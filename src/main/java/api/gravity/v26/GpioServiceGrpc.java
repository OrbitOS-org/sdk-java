package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: gpio_service/v26/gpio_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GpioServiceGrpc {

  private GpioServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.GpioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse> getListGPIOPinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGPIOPins",
      requestType = api.gravity.types.Types.Void.class,
      responseType = api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse> getListGPIOPinsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Void, api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse> getListGPIOPinsMethod;
    if ((getListGPIOPinsMethod = GpioServiceGrpc.getListGPIOPinsMethod) == null) {
      synchronized (GpioServiceGrpc.class) {
        if ((getListGPIOPinsMethod = GpioServiceGrpc.getListGPIOPinsMethod) == null) {
          GpioServiceGrpc.getListGPIOPinsMethod = getListGPIOPinsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Void, api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGPIOPins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListGPIOPinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest,
      api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> getGetGPIOLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGPIOLevel",
      requestType = api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest.class,
      responseType = api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest,
      api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> getGetGPIOLevelMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest, api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> getGetGPIOLevelMethod;
    if ((getGetGPIOLevelMethod = GpioServiceGrpc.getGetGPIOLevelMethod) == null) {
      synchronized (GpioServiceGrpc.class) {
        if ((getGetGPIOLevelMethod = GpioServiceGrpc.getGetGPIOLevelMethod) == null) {
          GpioServiceGrpc.getGetGPIOLevelMethod = getGetGPIOLevelMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest, api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGPIOLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetGPIOLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest,
      api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> getSetGPIOLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetGPIOLevel",
      requestType = api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest.class,
      responseType = api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest,
      api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> getSetGPIOLevelMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest, api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> getSetGPIOLevelMethod;
    if ((getSetGPIOLevelMethod = GpioServiceGrpc.getSetGPIOLevelMethod) == null) {
      synchronized (GpioServiceGrpc.class) {
        if ((getSetGPIOLevelMethod = GpioServiceGrpc.getSetGPIOLevelMethod) == null) {
          GpioServiceGrpc.getSetGPIOLevelMethod = getSetGPIOLevelMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest, api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetGPIOLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetGPIOLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest,
      api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> getGetGPIODirectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGPIODirection",
      requestType = api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest.class,
      responseType = api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest,
      api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> getGetGPIODirectionMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest, api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> getGetGPIODirectionMethod;
    if ((getGetGPIODirectionMethod = GpioServiceGrpc.getGetGPIODirectionMethod) == null) {
      synchronized (GpioServiceGrpc.class) {
        if ((getGetGPIODirectionMethod = GpioServiceGrpc.getGetGPIODirectionMethod) == null) {
          GpioServiceGrpc.getGetGPIODirectionMethod = getGetGPIODirectionMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest, api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGPIODirection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetGPIODirectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest,
      api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> getSetGPIODirectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetGPIODirection",
      requestType = api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest.class,
      responseType = api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest,
      api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> getSetGPIODirectionMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest, api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> getSetGPIODirectionMethod;
    if ((getSetGPIODirectionMethod = GpioServiceGrpc.getSetGPIODirectionMethod) == null) {
      synchronized (GpioServiceGrpc.class) {
        if ((getSetGPIODirectionMethod = GpioServiceGrpc.getSetGPIODirectionMethod) == null) {
          GpioServiceGrpc.getSetGPIODirectionMethod = getSetGPIODirectionMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest, api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetGPIODirection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetGPIODirectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GpioServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpioServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpioServiceStub>() {
        @java.lang.Override
        public GpioServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpioServiceStub(channel, callOptions);
        }
      };
    return GpioServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GpioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpioServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpioServiceBlockingStub>() {
        @java.lang.Override
        public GpioServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpioServiceBlockingStub(channel, callOptions);
        }
      };
    return GpioServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GpioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpioServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpioServiceFutureStub>() {
        @java.lang.Override
        public GpioServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpioServiceFutureStub(channel, callOptions);
        }
      };
    return GpioServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GPIO
     * </pre>
     */
    default void listGPIOPins(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGPIOPinsMethod(), responseObserver);
    }

    /**
     */
    default void getGPIOLevel(api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGPIOLevelMethod(), responseObserver);
    }

    /**
     */
    default void setGPIOLevel(api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetGPIOLevelMethod(), responseObserver);
    }

    /**
     */
    default void getGPIODirection(api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGPIODirectionMethod(), responseObserver);
    }

    /**
     */
    default void setGPIODirection(api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetGPIODirectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GpioService.
   */
  public static abstract class GpioServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GpioServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GpioService.
   */
  public static final class GpioServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GpioServiceStub> {
    private GpioServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpioServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpioServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GPIO
     * </pre>
     */
    public void listGPIOPins(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGPIOPinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGPIOLevel(api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGPIOLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setGPIOLevel(api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetGPIOLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGPIODirection(api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGPIODirectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setGPIODirection(api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetGPIODirectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GpioService.
   */
  public static final class GpioServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GpioServiceBlockingStub> {
    private GpioServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpioServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpioServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GPIO
     * </pre>
     */
    public api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse listGPIOPins(api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGPIOPinsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse getGPIOLevel(api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGPIOLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse setGPIOLevel(api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetGPIOLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse getGPIODirection(api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGPIODirectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse setGPIODirection(api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetGPIODirectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GpioService.
   */
  public static final class GpioServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GpioServiceFutureStub> {
    private GpioServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpioServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpioServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GPIO
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse> listGPIOPins(
        api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGPIOPinsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> getGPIOLevel(
        api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGPIOLevelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse> setGPIOLevel(
        api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetGPIOLevelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> getGPIODirection(
        api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGPIODirectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse> setGPIODirection(
        api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetGPIODirectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GPIOPINS = 0;
  private static final int METHODID_GET_GPIOLEVEL = 1;
  private static final int METHODID_SET_GPIOLEVEL = 2;
  private static final int METHODID_GET_GPIODIRECTION = 3;
  private static final int METHODID_SET_GPIODIRECTION = 4;

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
        case METHODID_LIST_GPIOPINS:
          serviceImpl.listGPIOPins((api.gravity.types.Types.Void) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse>) responseObserver);
          break;
        case METHODID_GET_GPIOLEVEL:
          serviceImpl.getGPIOLevel((api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse>) responseObserver);
          break;
        case METHODID_SET_GPIOLEVEL:
          serviceImpl.setGPIOLevel((api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse>) responseObserver);
          break;
        case METHODID_GET_GPIODIRECTION:
          serviceImpl.getGPIODirection((api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse>) responseObserver);
          break;
        case METHODID_SET_GPIODIRECTION:
          serviceImpl.setGPIODirection((api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse>) responseObserver);
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
          getListGPIOPinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Void,
              api.gravity.v26.GpioServiceOuterClass.ListGpioPinsResponse>(
                service, METHODID_LIST_GPIOPINS)))
        .addMethod(
          getGetGPIOLevelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest,
              api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse>(
                service, METHODID_GET_GPIOLEVEL)))
        .addMethod(
          getSetGPIOLevelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.GpioServiceOuterClass.GpioLevelRequest,
              api.gravity.v26.GpioServiceOuterClass.GpioLevelResponse>(
                service, METHODID_SET_GPIOLEVEL)))
        .addMethod(
          getGetGPIODirectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest,
              api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse>(
                service, METHODID_GET_GPIODIRECTION)))
        .addMethod(
          getSetGPIODirectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.GpioServiceOuterClass.GpioDirectionRequest,
              api.gravity.v26.GpioServiceOuterClass.GpioDirectionResponse>(
                service, METHODID_SET_GPIODIRECTION)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GpioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListGPIOPinsMethod())
              .addMethod(getGetGPIOLevelMethod())
              .addMethod(getSetGPIOLevelMethod())
              .addMethod(getGetGPIODirectionMethod())
              .addMethod(getSetGPIODirectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
