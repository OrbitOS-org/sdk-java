package org.orbitos.sdk.services;

import api.gravity.v26.EventServiceGrpc;
import api.gravity.v26.EventServiceOuterClass;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * SDK wrapper for EventService.
 * Subscribes to system lifecycle events (app installs, network changes, reboots, etc.).
 *
 * <p>Obtain via {@code client.eventManager()}.
 *
 * <p>Example — subscribe to all events:
 * <pre>{@code
 * EventManager.StreamHandle h = client.eventManager().subscribeAsync(
 *     List.of(),                     // empty = all types
 *     ev -> System.out.println(ev.type() + " " + ev.payload()),
 *     err -> System.err.println(err));
 * Thread.sleep(10_000);
 * h.cancel();
 * }</pre>
 */
public class EventManager {

    private final EventServiceGrpc.EventServiceStub asyncStub;

    public EventManager(EventServiceGrpc.EventServiceStub asyncStub) {
        this.asyncStub = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** System event types emitted by Gravity. */
    public enum EventType {
        APP_INSTALLED, APP_REMOVED, APP_UPDATED,
        APP_STARTED, APP_STOPPED, APP_CRASHED, APP_REJECTED,
        SYSTEM_REBOOT, SYSTEM_FACTORY_RESET, SYSTEM_UPDATE,
        NET_UP, NET_DOWN, UNKNOWN;

        static EventType fromProto(EventServiceOuterClass.EventType t) {
            return switch (t) {
                case EVENT_APP_INSTALLED     -> APP_INSTALLED;
                case EVENT_APP_REMOVED       -> APP_REMOVED;
                case EVENT_APP_UPDATED       -> APP_UPDATED;
                case EVENT_APP_STARTED       -> APP_STARTED;
                case EVENT_APP_STOPPED       -> APP_STOPPED;
                case EVENT_APP_CRASHED       -> APP_CRASHED;
                case EVENT_APP_REJECTED      -> APP_REJECTED;
                case EVENT_SYSTEM_REBOOT     -> SYSTEM_REBOOT;
                case EVENT_SYSTEM_FACTORY_RESET -> SYSTEM_FACTORY_RESET;
                case EVENT_SYSTEM_UPDATE     -> SYSTEM_UPDATE;
                case EVENT_NET_UP            -> NET_UP;
                case EVENT_NET_DOWN          -> NET_DOWN;
                default                      -> UNKNOWN;
            };
        }

        EventServiceOuterClass.EventType toProto() {
            return switch (this) {
                case APP_INSTALLED     -> EventServiceOuterClass.EventType.EVENT_APP_INSTALLED;
                case APP_REMOVED       -> EventServiceOuterClass.EventType.EVENT_APP_REMOVED;
                case APP_UPDATED       -> EventServiceOuterClass.EventType.EVENT_APP_UPDATED;
                case APP_STARTED       -> EventServiceOuterClass.EventType.EVENT_APP_STARTED;
                case APP_STOPPED       -> EventServiceOuterClass.EventType.EVENT_APP_STOPPED;
                case APP_CRASHED       -> EventServiceOuterClass.EventType.EVENT_APP_CRASHED;
                case APP_REJECTED      -> EventServiceOuterClass.EventType.EVENT_APP_REJECTED;
                case SYSTEM_REBOOT     -> EventServiceOuterClass.EventType.EVENT_SYSTEM_REBOOT;
                case SYSTEM_FACTORY_RESET -> EventServiceOuterClass.EventType.EVENT_SYSTEM_FACTORY_RESET;
                case SYSTEM_UPDATE     -> EventServiceOuterClass.EventType.EVENT_SYSTEM_UPDATE;
                case NET_UP            -> EventServiceOuterClass.EventType.EVENT_NET_UP;
                case NET_DOWN          -> EventServiceOuterClass.EventType.EVENT_NET_DOWN;
                default                -> EventServiceOuterClass.EventType.EVENT_TYPE_UNKNOWN;
            };
        }
    }

    /**
     * A system event received from Gravity.
     *
     * @param type      The event type.
     * @param timestamp Unix timestamp (seconds) when the event occurred.
     * @param payload   Optional JSON payload with event-specific details.
     */
    public record Event(EventType type, long timestamp, String payload) {}

    /** Handle to a running event subscription. Call {@link #cancel()} to stop. */
    public interface StreamHandle {
        void cancel();
    }

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Subscribes asynchronously to system events. The stream runs until {@link StreamHandle#cancel()} is called.
     *
     * @param types   Event types to receive. Pass an empty list to receive all types.
     * @param onEvent Callback invoked for each received event.
     * @param onError Callback invoked on stream error or completion.
     * @return A {@link StreamHandle} to cancel the subscription.
     */
    public StreamHandle subscribeAsync(
            List<EventType> types,
            Consumer<Event> onEvent,
            Consumer<Throwable> onError) {

        List<EventServiceOuterClass.EventType> protoTypes = new ArrayList<>();
        if (types != null) {
            for (EventType t : types) protoTypes.add(t.toProto());
        }

        Context.CancellableContext ctx = Context.current().withCancellation();

        ctx.run(() -> asyncStub.subscribe(
                EventServiceOuterClass.SubscribeRequest.newBuilder()
                        .addAllTypes(protoTypes)
                        .build(),
                new StreamObserver<EventServiceOuterClass.Event>() {
                    @Override public void onNext(EventServiceOuterClass.Event ev) {
                        onEvent.accept(new Event(
                                EventType.fromProto(ev.getType()),
                                ev.getTimestamp(),
                                ev.getPayload()));
                    }
                    @Override public void onError(Throwable t) {
                        if (onError != null) onError.accept(t);
                    }
                    @Override public void onCompleted() {}
                }));

        return () -> ctx.cancel(null);
    }
}
