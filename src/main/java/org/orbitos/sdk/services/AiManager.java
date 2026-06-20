package org.orbitos.sdk.services;

import api.gravity.v26.AiServiceGrpc;
import api.gravity.v26.AiServiceOuterClass;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * SDK wrapper for AiService.
 * Manages on-device ML model lifecycle (ONNX/TFLite) and runs inference.
 *
 * <p>Obtain via {@code client.aiManager()}.
 *
 * <p>Example — load a model and infer:
 * <pre>{@code
 * AiManager ai = client.aiManager();
 * AiManager.AiModel model = ai.loadModel("yolo", "/models/yolo.tflite",
 *         AiManager.ModelBackend.TFLITE, AiManager.ExecutionMode.CPU);
 * byte[] output = model.infer(inputBytes, new int[]{1, 640, 640, 3},
 *         AiManager.TensorDataType.FLOAT32).outputData();
 * model.unload();
 * }</pre>
 */
public class AiManager {

    private static final int UPLOAD_CHUNK_SIZE = 256 * 1024; // 256 KB

    private final AiServiceGrpc.AiServiceBlockingStub blockingStub;
    private final AiServiceGrpc.AiServiceStub asyncStub;

    public AiManager(AiServiceGrpc.AiServiceBlockingStub blockingStub,
                     AiServiceGrpc.AiServiceStub asyncStub) {
        this.blockingStub = blockingStub;
        this.asyncStub    = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** Inference backend type. */
    public enum ModelBackend {
        UNSPECIFIED, ONNX, TFLITE;

        AiServiceOuterClass.ModelBackend toProto() {
            return switch (this) {
                case ONNX    -> AiServiceOuterClass.ModelBackend.ONNX;
                case TFLITE  -> AiServiceOuterClass.ModelBackend.TFLITE;
                default      -> AiServiceOuterClass.ModelBackend.MODEL_BACKEND_UNSPECIFIED;
            };
        }
    }

    /** Controls which compute path the backend uses. */
    public enum ExecutionMode {
        /** Default — single/multi-core CPU. */
        CPU,
        /** GPU or NPU delegate. */
        GPU,
        /** CPU with maximum thread count. */
        HIGH_THREADS;

        AiServiceOuterClass.ExecutionMode toProto() {
            return switch (this) {
                case GPU          -> AiServiceOuterClass.ExecutionMode.EXEC_GPU;
                case HIGH_THREADS -> AiServiceOuterClass.ExecutionMode.EXEC_HIGH_THREADS;
                default           -> AiServiceOuterClass.ExecutionMode.EXEC_CPU;
            };
        }
    }

    /** How raw bytes in inference requests/responses are encoded. */
    public enum TensorDataType {
        /** 4-byte little-endian IEEE 754, normalised [0, 1]. */
        FLOAT32,
        /** 1-byte unsigned integer [0, 255]. */
        UINT8,
        /** 4-byte little-endian signed integer. */
        INT32,
        /** 8-byte little-endian signed integer. */
        INT64;

        AiServiceOuterClass.TensorDataType toProto() {
            return switch (this) {
                case UINT8  -> AiServiceOuterClass.TensorDataType.TENSOR_UINT8;
                case INT32  -> AiServiceOuterClass.TensorDataType.TENSOR_INT32;
                case INT64  -> AiServiceOuterClass.TensorDataType.TENSOR_INT64;
                default     -> AiServiceOuterClass.TensorDataType.TENSOR_FLOAT32;
            };
        }
    }

    /**
     * Metadata for a loaded model.
     *
     * @param modelId      Model identifier.
     * @param version      Optional version string.
     * @param backend      Backend the model is loaded into.
     * @param loadedAtUnix Unix timestamp when the model was loaded.
     */
    public record ModelInfo(String modelId, String version, ModelBackend backend, long loadedAtUnix) {}

    /**
     * Single tensor descriptor (name, dtype, shape) returned by the server after loading.
     *
     * @param name  Tensor name.
     * @param dtype Data type.
     * @param shape Shape dimensions.
     */
    public record TensorInfo(String name, TensorDataType dtype, List<Integer> shape) {}

    /**
     * Inference result from {@link AiModel#infer}.
     *
     * @param outputData    First output tensor as raw bytes.
     * @param outputShape   Shape of {@code outputData}.
     * @param namedOutputs  All outputs by tensor name.
     * @param latencyUs     Inference wall time in microseconds.
     */
    public record InferResult(
            byte[] outputData,
            List<Integer> outputShape,
            Map<String, byte[]> namedOutputs,
            long latencyUs) {}

    // -------------------------------------------------------------------------
    // Model management
    // -------------------------------------------------------------------------

    /**
     * Returns metadata for all currently loaded models.
     */
    public List<ModelInfo> listModels() {
        AiServiceOuterClass.ListModelsResponse resp =
                blockingStub.listModels(AiServiceOuterClass.ListModelsRequest.newBuilder().build());
        List<ModelInfo> out = new ArrayList<>();
        for (AiServiceOuterClass.ModelInfo m : resp.getModelsList()) {
            out.add(new ModelInfo(m.getModelId(), m.getVersion(),
                    backendFromProto(m.getBackend()), m.getLoadedAtUnix()));
        }
        return out;
    }

    /**
     * Loads a model file that already exists on the device filesystem.
     * Returns an {@link AiModel} handle for inference and lifecycle operations.
     *
     * @param modelId   Unique identifier to assign to the loaded model.
     * @param modelPath Path to the model file on the device (e.g. {@code "/models/yolo.tflite"}).
     * @param backend   Inference backend (ONNX or TFLITE).
     * @param execution Compute path preference (CPU, GPU, etc.).
     * @throws AiException if the server reports a load failure.
     */
    public AiModel loadModel(String modelId, String modelPath, ModelBackend backend, ExecutionMode execution)
            throws AiException {
        AiServiceOuterClass.LoadModelResponse resp = blockingStub.loadModel(
                AiServiceOuterClass.LoadModelRequest.newBuilder()
                        .setModelId(modelId != null ? modelId : "")
                        .setModelPath(modelPath != null ? modelPath : "")
                        .setBackend(backend.toProto())
                        .setExecution(execution.toProto())
                        .build());
        if (!resp.getSuccess()) {
            String msg = resp.hasError() ? resp.getError().getMessage() : "server reported failure";
            throw new AiException("LoadModel failed: " + msg);
        }
        return new AiModel(blockingStub, asyncStub, modelId, resp);
    }

    /**
     * Streams a local model file to the device (256 KB chunks) then loads it.
     * Use this when the model does not yet exist on the device filesystem.
     *
     * @param modelId   Unique identifier to assign.
     * @param localFile Local model file ({@code .onnx} or {@code .tflite}).
     * @param backend   Inference backend.
     * @param execution Compute path preference.
     * @throws AiException if upload or load fails.
     * @throws IOException if the file cannot be read.
     */
    public AiModel uploadAndLoadModel(String modelId, File localFile, ModelBackend backend, ExecutionMode execution)
            throws AiException, IOException {
        if (!localFile.exists() || !localFile.isFile()) {
            throw new IllegalArgumentException("File not found: " + localFile.getPath());
        }

        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<AiServiceOuterClass.LoadModelResponse> respRef = new AtomicReference<>();
        AtomicReference<Throwable> errorRef = new AtomicReference<>();

        StreamObserver<AiServiceOuterClass.UploadModelChunk> requestStream =
                asyncStub.uploadAndLoadModel(new StreamObserver<>() {
                    @Override public void onNext(AiServiceOuterClass.LoadModelResponse r) { respRef.set(r); }
                    @Override public void onError(Throwable t) { errorRef.set(t); latch.countDown(); }
                    @Override public void onCompleted()        { latch.countDown(); }
                });

        // Send meta chunk first
        requestStream.onNext(AiServiceOuterClass.UploadModelChunk.newBuilder()
                .setMeta(AiServiceOuterClass.UploadModelMeta.newBuilder()
                        .setModelId(modelId != null ? modelId : "")
                        .setBackend(backend.toProto())
                        .setExecution(execution.toProto())
                        .setTotalBytes(localFile.length())
                        .setFilename(localFile.getName())
                        .build())
                .build());

        // Stream file data
        try (FileInputStream fis = new FileInputStream(localFile)) {
            byte[] buf = new byte[UPLOAD_CHUNK_SIZE];
            int n;
            while ((n = fis.read(buf)) > 0) {
                byte[] chunk = new byte[n];
                System.arraycopy(buf, 0, chunk, 0, n);
                requestStream.onNext(AiServiceOuterClass.UploadModelChunk.newBuilder()
                        .setData(com.google.protobuf.ByteString.copyFrom(chunk))
                        .build());
            }
        } catch (IOException e) {
            requestStream.onError(e);
            throw e;
        }

        requestStream.onCompleted();

        try {
            if (!latch.await(5, TimeUnit.MINUTES)) {
                throw new AiException("UploadAndLoadModel: timed out");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AiException("UploadAndLoadModel: interrupted");
        }

        if (errorRef.get() != null) {
            throw new AiException("UploadAndLoadModel: " + errorRef.get().getMessage());
        }

        AiServiceOuterClass.LoadModelResponse resp = respRef.get();
        if (resp == null || !resp.getSuccess()) {
            String msg = (resp != null && resp.hasError()) ? resp.getError().getMessage() : "server reported failure";
            throw new AiException("UploadAndLoadModel failed: " + msg);
        }
        return new AiModel(blockingStub, asyncStub, modelId, resp);
    }

    /**
     * Convenience overload accepting a path string.
     */
    public AiModel uploadAndLoadModel(String modelId, String localPath, ModelBackend backend, ExecutionMode execution)
            throws AiException, IOException {
        return uploadAndLoadModel(modelId, new File(localPath), backend, execution);
    }

    // -------------------------------------------------------------------------
    // AiModel handle
    // -------------------------------------------------------------------------

    /** Handle to a loaded inference model. Holds the tensor schema reported at load time. */
    public static class AiModel {
        private final AiServiceGrpc.AiServiceBlockingStub blockingStub;
        private final AiServiceGrpc.AiServiceStub asyncStub;
        private final String modelId;

        /** Tensor schema reported by the backend after loading. */
        public final List<TensorInfo> inputs;
        /** Output tensor schema. */
        public final List<TensorInfo> outputs;
        /** True if the model was already loaded and the upload was skipped. */
        public final boolean skippedUpload;

        AiModel(AiServiceGrpc.AiServiceBlockingStub blockingStub,
                AiServiceGrpc.AiServiceStub asyncStub,
                String modelId,
                AiServiceOuterClass.LoadModelResponse resp) {
            this.blockingStub  = blockingStub;
            this.asyncStub     = asyncStub;
            this.modelId       = modelId;
            this.skippedUpload = resp.getSkippedUpload();
            this.inputs        = tensorInfoList(resp.getInputsList());
            this.outputs       = tensorInfoList(resp.getOutputsList());
        }

        /** Frees the model from the inference backend. */
        public void unload() throws AiException {
            AiServiceOuterClass.UnloadModelResponse resp = blockingStub.unloadModel(
                    AiServiceOuterClass.UnloadModelRequest.newBuilder().setModelId(modelId).build());
            if (!resp.getSuccess()) {
                String msg = resp.hasError() ? resp.getError().getMessage() : "server reported failure";
                throw new AiException("UnloadModel failed: " + msg);
            }
        }

        /**
         * Returns true if the model is currently loaded, along with its tensor schema.
         *
         * @throws AiException if the RPC fails.
         */
        public boolean isLoaded() throws AiException {
            AiServiceOuterClass.IsModelLoadedResponse resp = blockingStub.isModelLoaded(
                    AiServiceOuterClass.IsModelLoadedRequest.newBuilder().setModelId(modelId).build());
            return resp.getLoaded();
        }

        /**
         * Runs one synchronous forward pass.
         *
         * @param inputData  Raw little-endian bytes (encoding determined by {@code dtype}).
         * @param inputShape Optional input shape (null = use schema from load).
         * @param dtype      Data type of {@code inputData}.
         * @return {@link InferResult} containing output data and timing.
         * @throws AiException if inference fails.
         */
        public InferResult infer(byte[] inputData, int[] inputShape, TensorDataType dtype) throws AiException {
            AiServiceOuterClass.InferRequest.Builder req = AiServiceOuterClass.InferRequest.newBuilder()
                    .setModelId(modelId)
                    .setInputData(com.google.protobuf.ByteString.copyFrom(inputData))
                    .setInputDtype(dtype.toProto());
            if (inputShape != null) {
                for (int d : inputShape) req.addInputShape(d);
            }
            AiServiceOuterClass.InferResponse resp = blockingStub.infer(req.build());
            if (!resp.getSuccess()) {
                String msg = resp.hasError() ? resp.getError().getMessage() : "server reported failure";
                throw new AiException("Infer failed: " + msg);
            }
            List<Integer> shape = new ArrayList<>(resp.getOutputShapeList());
            return new InferResult(
                    resp.getOutputData().toByteArray(),
                    shape,
                    resp.getNamedOutputsMap().entrySet().stream()
                            .collect(java.util.stream.Collectors.toMap(
                                    Map.Entry::getKey,
                                    e -> e.getValue().toByteArray())),
                    resp.getLatencyUs());
        }

        private static List<TensorInfo> tensorInfoList(List<AiServiceOuterClass.TensorInfo> src) {
            List<TensorInfo> out = new ArrayList<>();
            for (AiServiceOuterClass.TensorInfo t : src) {
                TensorDataType dt = switch (t.getDtype()) {
                    case TENSOR_UINT8  -> TensorDataType.UINT8;
                    case TENSOR_INT32  -> TensorDataType.INT32;
                    case TENSOR_INT64  -> TensorDataType.INT64;
                    default            -> TensorDataType.FLOAT32;
                };
                out.add(new TensorInfo(t.getName(), dt, new ArrayList<>(t.getShapeList())));
            }
            return out;
        }
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private static ModelBackend backendFromProto(AiServiceOuterClass.ModelBackend b) {
        return switch (b) {
            case ONNX    -> ModelBackend.ONNX;
            case TFLITE  -> ModelBackend.TFLITE;
            default      -> ModelBackend.UNSPECIFIED;
        };
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /** Thrown when AiService returns an error or inference fails. */
    public static class AiException extends Exception {
        public AiException(String message) { super(message); }
    }
}
