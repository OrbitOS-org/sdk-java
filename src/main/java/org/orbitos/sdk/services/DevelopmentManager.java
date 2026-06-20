package org.orbitos.sdk.services;

import api.gravity.v26.DevelopmentServiceGrpc;
import api.gravity.v26.DevelopmentServiceOuterClass;
import io.grpc.stub.StreamObserver;

import java.util.function.Consumer;

/**
 * SDK Wrapper for DevelopmentService.
 * Provides real-time log streaming from OrbitOS applications for remote development.
 *
 * <p>Obtain via {@code client.developmentManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * DevelopmentManager dev = client.developmentManager();
 *
 * // Stream all logs in real time
 * DevelopmentManager.StreamHandle h = dev.subscribeLogsAsync(
 *         "", "",               // all apps, all tags
 *         DevelopmentManager.LogLevel.DEBUG,
 *         entry -> System.out.println("[" + entry.app() + "] " + entry.message()),
 *         err   -> System.err.println("stream error: " + err.getMessage()));
 *
 * // Later, to stop:
 * h.cancel();
 * }</pre>
 */
public class DevelopmentManager {

    private final DevelopmentServiceGrpc.DevelopmentServiceStub asyncStub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public DevelopmentManager(DevelopmentServiceGrpc.DevelopmentServiceStub asyncStub) {
        this.asyncStub = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** Log level filter. */
    public enum LogLevel {
        DEBUG, INFO, WARNING, ERROR, FATAL;

        DevelopmentServiceOuterClass.LogLevel toProto() {
            return switch (this) {
                case INFO    -> DevelopmentServiceOuterClass.LogLevel.LOG_LEVEL_INFO;
                case WARNING -> DevelopmentServiceOuterClass.LogLevel.LOG_LEVEL_WARNING;
                case ERROR   -> DevelopmentServiceOuterClass.LogLevel.LOG_LEVEL_ERROR;
                case FATAL   -> DevelopmentServiceOuterClass.LogLevel.LOG_LEVEL_FATAL;
                default      -> DevelopmentServiceOuterClass.LogLevel.LOG_LEVEL_DEBUG;
            };
        }

        public static LogLevel fromProto(DevelopmentServiceOuterClass.LogLevel l) {
            return switch (l) {
                case LOG_LEVEL_INFO    -> INFO;
                case LOG_LEVEL_WARNING -> WARNING;
                case LOG_LEVEL_ERROR   -> ERROR;
                case LOG_LEVEL_FATAL   -> FATAL;
                default                -> DEBUG;
            };
        }
    }

    /**
     * A single log entry emitted by an OrbitOS application.
     *
     * @param timestampMs Unix timestamp in milliseconds.
     * @param app         Application name that emitted the log.
     * @param tag         Log tag.
     * @param level       Log level.
     * @param message     Log message body.
     */
    public record LogEntry(
            long timestampMs,
            String app,
            String tag,
            LogLevel level,
            String message
    ) {}

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Subscribes to the device log stream and delivers entries asynchronously via callback.
     * The stream continues until the returned handle is cancelled.
     *
     * <p>Use empty strings for {@code app} and {@code tag} to receive logs from all sources.
     * Use {@link LogLevel#DEBUG} to receive all log levels.
     *
     * <p>Example:
     * <pre>{@code
     * DevelopmentManager.StreamHandle h = dev.subscribeLogsAsync(
     *         "my-app", "",
     *         DevelopmentManager.LogLevel.INFO,
     *         entry -> System.out.println(entry.level() + " " + entry.message()),
     *         err   -> System.err.println("stream error: " + err.getMessage()));
     *
     * Thread.sleep(30_000);
     * h.cancel();
     * }</pre>
     *
     * @param app      Filter by application name (empty = all apps).
     * @param tag      Filter by log tag (empty = all tags).
     * @param minLevel Minimum log level to receive.
     * @param onEntry  Called for each log entry.
     * @param onError  Called when the stream terminates with an error.
     * @return A {@link StreamHandle} to cancel the subscription.
     */
    public StreamHandle subscribeLogsAsync(String app, String tag, LogLevel minLevel,
                                           Consumer<LogEntry> onEntry,
                                           Consumer<Throwable> onError) {
        io.grpc.Context.CancellableContext ctx = io.grpc.Context.current().withCancellation();
        ctx.run(() ->
            asyncStub.subscribeLogs(
                    DevelopmentServiceOuterClass.LogSubscribeRequest.newBuilder()
                            .setApp(app != null ? app : "")
                            .setTag(tag != null ? tag : "")
                            .setLevel(minLevel.toProto())
                            .build(),
                    new StreamObserver<DevelopmentServiceOuterClass.LogEntry>() {
                        @Override
                        public void onNext(DevelopmentServiceOuterClass.LogEntry e) {
                            onEntry.accept(new LogEntry(
                                    e.getTimestampMs(),
                                    e.getApp(),
                                    e.getTag(),
                                    LogLevel.fromProto(e.getLevel()),
                                    e.getMessage()));
                        }
                        @Override
                        public void onError(Throwable t) { onError.accept(t); }
                        @Override
                        public void onCompleted() {}
                    })
        );
        return () -> ctx.cancel(null);
    }

    // -------------------------------------------------------------------------
    // Stream handle
    // -------------------------------------------------------------------------

    /**
     * Handle returned by {@link #subscribeLogsAsync}.
     * Call {@link #cancel()} to stop receiving logs.
     */
    @FunctionalInterface
    public interface StreamHandle {
        /** Cancels the log subscription. */
        void cancel();
    }
}
