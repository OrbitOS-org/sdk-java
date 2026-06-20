package org.orbitos.sdk.services;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.ByteString;

import api.gravity.types.Types;
import api.gravity.v26.I2CServiceGrpc;
import api.gravity.v26.I2CServiceOuterClass;

/**
 * SDK Wrapper for I2C functionality exposed by I2CService.
 * Scans buses, configures bus parameters, and performs raw I2C transfers.
 *
 * <p>Obtain via {@code client.i2cManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * I2CManager i2c = client.i2cManager();
 *
 * // Discover all buses and scan bus 1 for devices
 * List<Integer> buses = i2c.listBuses();
 * List<Integer> addrs = i2c.scanBus(1);
 * System.out.println("Devices on bus 1: " + addrs);
 *
 * // Write 2 bytes to address 0x48 on bus 1
 * i2c.write(1, 0x48, new byte[]{0x01, 0x60});
 *
 * // Read 2 bytes from address 0x48
 * byte[] result = i2c.read(1, 0x48, 2);
 *
 * // Write register address then read its value (combined transaction)
 * byte[] value = i2c.writeRead(1, 0x48, new byte[]{0x00}, 2);
 * }</pre>
 */
public class I2CManager {

    private final I2CServiceGrpc.I2CServiceBlockingStub stub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public I2CManager(I2CServiceGrpc.I2CServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // DTOs
    // -------------------------------------------------------------------------

    /**
     * I2C bus configuration parameters.
     *
     * @param bus             Bus number (e.g. 1 for /dev/i2c-1).
     * @param clockHz         Bus clock frequency in Hz.
     * @param tenBitAddr      {@code true} if 10-bit device addressing is enabled.
     * @param clockStretching {@code true} if clock stretching is enabled.
     */
    public record I2CConfig(int bus, int clockHz, boolean tenBitAddr, boolean clockStretching) {}

    /**
     * I2C transfer request DTO.
     *
     * <p>Operation is inferred from the fields:
     * <ul>
     *   <li>{@code data} only ({@code readLength=0}) → write</li>
     *   <li>{@code readLength} only ({@code data=null}) → read</li>
     *   <li>{@code data} + {@code readLength} → write-then-read (repeated START)</li>
     * </ul>
     *
     * @param bus        Bus number (e.g. 1).
     * @param address    7-bit device address (e.g. 0x48).
     * @param data       Bytes to write; {@code null} or empty for read-only.
     * @param readLength Number of bytes to read back; 0 for write-only.
     */
    public record I2CTransferRequest(int bus, int address, byte[] data, int readLength) {}

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Returns the list of I2C bus numbers available on the device.
     *
     * @throws I2CException If the server returns an error.
     */
    public List<Integer> listBuses() throws I2CException {
        I2CServiceOuterClass.I2CBusesResponse resp =
                stub.listI2CBuses(Types.Void.getDefaultInstance());
        checkError(resp.getError(), "ListBuses");
        List<Integer> out = new ArrayList<>();
        for (int b : resp.getBusesList()) out.add(b);
        return out;
    }

    /**
     * Scans an I2C bus and returns the 7-bit addresses of responding devices.
     *
     * @param bus Bus number (e.g. 1).
     * @throws I2CException If the server returns an error.
     */
    public List<Integer> scanBus(int bus) throws I2CException {
        I2CServiceOuterClass.I2CScanResponse resp = stub.scanI2CBus(
                I2CServiceOuterClass.I2CBusRequest.newBuilder().setBus(bus).build());
        checkError(resp.getError(), "ScanBus");
        List<Integer> out = new ArrayList<>();
        for (int a : resp.getAddressesList()) out.add(a);
        return out;
    }

    /**
     * Returns the current configuration of an I2C bus.
     *
     * @param bus Bus number (e.g. 1).
     * @throws I2CException If the server returns an error.
     */
    public I2CConfig getConfig(int bus) throws I2CException {
        I2CServiceOuterClass.I2CConfigResponse resp = stub.getI2CConfig(
                I2CServiceOuterClass.I2CBusRequest.newBuilder().setBus(bus).build());
        checkError(resp.getError(), "GetConfig");
        return new I2CConfig(resp.getBus(), resp.getClockHz(),
                resp.getTenBitAddr(), resp.getClockStretching());
    }

    /**
     * Configures an I2C bus.
     *
     * @param cfg New configuration.
     * @throws I2CException If the server returns an error.
     */
    public void setConfig(I2CConfig cfg) throws I2CException {
        Types.BooleanResponse resp = stub.setI2CConfig(
                I2CServiceOuterClass.I2CConfigRequest.newBuilder()
                        .setBus(cfg.bus())
                        .setClockHz(cfg.clockHz())
                        .setTenBitAddr(cfg.tenBitAddr())
                        .setClockStretching(cfg.clockStretching())
                        .build());
        checkError(resp.getError(), "SetConfig");
    }

    /**
     * Performs an I2C operation (write, read, or write-then-read) via {@code I2CTransfer} RPC.
     *
     * <p>Operation is inferred from the request:
     * <ul>
     *   <li>{@code data} only ({@code readLength=0}) → write bytes, returns empty array.</li>
     *   <li>{@code readLength} only ({@code data=null/empty}) → read n bytes.</li>
     *   <li>{@code data} + {@code readLength} → write-then-read (repeated START).</li>
     * </ul>
     *
     * @param req Transfer parameters (bus, address, data, readLength).
     * @return Received bytes; empty array for write-only operations.
     * @throws I2CException If the server returns an error.
     */
    public byte[] transfer(I2CTransferRequest req) throws I2CException {
        I2CServiceOuterClass.I2CTransferRequest.Builder b =
                I2CServiceOuterClass.I2CTransferRequest.newBuilder()
                        .setBus(req.bus())
                        .setAddress(req.address())
                        .setReadLength(req.readLength());
        if (req.data() != null && req.data().length > 0) {
            b.setData(ByteString.copyFrom(req.data()));
        }
        I2CServiceOuterClass.I2CReadResponse resp = stub.i2CTransfer(b.build());
        checkError(resp.getError(), "Transfer");
        return resp.getData() != null ? resp.getData().toByteArray() : new byte[0];
    }

    // ── Internal helpers — not public API, use transfer() directly ──────────────

    private void write(int bus, int address, byte[] data) throws I2CException {
        transfer(new I2CTransferRequest(bus, address, data, 0));
    }

    private byte[] read(int bus, int address, int readLength) throws I2CException {
        return transfer(new I2CTransferRequest(bus, address, null, readLength));
    }

    private byte[] writeRead(int bus, int address, byte[] data, int readLength) throws I2CException {
        return transfer(new I2CTransferRequest(bus, address, data, readLength));
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws I2CException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new I2CException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the I2CService returns a server-side error for an I2C operation.
     */
    public static class I2CException extends Exception {
        private final Types.ErrorCode errorCode;

        public I2CException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
