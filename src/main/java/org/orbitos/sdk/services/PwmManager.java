package org.orbitos.sdk.services;

import api.gravity.v26.PwmServiceGrpc;
import api.gravity.v26.PwmServiceOuterClass;
import api.gravity.types.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * SDK wrapper for PwmService.
 * Controls hardware PWM channels — list, configure duty cycle/frequency, and stop.
 *
 * <p>Obtain via {@code client.pwmManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * PwmManager pwm = client.pwmManager();
 * List<PwmManager.PwmChannel> channels = pwm.listChannels();
 * pwm.setPwm(channels.get(0), 0.5, 1000);  // 50% duty, 1 kHz
 * pwm.stopPwm(channels.get(0));
 * }</pre>
 */
public class PwmManager {

    private final PwmServiceGrpc.PwmServiceBlockingStub stub;

    public PwmManager(PwmServiceGrpc.PwmServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // DTOs
    // -------------------------------------------------------------------------

    /**
     * Identifies a hardware PWM channel.
     *
     * @param channel Hardware channel index.
     * @param name    Human-readable channel name.
     */
    public record PwmChannel(int channel, String name) {}

    /**
     * Current state of a PWM channel.
     *
     * @param channel     The channel this state belongs to.
     * @param enabled     Whether the channel is currently active.
     * @param dutyCycle   Duty cycle in the range [0.0, 1.0].
     * @param frequencyHz Output frequency in Hz.
     */
    public record PwmProperties(PwmChannel channel, boolean enabled, double dutyCycle, double frequencyHz) {}

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Returns all PWM channels available on the device.
     *
     * @throws PwmException if the server returns an error.
     */
    public List<PwmChannel> listChannels() throws PwmException {
        PwmServiceOuterClass.PwmChannelsResponse resp =
                stub.listPwmChannels(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "ListPwmChannels");
        List<PwmChannel> out = new ArrayList<>();
        for (PwmServiceOuterClass.PwmChannel ch : resp.getChannelsList()) {
            out.add(fromProto(ch));
        }
        return out;
    }

    /**
     * Returns the current configuration of a PWM channel.
     *
     * @param channel Channel to query.
     * @throws PwmException if the server returns an error.
     */
    public PwmProperties getProperties(PwmChannel channel) throws PwmException {
        PwmServiceOuterClass.PwmPropertiesResponse resp =
                stub.getPwmProperties(PwmServiceOuterClass.PwmChannelRequest.newBuilder()
                        .setChannel(toProto(channel))
                        .build());
        checkError(resp.getError(), "GetPwmProperties");
        PwmServiceOuterClass.PwmProperties p = resp.getProperties();
        return new PwmProperties(
                fromProto(p.getChannel()),
                p.getEnabled(),
                p.getDutyCycle(),
                p.getFrequencyHz());
    }

    /**
     * Configures duty cycle and frequency and starts PWM output on the channel.
     *
     * @param channel     Target channel.
     * @param dutyCycle   Duty cycle in the range [0.0, 1.0] (e.g. 0.5 = 50%).
     * @param frequencyHz Output frequency in Hz.
     * @throws PwmException if the server returns an error.
     */
    public void setPwm(PwmChannel channel, double dutyCycle, double frequencyHz) throws PwmException {
        Types.BooleanResponse resp = stub.setPwm(
                PwmServiceOuterClass.SetPwmRequest.newBuilder()
                        .setChannel(toProto(channel))
                        .setDutyCycle(dutyCycle)
                        .setFrequencyHz(frequencyHz)
                        .build());
        checkError(resp.getError(), "SetPwm");
    }

    /**
     * Stops PWM output on the channel.
     *
     * @param channel Target channel.
     * @throws PwmException if the server returns an error.
     */
    public void stopPwm(PwmChannel channel) throws PwmException {
        Types.BooleanResponse resp = stub.stopPwm(
                PwmServiceOuterClass.PwmChannelRequest.newBuilder()
                        .setChannel(toProto(channel))
                        .build());
        checkError(resp.getError(), "StopPwm");
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private PwmServiceOuterClass.PwmChannel toProto(PwmChannel ch) {
        return PwmServiceOuterClass.PwmChannel.newBuilder()
                .setChannel(ch.channel())
                .setName(ch.name() != null ? ch.name() : "")
                .build();
    }

    private PwmChannel fromProto(PwmServiceOuterClass.PwmChannel ch) {
        return new PwmChannel(ch.getChannel(), ch.getName());
    }

    private void checkError(Types.ErrorInfo error, String method) throws PwmException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new PwmException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /** Thrown when PwmService returns a server-side error. */
    public static class PwmException extends Exception {
        private final Types.ErrorCode errorCode;

        public PwmException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
