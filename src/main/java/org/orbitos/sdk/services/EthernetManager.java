package org.orbitos.sdk.services;

import api.gravity.v26.EthernetServiceGrpc;
import api.gravity.v26.EthernetServiceOuterClass;
import api.gravity.types.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * SDK Wrapper for EthernetService.
 * Provides Ethernet interface status and configuration.
 *
 * <p>Obtain via {@code client.ethernetManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * EthernetManager eth = client.ethernetManager();
 *
 * List<EthernetManager.EthernetInterfaceInfo> ifaces = eth.listInterfaces();
 * for (EthernetManager.EthernetInterfaceInfo i : ifaces) {
 *     System.out.println(i.interfaceName() + "  ip=" + i.ipv4Address() + "  connected=" + i.connected());
 * }
 *
 * // Configure static IP
 * eth.setStaticConfig("eth0", "192.168.1.10/24", "192.168.1.1", List.of("8.8.8.8"));
 * }</pre>
 */
public class EthernetManager {

    private final EthernetServiceGrpc.EthernetServiceBlockingStub stub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public EthernetManager(EthernetServiceGrpc.EthernetServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // DTOs
    // -------------------------------------------------------------------------

    /**
     * Current state and link properties of an Ethernet interface.
     */
    public record EthernetInterfaceInfo(
            String interfaceName,
            String macAddress,
            String state,
            boolean connected,
            int mtu,
            boolean dhcpEnabled,
            String ipv4Address,
            String ipv4Gateway,
            List<String> ipv4Dns
    ) {}

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Returns all Ethernet interfaces found on the device.
     *
     * @throws EthernetException If the server returns an error.
     */
    public List<EthernetInterfaceInfo> listInterfaces() throws EthernetException {
        EthernetServiceOuterClass.EthernetInterfacesResponse resp =
                stub.listEthernetInterfaces(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListInterfaces");
        List<EthernetInterfaceInfo> out = new ArrayList<>();
        for (EthernetServiceOuterClass.EthernetLinkProperties p : resp.getInterfacesList()) {
            out.add(propsToDto(p, false));
        }
        return out;
    }

    /**
     * Returns link properties for a specific Ethernet interface.
     *
     * @param ifname Interface name (e.g. "eth0").
     * @throws EthernetException If the server returns an error.
     */
    public EthernetInterfaceInfo getLinkProperties(String ifname) throws EthernetException {
        EthernetServiceOuterClass.EthernetLinkPropertiesResponse resp = stub.getEthernetLinkProperties(
                EthernetServiceOuterClass.InterfaceRequest.newBuilder()
                        .setInterfaceName(ifname).build());
        checkError(resp.getError(), "GetLinkProperties");
        return propsToDto(resp.getProperties(), true);
    }

    /**
     * Returns {@code true} if the given interface has an active Ethernet link.
     *
     * @param ifname Interface name (e.g. "eth0").
     * @throws EthernetException If the server returns an error.
     */
    public boolean isConnected(String ifname) throws EthernetException {
        Types.BooleanResponse resp = stub.isEthernetConnected(
                EthernetServiceOuterClass.InterfaceRequest.newBuilder()
                        .setInterfaceName(ifname).build());
        checkError(resp.getError(), "IsConnected");
        return resp.getValue();
    }

    /**
     * Configures static IP addressing for an Ethernet interface.
     *
     * @param ifname      Interface name (e.g. "eth0").
     * @param ipv4Address IPv4 address in CIDR format (e.g. "192.168.1.10/24").
     * @param gateway     Default gateway (e.g. "192.168.1.1").
     * @param dns         DNS server addresses (e.g. ["8.8.8.8", "1.1.1.1"]).
     * @throws EthernetException If the server returns an error.
     */
    public void setStaticConfig(String ifname, String ipv4Address,
                                String gateway, List<String> dns) throws EthernetException {
        Types.BooleanResponse resp = stub.setEthernetConfig(
                EthernetServiceOuterClass.EthernetConfig.newBuilder()
                        .setInterfaceName(ifname)
                        .setDhcpEnable(false)
                        .setIpv4Address(ipv4Address)
                        .setIpv4Gateway(gateway)
                        .addAllIpv4Dns(dns != null ? dns : List.of())
                        .build());
        checkError(resp.getError(), "SetStaticConfig");
    }

    /**
     * Configures DHCP addressing for an Ethernet interface.
     *
     * @param ifname Interface name (e.g. "eth0").
     * @throws EthernetException If the server returns an error.
     */
    public void setDhcp(String ifname) throws EthernetException {
        Types.BooleanResponse resp = stub.setEthernetConfig(
                EthernetServiceOuterClass.EthernetConfig.newBuilder()
                        .setInterfaceName(ifname)
                        .setDhcpEnable(true)
                        .build());
        checkError(resp.getError(), "SetDhcp");
    }

    /**
     * Enables the Ethernet interface (brings it up).
     *
     * @param ifname Interface name (e.g. "eth0").
     * @throws EthernetException If the server returns an error.
     */
    public void enable(String ifname) throws EthernetException {
        Types.BooleanResponse resp = stub.enableEthernet(
                EthernetServiceOuterClass.InterfaceRequest.newBuilder()
                        .setInterfaceName(ifname).build());
        checkError(resp.getError(), "Enable");
    }

    /**
     * Disables the Ethernet interface (brings it down).
     *
     * @param ifname Interface name (e.g. "eth0").
     * @throws EthernetException If the server returns an error.
     */
    public void disable(String ifname) throws EthernetException {
        Types.BooleanResponse resp = stub.disableEthernet(
                EthernetServiceOuterClass.InterfaceRequest.newBuilder()
                        .setInterfaceName(ifname).build());
        checkError(resp.getError(), "Disable");
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private EthernetInterfaceInfo propsToDto(EthernetServiceOuterClass.EthernetLinkProperties p,
                                             boolean checkConnected) {
        if (p == null) return new EthernetInterfaceInfo("", "", "UNKNOWN", false, 0, false, "", "", List.of());
        boolean connected = p.getState() == EthernetServiceOuterClass.EthernetState.ETH_CONNECTED;
        return new EthernetInterfaceInfo(
                p.getInterfaceName(),
                p.getMacAddress(),
                p.getState().name(),
                connected,
                p.getMtu(),
                p.getDhcpEnable(),
                p.getIpv4Address(),
                p.getIpv4Gateway(),
                new ArrayList<>(p.getIpv4DnsList()));
    }

    private void checkError(Types.ErrorInfo error, String method) throws EthernetException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new EthernetException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the EthernetService returns a server-side error.
     */
    public static class EthernetException extends Exception {
        private final Types.ErrorCode errorCode;

        public EthernetException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
