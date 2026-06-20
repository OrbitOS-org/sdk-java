package org.orbitos.sdk.services;

import api.gravity.types.Types;
import api.gravity.v26.AccountServiceGrpc;
import api.gravity.v26.AccountServiceOuterClass;

/**
 * SDK Wrapper for AccountService.
 * Provides account registration management on the device.
 *
 * <p>Obtain via {@code client.accountManager()}.
 *
 * <p>Example:
 * <pre>{@code
 * AccountManager acct = client.accountManager();
 * acct.addAccount("admin@example.com", "s3cr3t");
 *
 * AccountStatus status = acct.getStatus();
 * System.out.println("registered: " + status.registered() + "  email: " + status.email());
 * }</pre>
 */
public class AccountManager {

    private final AccountServiceGrpc.AccountServiceBlockingStub stub;

    /**
     * Constructor — called automatically by {@code Client}.
     */
    public AccountManager(AccountServiceGrpc.AccountServiceBlockingStub stub) {
        this.stub = stub;
    }

    // -------------------------------------------------------------------------
    // DTOs
    // -------------------------------------------------------------------------

    /**
     * Account registration state.
     *
     * @param registered {@code true} when an account has been created on this device.
     * @param email      Email of the registered account. Empty when {@code registered=false}.
     */
    public record AccountStatus(boolean registered, String email) {}

    // -------------------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------------------

    /**
     * Registers a new account on the device.
     * Throws if registration fails or an account already exists.
     *
     * @param email    Account email address.
     * @param password Account password.
     * @throws AccountException If the server rejects the request.
     */
    public void addAccount(String email, String password) throws AccountException {
        AccountServiceOuterClass.AddAccountResponse resp = stub.addAccount(
                AccountServiceOuterClass.AddAccountRequest.newBuilder()
                        .setEmail(email)
                        .setPassword(password)
                        .build());
        checkError(resp.getError(), "AddAccount");
        if (!resp.getSuccess()) {
            throw new AccountException("AddAccount: " + resp.getMessage(),
                    Types.ErrorCode.ERROR_CODE_UNSPECIFIED);
        }
    }

    /**
     * Returns the current registration state of the device account.
     *
     * @return {@link AccountStatus} with registration flag and email.
     * @throws AccountException If the server returns an error.
     */
    public AccountStatus getStatus() throws AccountException {
        AccountServiceOuterClass.AccountStatusResponse resp =
                stub.getAccountStatus(Types.Empty.getDefaultInstance());
        checkError(resp.getError(), "GetStatus");
        return new AccountStatus(resp.getRegistered(), resp.getEmail());
    }

    /**
     * Deletes the device account after verifying the password.
     *
     * @param password Current account password.
     * @throws AccountException If verification fails or the server returns an error.
     */
    public void removeAccount(String password) throws AccountException {
        AccountServiceOuterClass.RemoveAccountResponse resp = stub.removeAccount(
                AccountServiceOuterClass.RemoveAccountRequest.newBuilder()
                        .setPassword(password)
                        .build());
        checkError(resp.getError(), "RemoveAccount");
        if (!resp.getSuccess()) {
            throw new AccountException("RemoveAccount: " + resp.getMessage(),
                    Types.ErrorCode.ERROR_CODE_UNSPECIFIED);
        }
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private void checkError(Types.ErrorInfo error, String method) throws AccountException {
        if (error != null && error.getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new AccountException(method + " failed: " + error.getMessage(), error.getCode());
        }
    }

    // -------------------------------------------------------------------------
    // Custom exception
    // -------------------------------------------------------------------------

    /**
     * Thrown when the AccountService returns a server-side error.
     */
    public static class AccountException extends Exception {
        private final Types.ErrorCode errorCode;

        public AccountException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
