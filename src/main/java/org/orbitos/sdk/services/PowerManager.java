package org.orbitos.sdk.services;

import api.gravity.v26.PowerServiceGrpc;
import api.gravity.v26.PowerServiceOuterClass;
import api.gravity.types.Types;

/**
 * SDK Wrapper for PowerService.
 * Provides reboot and shutdown control for the device.
 *
 * <p>Obtain via {@code client.powerManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * PowerManager pwr = client.powerManager();
 * pwr.reboot(false, "applying config update");
 * }</pre>
 */
public class PowerManager {

    private final PowerServiceGrpc.PowerServiceBlockingStub stub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public PowerManager(PowerServiceGrpc.PowerServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Sends a reboot request to the device.
     *
     * @param force  If {@code true}, the reboot proceeds immediately even if services are running.
     * @param reason Human-readable reason logged on the device (may be empty).
     * @throws PowerException If the server returns an error.
     */
    public void reboot(boolean force, String reason) throws PowerException {
        Types.BooleanResponse resp = stub.reboot(
                PowerServiceOuterClass.RebootRequest.newBuilder()
                        .setForce(force)
                        .setReason(reason != null ? reason : "")
                        .build());
        checkError(resp.getError(), "Reboot");
    }

    /**
     * Sends a shutdown request to the device.
     *
     * @param force  If {@code true}, the shutdown proceeds immediately even if services are running.
     * @param reason Human-readable reason logged on the device (may be empty).
     * @throws PowerException If the server returns an error.
     */
    public void shutdown(boolean force, String reason) throws PowerException {
        Types.BooleanResponse resp = stub.shutdown(
                PowerServiceOuterClass.ShutdownRequest.newBuilder()
                        .setForce(force)
                        .setReason(reason != null ? reason : "")
                        .build());
        checkError(resp.getError(), "Shutdown");
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws PowerException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new PowerException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the PowerService returns a server-side error.
     */
    public static class PowerException extends Exception {
        private final Types.ErrorCode errorCode;

        public PowerException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
