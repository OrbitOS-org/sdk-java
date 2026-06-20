package org.orbitos.sdk.services;

import api.gravity.v26.PackageManagerServiceGrpc;
import api.gravity.v26.PackagemanagerService;
import api.gravity.types.Types;
import io.grpc.stub.StreamObserver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * SDK wrapper for PackageManagerService.
 * Encapsulates the gRPC calls and provides a simple interface for the user.
 */
public class PackageManager {
    
    private final PackageManagerServiceGrpc.PackageManagerServiceBlockingStub blockingStub;
    private final PackageManagerServiceGrpc.PackageManagerServiceStub asyncStub;
    
    /**
     * PackageManager constructor.
     *
     * @param blockingStub Blocking stub of the PackageManagerService gRPC
     * @param asyncStub Async stub of the PackageManagerService gRPC (for streaming)
     */
    public PackageManager(
            PackageManagerServiceGrpc.PackageManagerServiceBlockingStub blockingStub,
            PackageManagerServiceGrpc.PackageManagerServiceStub asyncStub) {
        this.blockingStub = blockingStub;
        this.asyncStub = asyncStub;
    }
    
    /**
     * GetInstalledPackages - Gets the list of installed packages.
     *
     * @return List of installed packages
     * @throws PackageManagerException If an error occurs during the call
     */
    public List<PackagemanagerService.InstalledPackage> getInstalledPackages() throws PackageManagerException {
        Types.Empty request = Types.Empty.getDefaultInstance();
        PackagemanagerService.InstalledPackagesResponse response = blockingStub.getInstalledPackages(request);
        
        // Check whether an error occurred
        if (response.hasError() && response.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new PackageManagerException(
                "GetInstalledPackages failed: " + response.getError().getMessage(),
                response.getError().getCode()
            );
        }
        
        return response.getPackagesList();
    }
    
    /**
     * Installs or updates a package by streaming the file in chunks to the device.
     * Pass {@code chunkSize <= 0} to use the default of 1 MiB.
     *
     * <p>Example:
     * <pre>{@code
     * boolean ok = pkg.installUpdatePackage("/path/to/myapp_v1.2.0.opk", 0);
     * }</pre>
     *
     * @param filePath  Path to the .opk package file.
     * @param chunkSize Chunk size in bytes (≤ 0 = default 1 MiB).
     * @return {@code true} if the installation succeeded.
     * @throws PackageManagerException If the server returns an error.
     * @throws IOException             If the file cannot be read.
     */
    public boolean installUpdatePackage(String filePath, int chunkSize) throws PackageManagerException, IOException {
        File packageFile = new File(filePath);
        if (!packageFile.exists() || !packageFile.isFile()) {
            throw new IllegalArgumentException("File does not exist or is not a regular file: " + filePath);
        }

        if (chunkSize <= 0) chunkSize = 1024 * 1024; // 1 MiB default

        String filename  = packageFile.getName();
        long   fileSize  = packageFile.length();
        String fileMd5   = calculateMD5(packageFile);
        long   totalChunks = (fileSize + chunkSize - 1) / chunkSize;

        final boolean[]                success   = {false};
        final PackageManagerException[] exception = {null};
        final Object lock = new Object();

        final int cs = chunkSize; // effectively final for lambda
        StreamObserver<PackagemanagerService.PackageChunk> requestObserver =
            asyncStub.installUpdatePackage(new StreamObserver<Types.BooleanResponse>() {
                @Override
                public void onNext(Types.BooleanResponse response) {
                    synchronized (lock) {
                        if (response.hasError() && response.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
                            exception[0] = new PackageManagerException(
                                "installUpdatePackage failed: " + response.getError().getMessage(),
                                response.getError().getCode());
                        } else {
                            success[0] = response.getValue();
                        }
                        lock.notify();
                    }
                }
                @Override public void onError(Throwable t) {
                    synchronized (lock) {
                        exception[0] = new PackageManagerException(
                            "installUpdatePackage error: " + t.getMessage(),
                            Types.ErrorCode.ERROR_CODE_INTERNAL);
                        lock.notify();
                    }
                }
                @Override public void onCompleted() {}
            });

        try (FileInputStream fis = new FileInputStream(packageFile)) {
            byte[] buffer = new byte[cs];
            int chunkNumber = 0, bytesRead;
            while ((bytesRead = fis.read(buffer)) > 0) {
                chunkNumber++;
                byte[] data = new byte[bytesRead];
                System.arraycopy(buffer, 0, data, 0, bytesRead);
                requestObserver.onNext(PackagemanagerService.PackageChunk.newBuilder()
                    .setFilename(filename)
                    .setChunkNumber(chunkNumber)
                    .setTotalChunks((int) totalChunks)
                    .setData(com.google.protobuf.ByteString.copyFrom(data))
                    .setIsLast(chunkNumber == totalChunks)
                    .setFileMd5(fileMd5)
                    .setFileSize(fileSize)
                    .build());
            }
            requestObserver.onCompleted();

            synchronized (lock) {
                try { lock.wait(60_000); }
                catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new PackageManagerException("installUpdatePackage interrupted",
                        Types.ErrorCode.ERROR_CODE_INTERNAL);
                }
            }
            if (exception[0] != null) throw exception[0];
            return success[0];
        } catch (IOException e) {
            requestObserver.onError(e);
            throw new IOException("Error reading file: " + e.getMessage(), e);
        }
    }
    
    /**
     * RemovePackage - Removes an installed package.
     *
     * @param packageId {@code RemovePackageRequest.package_id} (in the UI this is usually the PackageId column)
     * @return true if successful, false otherwise
     * @throws PackageManagerException If an error occurs during the call
     */
    public boolean removePackage(String packageId) throws PackageManagerException {
        if (packageId == null || packageId.trim().isEmpty()) {
            throw new IllegalArgumentException("packageId cannot be empty");
        }

        PackagemanagerService.RemovePackageRequest request = PackagemanagerService.RemovePackageRequest.newBuilder()
                .setPackageId(packageId)
                .build();
        
        Types.BooleanResponse response = blockingStub.removePackage(request);
        return extractBooleanValue(response, "RemovePackage");
    }
    
    /**
     * Calculates the MD5 of a file.
     *
     * @param file File to calculate the MD5 for
     * @return MD5 string in hexadecimal
     * @throws IOException If an error occurs while reading the file
     */
    private String calculateMD5(File file) throws IOException {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    md.update(buffer, 0, bytesRead);
                }
            }
            
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new IOException("MD5 algorithm not available", e);
        }
    }
    
    /**
     * Extracts the boolean value from the BooleanResponse, checking for errors.
     *
     * @param response gRPC BooleanResponse
     * @param methodName Method name for error messages
     * @return Extracted boolean value
     * @throws PackageManagerException If the response contains an error
     */
    private boolean extractBooleanValue(Types.BooleanResponse response, String methodName) throws PackageManagerException {
        if (response.hasError() && response.getError().getCode() != Types.ErrorCode.ERROR_CODE_NONE) {
            throw new PackageManagerException(
                methodName + " failed: " + response.getError().getMessage(),
                response.getError().getCode()
            );
        }
        return response.getValue();
    }
    
    /**
     * Custom exception for PackageManagerService errors.
     */
    public static class PackageManagerException extends Exception {
        private final Types.ErrorCode errorCode;
        
        public PackageManagerException(String message, Types.ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }
        
        public Types.ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}

