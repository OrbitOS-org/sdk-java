package org.orbitos.sdk.services;

import api.gravity.v26.GpioServiceGrpc;
import api.gravity.v26.GpioServiceOuterClass;
import api.gravity.v26.PwmServiceGrpc;
import api.gravity.v26.PwmServiceOuterClass;
import api.gravity.types.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * SDK Wrapper for GPIO and PWM functionality exposed by GpioService.
 * Controls individual GPIO pins and hardware PWM channels.
 *
 * <p>Obtain via {@code client.gpioManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * GpioManager gpio = client.gpioManager();
 *
 * // List available pins
 * List<GpioManager.GpioPin> pins = gpio.listPins();
 *
 * // Configure pin 17 as output and drive it HIGH
 * GpioManager.GpioPin pin17 = new GpioManager.GpioPin("GPIO17", 17, 0);
 * gpio.setDirection(pin17, GpioManager.Direction.OUT);
 * gpio.setLevel(pin17, GpioManager.Level.HIGH);
 *
 * // Start 1 kHz PWM at 50% on hardware channel 0 (see listPwmChannels())
 * GpioManager.PwmChannel pwm0 = gpio.listPwmChannels().get(0);
 * gpio.setPwm(pwm0, 0.5, 1000.0);
 * }</pre>
 */
public class GpioManager {

    private final GpioServiceGrpc.GpioServiceBlockingStub stub;
    private final PwmServiceGrpc.PwmServiceBlockingStub pwmStub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public GpioManager(GpioServiceGrpc.GpioServiceBlockingStub stub,
                       PwmServiceGrpc.PwmServiceBlockingStub pwmStub) {
        this.stub = stub;
        this.pwmStub = pwmStub;
    }

    // -------------------------------------------------------------------------
    // DTOs / enums
    // -------------------------------------------------------------------------

    /** GPIO logical level. */
    public enum Level {
        LOW, HIGH;

        public GpioServiceOuterClass.GpioLevel toProto() {
            return this == HIGH ? GpioServiceOuterClass.GpioLevel.GPIO_LEVEL_HIGH
                                : GpioServiceOuterClass.GpioLevel.GPIO_LEVEL_LOW;
        }

        public static Level fromProto(GpioServiceOuterClass.GpioLevel l) {
            return l == GpioServiceOuterClass.GpioLevel.GPIO_LEVEL_HIGH ? HIGH : LOW;
        }
    }

    /** GPIO pin direction. */
    public enum Direction {
        IN, OUT;

        public GpioServiceOuterClass.GpioDirection toProto() {
            return this == OUT ? GpioServiceOuterClass.GpioDirection.GPIO_DIR_OUT
                              : GpioServiceOuterClass.GpioDirection.GPIO_DIR_IN;
        }

        public static Direction fromProto(GpioServiceOuterClass.GpioDirection d) {
            return d == GpioServiceOuterClass.GpioDirection.GPIO_DIR_OUT ? OUT : IN;
        }
    }

    /**
     * Identifies a GPIO line.
     *
     * @param name       Human-readable name (e.g. "GPIO17").
     * @param line       Pin line offset within the gpiochip.
     * @param gpiochip   GPIO chip index (0 = /dev/gpiochip0).
     */
    public record GpioPin(String name, int line, int gpiochip) {
        GpioServiceOuterClass.GpioPin toProto() {
            return GpioServiceOuterClass.GpioPin.newBuilder()
                    .setName(name).setLine(line).setGpiochip(gpiochip).build();
        }

        static GpioPin fromProto(GpioServiceOuterClass.GpioPin p) {
            return new GpioPin(p.getName(), p.getLine(), p.getGpiochip());
        }
    }

    /**
     * Hardware PWM channel (see {@link #listPwmChannels()}).
     *
     * @param channel Hardware channel index from the runtime.
     * @param name    Human-readable name (e.g. "pwm0").
     */
    public record PwmChannel(int channel, String name) {
        PwmServiceOuterClass.PwmChannel toProto() {
            return PwmServiceOuterClass.PwmChannel.newBuilder()
                    .setChannel(channel).setName(name).build();
        }

        static PwmChannel fromProto(PwmServiceOuterClass.PwmChannel p) {
            return new PwmChannel(p.getChannel(), p.getName());
        }
    }

    /**
     * Current PWM state for a channel.
     */
    public record PwmState(boolean enabled, double dutyCycle, double frequencyHz) {}

    // -------------------------------------------------------------------------
    // GPIO methods
    // -------------------------------------------------------------------------

    /**
     * Returns all GPIO pins available on the device.
     *
     * @throws GpioException If the server returns an error.
     */
    public List<GpioPin> listPins() throws GpioException {
        GpioServiceOuterClass.ListGpioPinsResponse resp =
                stub.listGPIOPins(Types.Void.getDefaultInstance());
        checkError(resp.getError(), "ListPins");
        List<GpioPin> out = new ArrayList<>();
        for (GpioServiceOuterClass.GpioPin p : resp.getPinsList()) {
            out.add(GpioPin.fromProto(p));
        }
        return out;
    }

    /**
     * Reads the current logic level of a GPIO pin.
     *
     * @param pin Target pin.
     * @return Current {@link Level}.
     * @throws GpioException If the server returns an error.
     */
    public Level getLevel(GpioPin pin) throws GpioException {
        GpioServiceOuterClass.GpioLevelResponse resp = stub.getGPIOLevel(
                GpioServiceOuterClass.GpioLevelRequest.newBuilder().setPin(pin.toProto()).build());
        checkError(resp.getError(), "GetLevel");
        return Level.fromProto(resp.getLevel());
    }

    /**
     * Sets the logic level of an output GPIO pin.
     *
     * @param pin   Target pin.
     * @param level Desired level.
     * @throws GpioException If the server returns an error.
     */
    public void setLevel(GpioPin pin, Level level) throws GpioException {
        GpioServiceOuterClass.GpioLevelResponse resp = stub.setGPIOLevel(
                GpioServiceOuterClass.GpioLevelRequest.newBuilder()
                        .setPin(pin.toProto()).setLevel(level.toProto()).build());
        checkError(resp.getError(), "SetLevel");
    }

    /**
     * Reads the direction of a GPIO pin.
     *
     * @param pin Target pin.
     * @return Current {@link Direction}.
     * @throws GpioException If the server returns an error.
     */
    public Direction getDirection(GpioPin pin) throws GpioException {
        GpioServiceOuterClass.GpioDirectionResponse resp = stub.getGPIODirection(
                GpioServiceOuterClass.GpioDirectionRequest.newBuilder().setPin(pin.toProto()).build());
        checkError(resp.getError(), "GetDirection");
        return Direction.fromProto(resp.getDirection());
    }

    /**
     * Sets the direction of a GPIO pin.
     *
     * @param pin       Target pin.
     * @param direction Desired direction.
     * @throws GpioException If the server returns an error.
     */
    public void setDirection(GpioPin pin, Direction direction) throws GpioException {
        GpioServiceOuterClass.GpioDirectionResponse resp = stub.setGPIODirection(
                GpioServiceOuterClass.GpioDirectionRequest.newBuilder()
                        .setPin(pin.toProto()).setDirection(direction.toProto()).build());
        checkError(resp.getError(), "SetDirection");
    }

    // -------------------------------------------------------------------------
    // PWM methods (PwmService)
    // -------------------------------------------------------------------------

    /**
     * Returns all hardware PWM channels available on the device.
     *
     * @throws GpioException If the server returns an error.
     */
    public List<PwmChannel> listPwmChannels() throws GpioException {
        PwmServiceOuterClass.PwmChannelsResponse resp =
                pwmStub.listPwmChannels(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListPwmChannels");
        List<PwmChannel> out = new ArrayList<>();
        for (PwmServiceOuterClass.PwmChannel p : resp.getChannelsList()) {
            out.add(PwmChannel.fromProto(p));
        }
        return out;
    }

    /**
     * Configures and starts PWM on a hardware channel.
     *
     * @param pwmChannel  Target channel from {@link #listPwmChannels()}.
     * @param dutyCycle   Duty cycle between 0.0 (0%) and 1.0 (100%).
     * @param frequencyHz PWM frequency in Hz (e.g. 1000.0 for 1 kHz).
     * @return Updated PWM state after the call.
     * @throws GpioException If the server returns an error.
     */
    public PwmState setPwm(PwmChannel pwmChannel, double dutyCycle, double frequencyHz) throws GpioException {
        Types.BooleanResponse br = pwmStub.setPwm(
                PwmServiceOuterClass.SetPwmRequest.newBuilder()
                        .setChannel(pwmChannel.toProto())
                        .setDutyCycle(dutyCycle)
                        .setFrequencyHz(frequencyHz)
                        .build());
        checkBooleanError(br, "SetPwm");
        return getPwm(pwmChannel);
    }

    /**
     * Reads the current PWM configuration of a channel.
     *
     * @param pwmChannel Target channel.
     * @return Current {@link PwmState}.
     * @throws GpioException If the server returns an error.
     */
    public PwmState getPwm(PwmChannel pwmChannel) throws GpioException {
        PwmServiceOuterClass.PwmPropertiesResponse resp = pwmStub.getPwmProperties(
                PwmServiceOuterClass.PwmChannelRequest.newBuilder()
                        .setChannel(pwmChannel.toProto())
                        .build());
        checkError(resp.getError(), "GetPwm");
        PwmServiceOuterClass.PwmProperties props = resp.getProperties();
        return new PwmState(props.getEnabled(), props.getDutyCycle(), props.getFrequencyHz());
    }

    /**
     * Stops PWM on a channel.
     *
     * @param pwmChannel Target channel.
     * @throws GpioException If the server returns an error.
     */
    public void stopPwm(PwmChannel pwmChannel) throws GpioException {
        Types.BooleanResponse br = pwmStub.stopPwm(
                PwmServiceOuterClass.PwmChannelRequest.newBuilder()
                        .setChannel(pwmChannel.toProto())
                        .build());
        checkBooleanError(br, "StopPwm");
    }

    /**
     * @deprecated Use {@link #stopPwm(PwmChannel)}.
     */
    @Deprecated
    public void disablePwm(PwmChannel pwmChannel) throws GpioException {
        stopPwm(pwmChannel);
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws GpioException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new GpioException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    private void checkBooleanError(Types.BooleanResponse resp, String method) throws GpioException {
        if (resp.hasError() && resp.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new GpioException(method + " failed: " + resp.getError().getMessage(),
                    resp.getError().getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the GpioService returns a server-side error for a GPIO/PWM operation.
     */
    public static class GpioException extends Exception {
        private final Types.ErrorCode errorCode;

        public GpioException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
