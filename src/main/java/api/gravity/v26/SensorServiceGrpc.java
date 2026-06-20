package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SensorService definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: sensor_service/v26/sensor_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SensorServiceGrpc {

  private SensorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.SensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse> getGetCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCapabilities",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse> getGetCapabilitiesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse> getGetCapabilitiesMethod;
    if ((getGetCapabilitiesMethod = SensorServiceGrpc.getGetCapabilitiesMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetCapabilitiesMethod = SensorServiceGrpc.getGetCapabilitiesMethod) == null) {
          SensorServiceGrpc.getGetCapabilitiesMethod = getGetCapabilitiesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCapabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest,
      api.gravity.v26.SensorServiceOuterClass.SensorEventResponse> getSubscribeSensorEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeSensorEvents",
      requestType = api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest.class,
      responseType = api.gravity.v26.SensorServiceOuterClass.SensorEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest,
      api.gravity.v26.SensorServiceOuterClass.SensorEventResponse> getSubscribeSensorEventsMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest, api.gravity.v26.SensorServiceOuterClass.SensorEventResponse> getSubscribeSensorEventsMethod;
    if ((getSubscribeSensorEventsMethod = SensorServiceGrpc.getSubscribeSensorEventsMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getSubscribeSensorEventsMethod = SensorServiceGrpc.getSubscribeSensorEventsMethod) == null) {
          SensorServiceGrpc.getSubscribeSensorEventsMethod = getSubscribeSensorEventsMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest, api.gravity.v26.SensorServiceOuterClass.SensorEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeSensorEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SensorServiceOuterClass.SensorEventResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeSensorEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceStub>() {
        @java.lang.Override
        public SensorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceStub(channel, callOptions);
        }
      };
    return SensorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceBlockingStub>() {
        @java.lang.Override
        public SensorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceBlockingStub(channel, callOptions);
        }
      };
    return SensorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceFutureStub>() {
        @java.lang.Override
        public SensorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceFutureStub(channel, callOptions);
        }
      };
    return SensorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SensorService definition
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns available sensor capabilities in the system
     * </pre>
     */
    default void getCapabilities(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCapabilitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribes to sensor events (stream)
     * </pre>
     */
    default void subscribeSensorEvents(api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SensorServiceOuterClass.SensorEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeSensorEventsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SensorService.
   * <pre>
   * SensorService definition
   * </pre>
   */
  public static abstract class SensorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SensorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SensorService.
   * <pre>
   * SensorService definition
   * </pre>
   */
  public static final class SensorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SensorServiceStub> {
    private SensorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns available sensor capabilities in the system
     * </pre>
     */
    public void getCapabilities(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribes to sensor events (stream)
     * </pre>
     */
    public void subscribeSensorEvents(api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SensorServiceOuterClass.SensorEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeSensorEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SensorService.
   * <pre>
   * SensorService definition
   * </pre>
   */
  public static final class SensorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SensorServiceBlockingStub> {
    private SensorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns available sensor capabilities in the system
     * </pre>
     */
    public api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse getCapabilities(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribes to sensor events (stream)
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.SensorServiceOuterClass.SensorEventResponse> subscribeSensorEvents(
        api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeSensorEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SensorService.
   * <pre>
   * SensorService definition
   * </pre>
   */
  public static final class SensorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SensorServiceFutureStub> {
    private SensorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns available sensor capabilities in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse> getCapabilities(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCapabilitiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAPABILITIES = 0;
  private static final int METHODID_SUBSCRIBE_SENSOR_EVENTS = 1;

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
        case METHODID_GET_CAPABILITIES:
          serviceImpl.getCapabilities((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_SENSOR_EVENTS:
          serviceImpl.subscribeSensorEvents((api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.SensorServiceOuterClass.SensorEventResponse>) responseObserver);
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
          getGetCapabilitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.SensorServiceOuterClass.CapabilitiesResponse>(
                service, METHODID_GET_CAPABILITIES)))
        .addMethod(
          getSubscribeSensorEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.SensorServiceOuterClass.SensorEventsRequest,
              api.gravity.v26.SensorServiceOuterClass.SensorEventResponse>(
                service, METHODID_SUBSCRIBE_SENSOR_EVENTS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetCapabilitiesMethod())
              .addMethod(getSubscribeSensorEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
