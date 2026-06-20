package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: development_service/v26/development_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DevelopmentServiceGrpc {

  private DevelopmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.DevelopmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest,
      api.gravity.v26.DevelopmentServiceOuterClass.LogEntry> getSubscribeLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeLogs",
      requestType = api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest.class,
      responseType = api.gravity.v26.DevelopmentServiceOuterClass.LogEntry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest,
      api.gravity.v26.DevelopmentServiceOuterClass.LogEntry> getSubscribeLogsMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest, api.gravity.v26.DevelopmentServiceOuterClass.LogEntry> getSubscribeLogsMethod;
    if ((getSubscribeLogsMethod = DevelopmentServiceGrpc.getSubscribeLogsMethod) == null) {
      synchronized (DevelopmentServiceGrpc.class) {
        if ((getSubscribeLogsMethod = DevelopmentServiceGrpc.getSubscribeLogsMethod) == null) {
          DevelopmentServiceGrpc.getSubscribeLogsMethod = getSubscribeLogsMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest, api.gravity.v26.DevelopmentServiceOuterClass.LogEntry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.DevelopmentServiceOuterClass.LogEntry.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DevelopmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DevelopmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DevelopmentServiceStub>() {
        @java.lang.Override
        public DevelopmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DevelopmentServiceStub(channel, callOptions);
        }
      };
    return DevelopmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DevelopmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DevelopmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DevelopmentServiceBlockingStub>() {
        @java.lang.Override
        public DevelopmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DevelopmentServiceBlockingStub(channel, callOptions);
        }
      };
    return DevelopmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DevelopmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DevelopmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DevelopmentServiceFutureStub>() {
        @java.lang.Override
        public DevelopmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DevelopmentServiceFutureStub(channel, callOptions);
        }
      };
    return DevelopmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Stream log entries filtered by app, tag and minimum log level
     * </pre>
     */
    default void subscribeLogs(api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.DevelopmentServiceOuterClass.LogEntry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeLogsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DevelopmentService.
   */
  public static abstract class DevelopmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DevelopmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DevelopmentService.
   */
  public static final class DevelopmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DevelopmentServiceStub> {
    private DevelopmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevelopmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DevelopmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stream log entries filtered by app, tag and minimum log level
     * </pre>
     */
    public void subscribeLogs(api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.DevelopmentServiceOuterClass.LogEntry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DevelopmentService.
   */
  public static final class DevelopmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DevelopmentServiceBlockingStub> {
    private DevelopmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevelopmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DevelopmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stream log entries filtered by app, tag and minimum log level
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.DevelopmentServiceOuterClass.LogEntry> subscribeLogs(
        api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DevelopmentService.
   */
  public static final class DevelopmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DevelopmentServiceFutureStub> {
    private DevelopmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevelopmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DevelopmentServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SUBSCRIBE_LOGS = 0;

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
        case METHODID_SUBSCRIBE_LOGS:
          serviceImpl.subscribeLogs((api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.DevelopmentServiceOuterClass.LogEntry>) responseObserver);
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
          getSubscribeLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.DevelopmentServiceOuterClass.LogSubscribeRequest,
              api.gravity.v26.DevelopmentServiceOuterClass.LogEntry>(
                service, METHODID_SUBSCRIBE_LOGS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DevelopmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
