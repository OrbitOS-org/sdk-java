package org.orbitos.sdk.services;

import api.gravity.v26.SystemServiceGrpc;
import api.gravity.v26.SystemServiceOuterClass;
import api.gravity.types.Types;

/**
 * SDK Wrapper for the SystemService.
 * Wraps gRPC calls and exposes a simple, strongly-typed interface.
 *
 * <p>Obtain via {@code client.systemManager()}.
 */
public class SystemManager {

    private final SystemServiceGrpc.SystemServiceBlockingStub stub;
    private final SystemServiceGrpc.SystemServiceStub asyncStub;

    public SystemManager(SystemServiceGrpc.SystemServiceBlockingStub stub,
                         SystemServiceGrpc.SystemServiceStub asyncStub) {
        this.stub = stub;
        this.asyncStub = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs
    // -------------------------------------------------------------------------

    /** API version and revision of the SystemService. */
    public static class ApiVersion {
        public final long version;
        public final long revision;
        public ApiVersion(long version, long revision) {
            this.version  = version;
            this.revision = revision;
        }
        @Override public String toString() {
            return "ApiVersion{version=" + version + ", revision=" + revision + "}";
        }
    }

    // -------------------------------------------------------------------------
    // API Version
    // -------------------------------------------------------------------------

    /**
     * Returns the API version and revision reported by the runtime.
     *
     * <pre>{@code
     * SystemManager.ApiVersion v = client.systemManager().getApiVersion();
     * System.out.printf("API version %d rev %d%n", v.version, v.revision);
     * }</pre>
     *
     * @return {@link ApiVersion} DTO with {@code version} and {@code revision}
     * @throws SystemServiceException if the server returns an error
     */
    public ApiVersion getApiVersion() throws SystemServiceException {
        Types.APIVersionResponse response = stub.getApiVersion(Types.Void.getDefaultInstance());
        if (response.hasError() && response.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new SystemServiceException(
                "getApiVersion failed: " + response.getError().getMessage(),
                response.getError().getCode());
        }
        return new ApiVersion(response.getVersion(), response.getRevision());
    }

    /**
     * Returns the API version info string reported by the runtime (e.g. {@code "v26.0.1"}).
     *
     * @throws SystemServiceException if the server returns an error
     */
    public String getApiVersionInfo() throws SystemServiceException {
        return extractString(stub.getApiVersionInfo(Types.Void.getDefaultInstance()), "getApiVersionInfo");
    }

    /**
     * Mandatory environment binding call. Must be called by apps running inside the Gravity
     * runtime to register the current process before calling other services.
     *
     * @return {@code true} if successfully attached.
     * @throws SystemServiceException if the server returns an error.
     */
    public boolean attach() throws SystemServiceException {
        return extractBoolean(stub.attach(empty()), "attach");
    }

    // -------------------------------------------------------------------------
    // Device / Hardware Info
    // -------------------------------------------------------------------------

    /** Returns the device name (hostname or descriptive identifier). */
    public String getDeviceName() throws SystemServiceException {
        return extractString(stub.getDeviceName(empty()), "getDeviceName");
    }

    /** Returns the SoC model string. */
    public String getSocModel() throws SystemServiceException {
        return extractString(stub.getSocModel(empty()), "getSocModel");
    }

    /** Returns the SoC vendor string. */
    public String getSocVendor() throws SystemServiceException {
        return extractString(stub.getSocVendor(empty()), "getSocVendor");
    }

    /** Returns the board model string. */
    public String getBoardModel() throws SystemServiceException {
        return extractString(stub.getBoardModel(empty()), "getBoardModel");
    }

    /** Returns the board vendor string. */
    public String getBoardVendor() throws SystemServiceException {
        return extractString(stub.getBoardVendor(empty()), "getBoardVendor");
    }

    /** Returns the hardware version string. */
    public String getHardwareVersion() throws SystemServiceException {
        return extractString(stub.getHardwareVersion(empty()), "getHardwareVersion");
    }

    /** Returns the hardware model string. */
    public String getHardwareModel() throws SystemServiceException {
        return extractString(stub.getHardwareModel(empty()), "getHardwareModel");
    }

    /** Returns the system UUID. */
    public String getSystemUuid() throws SystemServiceException {
        return extractString(stub.getSystemUuid(empty()), "getSystemUuid");
    }

    /** Returns the board serial number. */
    public String getBoardSerial() throws SystemServiceException {
        return extractString(stub.getBoardSerial(empty()), "getBoardSerial");
    }

    /** Returns the CPU serial number. */
    public String getCpuSerial() throws SystemServiceException {
        return extractString(stub.getCpuSerial(empty()), "getCpuSerial");
    }

    /** Returns the machine ID. */
    public String getMachineId() throws SystemServiceException {
        return extractString(stub.getMachineId(empty()), "getMachineId");
    }

    /** Returns the system architecture (e.g. {@code x86_64}, {@code aarch64}). */
    public String getArchitecture() throws SystemServiceException {
        return extractString(stub.getArchitecture(empty()), "getArchitecture");
    }

    /**
     * Returns total installed RAM in bytes.
     *
     * @throws SystemServiceException if the server returns an error
     */
    public long getTotalRAM() throws SystemServiceException {
        Types.UInt64Response response = stub.getTotalRAM(empty());
        if (response.hasError() && response.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new SystemServiceException(
                "getTotalRAM failed: " + response.getError().getMessage(),
                response.getError().getCode());
        }
        return response.getValue();
    }

    // -------------------------------------------------------------------------
    // CPU Info
    // -------------------------------------------------------------------------

    /** Returns the CPU model string. */
    public String getCpuModel() throws SystemServiceException {
        return extractString(stub.getCpuModel(empty()), "getCpuModel");
    }

    /** Returns the number of physical CPU cores. */
    public long getCpuCores() throws SystemServiceException {
        return extractInteger(stub.getCpuCores(empty()), "getCpuCores");
    }

    /** Returns the number of logical CPU threads. */
    public long getCpuThreads() throws SystemServiceException {
        return extractInteger(stub.getCpuThreads(empty()), "getCpuThreads");
    }

    /** Returns the minimum CPU frequency in MHz. */
    public double getCpuMinMhz() throws SystemServiceException {
        return extractDouble(stub.getCpuMinMhz(empty()), "getCpuMinMhz");
    }

    /** Returns the maximum CPU frequency in MHz. */
    public double getCpuMaxMhz() throws SystemServiceException {
        return extractDouble(stub.getCpuMaxMhz(empty()), "getCpuMaxMhz");
    }

    // -------------------------------------------------------------------------
    // Software / OS Info
    // -------------------------------------------------------------------------

    /** Returns the OS name. */
    public String getOsName() throws SystemServiceException {
        return extractString(stub.getOsName(empty()), "getOsName");
    }

    /** Returns the OS version. */
    public String getOsVersion() throws SystemServiceException {
        return extractString(stub.getOsVersion(empty()), "getOsVersion");
    }

    /** Returns the OS revision string (complements {@link #getOsVersion()}). */
    public String getOsRevision() throws SystemServiceException {
        return extractString(stub.getOsRevision(empty()), "getOsRevision");
    }

    /** Returns the kernel version string. */
    public String getKernelVersion() throws SystemServiceException {
        return extractString(stub.getKernelVersion(empty()), "getKernelVersion");
    }

    /** Returns the Linux distribution name. */
    public String getDistro() throws SystemServiceException {
        return extractString(stub.getDistro(empty()), "getDistro");
    }

    /** Returns the Linux distribution version. */
    public String getDistroVersion() throws SystemServiceException {
        return extractString(stub.getDistroVersion(empty()), "getDistroVersion");
    }

    /** Returns the OrbitOS runtime version. */
    public String getRuntimeVersion() throws SystemServiceException {
        return extractString(stub.getRuntimeVersion(empty()), "getRuntimeVersion");
    }

    /**
     * Returns the firmware/application build version.
     * In API v26 this is the same value as {@link #getRuntimeVersion()}.
     */
    public String getBuildVersion() throws SystemServiceException {
        return getRuntimeVersion();
    }

    /** Returns the OrbitOS runtime build date string. */
    public String getRuntimeBuildDate() throws SystemServiceException {
        return extractString(stub.getRuntimeBuildDate(empty()), "getRuntimeBuildDate");
    }

    /** Returns the firmware/application build date (alias for {@link #getRuntimeBuildDate()}). */
    public String getBuildDate() throws SystemServiceException {
        return getRuntimeBuildDate();
    }

    // -------------------------------------------------------------------------
    // System Metrics
    // -------------------------------------------------------------------------

    /**
     * Returns real-time system metrics (CPU, memory, temperature, uptime, etc.).
     *
     * @return {@link SystemServiceOuterClass.MetricsInfoResponse}
     * @throws SystemServiceException if the server returns an error
     */
    public SystemServiceOuterClass.MetricsInfoResponse getMetrics() throws SystemServiceException {
        SystemServiceOuterClass.MetricsInfoResponse response = stub.getMetrics(empty());
        if (response.hasError() && response.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new SystemServiceException(
                "getMetrics failed: " + response.getError().getMessage(),
                response.getError().getCode());
        }
        return response;
    }

    // -------------------------------------------------------------------------
    // Untrusted Apps
    // -------------------------------------------------------------------------

    /** Allows installation of uncertified (untrusted) applications. */
    public boolean allowUntrustedApps() throws SystemServiceException {
        return extractBoolean(stub.allowUntrustedApps(empty()), "allowUntrustedApps");
    }

    /** Prevents installation of uncertified (untrusted) applications. */
    public boolean disallowUntrustedApps() throws SystemServiceException {
        return extractBoolean(stub.disallowUntrustedApps(empty()), "disallowUntrustedApps");
    }

    /** Returns {@code true} if untrusted app installation is currently allowed. */
    public boolean isUntrustedAppsAllowed() throws SystemServiceException {
        return extractBoolean(stub.isUntrustedAppsAllowed(empty()), "isUntrustedAppsAllowed");
    }

    // -------------------------------------------------------------------------
    // Reboot on Failure
    // -------------------------------------------------------------------------

    /** Enables automatic reboot when a critical failure is detected. */
    public boolean enableRebootOnFailure() throws SystemServiceException {
        return extractBoolean(stub.enableRebootOnFailure(empty()), "enableRebootOnFailure");
    }

    /** Disables automatic reboot on failure. */
    public boolean disableRebootOnFailure() throws SystemServiceException {
        return extractBoolean(stub.disableRebootOnFailure(empty()), "disableRebootOnFailure");
    }

    /** Returns {@code true} if automatic reboot on failure is enabled. */
    public boolean isRebootOnFailureEnabled() throws SystemServiceException {
        return extractBoolean(stub.isRebootOnFailureEnabled(empty()), "isRebootOnFailureEnabled");
    }

    // -------------------------------------------------------------------------
    // Development Mode
    // -------------------------------------------------------------------------

    /** Enables developer mode (relaxed security, debug access). */
    public boolean enableDevMode() throws SystemServiceException {
        return extractBoolean(stub.enableDeveMode(empty()), "enableDevMode");
    }

    /** Disables developer mode. */
    public boolean disableDevMode() throws SystemServiceException {
        return extractBoolean(stub.disableDevMode(empty()), "disableDevMode");
    }

    /** Returns {@code true} if developer mode is currently enabled. */
    public boolean isDevModeEnabled() throws SystemServiceException {
        return extractBoolean(stub.isDevModeEnabled(empty()), "isDevModeEnabled");
    }

    // -------------------------------------------------------------------------
    // SSH Server
    // -------------------------------------------------------------------------

    /** Enables the built-in SSH server. */
    public boolean enableSSHServer() throws SystemServiceException {
        return extractBoolean(stub.enableSSHServer(empty()), "enableSSHServer");
    }

    /** Disables the built-in SSH server. */
    public boolean disableSSHServer() throws SystemServiceException {
        return extractBoolean(stub.disableSSHServer(empty()), "disableSSHServer");
    }

    /** Returns {@code true} if the SSH server is currently enabled. */
    public boolean isSSHServerEnabled() throws SystemServiceException {
        return extractBoolean(stub.isSSHServerEnabled(empty()), "isSSHServerEnabled");
    }

    // -------------------------------------------------------------------------
    // Private helpers
    // -------------------------------------------------------------------------

    private Types.Empty empty() {
        return Types.Empty.getDefaultInstance();
    }

    private String extractString(Types.StringResponse r, String method) throws SystemServiceException {
        if (r.hasError() && r.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE)
            throw new SystemServiceException(method + " failed: " + r.getError().getMessage(), r.getError().getCode());
        return r.getValue();
    }

    private long extractInteger(Types.IntegerResponse r, String method) throws SystemServiceException {
        if (r.hasError() && r.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE)
            throw new SystemServiceException(method + " failed: " + r.getError().getMessage(), r.getError().getCode());
        return r.getValue();
    }

    private double extractDouble(Types.DoubleResponse r, String method) throws SystemServiceException {
        if (r.hasError() && r.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE)
            throw new SystemServiceException(method + " failed: " + r.getError().getMessage(), r.getError().getCode());
        return r.getValue();
    }

    private boolean extractBoolean(Types.BooleanResponse r, String method) throws SystemServiceException {
        if (r.hasError() && r.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE)
            throw new SystemServiceException(method + " failed: " + r.getError().getMessage(), r.getError().getCode());
        return r.getValue();
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the SystemService returns a server-side error.
     */
    public static class SystemServiceException extends Exception {
        private final Types.ErrorCode errorCode;

        public SystemServiceException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
