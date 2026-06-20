package org.orbitos.sdk.services;

import api.gravity.v26.BluetoothServiceGrpc;
import api.gravity.v26.BluetoothServiceOuterClass;
import api.gravity.types.Types;
import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * SDK Wrapper for BluetoothService.
 * Controls the Bluetooth adapter, performs Classic and BLE scans, manages bonding,
 * connects to devices, and interacts with GATT services.
 *
 * <p>Obtain via {@code client.bluetoothManager()}.
 *
 * <p>Example — BLE scan:
 * <pre>{@code
 * BluetoothManager bt = client.bluetoothManager();
 * bt.enable();
 *
 * BluetoothManager.StreamHandle scan = bt.startBleScan(
 *     List.of(),                              // no filters — discover all
 *     false,
 *     result -> System.out.println("BLE: " + result.name() + " (" + result.address() + ")"),
 *     err    -> System.err.println("scan error: " + err.getMessage()));
 *
 * Thread.sleep(5000);
 * scan.cancel();
 * }</pre>
 *
 * <p>Example — GATT read:
 * <pre>{@code
 * bt.gattConnect("AA:BB:CC:DD:EE:FF");
 * List<BluetoothManager.GattService> services = bt.gattDiscoverServices("AA:BB:CC:DD:EE:FF");
 * byte[] value = bt.gattRead("AA:BB:CC:DD:EE:FF", "180D", "2A37");
 * bt.gattDisconnect("AA:BB:CC:DD:EE:FF");
 * }</pre>
 */
public class BluetoothManager {

    private final BluetoothServiceGrpc.BluetoothServiceBlockingStub stub;
    private final BluetoothServiceGrpc.BluetoothServiceStub asyncStub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public BluetoothManager(BluetoothServiceGrpc.BluetoothServiceBlockingStub stub,
                            BluetoothServiceGrpc.BluetoothServiceStub asyncStub) {
        this.stub = stub;
        this.asyncStub = asyncStub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** Bluetooth adapter power state. */
    public enum BtState { UNKNOWN, OFF, TURNING_ON, ON, TURNING_OFF }

    /** Device transport type. */
    public enum DeviceType { UNKNOWN, CLASSIC, LE, DUAL }

    /** Pairing state. */
    public enum BondState { NONE, BONDING, BONDED }

    /** BLE write type. */
    public enum GattWriteType { DEFAULT, NO_RESPONSE }

    /** Adapter information. */
    public record AdapterInfo(
            String address, String name, BtState state,
            boolean discoverable, boolean discovering) {}

    /** A Bluetooth device (discovered or bonded). */
    public record BtDevice(
            String address, String name, DeviceType type,
            BondState bondState, int rssi) {}

    /** A result from a BLE advertisement scan. */
    public record BleScanResult(
            String address, String name, int rssi,
            boolean connectable, List<String> serviceUuids) {}

    /** A GATT descriptor. */
    public record GattDescriptor(String uuid, byte[] value) {}

    /** A GATT characteristic. */
    public record GattCharacteristic(String uuid, int properties, List<GattDescriptor> descriptors) {}

    /** A GATT service (primary or secondary). */
    public record GattService(String uuid, boolean primary, List<GattCharacteristic> characteristics) {}

    // -------------------------------------------------------------------------
    // Adapter methods
    // -------------------------------------------------------------------------

    /**
     * Returns information about the local Bluetooth adapter.
     *
     * @throws BluetoothException If the server returns an error.
     */
    public AdapterInfo getAdapterInfo() throws BluetoothException {
        BluetoothServiceOuterClass.BluetoothAdapterInfoResponse resp =
                stub.getAdapterInfo(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "GetAdapterInfo");
        BluetoothServiceOuterClass.BluetoothAdapterInfo i = resp.getInfo();
        return new AdapterInfo(i.getAddress(), i.getName(),
                btStateFromProto(i.getState()), i.getDiscoverable(), i.getDiscovering());
    }

    /**
     * Powers on the Bluetooth adapter.
     *
     * @throws BluetoothException If the server returns an error.
     */
    public void enable() throws BluetoothException {
        Types.BooleanResponse resp = stub.enableBluetooth(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "Enable");
    }

    /**
     * Powers off the Bluetooth adapter.
     *
     * @throws BluetoothException If the server returns an error.
     */
    public void disable() throws BluetoothException {
        Types.BooleanResponse resp = stub.disableBluetooth(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "Disable");
    }

    /**
     * Returns the local Bluetooth device name.
     *
     * @throws BluetoothException If the server returns an error.
     */
    public String getLocalName() throws BluetoothException {
        Types.StringResponse resp = stub.getLocalName(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "GetLocalName");
        return resp.getValue();
    }

    /**
     * Sets the local Bluetooth device name.
     *
     * @param name New device name.
     * @throws BluetoothException If the server returns an error.
     */
    public void setLocalName(String name) throws BluetoothException {
        Types.BooleanResponse resp = stub.setLocalName(
                Types.StringRequest.newBuilder().setValue(name).build());
        checkError(resp.getError(), "SetLocalName");
    }

    /**
     * Makes the adapter discoverable (visible to nearby devices).
     *
     * @param discoverable {@code true} to enable discoverability.
     * @param timeoutSec   Visibility window in seconds (0 = indefinite).
     * @throws BluetoothException If the server returns an error.
     */
    public void setDiscoverable(boolean discoverable, int timeoutSec) throws BluetoothException {
        Types.BooleanResponse resp = stub.setDiscoverable(
                BluetoothServiceOuterClass.SetDiscoverableRequest.newBuilder()
                        .setDiscoverable(discoverable)
                        .setTimeoutSec(timeoutSec)
                        .build());
        checkError(resp.getError(), "SetDiscoverable");
    }

    // -------------------------------------------------------------------------
    // Classic Bluetooth — scan + bonding
    // -------------------------------------------------------------------------

    /**
     * Starts a Classic Bluetooth scan and delivers discovered devices via callback.
     * The stream ends when the adapter finishes discovery or the handle is cancelled.
     *
     * @param onDevice Called for each discovered device.
     * @param onError  Called if the stream terminates with an error.
     * @return A {@link StreamHandle} to cancel the scan.
     */
    public StreamHandle startScan(Consumer<BtDevice> onDevice, Consumer<Throwable> onError) {
        io.grpc.Context.CancellableContext ctx = io.grpc.Context.current().withCancellation();
        ctx.run(() ->
            asyncStub.startScan(
                    Types.Empty.getDefaultInstance(),
                    new StreamObserver<BluetoothServiceOuterClass.ClassicScanResult>() {
                        @Override
                        public void onNext(BluetoothServiceOuterClass.ClassicScanResult r) {
                            onDevice.accept(btDeviceFromProto(r.getDevice()));
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
     * Returns all bonded (paired) Bluetooth devices.
     *
     * @throws BluetoothException If the server returns an error.
     */
    public List<BtDevice> getBondedDevices() throws BluetoothException {
        BluetoothServiceOuterClass.BondedDevicesResponse resp =
                stub.getBondedDevices(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "GetBondedDevices");
        List<BtDevice> out = new ArrayList<>();
        for (BluetoothServiceOuterClass.BluetoothDevice d : resp.getDevicesList()) {
            out.add(btDeviceFromProto(d));
        }
        return out;
    }

    /**
     * Initiates pairing with a device and streams bonding events via callback.
     *
     * @param address    Device MAC address (e.g. "AA:BB:CC:DD:EE:FF").
     * @param onEvent    Called for each bonding event ({@code state, pin}).
     *                   {@code pin} may be non-empty when user confirmation is required.
     * @param onError    Called if bonding fails.
     * @return A {@link StreamHandle} to cancel the pairing flow.
     */
    public StreamHandle bondDevice(String address,
                                   BiConsumer<BondState, String> onEvent,
                                   Consumer<Throwable> onError) {
        io.grpc.Context.CancellableContext ctx = io.grpc.Context.current().withCancellation();
        ctx.run(() ->
            asyncStub.bondDevice(
                    BluetoothServiceOuterClass.BtDeviceRequest.newBuilder().setAddress(address).build(),
                    new StreamObserver<BluetoothServiceOuterClass.BondEvent>() {
                        @Override
                        public void onNext(BluetoothServiceOuterClass.BondEvent e) {
                            onEvent.accept(bondStateFromProto(e.getState()), e.getPin());
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
     * Removes the bond with a previously paired device.
     *
     * @param address Device MAC address.
     * @throws BluetoothException If the server returns an error.
     */
    public void removeBond(String address) throws BluetoothException {
        Types.BooleanResponse resp = stub.removeBond(
                BluetoothServiceOuterClass.BtDeviceRequest.newBuilder().setAddress(address).build());
        checkError(resp.getError(), "RemoveBond");
    }

    // -------------------------------------------------------------------------
    // Classic Bluetooth — connection
    // -------------------------------------------------------------------------

    /**
     * Connects to a bonded Bluetooth device.
     *
     * @param address Device MAC address.
     * @throws BluetoothException If the server returns an error.
     */
    public void connect(String address) throws BluetoothException {
        Types.BooleanResponse resp = stub.connectDevice(
                BluetoothServiceOuterClass.BtDeviceRequest.newBuilder().setAddress(address).build());
        checkError(resp.getError(), "Connect");
    }

    /**
     * Disconnects from a connected Bluetooth device.
     *
     * @param address Device MAC address.
     * @throws BluetoothException If the server returns an error.
     */
    public void disconnect(String address) throws BluetoothException {
        Types.BooleanResponse resp = stub.disconnectDevice(
                BluetoothServiceOuterClass.BtDeviceRequest.newBuilder().setAddress(address).build());
        checkError(resp.getError(), "Disconnect");
    }

    // -------------------------------------------------------------------------
    // BLE — scan
    // -------------------------------------------------------------------------

    /**
     * Starts a BLE advertisement scan and delivers results via callback.
     * The stream continues until the handle is cancelled.
     *
     * <p>Example:
     * <pre>{@code
     * StreamHandle h = bt.startBleScan(List.of(), false,
     *     r -> System.out.println(r.address() + " rssi=" + r.rssi()),
     *     e -> System.err.println(e.getMessage()));
     * Thread.sleep(5000);
     * h.cancel();
     * }</pre>
     *
     * @param filters       Optional scan filters (empty = no filter).
     * @param includeAdvData Whether to include raw advertisement payload.
     * @param onResult      Called for each advertisement received.
     * @param onError       Called if the stream terminates with an error.
     * @return A {@link StreamHandle} to stop scanning.
     */
    public StreamHandle startBleScan(List<BleScanFilter> filters, boolean includeAdvData,
                                     Consumer<BleScanResult> onResult,
                                     Consumer<Throwable> onError) {
        BluetoothServiceOuterClass.BleScanRequest.Builder req =
                BluetoothServiceOuterClass.BleScanRequest.newBuilder()
                        .setIncludeAdvData(includeAdvData);
        if (filters != null) {
            for (BleScanFilter f : filters) {
                req.addFilters(BluetoothServiceOuterClass.BleScanFilter.newBuilder()
                        .setNamePrefix(f.namePrefix() != null ? f.namePrefix() : "")
                        .setAddress(f.address() != null ? f.address() : "")
                        .setServiceUuid(f.serviceUuid() != null ? f.serviceUuid() : "")
                        .build());
            }
        }
        io.grpc.Context.CancellableContext ctx = io.grpc.Context.current().withCancellation();
        ctx.run(() ->
            asyncStub.startBleScan(req.build(),
                    new StreamObserver<BluetoothServiceOuterClass.BleScanResult>() {
                        @Override
                        public void onNext(BluetoothServiceOuterClass.BleScanResult r) {
                            onResult.accept(new BleScanResult(
                                    r.getAddress(), r.getName(), r.getRssi(),
                                    r.getConnectable(), new ArrayList<>(r.getServiceUuidsList())));
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
     * Filter for a BLE scan.
     *
     * @param namePrefix  Filter by device name prefix (case-insensitive; empty = no filter).
     * @param address     Filter by exact MAC address (empty = no filter).
     * @param serviceUuid Filter by advertised service UUID (empty = no filter).
     */
    public record BleScanFilter(String namePrefix, String address, String serviceUuid) {}

    // -------------------------------------------------------------------------
    // BLE — GATT client
    // -------------------------------------------------------------------------

    /**
     * Opens a GATT connection to a BLE device.
     *
     * @param address Device MAC address.
     * @throws BluetoothException If the server returns an error.
     */
    public void gattConnect(String address) throws BluetoothException {
        Types.BooleanResponse resp = stub.gattConnect(
                BluetoothServiceOuterClass.BtDeviceRequest.newBuilder().setAddress(address).build());
        checkError(resp.getError(), "GattConnect");
    }

    /**
     * Closes the GATT connection to a BLE device.
     *
     * @param address Device MAC address.
     * @throws BluetoothException If the server returns an error.
     */
    public void gattDisconnect(String address) throws BluetoothException {
        Types.BooleanResponse resp = stub.gattDisconnect(
                BluetoothServiceOuterClass.BtDeviceRequest.newBuilder().setAddress(address).build());
        checkError(resp.getError(), "GattDisconnect");
    }

    /**
     * Discovers GATT services on a connected BLE device.
     *
     * @param address Device MAC address.
     * @return List of GATT services with their characteristics.
     * @throws BluetoothException If the server returns an error.
     */
    public List<GattService> gattDiscoverServices(String address) throws BluetoothException {
        BluetoothServiceOuterClass.GattServicesResponse resp = stub.gattDiscoverServices(
                BluetoothServiceOuterClass.BtDeviceRequest.newBuilder().setAddress(address).build());
        checkError(resp.getError(), "GattDiscoverServices");
        List<GattService> services = new ArrayList<>();
        for (BluetoothServiceOuterClass.GattService s : resp.getServicesList()) {
            List<GattCharacteristic> chars = new ArrayList<>();
            for (BluetoothServiceOuterClass.GattCharacteristic c : s.getCharacteristicsList()) {
                List<GattDescriptor> descs = new ArrayList<>();
                for (BluetoothServiceOuterClass.GattDescriptor d : c.getDescriptorsList()) {
                    descs.add(new GattDescriptor(d.getUuid(), d.getValue().toByteArray()));
                }
                chars.add(new GattCharacteristic(c.getUuid(), c.getProperties(), descs));
            }
            services.add(new GattService(s.getUuid(), s.getPrimary(), chars));
        }
        return services;
    }

    /**
     * Reads the value of a GATT characteristic.
     *
     * @param address     Device MAC address.
     * @param serviceUuid Service UUID (e.g. "180D").
     * @param charUuid    Characteristic UUID (e.g. "2A37").
     * @return Characteristic value as a byte array.
     * @throws BluetoothException If the server returns an error.
     */
    public byte[] gattRead(String address, String serviceUuid, String charUuid) throws BluetoothException {
        BluetoothServiceOuterClass.GattReadResponse resp = stub.gattReadCharacteristic(
                BluetoothServiceOuterClass.GattReadRequest.newBuilder()
                        .setAddress(address).setServiceUuid(serviceUuid).setCharUuid(charUuid).build());
        checkError(resp.getError(), "GattRead");
        return resp.getValue().toByteArray();
    }

    /**
     * Writes a value to a GATT characteristic.
     *
     * @param address     Device MAC address.
     * @param serviceUuid Service UUID.
     * @param charUuid    Characteristic UUID.
     * @param value       Value to write.
     * @param writeType   Write type.
     * @throws BluetoothException If the server returns an error.
     */
    public void gattWrite(String address, String serviceUuid, String charUuid,
                          byte[] value, GattWriteType writeType) throws BluetoothException {
        BluetoothServiceOuterClass.GattWriteType protoType =
                writeType == GattWriteType.NO_RESPONSE
                        ? BluetoothServiceOuterClass.GattWriteType.GATT_WRITE_NO_RESPONSE
                        : BluetoothServiceOuterClass.GattWriteType.GATT_WRITE_DEFAULT;
        Types.BooleanResponse resp = stub.gattWriteCharacteristic(
                BluetoothServiceOuterClass.GattWriteRequest.newBuilder()
                        .setAddress(address).setServiceUuid(serviceUuid).setCharUuid(charUuid)
                        .setValue(ByteString.copyFrom(value)).setWriteType(protoType).build());
        checkError(resp.getError(), "GattWrite");
    }

    /**
     * Subscribes to characteristic notifications/indications from a connected BLE device.
     * Delivers values via callback until the handle is cancelled.
     *
     * @param address     Device MAC address.
     * @param serviceUuid Service UUID.
     * @param charUuid    Characteristic UUID.
     * @param onNotify    Called for each received notification ({@code charUuid, value}).
     * @param onError     Called if the stream terminates with an error.
     * @return A {@link StreamHandle} to cancel the subscription.
     */
    public StreamHandle gattSubscribe(String address, String serviceUuid, String charUuid,
                                      BiConsumer<String, byte[]> onNotify,
                                      Consumer<Throwable> onError) {
        io.grpc.Context.CancellableContext ctx = io.grpc.Context.current().withCancellation();
        ctx.run(() ->
            asyncStub.gattSubscribeCharacteristic(
                    BluetoothServiceOuterClass.GattSubscribeRequest.newBuilder()
                            .setAddress(address).setServiceUuid(serviceUuid).setCharUuid(charUuid).build(),
                    new StreamObserver<BluetoothServiceOuterClass.GattNotification>() {
                        @Override
                        public void onNext(BluetoothServiceOuterClass.GattNotification n) {
                            if (n.hasError() && n.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
                                onError.accept(new RuntimeException(n.getError().getMessage()));
                                return;
                            }
                            onNotify.accept(n.getCharUuid(), n.getValue().toByteArray());
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
     * Reads the RSSI of a connected BLE device.
     *
     * @param address Device MAC address.
     * @return RSSI in dBm.
     * @throws BluetoothException If the server returns an error.
     */
    public int gattReadRssi(String address) throws BluetoothException {
        BluetoothServiceOuterClass.GattRssiResponse resp = stub.gattReadRssi(
                BluetoothServiceOuterClass.BtDeviceRequest.newBuilder().setAddress(address).build());
        checkError(resp.getError(), "GattReadRssi");
        return resp.getRssi();
    }

    // -------------------------------------------------------------------------
    // Stream handle
    // -------------------------------------------------------------------------

    /**
     * Handle returned by streaming methods (scan, bond, GATT subscribe).
     * Call {@link #cancel()} to stop the stream.
     */
    @FunctionalInterface
    public interface StreamHandle {
        /** Cancels the ongoing stream. */
        void cancel();
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private BtDevice btDeviceFromProto(BluetoothServiceOuterClass.BluetoothDevice d) {
        DeviceType type = switch (d.getType()) {
            case BT_DEVICE_CLASSIC -> DeviceType.CLASSIC;
            case BT_DEVICE_LE      -> DeviceType.LE;
            case BT_DEVICE_DUAL    -> DeviceType.DUAL;
            default                -> DeviceType.UNKNOWN;
        };
        BondState bond = bondStateFromProto(d.getBondState());
        return new BtDevice(d.getAddress(), d.getName(), type, bond, d.getRssi());
    }

    private BtState btStateFromProto(BluetoothServiceOuterClass.BluetoothState s) {
        return switch (s) {
            case BT_STATE_OFF         -> BtState.OFF;
            case BT_STATE_TURNING_ON  -> BtState.TURNING_ON;
            case BT_STATE_ON          -> BtState.ON;
            case BT_STATE_TURNING_OFF -> BtState.TURNING_OFF;
            default                   -> BtState.UNKNOWN;
        };
    }

    private BondState bondStateFromProto(BluetoothServiceOuterClass.BondState s) {
        return switch (s) {
            case BOND_BONDING -> BondState.BONDING;
            case BOND_BONDED  -> BondState.BONDED;
            default           -> BondState.NONE;
        };
    }

    private void checkError(Types.ErrorInfo error, String method) throws BluetoothException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new BluetoothException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the BluetoothService returns a server-side error.
     */
    public static class BluetoothException extends Exception {
        private final Types.ErrorCode errorCode;

        public BluetoothException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
