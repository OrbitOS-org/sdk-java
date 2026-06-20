package org.orbitos.sdk.services;

import api.gravity.v26.FirewallServiceGrpc;
import api.gravity.v26.FirewallServiceOuterClass;
import api.gravity.types.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * SDK Wrapper for FirewallService.
 * Manages firewall zones (interface groups + default policies) and traffic rules.
 *
 * <p>Obtain via {@code client.firewallManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * FirewallManager fw = client.firewallManager();
 *
 * // Create a zone that drops all inbound traffic on WAN
 * fw.addZone("wan", List.of("eth0"), FirewallManager.Policy.DROP, FirewallManager.Policy.ACCEPT, true);
 *
 * // Open port 22 from the WAN zone
 * fw.addRule(new FirewallManager.FirewallRule(
 *         "wan", "", FirewallManager.Protocol.TCP, "", 22, FirewallManager.Policy.ACCEPT, "SSH access"));
 * }</pre>
 */
public class FirewallManager {

    private final FirewallServiceGrpc.FirewallServiceBlockingStub stub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public FirewallManager(FirewallServiceGrpc.FirewallServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** Firewall zone/rule policy. */
    public enum Policy {
        ACCEPT, DROP, REJECT;

        public FirewallServiceOuterClass.ZonePolicy toProto() {
            return switch (this) {
                case ACCEPT -> FirewallServiceOuterClass.ZonePolicy.POLICY_ACCEPT;
                case DROP   -> FirewallServiceOuterClass.ZonePolicy.POLICY_DROP;
                case REJECT -> FirewallServiceOuterClass.ZonePolicy.POLICY_REJECT;
            };
        }

        public static Policy fromProto(FirewallServiceOuterClass.ZonePolicy p) {
            return switch (p) {
                case POLICY_DROP   -> DROP;
                case POLICY_REJECT -> REJECT;
                default            -> ACCEPT;
            };
        }
    }

    /** Network protocol for a firewall rule. */
    public enum Protocol {
        ANY, TCP, UDP, ICMP;

        public FirewallServiceOuterClass.FirewallProtocol toProto() {
            return switch (this) {
                case TCP  -> FirewallServiceOuterClass.FirewallProtocol.PROTO_TCP;
                case UDP  -> FirewallServiceOuterClass.FirewallProtocol.PROTO_UDP;
                case ICMP -> FirewallServiceOuterClass.FirewallProtocol.PROTO_ICMP;
                default   -> FirewallServiceOuterClass.FirewallProtocol.PROTO_ANY;
            };
        }

        public static Protocol fromProto(FirewallServiceOuterClass.FirewallProtocol p) {
            return switch (p) {
                case PROTO_TCP  -> TCP;
                case PROTO_UDP  -> UDP;
                case PROTO_ICMP -> ICMP;
                default         -> ANY;
            };
        }
    }

    /**
     * A firewall zone groups one or more network interfaces under a shared policy.
     */
    public record Zone(
            String name,
            List<String> interfaces,
            Policy inputPolicy,
            Policy outputPolicy,
            boolean masquerade
    ) {}

    /**
     * A firewall rule that overrides the zone default policy for specific traffic.
     *
     * @param id        Server-assigned rule identifier (empty when creating a new rule).
     * @param srcZone   Source zone name (empty = any zone).
     * @param dstZone   Destination zone name (empty = any zone).
     * @param protocol  Network protocol.
     * @param srcIp     Source IP in CIDR format (e.g. "192.168.1.0/24"; empty = any).
     * @param destPort  Destination port (0 = any).
     * @param action    Rule action.
     * @param comment   Human-readable description.
     */
    public record FirewallRule(
            String id,
            String srcZone,
            String dstZone,
            Protocol protocol,
            String srcIp,
            int destPort,
            Policy action,
            String comment
    ) {
        /** Convenience constructor for new rules (id is assigned by the server). */
        public FirewallRule(String srcZone, String dstZone, Protocol protocol,
                            String srcIp, int destPort, Policy action, String comment) {
            this("", srcZone, dstZone, protocol, srcIp, destPort, action, comment);
        }
    }

    // -------------------------------------------------------------------------
    // Zone methods
    // -------------------------------------------------------------------------

    /**
     * Returns all firewall zones configured on the device.
     *
     * @throws FirewallException If the server returns an error.
     */
    public List<Zone> listZones() throws FirewallException {
        FirewallServiceOuterClass.ZonesResponse resp =
                stub.listZones(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListZones");
        List<Zone> out = new ArrayList<>();
        for (FirewallServiceOuterClass.ZoneRequest z : resp.getZonesList()) {
            out.add(new Zone(
                    z.getName(),
                    new ArrayList<>(z.getInterfacesList()),
                    Policy.fromProto(z.getInputPolicy()),
                    Policy.fromProto(z.getOutputPolicy()),
                    z.getMasquerade()));
        }
        return out;
    }

    /**
     * Adds a new firewall zone.
     *
     * @param name          Zone name (e.g. "lan", "wan").
     * @param interfaces    Network interfaces included in this zone (e.g. ["eth0"]).
     * @param inputPolicy   Default policy for inbound traffic.
     * @param outputPolicy  Default policy for outbound traffic.
     * @param masquerade    If {@code true} enables NAT/masquerade (typically only on WAN zones).
     * @throws FirewallException If the server returns an error.
     */
    public void addZone(String name, List<String> interfaces,
                        Policy inputPolicy, Policy outputPolicy,
                        boolean masquerade) throws FirewallException {
        Types.BooleanResponse resp = stub.addZone(
                FirewallServiceOuterClass.ZoneRequest.newBuilder()
                        .setName(name)
                        .addAllInterfaces(interfaces != null ? interfaces : List.of())
                        .setInputPolicy(inputPolicy.toProto())
                        .setOutputPolicy(outputPolicy.toProto())
                        .setMasquerade(masquerade)
                        .build());
        checkError(resp.getError(), "AddZone");
    }

    /**
     * Removes a firewall zone by name.
     *
     * @param name Zone name.
     * @throws FirewallException If the server returns an error.
     */
    public void removeZone(String name) throws FirewallException {
        Types.BooleanResponse resp = stub.removeZone(
                FirewallServiceOuterClass.ZoneNameRequest.newBuilder().setName(name).build());
        checkError(resp.getError(), "RemoveZone");
    }

    // -------------------------------------------------------------------------
    // Rule methods
    // -------------------------------------------------------------------------

    /**
     * Returns all firewall rules.
     *
     * @throws FirewallException If the server returns an error.
     */
    public List<FirewallRule> listRules() throws FirewallException {
        FirewallServiceOuterClass.FirewallRulesResponse resp =
                stub.listRules(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListRules");
        List<FirewallRule> out = new ArrayList<>();
        for (FirewallServiceOuterClass.FirewallRule r : resp.getRulesList()) {
            out.add(new FirewallRule(
                    r.getId(), r.getSrcZone(), r.getDstZone(),
                    Protocol.fromProto(r.getProtocol()),
                    r.getSrcIp(), r.getDestPort(),
                    Policy.fromProto(r.getAction()), r.getComment()));
        }
        return out;
    }

    /**
     * Adds a new firewall rule.
     *
     * @param rule Rule to add (the {@code id} field is ignored; the server assigns it).
     * @throws FirewallException If the server returns an error.
     */
    public void addRule(FirewallRule rule) throws FirewallException {
        Types.BooleanResponse resp = stub.addRule(
                FirewallServiceOuterClass.FirewallRuleRequest.newBuilder()
                        .setSrcZone(rule.srcZone())
                        .setDstZone(rule.dstZone())
                        .setProtocol(rule.protocol().toProto())
                        .setSrcIp(rule.srcIp())
                        .setDestPort(rule.destPort())
                        .setAction(rule.action().toProto())
                        .setComment(rule.comment())
                        .build());
        checkError(resp.getError(), "AddRule");
    }

    /**
     * Removes a firewall rule by its server-assigned ID.
     *
     * @param id Rule ID (obtained from {@link #listRules()}).
     * @throws FirewallException If the server returns an error.
     */
    public void removeRule(String id) throws FirewallException {
        Types.BooleanResponse resp = stub.removeRule(
                FirewallServiceOuterClass.FirewallRuleIdRequest.newBuilder().setId(id).build());
        checkError(resp.getError(), "RemoveRule");
    }

    /**
     * Removes all firewall rules.
     *
     * @throws FirewallException If the server returns an error.
     */
    public void flushRules() throws FirewallException {
        Types.BooleanResponse resp = stub.flushRules(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "FlushRules");
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws FirewallException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new FirewallException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the FirewallService returns a server-side error.
     */
    public static class FirewallException extends Exception {
        private final Types.ErrorCode errorCode;

        public FirewallException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
