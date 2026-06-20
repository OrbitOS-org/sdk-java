package org.orbitos.sdk.services;

import api.gravity.v26.WiFiServiceGrpc;
import api.gravity.v26.WifiService;
import api.gravity.types.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * SDK Wrapper for WiFiService.
 * Provides WiFi interface management, client mode, Access Point mode and scanning.
 *
 * <p>Obtain via {@code client.wifiManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * WiFiManager wifi = client.wifiManager();
 *
 * // Connect to a network
 * wifi.connect(new WiFiManager.WiFiClientConfig("wlan0", "HomeNetwork", "s3cr3t", "WPA2", true));
 *
 * // Scan for nearby networks
 * List<WiFiManager.ScannedNetwork> nets = wifi.scan("wlan0", false);
 * for (WiFiManager.ScannedNetwork n : nets) {
 *     System.out.println(n.ssid() + "  signal=" + n.signalStrength() + "  sec=" + n.security());
 * }
 * }</pre>
 */
public class WiFiManager {

    private final WiFiServiceGrpc.WiFiServiceBlockingStub stub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public WiFiManager(WiFiServiceGrpc.WiFiServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // DTOs
    // -------------------------------------------------------------------------

    /**
     * WiFi operation mode.
     */
    public enum WiFiMode {
        UNKNOWN(0), CLIENT(2), AP(1), AP_CLIENT(3), DISABLED(4);

        WiFiMode(@SuppressWarnings("unused") int v) {}

        public static WiFiMode fromProto(WifiService.WiFiMode m) {
            return switch (m) {
                case WIFI_MODE_AP        -> AP;
                case WIFI_MODE_CLIENT    -> CLIENT;
                case WIFI_MODE_AP_CLIENT -> AP_CLIENT;
                case WIFI_MODE_DISABLED  -> DISABLED;
                default                  -> UNKNOWN;
            };
        }
    }

    /**
     * Status information for a WiFi interface.
     */
    public record WiFiInterfaceInfo(
            String interfaceName,
            String macAddress,
            WiFiMode mode,
            String state,
            String ssid,
            String bssid,
            String band,
            String ipv4Address,
            String ipv4Gateway,
            int signalStrength,
            int channel
    ) {}

    /**
     * Configuration to connect to a WiFi network in client mode.
     */
    public record WiFiClientConfig(
            String interfaceName,
            String ssid,
            String password,
            String security,
            boolean dhcpEnabled,
            String ipv4Address,
            String ipv4Gateway,
            List<String> ipv4Dns
    ) {
        /** Convenience constructor with DHCP enabled and no static IP. */
        public WiFiClientConfig(String interfaceName, String ssid, String password,
                                String security, boolean dhcpEnabled) {
            this(interfaceName, ssid, password, security, dhcpEnabled, "", "", List.of());
        }
    }

    /**
     * Configuration to start a WiFi Access Point.
     */
    public record WiFiAPConfig(
            String interfaceName,
            String ssid,
            String password,
            String band,
            int channel
    ) {}

    /**
     * A network found during a WiFi scan.
     */
    public record ScannedNetwork(
            String ssid,
            String bssid,
            String security,
            String band,
            int signalStrength,
            int channel,
            boolean hidden
    ) {}

    // -------------------------------------------------------------------------
    // Interface info
    // -------------------------------------------------------------------------

    /**
     * Returns status information for all WiFi interfaces.
     *
     * @throws WiFiException If the server returns an error.
     */
    public List<WiFiInterfaceInfo> listInterfaces() throws WiFiException {
        WifiService.WiFiInterfacesResponse resp =
                stub.listWiFiInterfaces(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListInterfaces");
        List<WiFiInterfaceInfo> out = new ArrayList<>();
        for (WifiService.WiFiLinkProperties p : resp.getInterfacesList()) {
            out.add(linkToDto(p));
        }
        return out;
    }

    /**
     * Returns the current link properties of a specific interface.
     *
     * @param ifname Interface name (e.g. "wlan0").
     * @throws WiFiException If the server returns an error.
     */
    public WiFiInterfaceInfo getLinkProperties(String ifname) throws WiFiException {
        WifiService.WiFiLinkPropertiesResponse resp = stub.getWiFiLinkProperties(
                WifiService.WiFiInterfaceRequest.newBuilder().setInterfaceName(ifname).build());
        checkError(resp.getError(), "GetLinkProperties");
        return linkToDto(resp.getProperties());
    }

    /**
     * Returns {@code true} if the interface has an active WiFi association.
     *
     * @param ifname Interface name (e.g. "wlan0").
     * @throws WiFiException If the server returns an error.
     */
    public boolean isConnected(String ifname) throws WiFiException {
        Types.BooleanResponse resp = stub.isWiFiConnected(
                WifiService.WiFiInterfaceRequest.newBuilder().setInterfaceName(ifname).build());
        checkError(resp.getError(), "IsConnected");
        return resp.getValue();
    }

    // -------------------------------------------------------------------------
    // Client mode
    // -------------------------------------------------------------------------

    /**
     * Configures and connects to a WiFi network.
     *
     * <p>Example:
     * <pre>{@code
     * wifi.connect(new WiFiManager.WiFiClientConfig("wlan0", "MySSID", "pass", "WPA2", true));
     * }</pre>
     *
     * @throws WiFiException If the server returns an error.
     */
    public void connect(WiFiClientConfig cfg) throws WiFiException {
        WifiService.ClientConfig.Builder req = WifiService.ClientConfig.newBuilder()
                .setInterfaceName(cfg.interfaceName())
                .setSsid(cfg.ssid())
                .setPassword(cfg.password())
                .setSecurity(cfg.security())
                .setDhcpEnable(cfg.dhcpEnabled());
        if (cfg.ipv4Address() != null) req.setIpv4Address(cfg.ipv4Address());
        if (cfg.ipv4Gateway() != null) req.setIpv4Gateway(cfg.ipv4Gateway());
        if (cfg.ipv4Dns() != null)     req.addAllIpv4Dns(cfg.ipv4Dns());

        Types.BooleanResponse resp = stub.setClientConfig(req.build());
        checkError(resp.getError(), "Connect");
    }

    /**
     * Reconnects using the previously saved configuration.
     *
     * @param ifname Interface name (e.g. "wlan0").
     * @throws WiFiException If the server returns an error.
     */
    public void reconnect(String ifname) throws WiFiException {
        Types.BooleanResponse resp = stub.connect(
                WifiService.WiFiInterfaceRequest.newBuilder().setInterfaceName(ifname).build());
        checkError(resp.getError(), "Reconnect");
    }

    /**
     * Disconnects from the current WiFi network.
     *
     * @param ifname Interface name (e.g. "wlan0").
     * @throws WiFiException If the server returns an error.
     */
    public void disconnect(String ifname) throws WiFiException {
        Types.BooleanResponse resp = stub.disconnect(
                WifiService.WiFiInterfaceRequest.newBuilder().setInterfaceName(ifname).build());
        checkError(resp.getError(), "Disconnect");
    }

    // -------------------------------------------------------------------------
    // Access Point
    // -------------------------------------------------------------------------

    /**
     * Configures and starts a WiFi Access Point.
     *
     * <p>Example:
     * <pre>{@code
     * wifi.startHotspot(new WiFiManager.WiFiAPConfig("wlan0", "OrbitAP", "orbit1234", "2.4GHz", 6));
     * }</pre>
     *
     * @throws WiFiException If the server returns an error.
     */
    public void startHotspot(WiFiAPConfig cfg) throws WiFiException {
        Types.BooleanResponse resp = stub.setAPConfig(
                WifiService.APConfig.newBuilder()
                        .setInterfaceName(cfg.interfaceName())
                        .setSsid(cfg.ssid())
                        .setPassword(cfg.password())
                        .setBand(cfg.band())
                        .setChannel(cfg.channel())
                        .build());
        checkError(resp.getError(), "StartHotspot");
    }

    /**
     * Stops the WiFi Access Point on the given interface.
     *
     * @param ifname Interface name (e.g. "wlan0").
     * @throws WiFiException If the server returns an error.
     */
    public void stopHotspot(String ifname) throws WiFiException {
        Types.BooleanResponse resp = stub.stopAP(
                WifiService.WiFiInterfaceRequest.newBuilder().setInterfaceName(ifname).build());
        checkError(resp.getError(), "StopHotspot");
    }

    // -------------------------------------------------------------------------
    // Scan
    // -------------------------------------------------------------------------

    /**
     * Returns the list of WiFi networks visible to an interface.
     *
     * @param ifname       Interface name (e.g. "wlan0").
     * @param forceRescan  If {@code true} a new hardware scan is triggered (~3 s);
     *                     otherwise cached results are returned.
     * @return List of scanned networks ordered by signal strength (strongest first).
     * @throws WiFiException If the server returns an error.
     */
    public List<ScannedNetwork> scan(String ifname, boolean forceRescan) throws WiFiException {
        WifiService.ScanWiFiResponse resp = stub.scanWiFi(
                WifiService.ScanWiFiRequest.newBuilder()
                        .setInterfaceName(ifname)
                        .setForceRescan(forceRescan)
                        .build());
        checkError(resp.getError(), "Scan");
        List<ScannedNetwork> nets = new ArrayList<>();
        for (WifiService.ScannedNetwork n : resp.getNetworksList()) {
            nets.add(new ScannedNetwork(
                    n.getSsid(), n.getBssid(), n.getSecurity(),
                    n.getBand(), n.getSignalStrength(), n.getChannel(), n.getHidden()));
        }
        return nets;
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private WiFiInterfaceInfo linkToDto(WifiService.WiFiLinkProperties p) {
        if (p == null) return new WiFiInterfaceInfo("", "", WiFiMode.UNKNOWN, "", "", "", "", "", "", 0, 0);
        String ssid = "", bssid = "", band = "", ipv4 = "", gw = "";
        int signal = 0, channel = 0;
        WifiService.ClientProperties cp = p.getClientProperties();
        if (cp != null) {
            ssid    = cp.getSsid();
            bssid   = cp.getBssid();
            band    = cp.getBand();
            ipv4    = cp.getIpv4Address();
            gw      = cp.getIpv4Gateway();
            signal  = cp.getSignalStrength();
            channel = cp.getChannel();
        }
        return new WiFiInterfaceInfo(
                p.getInterfaceName(),
                p.getMacAddress(),
                WiFiMode.fromProto(p.getMode()),
                p.getState().name(),
                ssid, bssid, band, ipv4, gw, signal, channel);
    }

    private void checkError(Types.ErrorInfo error, String method) throws WiFiException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new WiFiException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the WiFiService returns a server-side error.
     */
    public static class WiFiException extends Exception {
        private final Types.ErrorCode errorCode;

        public WiFiException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
