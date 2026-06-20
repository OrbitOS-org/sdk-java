# orbit-os-sdk-java

Java SDK for **OrbitOS / Gravity** — a high-level gRPC client that wraps every OrbitOS system service and exposes it as a typed Java API.

**API Reference:** [`orbit-os.org/api-reference.html`](https://www.orbit-os.org/api-reference.html)

---

## Requirements

- Java **17+**
- Gradle **8+**
- Access to an OrbitOS device (Unix socket on-device, or TCP+TLS over network)

---

## Installation

### As a Gradle submodule (workspace pattern)

The SDK is designed to be used as a local Gradle subproject — the same role that `go.work` + `replace` plays in the Go workspace.

In your root `settings.gradle`:

```groovy
include ':sdk'
project(':sdk').projectDir = file('orbit-os-sdk-java')
```

In your app's `build.gradle`:

```groovy
dependencies {
    implementation project(':sdk')
}
```

### Direct Gradle dependency (when published to a Maven repository)

```groovy
dependencies {
    implementation 'org.orbitos:orbit-os-sdk-java:26.0.0'
}
```

---

## Connecting

The SDK exposes factory methods on `Client`. All of them return a `Client` instance that holds every service manager as an accessor method. `Client` implements `AutoCloseable`, so it works naturally in a try-with-resources block.

### Auto (recommended)

Prefers the Unix Domain Socket when running on-device, falls back to TCP+TLS otherwise. Also verifies that the SDK API version matches the device.

```java
try (Client client = Client.connect("192.168.1.100", "my-app")) {
    System.out.println(client.systemManager().getDeviceName());
}
```

### On-device (localhost)

```java
try (Client client = Client.connectLocal("my-app")) {
    // UDS is tried first; falls back to localhost TCP if not present
}
```

### Explicit host + port

```java
try (Client client = Client.connect("192.168.1.100", 6000, "my-app")) {
    // connects on port 6000 (the default gRPC port for Gravity)
}
```

### Manual lifecycle

```java
Client client = Client.NewSdkClient("my-app");
client.connect("192.168.1.100", 6000);
// ... use client ...
client.disconnect();
```

### TLS certificates

TLS credentials are loaded automatically. Place your certificates at:

```
your-app/
  src/main/resources/certs/
    ca.crt        # required — CA that signed the server cert
    client.crt    # optional — for mutual TLS
    client.key
```

If no certificates are found the SDK falls back to plain-text mode (useful for local development without TLS).

---

## Service Managers

Every service is accessed through a manager accessor on `Client`:

| Accessor | Service | Description |
|----------|---------|-------------|
| `client.aiManager()` | AIService | Load ONNX/TFLite models, run inference, stream results |
| `client.appHubManager()` | AppHubService | Register WebUI with the Gravity portal (proxy routing) |
| `client.accountManager()` | AccountService | Manage device account registration |
| `client.authManager()` | AuthService | Login / logout from the device |
| `client.bluetoothManager()` | BluetoothService | BLE scan, connect, GATT read/write/notify |
| `client.cameraManager()` | CameraService | Enumerate cameras, capture frames, start streams |
| `client.developmentManager()` | DevelopmentService | Real-time log streaming, developer utilities |
| `client.ethernetManager()` | EthernetService | Ethernet interface configuration and status |
| `client.eventManager()` | EventService | Subscribe to and publish system-wide events |
| `client.firewallManager()` | FirewallService | Manage zones, traffic rules, apply firewall |
| `client.gpioManager()` | GpioService | Read/write GPIO pins, configure direction, PWM |
| `client.i2cManager()` | I2CService | I2C bus enumeration and transfers |
| `client.packageManager()` | PackageService | Install, remove, list ORB packages |
| `client.powerManager()` | PowerService | Reboot, shutdown, sleep |
| `client.pwmManager()` | PwmService | PWM channel configuration and output |
| `client.spiManager()` | SpiService | SPI device enumeration and transfers |
| `client.systemManager()` | SystemService | Device info, API version, system stats |
| `client.uartManager()` | UartService | UART port configuration and data transfer |
| `client.updateManager()` | UpdateService | OTA firmware update management |
| `client.vpnManager()` | VPNService | WireGuard / OpenVPN profiles, connect, watch events |
| `client.wifiManager()` | WiFiService | Scan, connect, disconnect Wi-Fi networks |

Each accessor throws `IllegalStateException` if the client is not connected.

---

## Quick Examples

### System info

```java
SystemManager sys = client.systemManager();

String board = sys.getBoardModel();
String arch  = sys.getArchitecture();
String uuid  = sys.getSystemUuid();
System.out.printf("board=%s arch=%s uuid=%s%n", board, arch, uuid);

var metrics = sys.getMetrics().getMetrics();
System.out.printf("CPU=%.1f%%  MEM=%.1f%%%n",
        metrics.getCpuUsage(), metrics.getMemoryUsage());
```

### GPIO

```java
GpioManager gpio = client.gpioManager();

List<GpioManager.GpioPin> pins = gpio.listPins();

GpioManager.GpioPin pin17 = new GpioManager.GpioPin("GPIO17", 17, 0);
gpio.setDirection(pin17, GpioManager.Direction.OUT);
gpio.setLevel(pin17, GpioManager.Level.HIGH);

GpioManager.Level level = gpio.getLevel(pin17);
```

### PWM

```java
List<GpioManager.PwmChannel> channels = gpio.listPwmChannels();
GpioManager.PwmChannel ch = channels.get(0);

gpio.setPwm(ch, 0.5, 1000.0);  // 50% duty cycle at 1 kHz
gpio.stopPwm(ch);
```

### WiFi

```java
WiFiManager wifi = client.wifiManager();

List<WiFiManager.WiFiInterfaceInfo> ifaces = wifi.listInterfaces();
for (var iface : ifaces) {
    System.out.printf("%s  state=%s  ssid=%s%n",
            iface.interfaceName(), iface.state(), iface.ssid());
}
```

### UART

```java
UartManager uart = client.uartManager();

List<String> ports = uart.listPorts();

uart.open(new UartManager.UartConfig(
        "ttyAMA0", 115200, 8,
        UartManager.Parity.NONE,
        UartManager.StopBits.ONE,
        UartManager.FlowControl.NONE));

int written = uart.write("ttyAMA0", "hello\r\n".getBytes());

// Asynchronous read (callback-based)
UartManager.StreamHandle handle = uart.listenAsync("ttyAMA0", 256,
        data -> System.out.println("RX: " + new String(data)),
        err  -> System.err.println("UART error: " + err.getMessage()));

// Later, to stop listening:
handle.cancel();

uart.close("ttyAMA0");
```

### I2C

```java
I2CManager i2c = client.i2cManager();

List<Integer> buses = i2c.listBuses();
List<Integer> addrs = i2c.scanBus(1);
System.out.println("devices on bus 1: " + addrs);

// Write 2 bytes to address 0x48
i2c.transfer(new I2CManager.I2CTransferRequest(1, 0x48, new byte[]{0x01, 0x60}, 0));

// Read 2 bytes from address 0x48
byte[] data = i2c.transfer(new I2CManager.I2CTransferRequest(1, 0x48, null, 2));

// Write register address then read its value (combined transaction)
byte[] value = i2c.transfer(new I2CManager.I2CTransferRequest(1, 0x48, new byte[]{0x00}, 2));
```

### SPI

```java
SpiManager spi = client.spiManager();

List<String> devices = spi.listDevices();

// Full-duplex transfer — read JEDEC ID from a flash chip
byte[] rx = spi.transfer(0, 0, new byte[]{(byte) 0x9F}, 3);
```

### Bluetooth / BLE scan

```java
BluetoothManager bt = client.bluetoothManager();

bt.enable();

BluetoothManager.StreamHandle scan = bt.startBleScan(
        List.of(), false,
        r -> System.out.printf("BLE %s  %s  RSSI=%d%n", r.address(), r.name(), r.rssi()),
        err -> System.err.println("scan error: " + err.getMessage()));

Thread.sleep(5000);
scan.cancel();
```

### Events

```java
EventManager events = client.eventManager();

EventManager.StreamHandle sub = events.subscribeAsync(
        e -> System.out.printf("event: %s  payload=%s%n", e.type(), e.payload()),
        err -> System.err.println("event stream error: " + err.getMessage()));

// Later:
sub.cancel();
```

### Log streaming

```java
DevelopmentManager dev = client.developmentManager();

DevelopmentManager.StreamHandle logs = dev.subscribeLogsAsync(
        "", "", DevelopmentManager.LogLevel.INFO,
        e -> System.out.printf("[%s] %s/%s: %s%n",
                e.level(), e.app(), e.tag(), e.message()),
        err -> System.err.println("log stream error: " + err.getMessage()));

Thread.sleep(3000);
logs.cancel();
```

### AppHub — register a WebUI

```java
client.appHubManager().registerService("127.0.0.1:9033", "/myapp");
// ... serve your WebUI on port 9033 ...
client.appHubManager().unregisterService();
```

---

## Async Streams

Streaming RPCs (UART, BLE, events, logs, camera) follow a consistent callback pattern:

```java
XxxManager.StreamHandle handle = manager.fooAsync(
        /* config */,
        data -> { /* called on each item */ },
        err  -> { /* called on stream error */ });

// Stop the stream:
handle.cancel();
```

`StreamHandle` is a `@FunctionalInterface` with a single `cancel()` method — it wraps a gRPC `CancellableContext` and can always be called safely.

---

## Repository Layout

| Path | Purpose |
|------|---------|
| `src/main/java/org/orbitos/sdk/` | High-level SDK — `Client` + all `*Manager` classes |
| `src/main/java/org/orbitos/sdk/services/` | One `*Manager` per OrbitOS service |
| `src/main/java/org/orbitos/sdk/logger/` | Structured logger (`Logger.Init`, `Logger.Info`, …) |
| `src/main/java/org/orbitos/sdk/utils/` | Internal helpers (TLS, etc.) |
| `src/main/java/api/gravity/v26/` | Generated gRPC stubs — do not edit |
| `src/main/java/api/gravity/types/` | Shared proto types — do not edit |
| `build.gradle` | SDK library build — `java-library`, grpc-okhttp, junixsocket |

---

## Building

```bash
./gradlew build
```

---

## Logger

```java
import org.orbitos.sdk.logger.Logger;

Logger.Init("my-app", "INFO", true);   // name, level, enable-stdout
Logger.Info("main", "service started");
Logger.Infof("main", "port=%d", 8080);
Logger.Warn("net", "retrying connection");
Logger.Error("db", "query failed: " + err.getMessage());
```

---

## API Reference

Open [`orbit-os.org/api-reference.html`](https://www.orbit-os.org/api-reference.html) in a browser for the full interactive API reference, including all service methods, parameters, return types, and usage examples.

---
