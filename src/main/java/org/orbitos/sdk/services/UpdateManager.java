package org.orbitos.sdk.services;

import api.gravity.v26.UpdateServiceGrpc;
import api.gravity.v26.UpdateServiceOuterClass;
import api.gravity.types.Types;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SDK wrapper for UpdateService.
 * Streams OTA image files to the device and performs factory reset.
 *
 * <p>Obtain via {@code client.updateManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * UpdateManager upd = client.updateManager();
 * upd.update("/path/to/firmware.orbit");
 * }</pre>
 */
public class UpdateManager {

    private static final int CHUNK_SIZE = 256 * 1024; // 256 KB

    private final UpdateServiceGrpc.UpdateServiceStub asyncStub;
    private final UpdateServiceGrpc.UpdateServiceBlockingStub blockingStub;

    public UpdateManager(UpdateServiceGrpc.UpdateServiceBlockingStub blockingStub,
                         UpdateServiceGrpc.UpdateServiceStub asyncStub) {
        this.blockingStub = blockingStub;
        this.asyncStub = asyncStub;
    }

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Resets the device to factory defaults and reboots.
     *
     * @throws UpdateException if the server returns an error.
     */
    public void factoryReset() throws UpdateException {
        Types.BooleanResponse resp = blockingStub.factoryReset(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "FactoryReset");
    }

    /**
     * Streams an OTA image file to the device in 256 KB chunks (with MD5 integrity check).
     * The filename is normalised to {@code .orbit} extension as required by the runtime.
     *
     * @param filePath Path to the {@code .orbit} update image.
     * @throws UpdateException if the server rejects the update.
     * @throws IOException     if the file cannot be read.
     */
    public void update(String filePath) throws UpdateException, IOException {
        update(new File(filePath));
    }

    /**
     * Streams an OTA image file to the device.
     *
     * @param file The {@code .orbit} update image.
     * @throws UpdateException if the server rejects the update.
     * @throws IOException     if the file cannot be read.
     */
    public void update(File file) throws UpdateException, IOException {
        if (!file.exists() || !file.isFile()) {
            throw new IllegalArgumentException("File not found: " + file.getPath());
        }

        long   fileSize    = file.length();
        String md5         = calculateMD5(file);
        int    totalChunks = (int) Math.max(1, (fileSize + CHUNK_SIZE - 1) / CHUNK_SIZE);

        // Normalise filename to .orbit
        String base = file.getName();
        if (!base.toLowerCase().endsWith(".orbit")) {
            int dot = base.lastIndexOf('.');
            base = (dot >= 0 ? base.substring(0, dot) : base) + ".orbit";
        }
        final String filename = base;

        final boolean[]        success   = {false};
        final UpdateException[] error    = {null};
        final Object lock = new Object();

        StreamObserver<UpdateServiceOuterClass.FileChunk> req =
                asyncStub.update(new StreamObserver<Types.BooleanResponse>() {
                    @Override public void onNext(Types.BooleanResponse r) {
                        synchronized (lock) {
                            if (r.hasError() && r.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
                                error[0] = new UpdateException("update failed: " + r.getError().getMessage(), r.getError().getCode());
                            } else {
                                success[0] = r.getValue();
                            }
                            lock.notify();
                        }
                    }
                    @Override public void onError(Throwable t) {
                        synchronized (lock) {
                            error[0] = new UpdateException("update error: " + t.getMessage(), Types.ErrorCode.ERROR_CODE_INTERNAL);
                            lock.notify();
                        }
                    }
                    @Override public void onCompleted() {}
                });

        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buf = new byte[CHUNK_SIZE];
            int chunkNum = 0, n;
            while ((n = fis.read(buf)) > 0) {
                chunkNum++;
                byte[] chunk = new byte[n];
                System.arraycopy(buf, 0, chunk, 0, n);
                req.onNext(UpdateServiceOuterClass.FileChunk.newBuilder()
                        .setFilename(filename)
                        .setChunkNumber(chunkNum)
                        .setTotalChunks(totalChunks)
                        .setData(com.google.protobuf.ByteString.copyFrom(chunk))
                        .setIsLast(chunkNum == totalChunks)
                        .setFileMd5(md5)
                        .setFileSize(fileSize)
                        .build());
            }
            req.onCompleted();

            synchronized (lock) {
                try { lock.wait(300_000); } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new UpdateException("update interrupted", Types.ErrorCode.ERROR_CODE_INTERNAL);
                }
            }
        } catch (IOException e) {
            req.onError(e);
            throw e;
        }

        if (error[0] != null) throw error[0];
        if (!success[0]) throw new UpdateException("update: device returned false", Types.ErrorCode.ERROR_CODE_INTERNAL);
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws UpdateException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new UpdateException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    private String calculateMD5(File file) throws IOException {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buf = new byte[8192];
                int n;
                while ((n = fis.read(buf)) != -1) md.update(buf, 0, n);
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : md.digest()) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new IOException("MD5 not available", e);
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /** Thrown when UpdateService returns a server-side error. */
    public static class UpdateException extends Exception {
        private final Types.ErrorCode errorCode;

        public UpdateException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
