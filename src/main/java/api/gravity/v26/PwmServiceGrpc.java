package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: pwm_service/v26/pwm_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PwmServiceGrpc {

  private PwmServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.PwmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse> getListPwmChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPwmChannels",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse> getListPwmChannelsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse> getListPwmChannelsMethod;
    if ((getListPwmChannelsMethod = PwmServiceGrpc.getListPwmChannelsMethod) == null) {
      synchronized (PwmServiceGrpc.class) {
        if ((getListPwmChannelsMethod = PwmServiceGrpc.getListPwmChannelsMethod) == null) {
          PwmServiceGrpc.getListPwmChannelsMethod = getListPwmChannelsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPwmChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListPwmChannelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest,
      api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse> getGetPwmPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPwmProperties",
      requestType = api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest.class,
      responseType = api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest,
      api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse> getGetPwmPropertiesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest, api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse> getGetPwmPropertiesMethod;
    if ((getGetPwmPropertiesMethod = PwmServiceGrpc.getGetPwmPropertiesMethod) == null) {
      synchronized (PwmServiceGrpc.class) {
        if ((getGetPwmPropertiesMethod = PwmServiceGrpc.getGetPwmPropertiesMethod) == null) {
          PwmServiceGrpc.getGetPwmPropertiesMethod = getGetPwmPropertiesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest, api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPwmProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPwmPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.SetPwmRequest,
      api.gravity.types.Types.BooleanResponse> getSetPwmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPwm",
      requestType = api.gravity.v26.PwmServiceOuterClass.SetPwmRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.SetPwmRequest,
      api.gravity.types.Types.BooleanResponse> getSetPwmMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.SetPwmRequest, api.gravity.types.Types.BooleanResponse> getSetPwmMethod;
    if ((getSetPwmMethod = PwmServiceGrpc.getSetPwmMethod) == null) {
      synchronized (PwmServiceGrpc.class) {
        if ((getSetPwmMethod = PwmServiceGrpc.getSetPwmMethod) == null) {
          PwmServiceGrpc.getSetPwmMethod = getSetPwmMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.PwmServiceOuterClass.SetPwmRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPwm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PwmServiceOuterClass.SetPwmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPwmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest,
      api.gravity.types.Types.BooleanResponse> getStopPwmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopPwm",
      requestType = api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest,
      api.gravity.types.Types.BooleanResponse> getStopPwmMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest, api.gravity.types.Types.BooleanResponse> getStopPwmMethod;
    if ((getStopPwmMethod = PwmServiceGrpc.getStopPwmMethod) == null) {
      synchronized (PwmServiceGrpc.class) {
        if ((getStopPwmMethod = PwmServiceGrpc.getStopPwmMethod) == null) {
          PwmServiceGrpc.getStopPwmMethod = getStopPwmMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopPwm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopPwmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PwmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PwmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PwmServiceStub>() {
        @java.lang.Override
        public PwmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PwmServiceStub(channel, callOptions);
        }
      };
    return PwmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PwmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PwmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PwmServiceBlockingStub>() {
        @java.lang.Override
        public PwmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PwmServiceBlockingStub(channel, callOptions);
        }
      };
    return PwmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PwmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PwmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PwmServiceFutureStub>() {
        @java.lang.Override
        public PwmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PwmServiceFutureStub(channel, callOptions);
        }
      };
    return PwmServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Channel info
     * </pre>
     */
    default void listPwmChannels(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPwmChannelsMethod(), responseObserver);
    }

    /**
     */
    default void getPwmProperties(api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPwmPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Control
     * </pre>
     */
    default void setPwm(api.gravity.v26.PwmServiceOuterClass.SetPwmRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPwmMethod(), responseObserver);
    }

    /**
     */
    default void stopPwm(api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopPwmMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PwmService.
   */
  public static abstract class PwmServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PwmServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PwmService.
   */
  public static final class PwmServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PwmServiceStub> {
    private PwmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PwmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PwmServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Channel info
     * </pre>
     */
    public void listPwmChannels(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPwmChannelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPwmProperties(api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPwmPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Control
     * </pre>
     */
    public void setPwm(api.gravity.v26.PwmServiceOuterClass.SetPwmRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPwmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopPwm(api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopPwmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PwmService.
   */
  public static final class PwmServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PwmServiceBlockingStub> {
    private PwmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PwmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PwmServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Channel info
     * </pre>
     */
    public api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse listPwmChannels(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPwmChannelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse getPwmProperties(api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPwmPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Control
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse setPwm(api.gravity.v26.PwmServiceOuterClass.SetPwmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPwmMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse stopPwm(api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopPwmMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PwmService.
   */
  public static final class PwmServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PwmServiceFutureStub> {
    private PwmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PwmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PwmServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Channel info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse> listPwmChannels(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPwmChannelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse> getPwmProperties(
        api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPwmPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setPwm(
        api.gravity.v26.PwmServiceOuterClass.SetPwmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPwmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> stopPwm(
        api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopPwmMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PWM_CHANNELS = 0;
  private static final int METHODID_GET_PWM_PROPERTIES = 1;
  private static final int METHODID_SET_PWM = 2;
  private static final int METHODID_STOP_PWM = 3;

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
        case METHODID_LIST_PWM_CHANNELS:
          serviceImpl.listPwmChannels((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse>) responseObserver);
          break;
        case METHODID_GET_PWM_PROPERTIES:
          serviceImpl.getPwmProperties((api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse>) responseObserver);
          break;
        case METHODID_SET_PWM:
          serviceImpl.setPwm((api.gravity.v26.PwmServiceOuterClass.SetPwmRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_STOP_PWM:
          serviceImpl.stopPwm((api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest) request,
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
          getListPwmChannelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.PwmServiceOuterClass.PwmChannelsResponse>(
                service, METHODID_LIST_PWM_CHANNELS)))
        .addMethod(
          getGetPwmPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest,
              api.gravity.v26.PwmServiceOuterClass.PwmPropertiesResponse>(
                service, METHODID_GET_PWM_PROPERTIES)))
        .addMethod(
          getSetPwmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.PwmServiceOuterClass.SetPwmRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_PWM)))
        .addMethod(
          getStopPwmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.PwmServiceOuterClass.PwmChannelRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_STOP_PWM)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PwmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListPwmChannelsMethod())
              .addMethod(getGetPwmPropertiesMethod())
              .addMethod(getSetPwmMethod())
              .addMethod(getStopPwmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
