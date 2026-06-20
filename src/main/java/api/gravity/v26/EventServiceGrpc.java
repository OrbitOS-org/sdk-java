package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: event_service/v26/event_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.EventServiceOuterClass.SubscribeRequest,
      api.gravity.v26.EventServiceOuterClass.Event> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = api.gravity.v26.EventServiceOuterClass.SubscribeRequest.class,
      responseType = api.gravity.v26.EventServiceOuterClass.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.EventServiceOuterClass.SubscribeRequest,
      api.gravity.v26.EventServiceOuterClass.Event> getSubscribeMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.EventServiceOuterClass.SubscribeRequest, api.gravity.v26.EventServiceOuterClass.Event> getSubscribeMethod;
    if ((getSubscribeMethod = EventServiceGrpc.getSubscribeMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getSubscribeMethod = EventServiceGrpc.getSubscribeMethod) == null) {
          EventServiceGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.EventServiceOuterClass.SubscribeRequest, api.gravity.v26.EventServiceOuterClass.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EventServiceOuterClass.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EventServiceOuterClass.Event.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe opens a server-side stream and receives events as they occur.
     * Pass an empty SubscribeRequest to receive all events.
     * </pre>
     */
    default void subscribe(api.gravity.v26.EventServiceOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.EventServiceOuterClass.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventService.
   */
  public static abstract class EventServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventService.
   */
  public static final class EventServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe opens a server-side stream and receives events as they occur.
     * Pass an empty SubscribeRequest to receive all events.
     * </pre>
     */
    public void subscribe(api.gravity.v26.EventServiceOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.EventServiceOuterClass.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventService.
   */
  public static final class EventServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe opens a server-side stream and receives events as they occur.
     * Pass an empty SubscribeRequest to receive all events.
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.EventServiceOuterClass.Event> subscribe(
        api.gravity.v26.EventServiceOuterClass.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventService.
   */
  public static final class EventServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;

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
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((api.gravity.v26.EventServiceOuterClass.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.EventServiceOuterClass.Event>) responseObserver);
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
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.EventServiceOuterClass.SubscribeRequest,
              api.gravity.v26.EventServiceOuterClass.Event>(
                service, METHODID_SUBSCRIBE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
