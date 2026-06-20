package org.orbitos.sdk.services;

import api.gravity.v26.SpiServiceGrpc;
import api.gravity.v26.SpiServiceOuterClass;
import api.gravity.types.Types;
import com.google.protobuf.ByteString;

import java.util.ArrayList;
import java.util.List;

/**
 * SDK Wrapper for SPI functionality exposed by SpiService.
 * Configures SPI devices and performs full-duplex transfers.
 *
 * <p>Obtain via {@code client.spiManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * SpiManager spi = client.spiManager();
 *
 * // List available SPI devices
 * List<String> devices = spi.listDevices();
 *
 * // Configure SPI bus 0, CS 0 at 1 MHz, mode 0
 * spi.setConfig(new SpiManager.SpiConfig(0, 0, 1_000_000, 8, false, SpiManager.SpiMode.MODE_0));
 *
 * // Write only (no read back)
 * spi.transfer(0, 0, new byte[]{0x01, 0x02}, 0);
 *
 * // Read 4 bytes (clocks out zeros)
 * byte[] rx = spi.transfer(0, 0, null, 4);
 *
 * // Full-duplex: send and receive simultaneously
 * byte[] rx2 = spi.transfer(0, 0, new byte[]{0xFF, 0xFF}, 2);
 * }</pre>
 */
public class SpiManager {

    private final SpiServiceGrpc.SpiServiceBlockingStub stub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public SpiManager(SpiServiceGrpc.SpiServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /**
     * SPI clock mode (CPOL/CPHA).
     */
    public enum SpiMode {
        /** CPOL=0, CPHA=0 — most common. */
        MODE_0,
        /** CPOL=0, CPHA=1. */
        MODE_1,
        /** CPOL=1, CPHA=0. */
        MODE_2,
        /** CPOL=1, CPHA=1. */
        MODE_3;

        public SpiServiceOuterClass.SpiMode toProto() {
            return switch (this) {
                case MODE_1 -> SpiServiceOuterClass.SpiMode.SPI_MODE_1;
                case MODE_2 -> SpiServiceOuterClass.SpiMode.SPI_MODE_2;
                case MODE_3 -> SpiServiceOuterClass.SpiMode.SPI_MODE_3;
                default     -> SpiServiceOuterClass.SpiMode.SPI_MODE_0;
            };
        }

        public static SpiMode fromProto(SpiServiceOuterClass.SpiMode m) {
            return switch (m) {
                case SPI_MODE_1 -> MODE_1;
                case SPI_MODE_2 -> MODE_2;
                case SPI_MODE_3 -> MODE_3;
                default         -> MODE_0;
            };
        }
    }

    /**
     * SPI device configuration.
     *
     * @param bus         Bus number (e.g. 0 for /dev/spidev0.*).
     * @param chipSelect  Chip-select line (e.g. 0 for /dev/spidev0.0).
     * @param maxSpeedHz  Maximum clock speed in Hz (e.g. 1_000_000 for 1 MHz).
     * @param bitsPerWord Bits per word — typically 8.
     * @param lsbFirst    {@code true} for LSB-first bit order; {@code false} for MSB-first (default).
     * @param mode        SPI clock mode.
     */
    public record SpiConfig(
            int bus,
            int chipSelect,
            int maxSpeedHz,
            int bitsPerWord,
            boolean lsbFirst,
            SpiMode mode
    ) {}

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Returns all SPI devices available on the device (e.g. "spidev0.0", "spidev0.1").
     *
     * @throws SpiException If the server returns an error.
     */
    public List<String> listDevices() throws SpiException {
        SpiServiceOuterClass.ListSpiBusesResponse resp =
                stub.listSpiBuses(Types.Void.getDefaultInstance());
        checkError(resp.getError(), "ListDevices");
        return new ArrayList<>(resp.getDevicesList());
    }

    /**
     * Returns the current configuration of a SPI device.
     *
     * @param bus        Bus number (e.g. 0).
     * @param chipSelect Chip-select line (e.g. 0).
     * @throws SpiException If the server returns an error.
     */
    public SpiConfig getConfig(int bus, int chipSelect) throws SpiException {
        SpiServiceOuterClass.SpiConfigResponse resp = stub.getSpiConfig(
                SpiServiceOuterClass.SpiBusRequest.newBuilder()
                        .setBus(bus).setChipSelect(chipSelect).build());
        checkError(resp.getError(), "GetConfig");
        return new SpiConfig(
                resp.getBus(), resp.getChipSelect(),
                resp.getMaxSpeedHz(), resp.getBitsPerWord(),
                resp.getLsbFirst(), SpiMode.fromProto(resp.getMode()));
    }

    /**
     * Configures a SPI device.
     *
     * @param cfg New configuration.
     * @throws SpiException If the server returns an error.
     */
    public void setConfig(SpiConfig cfg) throws SpiException {
        Types.BooleanResponse resp = stub.setSpiConfig(
                SpiServiceOuterClass.SpiConfigRequest.newBuilder()
                        .setBus(cfg.bus())
                        .setChipSelect(cfg.chipSelect())
                        .setMaxSpeedHz(cfg.maxSpeedHz())
                        .setBitsPerWord(cfg.bitsPerWord())
                        .setLsbFirst(cfg.lsbFirst())
                        .setMode(cfg.mode().toProto())
                        .build());
        checkError(resp.getError(), "SetConfig");
    }

    /**
     * Performs a full-duplex SPI transfer.
     * Sends {@code dataOut} and simultaneously receives bytes from the device.
     *
     * <p>Example:
     * <pre>{@code
     * // Write command 0x01 0x02 and read 2 bytes back
     * byte[] rx = spi.transfer(0, 0, new byte[]{0x01, 0x02}, 2);
     * }</pre>
     *
     * @param bus        Bus number (e.g. 0).
     * @param chipSelect Chip-select line (e.g. 0).
     * @param dataOut    Bytes to send ({@code null} or empty for a read-only transfer).
     * @param readLength Number of bytes to receive (0 = write only).
     * @return Bytes received from the device.
     * @throws SpiException If the server returns an error.
     */
    public byte[] transfer(int bus, int chipSelect, byte[] dataOut, int readLength) throws SpiException {
        SpiServiceOuterClass.SpiTransferRequest.Builder req =
                SpiServiceOuterClass.SpiTransferRequest.newBuilder()
                        .setBus(bus)
                        .setChipSelect(chipSelect)
                        .setReadLength(readLength);
        if (dataOut != null && dataOut.length > 0) {
            req.setDataOut(ByteString.copyFrom(dataOut));
        }
        SpiServiceOuterClass.SpiTransferResponse resp = stub.spiTransfer(req.build());
        checkError(resp.getError(), "Transfer");
        return resp.getDataIn().toByteArray();
    }

    // ── Internal helpers — not public API, use transfer() directly ───────────────

    private void write(int bus, int chipSelect, byte[] data) throws SpiException {
        transfer(bus, chipSelect, data, 0);
    }

    private byte[] read(int bus, int chipSelect, int n) throws SpiException {
        return transfer(bus, chipSelect, null, n);
    }

    private byte[] writeRead(int bus, int chipSelect, byte[] dataOut) throws SpiException {
        return transfer(bus, chipSelect, dataOut, dataOut != null ? dataOut.length : 0);
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws SpiException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new SpiException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the SpiService returns a server-side error for a SPI operation.
     */
    public static class SpiException extends Exception {
        private final Types.ErrorCode errorCode;

        public SpiException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
