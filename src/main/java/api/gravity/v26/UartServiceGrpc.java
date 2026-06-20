package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: uart_service/v26/uart_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UartServiceGrpc {

  private UartServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.UartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse> getListUartPortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUartPorts",
      requestType = api.gravity.types.Types.Void.class,
      responseType = api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse> getListUartPortsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Void, api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse> getListUartPortsMethod;
    if ((getListUartPortsMethod = UartServiceGrpc.getListUartPortsMethod) == null) {
      synchronized (UartServiceGrpc.class) {
        if ((getListUartPortsMethod = UartServiceGrpc.getListUartPortsMethod) == null) {
          UartServiceGrpc.getListUartPortsMethod = getListUartPortsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Void, api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUartPorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListUartPortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartConfigRequest,
      api.gravity.types.Types.BooleanResponse> getOpenUartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenUart",
      requestType = api.gravity.v26.UartServiceOuterClass.UartConfigRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartConfigRequest,
      api.gravity.types.Types.BooleanResponse> getOpenUartMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartConfigRequest, api.gravity.types.Types.BooleanResponse> getOpenUartMethod;
    if ((getOpenUartMethod = UartServiceGrpc.getOpenUartMethod) == null) {
      synchronized (UartServiceGrpc.class) {
        if ((getOpenUartMethod = UartServiceGrpc.getOpenUartMethod) == null) {
          UartServiceGrpc.getOpenUartMethod = getOpenUartMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.UartServiceOuterClass.UartConfigRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenUart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.UartConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOpenUartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartPortRequest,
      api.gravity.types.Types.BooleanResponse> getCloseUartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseUart",
      requestType = api.gravity.v26.UartServiceOuterClass.UartPortRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartPortRequest,
      api.gravity.types.Types.BooleanResponse> getCloseUartMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartPortRequest, api.gravity.types.Types.BooleanResponse> getCloseUartMethod;
    if ((getCloseUartMethod = UartServiceGrpc.getCloseUartMethod) == null) {
      synchronized (UartServiceGrpc.class) {
        if ((getCloseUartMethod = UartServiceGrpc.getCloseUartMethod) == null) {
          UartServiceGrpc.getCloseUartMethod = getCloseUartMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.UartServiceOuterClass.UartPortRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseUart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.UartPortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCloseUartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartPortRequest,
      api.gravity.v26.UartServiceOuterClass.UartConfigResponse> getGetUartConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUartConfig",
      requestType = api.gravity.v26.UartServiceOuterClass.UartPortRequest.class,
      responseType = api.gravity.v26.UartServiceOuterClass.UartConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartPortRequest,
      api.gravity.v26.UartServiceOuterClass.UartConfigResponse> getGetUartConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartPortRequest, api.gravity.v26.UartServiceOuterClass.UartConfigResponse> getGetUartConfigMethod;
    if ((getGetUartConfigMethod = UartServiceGrpc.getGetUartConfigMethod) == null) {
      synchronized (UartServiceGrpc.class) {
        if ((getGetUartConfigMethod = UartServiceGrpc.getGetUartConfigMethod) == null) {
          UartServiceGrpc.getGetUartConfigMethod = getGetUartConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.UartServiceOuterClass.UartPortRequest, api.gravity.v26.UartServiceOuterClass.UartConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUartConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.UartPortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.UartConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetUartConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartWriteRequest,
      api.gravity.v26.UartServiceOuterClass.UartWriteResponse> getWriteUartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteUart",
      requestType = api.gravity.v26.UartServiceOuterClass.UartWriteRequest.class,
      responseType = api.gravity.v26.UartServiceOuterClass.UartWriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartWriteRequest,
      api.gravity.v26.UartServiceOuterClass.UartWriteResponse> getWriteUartMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartWriteRequest, api.gravity.v26.UartServiceOuterClass.UartWriteResponse> getWriteUartMethod;
    if ((getWriteUartMethod = UartServiceGrpc.getWriteUartMethod) == null) {
      synchronized (UartServiceGrpc.class) {
        if ((getWriteUartMethod = UartServiceGrpc.getWriteUartMethod) == null) {
          UartServiceGrpc.getWriteUartMethod = getWriteUartMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.UartServiceOuterClass.UartWriteRequest, api.gravity.v26.UartServiceOuterClass.UartWriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteUart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.UartWriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.UartWriteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getWriteUartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartReadRequest,
      api.gravity.v26.UartServiceOuterClass.UartReadChunk> getListenUartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenUart",
      requestType = api.gravity.v26.UartServiceOuterClass.UartReadRequest.class,
      responseType = api.gravity.v26.UartServiceOuterClass.UartReadChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartReadRequest,
      api.gravity.v26.UartServiceOuterClass.UartReadChunk> getListenUartMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.UartServiceOuterClass.UartReadRequest, api.gravity.v26.UartServiceOuterClass.UartReadChunk> getListenUartMethod;
    if ((getListenUartMethod = UartServiceGrpc.getListenUartMethod) == null) {
      synchronized (UartServiceGrpc.class) {
        if ((getListenUartMethod = UartServiceGrpc.getListenUartMethod) == null) {
          UartServiceGrpc.getListenUartMethod = getListenUartMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.UartServiceOuterClass.UartReadRequest, api.gravity.v26.UartServiceOuterClass.UartReadChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListenUart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.UartReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.UartServiceOuterClass.UartReadChunk.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListenUartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UartServiceStub>() {
        @java.lang.Override
        public UartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UartServiceStub(channel, callOptions);
        }
      };
    return UartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UartServiceBlockingStub>() {
        @java.lang.Override
        public UartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UartServiceBlockingStub(channel, callOptions);
        }
      };
    return UartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UartServiceFutureStub>() {
        @java.lang.Override
        public UartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UartServiceFutureStub(channel, callOptions);
        }
      };
    return UartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * UART
     * </pre>
     */
    default void listUartPorts(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUartPortsMethod(), responseObserver);
    }

    /**
     */
    default void openUart(api.gravity.v26.UartServiceOuterClass.UartConfigRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenUartMethod(), responseObserver);
    }

    /**
     */
    default void closeUart(api.gravity.v26.UartServiceOuterClass.UartPortRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseUartMethod(), responseObserver);
    }

    /**
     */
    default void getUartConfig(api.gravity.v26.UartServiceOuterClass.UartPortRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUartConfigMethod(), responseObserver);
    }

    /**
     */
    default void writeUart(api.gravity.v26.UartServiceOuterClass.UartWriteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartWriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteUartMethod(), responseObserver);
    }

    /**
     */
    default void listenUart(api.gravity.v26.UartServiceOuterClass.UartReadRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartReadChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListenUartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UartService.
   */
  public static abstract class UartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UartService.
   */
  public static final class UartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UartServiceStub> {
    private UartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UartServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * UART
     * </pre>
     */
    public void listUartPorts(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUartPortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openUart(api.gravity.v26.UartServiceOuterClass.UartConfigRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenUartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeUart(api.gravity.v26.UartServiceOuterClass.UartPortRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseUartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUartConfig(api.gravity.v26.UartServiceOuterClass.UartPortRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUartConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void writeUart(api.gravity.v26.UartServiceOuterClass.UartWriteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartWriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteUartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listenUart(api.gravity.v26.UartServiceOuterClass.UartReadRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartReadChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListenUartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UartService.
   */
  public static final class UartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UartServiceBlockingStub> {
    private UartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UartServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * UART
     * </pre>
     */
    public api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse listUartPorts(api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUartPortsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse openUart(api.gravity.v26.UartServiceOuterClass.UartConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenUartMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse closeUart(api.gravity.v26.UartServiceOuterClass.UartPortRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseUartMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.UartServiceOuterClass.UartConfigResponse getUartConfig(api.gravity.v26.UartServiceOuterClass.UartPortRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUartConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.UartServiceOuterClass.UartWriteResponse writeUart(api.gravity.v26.UartServiceOuterClass.UartWriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteUartMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<api.gravity.v26.UartServiceOuterClass.UartReadChunk> listenUart(
        api.gravity.v26.UartServiceOuterClass.UartReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListenUartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UartService.
   */
  public static final class UartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UartServiceFutureStub> {
    private UartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UartServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * UART
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse> listUartPorts(
        api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUartPortsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> openUart(
        api.gravity.v26.UartServiceOuterClass.UartConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenUartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> closeUart(
        api.gravity.v26.UartServiceOuterClass.UartPortRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseUartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.UartServiceOuterClass.UartConfigResponse> getUartConfig(
        api.gravity.v26.UartServiceOuterClass.UartPortRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUartConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.UartServiceOuterClass.UartWriteResponse> writeUart(
        api.gravity.v26.UartServiceOuterClass.UartWriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteUartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_UART_PORTS = 0;
  private static final int METHODID_OPEN_UART = 1;
  private static final int METHODID_CLOSE_UART = 2;
  private static final int METHODID_GET_UART_CONFIG = 3;
  private static final int METHODID_WRITE_UART = 4;
  private static final int METHODID_LISTEN_UART = 5;

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
        case METHODID_LIST_UART_PORTS:
          serviceImpl.listUartPorts((api.gravity.types.Types.Void) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse>) responseObserver);
          break;
        case METHODID_OPEN_UART:
          serviceImpl.openUart((api.gravity.v26.UartServiceOuterClass.UartConfigRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_CLOSE_UART:
          serviceImpl.closeUart((api.gravity.v26.UartServiceOuterClass.UartPortRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_UART_CONFIG:
          serviceImpl.getUartConfig((api.gravity.v26.UartServiceOuterClass.UartPortRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartConfigResponse>) responseObserver);
          break;
        case METHODID_WRITE_UART:
          serviceImpl.writeUart((api.gravity.v26.UartServiceOuterClass.UartWriteRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartWriteResponse>) responseObserver);
          break;
        case METHODID_LISTEN_UART:
          serviceImpl.listenUart((api.gravity.v26.UartServiceOuterClass.UartReadRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.UartServiceOuterClass.UartReadChunk>) responseObserver);
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
          getListUartPortsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Void,
              api.gravity.v26.UartServiceOuterClass.ListUartPortsResponse>(
                service, METHODID_LIST_UART_PORTS)))
        .addMethod(
          getOpenUartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.UartServiceOuterClass.UartConfigRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_OPEN_UART)))
        .addMethod(
          getCloseUartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.UartServiceOuterClass.UartPortRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_CLOSE_UART)))
        .addMethod(
          getGetUartConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.UartServiceOuterClass.UartPortRequest,
              api.gravity.v26.UartServiceOuterClass.UartConfigResponse>(
                service, METHODID_GET_UART_CONFIG)))
        .addMethod(
          getWriteUartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.UartServiceOuterClass.UartWriteRequest,
              api.gravity.v26.UartServiceOuterClass.UartWriteResponse>(
                service, METHODID_WRITE_UART)))
        .addMethod(
          getListenUartMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.UartServiceOuterClass.UartReadRequest,
              api.gravity.v26.UartServiceOuterClass.UartReadChunk>(
                service, METHODID_LISTEN_UART)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListUartPortsMethod())
              .addMethod(getOpenUartMethod())
              .addMethod(getCloseUartMethod())
              .addMethod(getGetUartConfigMethod())
              .addMethod(getWriteUartMethod())
              .addMethod(getListenUartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
