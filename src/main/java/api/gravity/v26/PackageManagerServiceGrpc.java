package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: package_service/v26/packagemanager_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PackageManagerServiceGrpc {

  private PackageManagerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.PackageManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.PackagemanagerService.InstalledPackagesResponse> getGetInstalledPackagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstalledPackages",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.PackagemanagerService.InstalledPackagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.PackagemanagerService.InstalledPackagesResponse> getGetInstalledPackagesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.PackagemanagerService.InstalledPackagesResponse> getGetInstalledPackagesMethod;
    if ((getGetInstalledPackagesMethod = PackageManagerServiceGrpc.getGetInstalledPackagesMethod) == null) {
      synchronized (PackageManagerServiceGrpc.class) {
        if ((getGetInstalledPackagesMethod = PackageManagerServiceGrpc.getGetInstalledPackagesMethod) == null) {
          PackageManagerServiceGrpc.getGetInstalledPackagesMethod = getGetInstalledPackagesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.PackagemanagerService.InstalledPackagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstalledPackages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PackagemanagerService.InstalledPackagesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetInstalledPackagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.PackagemanagerService.PackageChunk,
      api.gravity.types.Types.BooleanResponse> getInstallUpdatePackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstallUpdatePackage",
      requestType = api.gravity.v26.PackagemanagerService.PackageChunk.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.PackagemanagerService.PackageChunk,
      api.gravity.types.Types.BooleanResponse> getInstallUpdatePackageMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.PackagemanagerService.PackageChunk, api.gravity.types.Types.BooleanResponse> getInstallUpdatePackageMethod;
    if ((getInstallUpdatePackageMethod = PackageManagerServiceGrpc.getInstallUpdatePackageMethod) == null) {
      synchronized (PackageManagerServiceGrpc.class) {
        if ((getInstallUpdatePackageMethod = PackageManagerServiceGrpc.getInstallUpdatePackageMethod) == null) {
          PackageManagerServiceGrpc.getInstallUpdatePackageMethod = getInstallUpdatePackageMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.PackagemanagerService.PackageChunk, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstallUpdatePackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PackagemanagerService.PackageChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getInstallUpdatePackageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.PackagemanagerService.RemovePackageRequest,
      api.gravity.types.Types.BooleanResponse> getRemovePackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePackage",
      requestType = api.gravity.v26.PackagemanagerService.RemovePackageRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.PackagemanagerService.RemovePackageRequest,
      api.gravity.types.Types.BooleanResponse> getRemovePackageMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.PackagemanagerService.RemovePackageRequest, api.gravity.types.Types.BooleanResponse> getRemovePackageMethod;
    if ((getRemovePackageMethod = PackageManagerServiceGrpc.getRemovePackageMethod) == null) {
      synchronized (PackageManagerServiceGrpc.class) {
        if ((getRemovePackageMethod = PackageManagerServiceGrpc.getRemovePackageMethod) == null) {
          PackageManagerServiceGrpc.getRemovePackageMethod = getRemovePackageMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.PackagemanagerService.RemovePackageRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PackagemanagerService.RemovePackageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemovePackageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PackageManagerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageManagerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageManagerServiceStub>() {
        @java.lang.Override
        public PackageManagerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageManagerServiceStub(channel, callOptions);
        }
      };
    return PackageManagerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PackageManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageManagerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageManagerServiceBlockingStub>() {
        @java.lang.Override
        public PackageManagerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageManagerServiceBlockingStub(channel, callOptions);
        }
      };
    return PackageManagerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PackageManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageManagerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageManagerServiceFutureStub>() {
        @java.lang.Override
        public PackageManagerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageManagerServiceFutureStub(channel, callOptions);
        }
      };
    return PackageManagerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getInstalledPackages(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.PackagemanagerService.InstalledPackagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInstalledPackagesMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<api.gravity.v26.PackagemanagerService.PackageChunk> installUpdatePackage(
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getInstallUpdatePackageMethod(), responseObserver);
    }

    /**
     */
    default void removePackage(api.gravity.v26.PackagemanagerService.RemovePackageRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePackageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PackageManagerService.
   */
  public static abstract class PackageManagerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PackageManagerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PackageManagerService.
   */
  public static final class PackageManagerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PackageManagerServiceStub> {
    private PackageManagerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageManagerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageManagerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getInstalledPackages(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.PackagemanagerService.InstalledPackagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInstalledPackagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<api.gravity.v26.PackagemanagerService.PackageChunk> installUpdatePackage(
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getInstallUpdatePackageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void removePackage(api.gravity.v26.PackagemanagerService.RemovePackageRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePackageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PackageManagerService.
   */
  public static final class PackageManagerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PackageManagerServiceBlockingStub> {
    private PackageManagerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageManagerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public api.gravity.v26.PackagemanagerService.InstalledPackagesResponse getInstalledPackages(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInstalledPackagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse removePackage(api.gravity.v26.PackagemanagerService.RemovePackageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePackageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PackageManagerService.
   */
  public static final class PackageManagerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PackageManagerServiceFutureStub> {
    private PackageManagerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageManagerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageManagerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.PackagemanagerService.InstalledPackagesResponse> getInstalledPackages(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInstalledPackagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> removePackage(
        api.gravity.v26.PackagemanagerService.RemovePackageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePackageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INSTALLED_PACKAGES = 0;
  private static final int METHODID_REMOVE_PACKAGE = 1;
  private static final int METHODID_INSTALL_UPDATE_PACKAGE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INSTALLED_PACKAGES:
          serviceImpl.getInstalledPackages((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.PackagemanagerService.InstalledPackagesResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PACKAGE:
          serviceImpl.removePackage((api.gravity.v26.PackagemanagerService.RemovePackageRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSTALL_UPDATE_PACKAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.installUpdatePackage(
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetInstalledPackagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.PackagemanagerService.InstalledPackagesResponse>(
                service, METHODID_GET_INSTALLED_PACKAGES)))
        .addMethod(
          getInstallUpdatePackageMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              api.gravity.v26.PackagemanagerService.PackageChunk,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_INSTALL_UPDATE_PACKAGE)))
        .addMethod(
          getRemovePackageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.PackagemanagerService.RemovePackageRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_REMOVE_PACKAGE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PackageManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetInstalledPackagesMethod())
              .addMethod(getInstallUpdatePackageMethod())
              .addMethod(getRemovePackageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
