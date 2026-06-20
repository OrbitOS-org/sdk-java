package org.orbitos.sdk.services;

import api.gravity.v26.AuthServiceGrpc;
import api.gravity.v26.AuthServiceOuterClass;
import api.gravity.types.Types;

/**
 * SDK wrapper for AuthService.
 * Handles device-local authentication via the Gravity runtime.
 *
 * <p>Obtain via {@code client.authManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * AuthManager auth = client.authManager();
 * AuthManager.LoginResult result = auth.login("admin", "secret");
 * System.out.println("token=" + result.token() + " expires=" + result.expiresAt());
 * auth.logout(result.token());
 * }</pre>
 */
public class AuthManager {

    private final AuthServiceGrpc.AuthServiceBlockingStub stub;

    public AuthManager(AuthServiceGrpc.AuthServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // DTOs
    // -------------------------------------------------------------------------

    /**
     * Returned by {@link #login(String, String)}.
     *
     * @param token     Session token to pass to subsequent authenticated calls.
     * @param expiresAt Unix timestamp (seconds) when the token expires.
     */
    public record LoginResult(String token, long expiresAt) {}

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Authenticates with the given credentials.
     *
     * @param username Account username.
     * @param password Account password.
     * @return {@link LoginResult} containing the session token and expiry.
     * @throws AuthException if credentials are invalid or the server returns an error.
     */
    public LoginResult login(String username, String password) throws AuthException {
        AuthServiceOuterClass.LoginResponse resp = stub.login(
                AuthServiceOuterClass.LoginRequest.newBuilder()
                        .setUsername(username != null ? username : "")
                        .setPassword(password != null ? password : "")
                        .build());
        checkError(resp.getError(), "Login");
        return new LoginResult(resp.getToken(), resp.getExpiresAt());
    }

    /**
     * Invalidates a session token.
     *
     * @param token Token obtained from {@link #login(String, String)}.
     * @throws AuthException if the token is unknown or the server returns an error.
     */
    public void logout(String token) throws AuthException {
        AuthServiceOuterClass.LogoutResponse resp = stub.logout(
                AuthServiceOuterClass.LogoutRequest.newBuilder()
                        .setToken(token != null ? token : "")
                        .build());
        checkError(resp.getError(), "Logout");
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws AuthException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new AuthException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /** Thrown when AuthService returns a server-side error. */
    public static class AuthException extends Exception {
        private final Types.ErrorCode errorCode;

        public AuthException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
