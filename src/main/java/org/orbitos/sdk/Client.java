package org.orbitos.sdk;

import javax.net.ssl.SSLException;

import org.orbitos.sdk.logger.Logger;
import org.orbitos.sdk.services.AccountManager;
import org.orbitos.sdk.services.AiManager;
import org.orbitos.sdk.services.AppHubManager;
import org.orbitos.sdk.services.AuthManager;
import org.orbitos.sdk.services.BluetoothManager;
import org.orbitos.sdk.services.CameraManager;
import org.orbitos.sdk.services.DevelopmentManager;
import org.orbitos.sdk.services.EthernetManager;
import org.orbitos.sdk.services.EventManager;
import org.orbitos.sdk.services.FirewallManager;
import org.orbitos.sdk.services.GpioManager;
import org.orbitos.sdk.services.I2CManager;
import org.orbitos.sdk.services.PackageManager;
import org.orbitos.sdk.services.PowerManager;
import org.orbitos.sdk.services.PwmManager;
import org.orbitos.sdk.services.SpiManager;
import org.orbitos.sdk.services.SystemManager;
import org.orbitos.sdk.services.UartManager;
import org.orbitos.sdk.services.UpdateManager;
import org.orbitos.sdk.services.VpnManager;
import org.orbitos.sdk.services.WiFiManager;
import org.orbitos.sdk.utils.GrpcTlsHelper;

import api.gravity.types.Types;
import api.gravity.v26.AccountServiceGrpc;
import api.gravity.v26.SystemServiceOuterClass;
import api.gravity.v26.AiServiceGrpc;
import api.gravity.v26.AppHubServiceGrpc;
import api.gravity.v26.AuthServiceGrpc;
import api.gravity.v26.BluetoothServiceGrpc;
import api.gravity.v26.CameraServiceGrpc;
import api.gravity.v26.DevelopmentServiceGrpc;
import api.gravity.v26.EthernetServiceGrpc;
import api.gravity.v26.EventServiceGrpc;
import api.gravity.v26.FirewallServiceGrpc;
import api.gravity.v26.GpioServiceGrpc;
import api.gravity.v26.I2CServiceGrpc;
import api.gravity.v26.PackageManagerServiceGrpc;
import api.gravity.v26.PowerServiceGrpc;
import api.gravity.v26.PwmServiceGrpc;
import api.gravity.v26.SpiServiceGrpc;
import api.gravity.v26.SystemServiceGrpc;
import api.gravity.v26.UpdateServiceGrpc;
import api.gravity.v26.UartServiceGrpc;
import api.gravity.v26.VPNServiceGrpc;
import api.gravity.v26.WiFiServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.okhttp.OkHttpChannelBuilder;

/**
 * Main OrbitOS SDK client.
 *
 * <p>Establishes a gRPC connection to the gravity runtime and exposes all service managers.
 * Supports mutual TLS when client certificates are present, falling back to plain text.
 *
 * <p>{@link #connect(String, int)} auto-detects the transport: if the Unix Domain Socket
 * {@code /var/run/gravity.sock} is present it connects via UDS (no TLS needed), otherwise
 * it falls back to TCP — exactly like Go's {@code NewClientAuto}.
 *
 * <p>Example — remote device:
 * <pre>{@code
 * try (Client client = Client.connect("192.168.1.100", 6000, "my-app")) {
 *     System.out.println(client.systemManager().getDeviceName());
 * }
 * }</pre>
 *
 * <p>Example — local (in-device, prefers UDS):
 * <pre>{@code
 * try (Client client = Client.connectLocal("my-app")) {
 *     client.gpioManager().setLevel(new GpioManager.GpioPin("GPIO17", 17, 0), GpioManager.Level.HIGH);
 * }
 * }</pre>
 */
public class Client implements AutoCloseable {

    // ── Defaults ───────────────────────────────────────────────────────────────
    private static final int    DEFAULT_PORT       = 6000;
    private static final String DEFAULT_UDS_SOCKET = "/run/gravity/ipc/system_server.sock";

    private final String appName;
    private ManagedChannel channel;
    private boolean connected = false;

    /** Avoids log spam when there are several TCP attempts without certs in the classpath/disk. */
    private static volatile boolean plainTextModeLogged = false;

    // ── Managers ───────────────────────────────────────────────────────────────
    private SystemManager      systemManager;
    private PackageManager     packageManager;
    private AccountManager     accountManager;
    private PowerManager       powerManager;
    private WiFiManager        wifiManager;
    private EthernetManager    ethernetManager;
    private FirewallManager    firewallManager;
    private GpioManager        gpioManager;
    private PwmManager         pwmManager;
    private UartManager        uartManager;
    private I2CManager         i2cManager;
    private SpiManager         spiManager;
    private BluetoothManager   bluetoothManager;
    private DevelopmentManager developmentManager;
    private AuthManager        authManager;
    private UpdateManager      updateManager;
    private EventManager       eventManager;
    private VpnManager         vpnManager;
    private AppHubManager      appHubManager;
    private CameraManager      cameraManager;
    private AiManager          aiManager;

    // ── Constructor (private — use factory methods) ────────────────────────────

    private Client(String appName) {
        this.appName = appName;
    }

    // ── SDK version helpers ────────────────────────────────────────────────────

    /** Returns the gRPC API version this SDK was built against (e.g. {@code 26}). */
    public static int getSDKAPIVersion() {
        return SystemServiceOuterClass.APIVersionInfo.VERSION_VALUE;
    }

    /** Returns the gRPC API revision this SDK was built against (e.g. {@code 0}). */
    public static int getSDKAPIRevision() {
        return SystemServiceOuterClass.APIRevisionInfo.REVISION_VALUE;
    }

    /** Returns the SDK API version and revision as a formatted string (e.g. {@code "26.0"}). */
    public static String getSDKAPIVersionInfo() {
        return getSDKAPIVersion() + "." + getSDKAPIRevision();
    }

    // ── Factory methods ────────────────────────────────────────────────────────

    /**
     * Creates a new (not yet connected) SDK client.
     *
     * @param appName Application identifier used for logging.
     */
    public static Client NewSdkClient(String appName) {
        return new Client(appName);
    }

    /**
     * Creates an SDK client and connects to a remote device on the default port ({@value DEFAULT_PORT}).
     * Mirrors Go's {@code NewClientAuto} — port is an SDK internal detail.
     *
     * @param host    Device IP or hostname (e.g. "192.168.1.100").
     * @param appName Application identifier.
     * @throws Exception If the connection fails.
     */
    public static Client connect(String host, String appName) throws Exception {
        return connect(host, DEFAULT_PORT, appName);
    }

    /**
     * Creates an SDK client and connects to a remote device on an explicit port.
     *
     * @param host    Device IP or hostname (e.g. "192.168.1.100").
     * @param port    gRPC port.
     * @param appName Application identifier.
     * @throws Exception If the connection fails.
     */
    public static Client connect(String host, int port, String appName) throws Exception {
        Client c = new Client(appName);
        c.connect(host, port);
        return c;
    }

    /**
     * Creates an SDK client and connects to the local gravity runtime
     * on {@code localhost} with the default port.
     *
     * @param appName Application identifier.
     * @throws Exception If the connection fails.
     */
    public static Client connectLocal(String appName) throws Exception {
        return connect("localhost", DEFAULT_PORT, appName);
    }

    // ── Connection lifecycle ───────────────────────────────────────────────────

    /**
     * Auto-connect: tries Unix Domain Socket ({@code /var/run/gravity.sock}) first;
     * falls back to TCP if the socket file is not present.
     * This mirrors Go's {@code NewClientAuto} behaviour.
     *
     * @param host Fallback TCP host (e.g. {@code "192.168.1.100"}).
     * @param port Fallback TCP port (e.g. {@code 6000}).
     * @throws Exception If both transports fail.
     */
    public void connect(String host, int port) throws Exception {
        if (connected) {
            throw new IllegalStateException("Client is already connected");
        }
        // Try UDS first (same logic as Go's NewClientAuto)
        java.io.File socketFile = new java.io.File(DEFAULT_UDS_SOCKET);
        if (socketFile.exists()) {
            try {
                connectUDS(DEFAULT_UDS_SOCKET);
                compareSDKAndDeviceAPIVersions();
                return;
            } catch (Exception e) {
                if (connected) {
                    // UDS connected but version check failed
                    disconnect();
                    throw e;
                }
                Logger.Warn("sdk", "UDS connect failed, falling back to TCP: " + e.getMessage());
            }
        }
        connectTCP(host, port);
        try {
            compareSDKAndDeviceAPIVersions();
        } catch (Exception e) {
            disconnect();
            throw e;
        }
    }

    private void compareSDKAndDeviceAPIVersions() throws Exception {
        String sdkVersion = getSDKAPIVersionInfo();
        String deviceVersion = systemManager.getApiVersionInfo();
        Logger.Info("sdk", "SDK API Version: " + sdkVersion);
        Logger.Info("sdk", "Dev API Version: " + deviceVersion);
        if (!deviceVersion.equals(sdkVersion)) {
            Logger.Warn("sdk", "SDK API Version: " + sdkVersion +
                    " does not match Device API Version: " + deviceVersion);
        }
    }

    /**
     * Connects via TCP (with optional TLS). Skips UDS auto-detection.
     *
     * @param host Device IP or hostname.
     * @param port gRPC port.
     * @throws Exception If the connection or TLS setup fails.
     */
    private void connectTCP(String host, int port) throws Exception {
        GrpcTlsHelper.SslConfig sslConfig = loadSslConfig();

        // Resolve localhost to 127.0.0.1 to avoid NameResolver issues
        String targetHost = "localhost".equals(host) ? "127.0.0.1" : host;

        OkHttpChannelBuilder channelBuilder = OkHttpChannelBuilder.forAddress(targetHost, port);
        channelBuilder.keepAliveTime(5, java.util.concurrent.TimeUnit.SECONDS);
        channelBuilder.keepAliveTimeout(3, java.util.concurrent.TimeUnit.SECONDS);
        channelBuilder.keepAliveWithoutCalls(true);

        if (sslConfig != null) {
            channelBuilder.sslSocketFactory(sslConfig.socketFactory);
            channelBuilder.hostnameVerifier((hostname, session) -> true);
            if (!host.matches("^\\d+\\.\\d+\\.\\d+\\.\\d+$") && !host.startsWith("[")) {
                channelBuilder.overrideAuthority(host);
            }
        } else {
            channelBuilder.usePlaintext();
        }

        channel = channelBuilder.build();
        initManagers();

        try {
            SystemServiceGrpc.newBlockingStub(channel)
                    .withDeadlineAfter(5, java.util.concurrent.TimeUnit.SECONDS)
                    .getDeviceName(Types.Empty.getDefaultInstance());
        } catch (Exception e) {
            shutdownChannel();
            throw new Exception("Failed to connect to " + host + ":" + port + ": " + e.getMessage(), e);
        }

        connected = true;
        Logger.Info("sdk", "Connected (TCP) to " + host + ":" + port + "  app=" + appName);
    }

    /**
     * Connects via Unix Domain Socket (no TLS).
     * Uses junixsocket to create a custom {@link javax.net.SocketFactory} that routes
     * all connections through the local socket file, regardless of host/port.
     *
     * @param socketPath Path to the socket file (e.g. {@code /var/run/gravity.sock}).
     * @throws Exception If the socket is not reachable or the handshake fails.
     */
    private void connectUDS(String socketPath) throws Exception {
        java.io.File socketFile = new java.io.File(socketPath);

        // Custom SocketFactory — ignores host/port, always dials the Unix socket
        javax.net.SocketFactory udsFactory = new javax.net.SocketFactory() {
            private java.net.Socket connect() throws java.io.IOException {
                return org.newsclub.net.unix.AFUNIXSocket.connectTo(
                        org.newsclub.net.unix.AFUNIXSocketAddress.of(socketFile));
            }
            @Override public java.net.Socket createSocket() throws java.io.IOException { return org.newsclub.net.unix.AFUNIXSocket.newInstance(); }
            @Override public java.net.Socket createSocket(String h, int p) throws java.io.IOException { return connect(); }
            @Override public java.net.Socket createSocket(String h, int p, java.net.InetAddress l, int lp) throws java.io.IOException { return connect(); }
            @Override public java.net.Socket createSocket(java.net.InetAddress h, int p) throws java.io.IOException { return connect(); }
            @Override public java.net.Socket createSocket(java.net.InetAddress h, int p, java.net.InetAddress l, int lp) throws java.io.IOException { return connect(); }
        };

        OkHttpChannelBuilder channelBuilder = OkHttpChannelBuilder
                .forAddress("localhost", 1)   // host/port are ignored — socket factory handles it
                .socketFactory(udsFactory)
                .usePlaintext()
                .keepAliveTime(5, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveTimeout(3, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveWithoutCalls(true);

        channel = channelBuilder.build();
        initManagers();

        try {
            SystemServiceGrpc.newBlockingStub(channel)
                    .withDeadlineAfter(5, java.util.concurrent.TimeUnit.SECONDS)
                    .getDeviceName(Types.Empty.getDefaultInstance());
        } catch (Exception e) {
            shutdownChannel();
            throw new Exception("Failed to connect via UDS " + socketPath + ": " + e.getMessage(), e);
        }

        connected = true;
        Logger.Info("sdk", "Connected (UDS) via " + socketPath + "  app=" + appName);
    }

    /**
     * Disconnects from the gravity runtime and releases all resources.
     */
    public void disconnect() {
        if (!connected) return;
        shutdownChannel();
        connected = false;
        clearManagers();
        Logger.Info("sdk", "Disconnected  app=" + appName);
    }

    /** Returns {@code true} if the client is currently connected. */
    public boolean isConnected() {
        return connected;
    }

    /** Implements {@link AutoCloseable} — equivalent to {@link #disconnect()}. */
    @Override
    public void close() {
        disconnect();
    }

    // ── Managers ───────────────────────────────────────────────────────────────

    /** Access to System information and control methods. */
    public SystemManager systemManager() {
        requireConnected("systemManager");
        return systemManager;
    }

    /** Access to package install / remove methods. */
    public PackageManager packageManager() {
        requireConnected("packageManager");
        return packageManager;
    }

    /** Access to device account registration methods. */
    public AccountManager accountManager() {
        requireConnected("accountManager");
        return accountManager;
    }

    /** Access to reboot / shutdown methods. */
    public PowerManager powerManager() {
        requireConnected("powerManager");
        return powerManager;
    }

    /** Access to WiFi configuration, scanning and AP methods. */
    public WiFiManager wifiManager() {
        requireConnected("wifiManager");
        return wifiManager;
    }

    /** Access to Ethernet configuration and status methods. */
    public EthernetManager ethernetManager() {
        requireConnected("ethernetManager");
        return ethernetManager;
    }

    /** Access to firewall zone and rule management. */
    public FirewallManager firewallManager() {
        requireConnected("firewallManager");
        return firewallManager;
    }

    /** Access to GPIO pin control and PWM methods. */
    public GpioManager gpioManager() {
        requireConnected("gpioManager");
        return gpioManager;
    }

    /** Access to UART serial port methods. */
    public UartManager uartManager() {
        requireConnected("uartManager");
        return uartManager;
    }

    /** Access to I2C bus scan, config and transfer methods. */
    public I2CManager i2cManager() {
        requireConnected("i2cManager");
        return i2cManager;
    }

    /** Access to SPI device config and transfer methods. */
    public SpiManager spiManager() {
        requireConnected("spiManager");
        return spiManager;
    }

    /** Access to Bluetooth adapter, scan, bonding, and GATT client methods. */
    public BluetoothManager bluetoothManager() {
        requireConnected("bluetoothManager");
        return bluetoothManager;
    }

    /** Access to real-time application log streaming. */
    public DevelopmentManager developmentManager() {
        requireConnected("developmentManager");
        return developmentManager;
    }

    /** Access to hardware PWM channel control. */
    public PwmManager pwmManager() {
        requireConnected("pwmManager");
        return pwmManager;
    }

    /** Access to device-local authentication (login/logout). */
    public AuthManager authManager() {
        requireConnected("authManager");
        return authManager;
    }

    /** Access to OTA firmware update and factory reset. */
    public UpdateManager updateManager() {
        requireConnected("updateManager");
        return updateManager;
    }

    /** Access to system lifecycle event subscriptions. */
    public EventManager eventManager() {
        requireConnected("eventManager");
        return eventManager;
    }

    /** Access to VPN tunnel management (WireGuard, OpenVPN, IPSec). */
    public VpnManager vpnManager() {
        requireConnected("vpnManager");
        return vpnManager;
    }

    /** Access to the Gravity portal WebUI registry (AppHubService). */
    public AppHubManager appHubManager() {
        requireConnected("appHubManager");
        return appHubManager;
    }

    /** Access to V4L2 camera capture and streaming. */
    public CameraManager cameraManager() {
        requireConnected("cameraManager");
        return cameraManager;
    }

    /** Access to on-device ML model lifecycle and inference. */
    public AiManager aiManager() {
        requireConnected("aiManager");
        return aiManager;
    }

    // ── Private helpers ────────────────────────────────────────────────────────

    private void initManagers() {
        // Blocking stubs (unary RPC)
        SystemServiceGrpc.SystemServiceBlockingStub sysBlock =
                SystemServiceGrpc.newBlockingStub(channel);
        SystemServiceGrpc.SystemServiceStub sysAsync =
                SystemServiceGrpc.newStub(channel);
        systemManager = new SystemManager(sysBlock, sysAsync);

        PackageManagerServiceGrpc.PackageManagerServiceBlockingStub pkgBlock =
                PackageManagerServiceGrpc.newBlockingStub(channel);
        PackageManagerServiceGrpc.PackageManagerServiceStub pkgAsync =
                PackageManagerServiceGrpc.newStub(channel);
        packageManager = new PackageManager(pkgBlock, pkgAsync);

        accountManager = new AccountManager(
                AccountServiceGrpc.newBlockingStub(channel));

        powerManager = new PowerManager(
                PowerServiceGrpc.newBlockingStub(channel));

        wifiManager = new WiFiManager(
                WiFiServiceGrpc.newBlockingStub(channel));

        ethernetManager = new EthernetManager(
                EthernetServiceGrpc.newBlockingStub(channel));

        firewallManager = new FirewallManager(
                FirewallServiceGrpc.newBlockingStub(channel));

        GpioServiceGrpc.GpioServiceBlockingStub gpioBlock =
                GpioServiceGrpc.newBlockingStub(channel);
        PwmServiceGrpc.PwmServiceBlockingStub pwmBlock =
                PwmServiceGrpc.newBlockingStub(channel);
        gpioManager = new GpioManager(gpioBlock, pwmBlock);

        pwmManager = new PwmManager(pwmBlock);

        UartServiceGrpc.UartServiceBlockingStub uartBlock =
                UartServiceGrpc.newBlockingStub(channel);
        UartServiceGrpc.UartServiceStub uartAsync =
                UartServiceGrpc.newStub(channel);
        uartManager = new UartManager(uartBlock, uartAsync);

        I2CServiceGrpc.I2CServiceBlockingStub i2cBlock =
                I2CServiceGrpc.newBlockingStub(channel);
        i2cManager = new I2CManager(i2cBlock);

        SpiServiceGrpc.SpiServiceBlockingStub spiBlock =
                SpiServiceGrpc.newBlockingStub(channel);
        spiManager = new SpiManager(spiBlock);

        BluetoothServiceGrpc.BluetoothServiceBlockingStub btBlock =
                BluetoothServiceGrpc.newBlockingStub(channel);
        BluetoothServiceGrpc.BluetoothServiceStub btAsync =
                BluetoothServiceGrpc.newStub(channel);
        bluetoothManager = new BluetoothManager(btBlock, btAsync);

        developmentManager = new DevelopmentManager(
                DevelopmentServiceGrpc.newStub(channel));

        authManager = new AuthManager(
                AuthServiceGrpc.newBlockingStub(channel));

        updateManager = new UpdateManager(
                UpdateServiceGrpc.newBlockingStub(channel),
                UpdateServiceGrpc.newStub(channel));

        eventManager = new EventManager(
                EventServiceGrpc.newStub(channel));

        vpnManager = new VpnManager(
                VPNServiceGrpc.newBlockingStub(channel),
                VPNServiceGrpc.newStub(channel));

        appHubManager = new AppHubManager(
                AppHubServiceGrpc.newBlockingStub(channel),
                AppHubServiceGrpc.newStub(channel));

        cameraManager = new CameraManager(
                CameraServiceGrpc.newBlockingStub(channel),
                CameraServiceGrpc.newStub(channel));

        aiManager = new AiManager(
                AiServiceGrpc.newBlockingStub(channel),
                AiServiceGrpc.newStub(channel));
    }

    private void clearManagers() {
        systemManager      = null;
        packageManager     = null;
        accountManager     = null;
        powerManager       = null;
        wifiManager        = null;
        ethernetManager    = null;
        firewallManager    = null;
        gpioManager        = null;
        pwmManager         = null;
        uartManager        = null;
        i2cManager         = null;
        spiManager         = null;
        bluetoothManager   = null;
        developmentManager = null;
        authManager        = null;
        updateManager      = null;
        eventManager       = null;
        vpnManager         = null;
        appHubManager      = null;
        cameraManager      = null;
        aiManager          = null;
    }

    private void shutdownChannel() {
        if (channel == null) return;
        try {
            channel.shutdown();
            if (!channel.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)) {
                channel.shutdownNow();
            }
        } catch (InterruptedException e) {
            channel.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    private void requireConnected(String manager) {
        if (!connected) {
            throw new IllegalStateException(
                    "Client is not connected. Call connect() before using " + manager + ".");
        }
    }

    /**
     * Loads TLS certificates. Tries the classpath first, then several filesystem paths.
     * Returns {@code null} if no certificates are found, causing plain-text mode.
     */
    private GrpcTlsHelper.SslConfig loadSslConfig() throws SSLException {
        String userDir = System.getProperty("user.dir");

        try {
            return GrpcTlsHelper.createSslConfigFromResources();
        } catch (SSLException e) {
            java.io.File userDirFile = new java.io.File(userDir);

            java.util.List<String> possiblePaths = new java.util.ArrayList<>();
            // Walk up the directory tree (up to 6 levels) looking for certs/grpc/
            java.io.File dir = userDirFile;
            for (int i = 0; i < 6 && dir != null; i++) {
                possiblePaths.add(new java.io.File(dir, "certs/grpc").getAbsolutePath());
                dir = dir.getParentFile();
            }
            // Legacy fallbacks (src/main/resources/certs inside the app)
            possiblePaths.add("app/src/main/resources/certs");
            possiblePaths.add("src/main/resources/certs");
            possiblePaths.add(userDir + "/app/src/main/resources/certs");
            possiblePaths.add(userDir + "/src/main/resources/certs");

            for (String basePath : possiblePaths) {
                String caCertPath = basePath + "/ca.crt";
                java.io.File caCertFile = new java.io.File(caCertPath);
                if (!caCertFile.isFile()) {
                    continue;
                }
                String[][] certPairs = {
                    {"client.crt", "client.key"},
                    {"sdk_java.crt", "sdk_java.key"},
                };
                for (String[] names : certPairs) {
                    String clientCertPath = basePath + "/" + names[0];
                    String clientKeyPath  = basePath + "/" + names[1];
                    java.io.File clientCertFile = new java.io.File(clientCertPath);
                    java.io.File clientKeyFile  = new java.io.File(clientKeyPath);
                    if (clientCertFile.isFile() && clientKeyFile.isFile()) {
                        try {
                            return GrpcTlsHelper.createSslConfig(clientCertPath, clientKeyPath, caCertPath);
                        } catch (SSLException ignored) {
                            // try next pair / path
                        }
                    }
                }
            }

            if (!plainTextModeLogged) {
                plainTextModeLogged = true;
                Logger.Warn("sdk",
                        "No TLS certificates found — connecting in plain-text mode "
                        + "(add certs/ca.crt + client.crt + client.key under app/src/main/resources/certs/ or rebuild).");
            }
            return null;
        }
    }
}
