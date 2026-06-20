package org.orbitos.sdk.services;

import api.gravity.types.Types;
import api.gravity.v26.VPNServiceGrpc;
import api.gravity.v26.VpnService;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * SDK wrapper for VPNService.
 * Manages WireGuard, OpenVPN, and IPSec tunnels on the device.
 *
 * <p>Obtain via {@code client.vpnManager()}.
 *
 * <p>Example — apply a WireGuard config and connect:
 * <pre>{@code
 * VpnManager vpn = client.vpnManager();
 * byte[] conf = Files.readAllBytes(Path.of("wg0.conf"));
 * String profileId = vpn.applyWireGuard("Home VPN", conf, false);
 * String sessionId = vpn.connect(profileId);
 * }</pre>
 */
public class VpnManager {

    private final VPNServiceGrpc.VPNServiceBlockingStub blockingStub;
    private final VPNServiceGrpc.VPNServiceStub asyncStub;

    public VpnManager(VPNServiceGrpc.VPNServiceBlockingStub blockingStub,
                      VPNServiceGrpc.VPNServiceStub asyncStub) {
        this.blockingStub = blockingStub;
        this.asyncStub    = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** Supported VPN provider types. */
    public enum VpnProvider {
        UNSPECIFIED, WIREGUARD, OPENVPN, IPSEC, CUSTOM;

        static VpnProvider fromProto(VpnService.VpnProvider p) {
            return switch (p) {
                case VPN_PROVIDER_WIREGUARD -> WIREGUARD;
                case VPN_PROVIDER_OPENVPN   -> OPENVPN;
                case VPN_PROVIDER_IPSEC     -> IPSEC;
                case VPN_PROVIDER_CUSTOM    -> CUSTOM;
                default                     -> UNSPECIFIED;
            };
        }

        VpnService.VpnProvider toProto() {
            return switch (this) {
                case WIREGUARD  -> VpnService.VpnProvider.VPN_PROVIDER_WIREGUARD;
                case OPENVPN    -> VpnService.VpnProvider.VPN_PROVIDER_OPENVPN;
                case IPSEC      -> VpnService.VpnProvider.VPN_PROVIDER_IPSEC;
                case CUSTOM     -> VpnService.VpnProvider.VPN_PROVIDER_CUSTOM;
                default         -> VpnService.VpnProvider.VPN_PROVIDER_UNSPECIFIED;
            };
        }
    }

    /** Current state of a VPN tunnel. */
    public enum TunnelState {
        UNSPECIFIED, DOWN, CONNECTING, UP, DEGRADED, ERROR;

        static TunnelState fromProto(VpnService.TunnelState s) {
            return switch (s) {
                case TUNNEL_STATE_DOWN       -> DOWN;
                case TUNNEL_STATE_CONNECTING -> CONNECTING;
                case TUNNEL_STATE_UP         -> UP;
                case TUNNEL_STATE_DEGRADED   -> DEGRADED;
                case TUNNEL_STATE_ERROR      -> ERROR;
                default                      -> UNSPECIFIED;
            };
        }
    }

    /**
     * A persisted VPN profile.
     *
     * @param profileId   Server-assigned ID (empty when creating a new profile).
     * @param displayName Human-readable name.
     * @param provider    VPN provider type.
     * @param configData  Raw provider config bytes (WireGuard .conf, OpenVPN .ovpn, etc.).
     * @param autoConnect Connect automatically on boot or when the network comes up.
     * @param secretRef   Optional reference to the secrets store (future use).
     */
    public record VpnProfile(
            String profileId,
            String displayName,
            VpnProvider provider,
            byte[] configData,
            boolean autoConnect,
            String secretRef) {}

    /**
     * An active VPN session.
     *
     * @param sessionId        Server-assigned session ID.
     * @param profileId        Profile this session belongs to.
     * @param provider         VPN provider in use.
     * @param state            Current tunnel state.
     * @param interfaceName    System network interface name (e.g. {@code wg0}).
     * @param rxBytes          Bytes received since session start.
     * @param txBytes          Bytes transmitted since session start.
     * @param startedAtUnixMs  Unix timestamp (milliseconds, UTC) when the session started.
     */
    public record VpnSession(
            String sessionId,
            String profileId,
            VpnProvider provider,
            TunnelState state,
            String interfaceName,
            long rxBytes,
            long txBytes,
            long startedAtUnixMs) {}

    /**
     * Available VPN providers on the device.
     *
     * @param wireguard WireGuard kernel module available.
     * @param openVpn   OpenVPN binary available.
     * @param ipsec     IPSec available.
     */
    public record VpnCapabilities(boolean wireguard, boolean openVpn, boolean ipsec) {}

    /** Handle to a running event stream. Call {@link #cancel()} to stop. */
    public interface StreamHandle {
        void cancel();
    }

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Returns which VPN providers are available on the device.
     *
     * @throws VpnException if the server returns an error.
     */
    public VpnCapabilities getCapabilities() throws VpnException {
        VpnService.VpnCapabilitiesResponse resp =
                blockingStub.getCapabilities(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "GetCapabilities");
        VpnService.VpnCapabilities c = resp.getCapabilities();
        return new VpnCapabilities(c.getWireguard(), c.getOpenvpn(), c.getIpsec());
    }

    /**
     * Returns all saved VPN profiles (config data is not included in the response).
     *
     * @throws VpnException if the server returns an error.
     */
    public List<VpnProfile> listProfiles() throws VpnException {
        VpnService.VpnProfilesResponse resp =
                blockingStub.listProfiles(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListProfiles");
        List<VpnProfile> out = new ArrayList<>();
        for (VpnService.VpnProfile p : resp.getProfilesList()) {
            out.add(fromProto(p));
        }
        return out;
    }

    /**
     * Creates or updates a VPN profile.
     * Pass an empty {@code profileId} to create; the server assigns and returns the ID.
     *
     * @param profile           The profile to apply.
     * @param connectAfterApply If {@code true}, start the tunnel immediately after saving.
     * @return The active profile ID assigned by the server.
     * @throws VpnException if the server returns an error.
     */
    public String applyProfile(VpnProfile profile, boolean connectAfterApply) throws VpnException {
        VpnService.ApplyProfileResponse resp = blockingStub.applyProfile(
                VpnService.ApplyProfileRequest.newBuilder()
                        .setProfile(toProto(profile))
                        .setConnectAfterApply(connectAfterApply)
                        .build());
        checkError(resp.getError(), "ApplyProfile");
        return resp.getActiveProfileId();
    }

    /**
     * Convenience overload — apply a WireGuard profile.
     *
     * @param displayName Human-readable name.
     * @param configData  Raw {@code .conf} file content.
     * @param autoConnect Auto-connect on boot/network-up.
     * @return The profile ID assigned by the server.
     * @throws VpnException if the server returns an error.
     */
    public String applyWireGuard(String displayName, byte[] configData, boolean autoConnect)
            throws VpnException {
        return applyProfile(new VpnProfile("", displayName, VpnProvider.WIREGUARD, configData, autoConnect, ""), false);
    }

    /**
     * Convenience overload — apply an OpenVPN profile.
     *
     * @param displayName Human-readable name.
     * @param configData  Raw {@code .ovpn} file content.
     * @param autoConnect Auto-connect on boot/network-up.
     * @return The profile ID assigned by the server.
     * @throws VpnException if the server returns an error.
     */
    public String applyOpenVpn(String displayName, byte[] configData, boolean autoConnect)
            throws VpnException {
        return applyProfile(new VpnProfile("", displayName, VpnProvider.OPENVPN, configData, autoConnect, ""), false);
    }

    /**
     * Deletes a profile by ID. Disconnects the tunnel first if it is active.
     *
     * @param profileId Profile ID to remove.
     * @return {@code true} if removed successfully.
     * @throws VpnException if the server returns an error.
     */
    public boolean removeProfile(String profileId) throws VpnException {
        Types.BooleanResponse resp = blockingStub.removeProfile(
                VpnService.VpnProfileRequest.newBuilder()
                        .setProfileId(profileId != null ? profileId : "")
                        .build());
        checkError(resp.getError(), "RemoveProfile");
        return resp.getValue();
    }

    /**
     * Activates a VPN profile by ID. The tunnel comes up asynchronously — use
     * {@link #watchEvents} or {@link #getStatus()} to track progress.
     *
     * @param profileId Profile ID to connect.
     * @return The server-assigned session ID.
     * @throws VpnException if the server returns an error.
     */
    public String connect(String profileId) throws VpnException {
        VpnService.ConnectResponse resp = blockingStub.connect(
                VpnService.VpnProfileRequest.newBuilder()
                        .setProfileId(profileId != null ? profileId : "")
                        .build());
        checkError(resp.getError(), "Connect");
        return resp.getSessionId();
    }

    /**
     * Tears down the active tunnel for the given profile.
     * Pass an empty string to disconnect whatever is currently active.
     *
     * @param profileId Profile ID to disconnect (or empty to disconnect any).
     * @return {@code true} if disconnected successfully.
     * @throws VpnException if the server returns an error.
     */
    public boolean disconnect(String profileId) throws VpnException {
        Types.BooleanResponse resp = blockingStub.disconnect(
                VpnService.VpnProfileRequest.newBuilder()
                        .setProfileId(profileId != null ? profileId : "")
                        .build());
        checkError(resp.getError(), "Disconnect");
        return resp.getValue();
    }

    /**
     * Returns the current active session and provider-specific JSON details.
     * The session is {@code null} when no tunnel is active.
     *
     * @return Two-element array: {@code [VpnSession|null, providerDetailsJson]}.
     * @throws VpnException if the server returns an error.
     */
    public StatusResult getStatus() throws VpnException {
        VpnService.GetStatusResponse resp =
                blockingStub.getStatus(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "GetStatus");
        VpnSession sess = resp.hasSession() ? sessionFromProto(resp.getSession()) : null;
        return new StatusResult(sess, resp.getProviderDetails());
    }

    /** Returned by {@link #getStatus()}. */
    public record StatusResult(VpnSession session, String providerDetails) {}

    /**
     * Returns all active sessions (at most one in the current runtime).
     *
     * @throws VpnException if the server returns an error.
     */
    public List<VpnSession> listSessions() throws VpnException {
        VpnService.SessionsResponse resp =
                blockingStub.listSessions(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListSessions");
        List<VpnSession> out = new ArrayList<>();
        for (VpnService.Session s : resp.getSessionsList()) {
            out.add(sessionFromProto(s));
        }
        return out;
    }

    /**
     * Returns {@code true} if there is an active tunnel in state {@code UP}.
     *
     * @throws VpnException if the server returns an error.
     */
    public boolean isConnected() throws VpnException {
        StatusResult r = getStatus();
        return r.session() != null && r.session().state() == TunnelState.UP;
    }

    /**
     * Watches VPN tunnel events asynchronously. The stream runs until {@link StreamHandle#cancel()}
     * is called or the server closes the connection.
     *
     * @param profileId Filter to a specific profile, or pass empty string for all profiles.
     * @param onEvent   Callback invoked for each event.
     * @param onError   Callback invoked on stream error.
     * @return A {@link StreamHandle} to cancel the subscription.
     */
    public StreamHandle watchEvents(String profileId,
                                    Consumer<VpnService.VPNEvent> onEvent,
                                    Consumer<Throwable> onError) {
        Context.CancellableContext ctx = Context.current().withCancellation();
        ctx.run(() -> asyncStub.watchEvents(
                VpnService.WatchEventsRequest.newBuilder()
                        .setProfileId(profileId != null ? profileId : "")
                        .build(),
                new StreamObserver<VpnService.VPNEvent>() {
                    @Override public void onNext(VpnService.VPNEvent e) { onEvent.accept(e); }
                    @Override public void onError(Throwable t)          { if (onError != null) onError.accept(t); }
                    @Override public void onCompleted()                 {}
                }));
        return () -> ctx.cancel(null);
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private VpnProfile fromProto(VpnService.VpnProfile p) {
        return new VpnProfile(
                p.getProfileId(),
                p.getDisplayName(),
                VpnProvider.fromProto(p.getProvider()),
                p.getConfigData().toByteArray(),
                p.getAutoConnect(),
                p.getSecretRef());
    }

    private VpnService.VpnProfile toProto(VpnProfile p) {
        VpnService.VpnProfile.Builder b = VpnService.VpnProfile.newBuilder()
                .setProfileId(p.profileId() != null ? p.profileId() : "")
                .setDisplayName(p.displayName() != null ? p.displayName() : "")
                .setProvider(p.provider().toProto())
                .setAutoConnect(p.autoConnect())
                .setSecretRef(p.secretRef() != null ? p.secretRef() : "");
        if (p.configData() != null) {
            b.setConfigData(com.google.protobuf.ByteString.copyFrom(p.configData()));
        }
        return b.build();
    }

    private VpnSession sessionFromProto(VpnService.Session s) {
        return new VpnSession(
                s.getSessionId(),
                s.getProfileId(),
                VpnProvider.fromProto(s.getProvider()),
                TunnelState.fromProto(s.getState()),
                s.getInterfaceName(),
                s.getRxBytes(),
                s.getTxBytes(),
                s.getStartedAtUnixMs());
    }

    private void checkError(Types.ErrorInfo error, String method) throws VpnException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new VpnException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /** Thrown when VPNService returns a server-side error. */
    public static class VpnException extends Exception {
        private final Types.ErrorCode errorCode;

        public VpnException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
