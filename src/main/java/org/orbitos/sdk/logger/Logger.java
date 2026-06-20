package org.orbitos.sdk.logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.ReentrantLock;

import org.newsclub.net.unix.AFUNIXDatagramSocket;
import org.newsclub.net.unix.AFUNIXSocketAddress;

/**
 * Logger that replicates the behavior of the Go logger.
 * Sends logs to logd via Unix socket and optionally to stdout.
 */
public class Logger {

    /**
     * LogLevel represents a log level
     */
    public enum LogLevel {
        TRACE(0, 'T'),
        DEBUG(1, 'D'),
        INFO(2, 'I'),
        WARN(3, 'W'),
        ERROR(4, 'E'),
        FATAL(5, 'F');

        private final int value;
        private final char letter;

        LogLevel(int value, char letter) {
            this.value = value;
            this.letter = letter;
        }

        public int getValue() {
            return value;
        }

        public char getLetter() {
            return letter;
        }
    }

    private static LogLevel logLevel = LogLevel.TRACE;
    private static final ReentrantLock mu = new ReentrantLock();
    private static boolean printStdout = true;
    private static final String socketPath = "/tmp/logd.sock";
    private static String appName = "void";
    private static AFUNIXDatagramSocket socket = null;
    private static boolean socketAvailable = true; // Flag to avoid repeated attempts if it fails

    private static final DateTimeFormatter timestampFormatter =
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Initializes the logger.
     *
     * @param appName Application name
     * @param levelStr Log level as a string (TRACE, DEBUG, INFO, WARN, ERROR, FATAL)
     * @param enableStdout Whether to print to stdout
     */
    public static void Init(String appName, String levelStr, boolean enableStdout) {
        SetAppName(appName);
        SetLevelStr(levelStr);
        SetPrintStdout(enableStdout);
    }

    /**
     * Sets the application name.
     */
    public static void SetAppName(String name) {
        mu.lock();
        try {
            appName = name;
        } finally {
            mu.unlock();
        }
    }

    /**
     * Sets whether to print to stdout.
     */
    public static void SetPrintStdout(boolean enable) {
        mu.lock();
        try {
            printStdout = enable;
        } finally {
            mu.unlock();
        }
    }

    /**
     * Sets the minimum log level to display.
     *
     * @param level Log level
     */
    public static void SetLevel(LogLevel level) {
        mu.lock();
        try {
            logLevel = level;
        } finally {
            mu.unlock();
        }
    }

    /**
     * Sets the log level by string.
     *
     * @param levelStr Level string (TRACE, DEBUG, INFO, WARN, ERROR, FATAL)
     */
    public static void SetLevelStr(String levelStr) {
        mu.lock();
        try {
            logLevel = getLogLevelFromString(levelStr.toUpperCase());
        } finally {
            mu.unlock();
        }
    }

    /**
     * Gets the configured minimum log level.
     */
    public static LogLevel GetLevel() {
        mu.lock();
        try {
            return logLevel;
        } finally {
            mu.unlock();
        }
    }

    /**
     * Logs a message at TRACE level.
     */
    public static void Trace(String tag, String text) {
        printMessage(LogLevel.TRACE, tag, text);
    }

    /**
     * Logs a message at TRACE level with a format string.
     */
    public static void Tracef(String tag, String format, Object... args) {
        printMessage(LogLevel.TRACE, tag, String.format(format, args));
    }

    /**
     * Logs a message at DEBUG level.
     */
    public static void Debug(String tag, String text) {
        printMessage(LogLevel.DEBUG, tag, text);
    }

    /**
     * Logs a message at DEBUG level with a format string.
     */
    public static void Debugf(String tag, String format, Object... args) {
        printMessage(LogLevel.DEBUG, tag, String.format(format, args));
    }

    /**
     * Logs a message at INFO level.
     */
    public static void Info(String tag, String text) {
        printMessage(LogLevel.INFO, tag, text);
    }

    /**
     * Logs a message at INFO level with a format string.
     */
    public static void Infof(String tag, String format, Object... args) {
        printMessage(LogLevel.INFO, tag, String.format(format, args));
    }

    /**
     * Logs a message at WARN level.
     */
    public static void Warn(String tag, String text) {
        printMessage(LogLevel.WARN, tag, text);
    }

    /**
     * Logs a message at WARN level with a format string.
     */
    public static void Warnf(String tag, String format, Object... args) {
        printMessage(LogLevel.WARN, tag, String.format(format, args));
    }

    /**
     * Logs a message at ERROR level.
     */
    public static void Error(String tag, String text) {
        printMessage(LogLevel.ERROR, tag, text);
    }

    /**
     * Logs a message at ERROR level with a format string.
     */
    public static void Errorf(String tag, String format, Object... args) {
        printMessage(LogLevel.ERROR, tag, String.format(format, args));
    }

    /**
     * Logs a message at FATAL level.
     */
    public static void Fatal(String tag, String text) {
        printMessage(LogLevel.FATAL, tag, text);
    }

    /**
     * Logs a message at FATAL level with a format string.
     */
    public static void Fatalf(String tag, String format, Object... args) {
        printMessage(LogLevel.FATAL, tag, String.format(format, args));
    }

    /**
     * Builds the log line in the format: appName|level|tag|message
     */
    private static String buildLogLine(String name, LogLevel level, String tag, String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('|');
        sb.append(level.getLetter());
        sb.append('|');
        sb.append(tag);
        sb.append('|');
        sb.append(msg);
        return sb.toString();
    }

    /**
     * Formats and prints the log message.
     * Package-internal use.
     */
    private static void printMessage(LogLevel level, String tag, String text) {
        mu.lock();
        try {
            String timestamp = LocalDateTime.now().format(timestampFormatter);

            if (level.getValue() >= logLevel.getValue()) {
                String[] lines = text.split("\n");

                for (String line : lines) {
                    if (printStdout) {
                        String tagDisplay = tag.length() > 17 ? tag.substring(0, 17) : tag;
                        System.out.printf("%s %c [%s]: %s%n", timestamp, level.getLetter(), tagDisplay, line);
                    }

                    // Always try to reconnect if socket is null or Write fails
                    // But only if the socket does not exist yet (avoid repeated attempts)
                    if (socket == null) {
                        tryConnect();
                    }

                    // Only try to send if the socket is connected
                    if (socket != null) {
                        String lineStr = buildLogLine(appName, level, tag, line);
                        byte[] data = lineStr.getBytes(StandardCharsets.UTF_8);

                        try {
                            // Send to the Unix datagram socket
                            sendToUnixSocket(data);

                        } catch (Exception e) {
                            // Error sending, try to reconnect next time
                            // Do not log error here to avoid an infinite loop
                            closeSocket();
                        }
                    }
                }
            }
        } finally {
            mu.unlock();
        }
    }

    /**
     * Tries to connect to the Unix socket.
     */
    private static void tryConnect() {
        // If we already tried and failed, do not try again
        if (!socketAvailable) {
            return;
        }

        if (socket == null) {
            try {
                // Check whether the socket file exists
                java.io.File socketFile = new java.io.File(socketPath);
                if (!socketFile.exists()) {
                    // Socket does not exist, do not try to connect
                    return;
                }

                // Create Unix datagram socket using junixsocket
                // junixsocket automatically loads the native library from the JAR
                socket = AFUNIXDatagramSocket.newInstance();
                AFUNIXSocketAddress address = AFUNIXSocketAddress.of(socketFile);
                socket.connect(address);

            } catch (UnsatisfiedLinkError | NoClassDefFoundError | ExceptionInInitializerError e) {
                // Error loading native library - mark as unavailable
                // This can happen if the native library is not available
                // or if there is a problem loading it from the JAR
                // Continue without socket - logs go only to stdout
                socket = null;
                socketAvailable = false; // Do not try again
            } catch (Exception e) {
                // Error connecting, socket remains null
                socket = null;
                // Do not mark as unavailable - it may be a temporary error
            }
        }
    }

    /**
     * Sends data to the Unix datagram socket.
     */
    private static void sendToUnixSocket(byte[] data) throws IOException {
        if (socket == null || !socket.isConnected()) {
            throw new IOException("Socket is not connected");
        }

        try {
            // Send data via AFUNIXDatagramSocket
            java.net.DatagramPacket packet = new java.net.DatagramPacket(data, data.length);
            socket.send(packet);
        } catch (Exception e) {
            // Error sending, try to reconnect next time
            closeSocket();
            throw new IOException("Error sending data to the socket: " + e.getMessage(), e);
        }
    }

    /**
     * Closes the socket.
     */
    private static void closeSocket() {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception e) {
                // Ignore errors when closing
            }
            socket = null;
        }
    }

    /**
     * Gets the log level from a string.
     */
    private static LogLevel getLogLevelFromString(String strLevel) {
        switch (strLevel) {
            case "TRACE":
                return LogLevel.TRACE;
            case "DEBUG":
                return LogLevel.DEBUG;
            case "INFO":
                return LogLevel.INFO;
            case "WARN":
                return LogLevel.WARN;
            case "ERROR":
                return LogLevel.ERROR;
            case "FATAL":
                return LogLevel.FATAL;
            default:
                return LogLevel.ERROR;
        }
    }
}
