package org.orbitos.sdk.services;

import api.gravity.v26.CameraServiceGrpc;
import api.gravity.v26.CameraServiceOuterClass;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * SDK wrapper for CameraService.
 * Captures still images and continuous frame streams from V4L2 camera devices.
 *
 * <p>Obtain via {@code client.cameraManager()}.
 *
 * <p>Usage pattern: discover devices, acquire a {@link LockedCamera} handle,
 * capture or stream, then {@link LockedCamera#unlock()}.
 *
 * <p>Example — capture one frame:
 * <pre>{@code
 * CameraManager cam = client.cameraManager();
 * List<CameraManager.DeviceInfo> devices = cam.listDevices();
 * try (CameraManager.LockedCamera lc = cam.lock(devices.get(0).deviceId(), "my-client")) {
 *     CameraManager.CaptureResult frame = lc.captureImage(640, 480, "mjpeg");
 *     Files.write(Path.of("photo.jpg"), frame.imageData());
 * }
 * }</pre>
 */
public class CameraManager {

    private final CameraServiceGrpc.CameraServiceBlockingStub blockingStub;
    private final CameraServiceGrpc.CameraServiceStub asyncStub;

    public CameraManager(CameraServiceGrpc.CameraServiceBlockingStub blockingStub,
                         CameraServiceGrpc.CameraServiceStub asyncStub) {
        this.blockingStub = blockingStub;
        this.asyncStub    = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs
    // -------------------------------------------------------------------------

    /**
     * Metadata for a V4L2 camera node.
     *
     * @param deviceId          Device path (e.g. {@code "/dev/video0"}).
     * @param driver            Kernel driver name.
     * @param card               Device card/model string.
     * @param supportedFormats  Pixel formats reported by the driver.
     * @param resolutions       Supported resolutions (e.g. {@code "640x480"}).
     */
    public record DeviceInfo(
            String deviceId,
            String driver,
            String card,
            List<String> supportedFormats,
            List<String> resolutions) {}

    /**
     * A single captured frame.
     *
     * @param imageData  Encoded image bytes (JPEG for {@code "mjpeg"}).
     * @param format     Pixel format used for encoding.
     * @param timestamp  Capture timestamp (device-local).
     */
    public record CaptureResult(byte[] imageData, String format, long timestamp) {}

    /**
     * A single frame from a continuous stream.
     *
     * @param data      Raw frame bytes.
     * @param timestamp Frame timestamp.
     * @param width     Frame width in pixels.
     * @param height    Frame height in pixels.
     * @param format    Pixel format.
     */
    public record Frame(byte[] data, long timestamp, int width, int height, String format) {}

    // -------------------------------------------------------------------------
    // Discovery
    // -------------------------------------------------------------------------

    /**
     * Returns all V4L2 video nodes available on the device.
     *
     * @throws CameraException if the server returns an error.
     */
    public List<DeviceInfo> listDevices() throws CameraException {
        CameraServiceOuterClass.ListDevicesResponse resp =
                blockingStub.listDevices(CameraServiceOuterClass.ListDevicesRequest.newBuilder().build());
        List<DeviceInfo> out = new ArrayList<>();
        for (CameraServiceOuterClass.DeviceInfoResponse d : resp.getDevicesList()) {
            out.add(fromProto(d));
        }
        return out;
    }

    /**
     * Returns metadata for a specific camera device.
     *
     * @param deviceId Device path (e.g. {@code "/dev/video0"}).
     * @throws CameraException if the server returns an error.
     */
    public DeviceInfo getDeviceInfo(String deviceId) throws CameraException {
        CameraServiceOuterClass.DeviceInfoResponse resp =
                blockingStub.getDeviceInfo(CameraServiceOuterClass.DeviceInfoRequest.newBuilder()
                        .setDeviceId(deviceId != null ? deviceId : "")
                        .build());
        return fromProto(resp);
    }

    // -------------------------------------------------------------------------
    // Lock / unlock
    // -------------------------------------------------------------------------

    /**
     * Acquires an exclusive lock on the camera and returns a handle for capture/streaming.
     * Call {@link LockedCamera#unlock()} (or use try-with-resources) when done.
     *
     * @param deviceId Device path (e.g. {@code "/dev/video0"}).
     * @param clientId Caller-chosen identifier used for lock ownership tracking.
     * @throws CameraException if the lock is held by another client or the server returns an error.
     */
    public LockedCamera lock(String deviceId, String clientId) throws CameraException {
        CameraServiceOuterClass.LockResponse resp = blockingStub.lockCamera(
                CameraServiceOuterClass.LockRequest.newBuilder()
                        .setDeviceId(deviceId != null ? deviceId : "")
                        .setClientId(clientId != null ? clientId : "")
                        .build());
        if (resp.hasError() && resp.getError().getCode() != api.gravity.types.Types.ErrorCode.ERROR_CODE_NONE) {
            throw new CameraException("LockCamera failed: " + resp.getError().getMessage());
        }
        if (!resp.getSuccess()) throw new CameraException("LockCamera: server reported failure");
        return new LockedCamera(blockingStub, asyncStub, deviceId, clientId);
    }

    // -------------------------------------------------------------------------
    // LockedCamera handle
    // -------------------------------------------------------------------------

    /**
     * Handle to an exclusively locked camera device.
     * Implements {@link AutoCloseable} — use with try-with-resources to auto-unlock.
     */
    public static class LockedCamera implements AutoCloseable {

        private final CameraServiceGrpc.CameraServiceBlockingStub blockingStub;
        private final CameraServiceGrpc.CameraServiceStub asyncStub;
        private final String deviceId;
        private final String clientId;

        LockedCamera(CameraServiceGrpc.CameraServiceBlockingStub blockingStub,
                     CameraServiceGrpc.CameraServiceStub asyncStub,
                     String deviceId,
                     String clientId) {
            this.blockingStub = blockingStub;
            this.asyncStub    = asyncStub;
            this.deviceId     = deviceId;
            this.clientId     = clientId;
        }

        /**
         * Releases the camera lock.
         *
         * @throws CameraException if the server returns an error.
         */
        public void unlock() throws CameraException {
            CameraServiceOuterClass.UnlockResponse resp = blockingStub.unlockCamera(
                    CameraServiceOuterClass.UnlockRequest.newBuilder()
                            .setDeviceId(deviceId)
                            .setClientId(clientId)
                            .build());
            if (resp.hasError() && resp.getError().getCode() != api.gravity.types.Types.ErrorCode.ERROR_CODE_NONE) {
                throw new CameraException("UnlockCamera failed: " + resp.getError().getMessage());
            }
            if (!resp.getSuccess()) throw new CameraException("UnlockCamera: server reported failure");
        }

        /** Implements {@link AutoCloseable} — equivalent to {@link #unlock()} (swallows exceptions). */
        @Override public void close() {
            try { unlock(); } catch (CameraException ignored) {}
        }

        /**
         * Captures a single still frame from the locked camera.
         *
         * @param width   Requested width in pixels.
         * @param height  Requested height in pixels.
         * @param format  Pixel format (e.g. {@code "mjpeg"}, {@code "yuyv"}).
         * @throws CameraException if capture fails.
         */
        public CaptureResult captureImage(int width, int height, String format) throws CameraException {
            CameraServiceOuterClass.CaptureImageResponse resp = blockingStub.captureImage(
                    CameraServiceOuterClass.CaptureImageRequest.newBuilder()
                            .setDeviceId(deviceId)
                            .setWidth(width)
                            .setHeight(height)
                            .setFormat(format != null ? format : "mjpeg")
                            .build());
            if (resp.hasError() && resp.getError().getCode() != api.gravity.types.Types.ErrorCode.ERROR_CODE_NONE) {
                throw new CameraException("CaptureImage failed: " + resp.getError().getMessage());
            }
            if (!resp.getSuccess()) throw new CameraException("CaptureImage: server reported failure");
            return new CaptureResult(
                    resp.getImageData().toByteArray(),
                    resp.getFormat(),
                    resp.getTimestamp());
        }

        /** Handle to a running frame stream. Call {@link #cancel()} to stop. */
        public interface StreamHandle {
            void cancel();
        }

        /**
         * Opens a continuous server-streaming frame stream at the requested FPS and resolution.
         *
         * @param fps     Target frames per second.
         * @param width   Frame width in pixels.
         * @param height  Frame height in pixels.
         * @param onFrame Callback invoked for each received frame.
         * @param onError Callback invoked on stream error.
         * @return A {@link StreamHandle} to stop the stream.
         */
        public StreamHandle streamFramesAsync(int fps, int width, int height,
                                               Consumer<Frame> onFrame,
                                               Consumer<Throwable> onError) {
            Context.CancellableContext ctx = Context.current().withCancellation();
            ctx.run(() -> asyncStub.streamFrames(
                    CameraServiceOuterClass.StreamFramesRequest.newBuilder()
                            .setDeviceId(deviceId)
                            .setFps(fps)
                            .setWidth(width)
                            .setHeight(height)
                            .build(),
                    new StreamObserver<CameraServiceOuterClass.Frame>() {
                        @Override public void onNext(CameraServiceOuterClass.Frame f) {
                            onFrame.accept(new Frame(
                                    f.getData().toByteArray(),
                                    f.getTimestamp(),
                                    f.getWidth(),
                                    f.getHeight(),
                                    f.getFormat()));
                        }
                        @Override public void onError(Throwable t) { if (onError != null) onError.accept(t); }
                        @Override public void onCompleted()         {}
                    }));
            return () -> ctx.cancel(null);
        }
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private DeviceInfo fromProto(CameraServiceOuterClass.DeviceInfoResponse d) {
        return new DeviceInfo(
                d.getDeviceId(),
                d.getDriver(),
                d.getCard(),
                new ArrayList<>(d.getSupportedFormatsList()),
                new ArrayList<>(d.getResolutionsList()));
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /** Thrown when CameraService returns an error. */
    public static class CameraException extends Exception {
        public CameraException(String message) { super(message); }
    }
}
