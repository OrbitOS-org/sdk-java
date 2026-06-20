package org.orbitos.sdk.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.google.protobuf.ByteString;

import api.gravity.types.Types;
import api.gravity.v26.UartServiceGrpc;
import api.gravity.v26.UartServiceOuterClass;
import io.grpc.stub.StreamObserver;

/**
 * SDK Wrapper for UART functionality exposed by UartService.
 * Manages serial port configuration, writing, and asynchronous reading.
 *
 * <p>Obtain via {@code client.uartManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * UartManager uart = client.uartManager();
 *
 * // Open port at 115200 baud, 8N1
 * uart.open(new UartManager.UartConfig("ttyAMA0", 115200, 8,
 *         UartManager.Parity.NONE, UartManager.StopBits.ONE, UartManager.FlowControl.NONE));
 *
 * // Write bytes
 * uart.write("ttyAMA0", "hello\r\n".getBytes());
 *
 * // Stream incoming data asynchronously
 * uart.listenAsync("ttyAMA0", 256,
 *         data -> System.out.println("RX: " + new String(data)),
 *         err  -> System.err.println("UART error: " + err.getMessage()));
 * }</pre>
 */
public class UartManager {

    private final UartServiceGrpc.UartServiceBlockingStub stub;
    private final UartServiceGrpc.UartServiceStub asyncStub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public UartManager(UartServiceGrpc.UartServiceBlockingStub stub,
                       UartServiceGrpc.UartServiceStub asyncStub) {
        this.stub = stub;
        this.asyncStub = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** Serial port parity. */
    public enum Parity {
        NONE, EVEN, ODD;

        public UartServiceOuterClass.UartParity toProto() {
            return switch (this) {
                case EVEN -> UartServiceOuterClass.UartParity.UART_PARITY_EVEN;
                case ODD  -> UartServiceOuterClass.UartParity.UART_PARITY_ODD;
                default   -> UartServiceOuterClass.UartParity.UART_PARITY_NONE;
            };
        }

        public static Parity fromProto(UartServiceOuterClass.UartParity p) {
            return switch (p) {
                case UART_PARITY_EVEN -> EVEN;
                case UART_PARITY_ODD  -> ODD;
                default               -> NONE;
            };
        }
    }

    /** Serial stop bits. */
    public enum StopBits {
        ONE, TWO;

        public UartServiceOuterClass.UartStopBits toProto() {
            return this == TWO ? UartServiceOuterClass.UartStopBits.UART_STOPBITS_2
                               : UartServiceOuterClass.UartStopBits.UART_STOPBITS_1;
        }

        public static StopBits fromProto(UartServiceOuterClass.UartStopBits s) {
            return s == UartServiceOuterClass.UartStopBits.UART_STOPBITS_2 ? TWO : ONE;
        }
    }

    /** Serial flow control. */
    public enum FlowControl {
        NONE, RTS_CTS, XON_XOFF;

        public UartServiceOuterClass.UartFlowControl toProto() {
            return switch (this) {
                case RTS_CTS  -> UartServiceOuterClass.UartFlowControl.UART_FLOW_RTSCTS;
                case XON_XOFF -> UartServiceOuterClass.UartFlowControl.UART_FLOW_XONXOFF;
                default       -> UartServiceOuterClass.UartFlowControl.UART_FLOW_NONE;
            };
        }

        public static FlowControl fromProto(UartServiceOuterClass.UartFlowControl f) {
            return switch (f) {
                case UART_FLOW_RTSCTS  -> RTS_CTS;
                case UART_FLOW_XONXOFF -> XON_XOFF;
                default                -> NONE;
            };
        }
    }

    /**
     * UART port configuration.
     *
     * @param port        Port name without the {@code /dev/} prefix (e.g. "ttyAMA0", "ttyS0").
     * @param baudRate    Baud rate (e.g. 9600, 115200).
     * @param dataBits    Data bits: 5, 6, 7 or 8.
     * @param parity      Parity mode.
     * @param stopBits    Stop bits.
     * @param flowControl Flow control.
     */
    public record UartConfig(
            String port,
            int baudRate,
            int dataBits,
            Parity parity,
            StopBits stopBits,
            FlowControl flowControl
    ) {}

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Returns all UART ports available on the device.
     *
     * @throws UartException If the server returns an error.
     */
    public List<String> listPorts() throws UartException {
        UartServiceOuterClass.ListUartPortsResponse resp =
                stub.listUartPorts(Types.Void.getDefaultInstance());
        checkError(resp.getError(), "ListPorts");
        return new ArrayList<>(resp.getPortsList());
    }

    /**
     * Opens and configures a UART port.
     *
     * @param cfg Port configuration.
     * @throws UartException If the server returns an error.
     */
    public void open(UartConfig cfg) throws UartException {
        Types.BooleanResponse resp = stub.openUart(
                UartServiceOuterClass.UartConfigRequest.newBuilder()
                        .setPort(cfg.port())
                        .setBaudrate(cfg.baudRate())
                        .setDataBits(cfg.dataBits())
                        .setParity(cfg.parity().toProto())
                        .setStopBits(cfg.stopBits().toProto())
                        .setFlowControl(cfg.flowControl().toProto())
                        .build());
        checkError(resp.getError(), "Open");
    }

    /**
     * Closes an open UART port.
     *
     * @param port Port name (e.g. "ttyAMA0").
     * @throws UartException If the server returns an error.
     */
    public void close(String port) throws UartException {
        Types.BooleanResponse resp = stub.closeUart(
                UartServiceOuterClass.UartPortRequest.newBuilder().setPort(port).build());
        checkError(resp.getError(), "Close");
    }

    /**
     * Returns the current configuration of a UART port.
     *
     * @param port Port name (e.g. "ttyAMA0").
     * @return Current configuration as {@link UartConfig}.
     * @throws UartException If the server returns an error.
     */
    public UartConfig getConfig(String port) throws UartException {
        UartServiceOuterClass.UartConfigResponse resp = stub.getUartConfig(
                UartServiceOuterClass.UartPortRequest.newBuilder().setPort(port).build());
        checkError(resp.getError(), "GetConfig");
        return new UartConfig(
                resp.getPort(),
                resp.getBaudrate(),
                resp.getDataBits(),
                Parity.fromProto(resp.getParity()),
                StopBits.fromProto(resp.getStopBits()),
                FlowControl.fromProto(resp.getFlowControl()));
    }

    /**
     * Writes bytes to an open UART port.
     *
     * @param port Port name (e.g. "ttyAMA0").
     * @param data Bytes to write.
     * @return Number of bytes actually written.
     * @throws UartException If the server returns an error.
     */
    public int write(String port, byte[] data) throws UartException {
        UartServiceOuterClass.UartWriteResponse resp = stub.writeUart(
                UartServiceOuterClass.UartWriteRequest.newBuilder()
                        .setPort(port)
                        .setData(ByteString.copyFrom(data))
                        .build());
        checkError(resp.getError(), "Write");
        return resp.getBytesWritten();
    }

    /**
     * Starts listening on a UART port and delivers incoming data chunks asynchronously via callback.
     * The stream runs until the returned {@link StreamHandle} is cancelled or an error occurs.
     *
     * <p>Example:
     * <pre>{@code
     * UartManager.StreamHandle handle = uart.listenAsync("ttyAMA0", 256,
     *     data -> System.out.println("RX: " + new String(data)),
     *     err  -> System.err.println("error: " + err.getMessage()));
     *
     * // Later, to stop listening:
     * handle.cancel();
     * }</pre>
     *
     * @param port         Port name (e.g. "ttyAMA0").
     * @param maxChunkSize Maximum bytes per received chunk.
     * @param onData       Called on each received chunk.
     * @param onError      Called when the stream terminates with an error.
     * @return A {@link StreamHandle} that can be used to cancel the subscription.
     */
    public StreamHandle listenAsync(String port, int maxChunkSize,
                                    Consumer<byte[]> onData,
                                    Consumer<Throwable> onError) {
        io.grpc.Context.CancellableContext ctx = io.grpc.Context.current().withCancellation();
        ctx.run(() ->
            asyncStub.listenUart(
                    UartServiceOuterClass.UartReadRequest.newBuilder()
                            .setPort(port)
                            .setMaxChunkSize(maxChunkSize)
                            .build(),
                    new StreamObserver<UartServiceOuterClass.UartReadChunk>() {
                        @Override
                        public void onNext(UartServiceOuterClass.UartReadChunk chunk) {
                            if (chunk.hasError() && chunk.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
                                onError.accept(new RuntimeException(chunk.getError().getMessage()));
                                return;
                            }
                            onData.accept(chunk.getData().toByteArray());
                        }
                        @Override
                        public void onError(Throwable t) { onError.accept(t); }
                        @Override
                        public void onCompleted() {}
                    })
        );
        return () -> ctx.cancel(null);
    }

    /**
     * Handle returned by {@link #listenAsync} allowing the caller to stop the stream.
     */
    @FunctionalInterface
    public interface StreamHandle {
        /** Cancels the UART stream. */
        void cancel();
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws UartException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new UartException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the UartService returns a server-side error for a UART operation.
     */
    public static class UartException extends Exception {
        private final Types.ErrorCode errorCode;

        public UartException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
