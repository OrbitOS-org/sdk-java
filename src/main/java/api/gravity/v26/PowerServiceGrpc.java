package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * PowerService manages power operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: power_service/v26/power_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PowerServiceGrpc {

  private PowerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.PowerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.PowerServiceOuterClass.RebootRequest,
      api.gravity.types.Types.BooleanResponse> getRebootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reboot",
      requestType = api.gravity.v26.PowerServiceOuterClass.RebootRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.PowerServiceOuterClass.RebootRequest,
      api.gravity.types.Types.BooleanResponse> getRebootMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.PowerServiceOuterClass.RebootRequest, api.gravity.types.Types.BooleanResponse> getRebootMethod;
    if ((getRebootMethod = PowerServiceGrpc.getRebootMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getRebootMethod = PowerServiceGrpc.getRebootMethod) == null) {
          PowerServiceGrpc.getRebootMethod = getRebootMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.PowerServiceOuterClass.RebootRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reboot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PowerServiceOuterClass.RebootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRebootMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.PowerServiceOuterClass.ShutdownRequest,
      api.gravity.types.Types.BooleanResponse> getShutdownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Shutdown",
      requestType = api.gravity.v26.PowerServiceOuterClass.ShutdownRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.PowerServiceOuterClass.ShutdownRequest,
      api.gravity.types.Types.BooleanResponse> getShutdownMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.PowerServiceOuterClass.ShutdownRequest, api.gravity.types.Types.BooleanResponse> getShutdownMethod;
    if ((getShutdownMethod = PowerServiceGrpc.getShutdownMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getShutdownMethod = PowerServiceGrpc.getShutdownMethod) == null) {
          PowerServiceGrpc.getShutdownMethod = getShutdownMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.PowerServiceOuterClass.ShutdownRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Shutdown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PowerServiceOuterClass.ShutdownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getShutdownMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PowerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerServiceStub>() {
        @java.lang.Override
        public PowerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerServiceStub(channel, callOptions);
        }
      };
    return PowerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PowerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerServiceBlockingStub>() {
        @java.lang.Override
        public PowerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerServiceBlockingStub(channel, callOptions);
        }
      };
    return PowerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PowerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerServiceFutureStub>() {
        @java.lang.Override
        public PowerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerServiceFutureStub(channel, callOptions);
        }
      };
    return PowerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PowerService manages power operations
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Reboot reboots the system
     * </pre>
     */
    default void reboot(api.gravity.v26.PowerServiceOuterClass.RebootRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRebootMethod(), responseObserver);
    }

    /**
     * <pre>
     * Shutdown shuts down the system
     * </pre>
     */
    default void shutdown(api.gravity.v26.PowerServiceOuterClass.ShutdownRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShutdownMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PowerService.
   * <pre>
   * PowerService manages power operations
   * </pre>
   */
  public static abstract class PowerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PowerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PowerService.
   * <pre>
   * PowerService manages power operations
   * </pre>
   */
  public static final class PowerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PowerServiceStub> {
    private PowerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reboot reboots the system
     * </pre>
     */
    public void reboot(api.gravity.v26.PowerServiceOuterClass.RebootRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRebootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Shutdown shuts down the system
     * </pre>
     */
    public void shutdown(api.gravity.v26.PowerServiceOuterClass.ShutdownRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PowerService.
   * <pre>
   * PowerService manages power operations
   * </pre>
   */
  public static final class PowerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PowerServiceBlockingStub> {
    private PowerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reboot reboots the system
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse reboot(api.gravity.v26.PowerServiceOuterClass.RebootRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRebootMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Shutdown shuts down the system
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse shutdown(api.gravity.v26.PowerServiceOuterClass.ShutdownRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShutdownMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PowerService.
   * <pre>
   * PowerService manages power operations
   * </pre>
   */
  public static final class PowerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PowerServiceFutureStub> {
    private PowerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reboot reboots the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> reboot(
        api.gravity.v26.PowerServiceOuterClass.RebootRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRebootMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Shutdown shuts down the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> shutdown(
        api.gravity.v26.PowerServiceOuterClass.ShutdownRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REBOOT = 0;
  private static final int METHODID_SHUTDOWN = 1;

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
        case METHODID_REBOOT:
          serviceImpl.reboot((api.gravity.v26.PowerServiceOuterClass.RebootRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_SHUTDOWN:
          serviceImpl.shutdown((api.gravity.v26.PowerServiceOuterClass.ShutdownRequest) request,
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRebootMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.PowerServiceOuterClass.RebootRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_REBOOT)))
        .addMethod(
          getShutdownMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.PowerServiceOuterClass.ShutdownRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SHUTDOWN)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PowerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getRebootMethod())
              .addMethod(getShutdownMethod())
              .build();
        }
      }
    }
    return result;
  }
}
