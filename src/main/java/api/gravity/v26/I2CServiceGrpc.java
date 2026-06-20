package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: i2c_service/v26/i2c_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class I2CServiceGrpc {

  private I2CServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.I2CService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse> getListI2CBusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListI2CBuses",
      requestType = api.gravity.types.Types.Void.class,
      responseType = api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse> getListI2CBusesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Void, api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse> getListI2CBusesMethod;
    if ((getListI2CBusesMethod = I2CServiceGrpc.getListI2CBusesMethod) == null) {
      synchronized (I2CServiceGrpc.class) {
        if ((getListI2CBusesMethod = I2CServiceGrpc.getListI2CBusesMethod) == null) {
          I2CServiceGrpc.getListI2CBusesMethod = getListI2CBusesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Void, api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListI2CBuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListI2CBusesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CBusRequest,
      api.gravity.v26.I2CServiceOuterClass.I2CScanResponse> getScanI2CBusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanI2CBus",
      requestType = api.gravity.v26.I2CServiceOuterClass.I2CBusRequest.class,
      responseType = api.gravity.v26.I2CServiceOuterClass.I2CScanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CBusRequest,
      api.gravity.v26.I2CServiceOuterClass.I2CScanResponse> getScanI2CBusMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CBusRequest, api.gravity.v26.I2CServiceOuterClass.I2CScanResponse> getScanI2CBusMethod;
    if ((getScanI2CBusMethod = I2CServiceGrpc.getScanI2CBusMethod) == null) {
      synchronized (I2CServiceGrpc.class) {
        if ((getScanI2CBusMethod = I2CServiceGrpc.getScanI2CBusMethod) == null) {
          I2CServiceGrpc.getScanI2CBusMethod = getScanI2CBusMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.I2CServiceOuterClass.I2CBusRequest, api.gravity.v26.I2CServiceOuterClass.I2CScanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanI2CBus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.I2CServiceOuterClass.I2CBusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.I2CServiceOuterClass.I2CScanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getScanI2CBusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CBusRequest,
      api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse> getGetI2CConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetI2CConfig",
      requestType = api.gravity.v26.I2CServiceOuterClass.I2CBusRequest.class,
      responseType = api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CBusRequest,
      api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse> getGetI2CConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CBusRequest, api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse> getGetI2CConfigMethod;
    if ((getGetI2CConfigMethod = I2CServiceGrpc.getGetI2CConfigMethod) == null) {
      synchronized (I2CServiceGrpc.class) {
        if ((getGetI2CConfigMethod = I2CServiceGrpc.getGetI2CConfigMethod) == null) {
          I2CServiceGrpc.getGetI2CConfigMethod = getGetI2CConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.I2CServiceOuterClass.I2CBusRequest, api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetI2CConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.I2CServiceOuterClass.I2CBusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetI2CConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest,
      api.gravity.types.Types.BooleanResponse> getSetI2CConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetI2CConfig",
      requestType = api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest,
      api.gravity.types.Types.BooleanResponse> getSetI2CConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest, api.gravity.types.Types.BooleanResponse> getSetI2CConfigMethod;
    if ((getSetI2CConfigMethod = I2CServiceGrpc.getSetI2CConfigMethod) == null) {
      synchronized (I2CServiceGrpc.class) {
        if ((getSetI2CConfigMethod = I2CServiceGrpc.getSetI2CConfigMethod) == null) {
          I2CServiceGrpc.getSetI2CConfigMethod = getSetI2CConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetI2CConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetI2CConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest,
      api.gravity.v26.I2CServiceOuterClass.I2CReadResponse> getI2CTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "I2CTransfer",
      requestType = api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest.class,
      responseType = api.gravity.v26.I2CServiceOuterClass.I2CReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest,
      api.gravity.v26.I2CServiceOuterClass.I2CReadResponse> getI2CTransferMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest, api.gravity.v26.I2CServiceOuterClass.I2CReadResponse> getI2CTransferMethod;
    if ((getI2CTransferMethod = I2CServiceGrpc.getI2CTransferMethod) == null) {
      synchronized (I2CServiceGrpc.class) {
        if ((getI2CTransferMethod = I2CServiceGrpc.getI2CTransferMethod) == null) {
          I2CServiceGrpc.getI2CTransferMethod = getI2CTransferMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest, api.gravity.v26.I2CServiceOuterClass.I2CReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "I2CTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.I2CServiceOuterClass.I2CReadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getI2CTransferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static I2CServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<I2CServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<I2CServiceStub>() {
        @java.lang.Override
        public I2CServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new I2CServiceStub(channel, callOptions);
        }
      };
    return I2CServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static I2CServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<I2CServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<I2CServiceBlockingStub>() {
        @java.lang.Override
        public I2CServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new I2CServiceBlockingStub(channel, callOptions);
        }
      };
    return I2CServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static I2CServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<I2CServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<I2CServiceFutureStub>() {
        @java.lang.Override
        public I2CServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new I2CServiceFutureStub(channel, callOptions);
        }
      };
    return I2CServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * I2C
     * </pre>
     */
    default void listI2CBuses(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListI2CBusesMethod(), responseObserver);
    }

    /**
     */
    default void scanI2CBus(api.gravity.v26.I2CServiceOuterClass.I2CBusRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CScanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanI2CBusMethod(), responseObserver);
    }

    /**
     */
    default void getI2CConfig(api.gravity.v26.I2CServiceOuterClass.I2CBusRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetI2CConfigMethod(), responseObserver);
    }

    /**
     */
    default void setI2CConfig(api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetI2CConfigMethod(), responseObserver);
    }

    /**
     */
    default void i2CTransfer(api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getI2CTransferMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service I2CService.
   */
  public static abstract class I2CServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return I2CServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service I2CService.
   */
  public static final class I2CServiceStub
      extends io.grpc.stub.AbstractAsyncStub<I2CServiceStub> {
    private I2CServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected I2CServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new I2CServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * I2C
     * </pre>
     */
    public void listI2CBuses(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListI2CBusesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanI2CBus(api.gravity.v26.I2CServiceOuterClass.I2CBusRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CScanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanI2CBusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getI2CConfig(api.gravity.v26.I2CServiceOuterClass.I2CBusRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetI2CConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setI2CConfig(api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetI2CConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void i2CTransfer(api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getI2CTransferMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service I2CService.
   */
  public static final class I2CServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<I2CServiceBlockingStub> {
    private I2CServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected I2CServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new I2CServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * I2C
     * </pre>
     */
    public api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse listI2CBuses(api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListI2CBusesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.I2CServiceOuterClass.I2CScanResponse scanI2CBus(api.gravity.v26.I2CServiceOuterClass.I2CBusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanI2CBusMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse getI2CConfig(api.gravity.v26.I2CServiceOuterClass.I2CBusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetI2CConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setI2CConfig(api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetI2CConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.I2CServiceOuterClass.I2CReadResponse i2CTransfer(api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getI2CTransferMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service I2CService.
   */
  public static final class I2CServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<I2CServiceFutureStub> {
    private I2CServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected I2CServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new I2CServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * I2C
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse> listI2CBuses(
        api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListI2CBusesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.I2CServiceOuterClass.I2CScanResponse> scanI2CBus(
        api.gravity.v26.I2CServiceOuterClass.I2CBusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanI2CBusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse> getI2CConfig(
        api.gravity.v26.I2CServiceOuterClass.I2CBusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetI2CConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setI2CConfig(
        api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetI2CConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.I2CServiceOuterClass.I2CReadResponse> i2CTransfer(
        api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getI2CTransferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_I2CBUSES = 0;
  private static final int METHODID_SCAN_I2CBUS = 1;
  private static final int METHODID_GET_I2CCONFIG = 2;
  private static final int METHODID_SET_I2CCONFIG = 3;
  private static final int METHODID_I2CTRANSFER = 4;

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
        case METHODID_LIST_I2CBUSES:
          serviceImpl.listI2CBuses((api.gravity.types.Types.Void) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse>) responseObserver);
          break;
        case METHODID_SCAN_I2CBUS:
          serviceImpl.scanI2CBus((api.gravity.v26.I2CServiceOuterClass.I2CBusRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CScanResponse>) responseObserver);
          break;
        case METHODID_GET_I2CCONFIG:
          serviceImpl.getI2CConfig((api.gravity.v26.I2CServiceOuterClass.I2CBusRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse>) responseObserver);
          break;
        case METHODID_SET_I2CCONFIG:
          serviceImpl.setI2CConfig((api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_I2CTRANSFER:
          serviceImpl.i2CTransfer((api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.I2CServiceOuterClass.I2CReadResponse>) responseObserver);
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
          getListI2CBusesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Void,
              api.gravity.v26.I2CServiceOuterClass.I2CBusesResponse>(
                service, METHODID_LIST_I2CBUSES)))
        .addMethod(
          getScanI2CBusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.I2CServiceOuterClass.I2CBusRequest,
              api.gravity.v26.I2CServiceOuterClass.I2CScanResponse>(
                service, METHODID_SCAN_I2CBUS)))
        .addMethod(
          getGetI2CConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.I2CServiceOuterClass.I2CBusRequest,
              api.gravity.v26.I2CServiceOuterClass.I2CConfigResponse>(
                service, METHODID_GET_I2CCONFIG)))
        .addMethod(
          getSetI2CConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.I2CServiceOuterClass.I2CConfigRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_I2CCONFIG)))
        .addMethod(
          getI2CTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.I2CServiceOuterClass.I2CTransferRequest,
              api.gravity.v26.I2CServiceOuterClass.I2CReadResponse>(
                service, METHODID_I2CTRANSFER)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (I2CServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListI2CBusesMethod())
              .addMethod(getScanI2CBusMethod())
              .addMethod(getGetI2CConfigMethod())
              .addMethod(getSetI2CConfigMethod())
              .addMethod(getI2CTransferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
