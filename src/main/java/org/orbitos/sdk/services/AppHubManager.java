package org.orbitos.sdk.services;

import api.gravity.types.Types;
import api.gravity.v26.AppHubServiceGrpc;
import api.gravity.v26.AppHubServiceOuterClass;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * SDK wrapper for AppHubService.
 * Registers the app's HTTP WebUI with the Gravity portal so it appears in the
 * device dashboard and is reachable via the portal's reverse proxy.
 *
 * <p>The portal derives the app's name and package_id from the caller's OS identity —
 * the app only declares where its HTTP server listens.
 *
 * <p>Obtain via {@code client.appHubManager()}.
 *
 * <p>Example — register a WebUI on port 9033:
 * <pre>{@code
 * client.appHubManager().registerWebUI("127.0.0.1", 9033, "/myapp");
 * // ... app runs ...
 * client.appHubManager().unregisterService();
 * }</pre>
 */
public class AppHubManager {

    private final AppHubServiceGrpc.AppHubServiceBlockingStub blockingStub;
    private final AppHubServiceGrpc.AppHubServiceStub asyncStub;

    public AppHubManager(AppHubServiceGrpc.AppHubServiceBlockingStub blockingStub,
                         AppHubServiceGrpc.AppHubServiceStub asyncStub) {
        this.blockingStub = blockingStub;
        this.asyncStub    = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** Health probe type for the portal to verify service liveness. */
    public enum HealthCheckType {
        UNKNOWN, HTTP, TCP;

        AppHubServiceOuterClass.HealthCheckType toProto() {
            return switch (this) {
                case HTTP -> AppHubServiceOuterClass.HealthCheckType.HEALTH_CHECK_HTTP;
                case TCP  -> AppHubServiceOuterClass.HealthCheckType.HEALTH_CHECK_TCP;
                default   -> AppHubServiceOuterClass.HealthCheckType.HEALTH_CHECK_UNKNOWN;
            };
        }
    }

    /** Controls how the portal exposes the service to the browser. */
    public enum ExposureMode {
        /** Default — portal reverse-proxies at {@code ip/<route_path>}. */
        PROXY,
        /** Portal redirects the browser to {@code ip:<port>/} directly. */
        REDIRECT;

        AppHubServiceOuterClass.ExposureMode toProto() {
            return switch (this) {
                case REDIRECT -> AppHubServiceOuterClass.ExposureMode.EXPOSURE_MODE_REDIRECT;
                default       -> AppHubServiceOuterClass.ExposureMode.EXPOSURE_MODE_PROXY;
            };
        }
    }

    /**
     * A registered service record returned by the portal.
     *
     * @param serviceId    Server-assigned UID.
     * @param name         Display name shown in the portal dashboard.
     * @param packageId    Installed app package ID.
     * @param host         Service host.
     * @param port         Service port.
     * @param healthy      Last known health check result.
     * @param routes       Path prefixes routed to this service.
     */
    public record Service(
            String serviceId,
            String name,
            String packageId,
            String host,
            int port,
            boolean healthy,
            List<String> routes) {}

    /** A proxy routing entry from the portal's routing table. */
    public record RoutingEntry(String path, String serviceId, String target) {}

    /** An event emitted when a service's registration or health changes. */
    public record ServiceEvent(
            AppHubServiceOuterClass.ServiceEventType type,
            Service service) {}

    /** Handle to a running event stream. Call {@link #cancel()} to stop. */
    public interface StreamHandle {
        void cancel();
    }

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * One-liner helper for the common case: an HTTP server with a TCP health check.
     * The portal will proxy requests at {@code route} to {@code host:port}.
     *
     * @param host  Service host (e.g. {@code "127.0.0.1"}).
     * @param port  Service port.
     * @param route Path prefix to proxy (e.g. {@code "/myapp"}).
     * @throws AppHubException if the registration fails.
     */
    public void registerWebUI(String host, int port, String route) throws AppHubException {
        AppHubServiceOuterClass.RegisterServiceRequest req =
                AppHubServiceOuterClass.RegisterServiceRequest.newBuilder()
                        .setHost(host != null ? host : "127.0.0.1")
                        .setPort(port)
                        .addRoutes(AppHubServiceOuterClass.Route.newBuilder().setPath(route).build())
                        .setHealth(AppHubServiceOuterClass.HealthCheck.newBuilder()
                                .setType(AppHubServiceOuterClass.HealthCheckType.HEALTH_CHECK_TCP)
                                .build())
                        .build();
        registerService(req);
    }

    /**
     * Full-control service registration. Prefer {@link #registerWebUI} for the common case.
     *
     * @throws AppHubException if the registration fails.
     */
    public void registerService(AppHubServiceOuterClass.RegisterServiceRequest req) throws AppHubException {
        AppHubServiceOuterClass.RegisterServiceResponse resp = blockingStub.registerService(req);
        checkError(resp.getError(), "RegisterService");
    }

    /**
     * Removes the app's registration from the portal. Safe to call on shutdown.
     *
     * @throws AppHubException if the server returns an error.
     */
    public void unregisterService() throws AppHubException {
        Types.BooleanResponse resp = blockingStub.unregisterService(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "UnregisterService");
    }

    /**
     * Adds an extra path prefix to the already-registered service.
     *
     * @param path Path prefix (e.g. {@code "/api"}).
     * @throws AppHubException if the server returns an error.
     */
    public void addRoute(String path) throws AppHubException {
        Types.BooleanResponse resp = blockingStub.addRoute(
                AppHubServiceOuterClass.AddRouteRequest.newBuilder()
                        .setRoute(AppHubServiceOuterClass.Route.newBuilder().setPath(path).build())
                        .build());
        checkError(resp.getError(), "AddRoute");
    }

    /**
     * Removes a path prefix from the registered service.
     *
     * @param path Path prefix to remove.
     * @throws AppHubException if the server returns an error.
     */
    public void removeRoute(String path) throws AppHubException {
        Types.BooleanResponse resp = blockingStub.removeRoute(
                AppHubServiceOuterClass.RemoveRouteRequest.newBuilder()
                        .setPath(path != null ? path : "")
                        .build());
        checkError(resp.getError(), "RemoveRoute");
    }

    /**
     * Returns the registration details for the given service ID.
     *
     * @throws AppHubException if the server returns an error.
     */
    public Service getService(String serviceId) throws AppHubException {
        AppHubServiceOuterClass.ServiceResponse resp = blockingStub.getService(
                AppHubServiceOuterClass.ServiceIdRequest.newBuilder()
                        .setServiceId(serviceId != null ? serviceId : "")
                        .build());
        checkError(resp.getError(), "GetService");
        return fromProto(resp.getService());
    }

    /**
     * Returns all services currently registered in the portal.
     *
     * @throws AppHubException if the server returns an error.
     */
    public List<Service> listServices() throws AppHubException {
        AppHubServiceOuterClass.ServicesResponse resp =
                blockingStub.listServices(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListServices");
        List<Service> out = new ArrayList<>();
        for (AppHubServiceOuterClass.Service s : resp.getServicesList()) {
            out.add(fromProto(s));
        }
        return out;
    }

    /**
     * Returns all current proxy routing entries.
     *
     * @throws AppHubException if the server returns an error.
     */
    public List<RoutingEntry> getRoutingTable() throws AppHubException {
        AppHubServiceOuterClass.RoutingTableResponse resp =
                blockingStub.getRoutingTable(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "GetRoutingTable");
        List<RoutingEntry> out = new ArrayList<>();
        for (AppHubServiceOuterClass.RoutingEntry e : resp.getEntriesList()) {
            out.add(new RoutingEntry(e.getPath(), e.getServiceId(), e.getTarget()));
        }
        return out;
    }

    /**
     * Watches service lifecycle events asynchronously. The stream runs until
     * {@link StreamHandle#cancel()} is called or the server closes the connection.
     *
     * @param onEvent Callback invoked for each event.
     * @param onError Callback invoked on stream error.
     * @return A {@link StreamHandle} to cancel the subscription.
     */
    public StreamHandle watchServices(Consumer<ServiceEvent> onEvent, Consumer<Throwable> onError) {
        Context.CancellableContext ctx = Context.current().withCancellation();
        ctx.run(() -> asyncStub.watchServices(
                Types.Empty.getDefaultInstance(),
                new StreamObserver<AppHubServiceOuterClass.ServiceEvent>() {
                    @Override public void onNext(AppHubServiceOuterClass.ServiceEvent e) {
                        onEvent.accept(new ServiceEvent(e.getType(), fromProto(e.getService())));
                    }
                    @Override public void onError(Throwable t) { if (onError != null) onError.accept(t); }
                    @Override public void onCompleted()        {}
                }));
        return () -> ctx.cancel(null);
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private Service fromProto(AppHubServiceOuterClass.Service s) {
        List<String> routes = new ArrayList<>();
        for (AppHubServiceOuterClass.Route r : s.getRoutesList()) routes.add(r.getPath());
        return new Service(
                s.getServiceId(), s.getName(), s.getPackageId(),
                s.getHost(), s.getPort(), s.getHealthy(), routes);
    }

    private void checkError(Types.ErrorInfo error, String method) throws AppHubException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new AppHubException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    private void checkError(AppHubServiceOuterClass.RegisterServiceResponse.Builder ignored,
                             String method) {}

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /** Thrown when AppHubService returns a server-side error. */
    public static class AppHubException extends Exception {
        private final Types.ErrorCode errorCode;

        public AppHubException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public AppHubException(String message) {
            super(message);
            this.errorCode = Types.ErrorCode.ERROR_CODE_INTERNAL;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
