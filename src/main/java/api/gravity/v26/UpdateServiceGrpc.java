package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: update_service/v26/update_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UpdateServiceGrpc {

  private UpdateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.UpdateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getFactoryResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FactoryReset",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getFactoryResetMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getFactoryResetMethod;
    if ((getFactoryResetMethod = UpdateServiceGrpc.getFactoryResetMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getFactoryResetMethod = UpdateServiceGrpc.getFactoryResetMethod) == null) {
          UpdateServiceGrpc.getFactoryResetMethod = getFactoryResetMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FactoryReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFactoryResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.UpdateServiceOuterClass.FileChunk,
      api.gravity.types.Types.BooleanResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = api.gravity.v26.UpdateServiceOuterClass.FileChunk.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.UpdateServiceOuterClass.FileChunk,
      api.gravity.types.Types.BooleanResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.UpdateServiceOuterClass.FileChunk, api.gravity.types.Types.BooleanResponse> getUpdateMethod;
    if ((getUpdateMethod = UpdateServiceGrpc.getUpdateMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getUpdateMethod = UpdateServiceGrpc.getUpdateMethod) == null) {
          UpdateServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.UpdateServiceOuterClass.FileChunk, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UpdateServiceOuterClass.FileChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateServiceStub>() {
        @java.lang.Override
        public UpdateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateServiceStub(channel, callOptions);
        }
      };
    return UpdateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateServiceBlockingStub>() {
        @java.lang.Override
        public UpdateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateServiceBlockingStub(channel, callOptions);
        }
      };
    return UpdateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateServiceFutureStub>() {
        @java.lang.Override
        public UpdateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateServiceFutureStub(channel, callOptions);
        }
      };
    return UpdateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Factory reset the system
     * </pre>
     */
    default void factoryReset(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFactoryResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the system
     * </pre>
     */
    default io.grpc.stub.StreamObserver<api.gravity.v26.UpdateServiceOuterClass.FileChunk> update(
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UpdateService.
   */
  public static abstract class UpdateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UpdateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UpdateService.
   */
  public static final class UpdateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UpdateServiceStub> {
    private UpdateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Factory reset the system
     * </pre>
     */
    public void factoryReset(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFactoryResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the system
     * </pre>
     */
    public io.grpc.stub.StreamObserver<api.gravity.v26.UpdateServiceOuterClass.FileChunk> update(
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UpdateService.
   */
  public static final class UpdateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UpdateServiceBlockingStub> {
    private UpdateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Factory reset the system
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse factoryReset(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFactoryResetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UpdateService.
   */
  public static final class UpdateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UpdateServiceFutureStub> {
    private UpdateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Factory reset the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> factoryReset(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFactoryResetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FACTORY_RESET = 0;
  private static final int METHODID_UPDATE = 1;

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
        case METHODID_FACTORY_RESET:
          serviceImpl.factoryReset((api.gravity.types.Types.Empty) request,
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
        case METHODID_UPDATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.update(
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFactoryResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_FACTORY_RESET)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              api.gravity.v26.UpdateServiceOuterClass.FileChunk,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_UPDATE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UpdateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getFactoryResetMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
