package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: spi_service/v26/spi_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpiServiceGrpc {

  private SpiServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.SpiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse> getListSpiBusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSpiBuses",
      requestType = api.gravity.types.Types.Void.class,
      responseType = api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse> getListSpiBusesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Void, api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse> getListSpiBusesMethod;
    if ((getListSpiBusesMethod = SpiServiceGrpc.getListSpiBusesMethod) == null) {
      synchronized (SpiServiceGrpc.class) {
        if ((getListSpiBusesMethod = SpiServiceGrpc.getListSpiBusesMethod) == null) {
          SpiServiceGrpc.getListSpiBusesMethod = getListSpiBusesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Void, api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSpiBuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListSpiBusesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiBusRequest,
      api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse> getGetSpiConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpiConfig",
      requestType = api.gravity.v26.SpiServiceOuterClass.SpiBusRequest.class,
      responseType = api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiBusRequest,
      api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse> getGetSpiConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiBusRequest, api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse> getGetSpiConfigMethod;
    if ((getGetSpiConfigMethod = SpiServiceGrpc.getGetSpiConfigMethod) == null) {
      synchronized (SpiServiceGrpc.class) {
        if ((getGetSpiConfigMethod = SpiServiceGrpc.getGetSpiConfigMethod) == null) {
          SpiServiceGrpc.getGetSpiConfigMethod = getGetSpiConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.SpiServiceOuterClass.SpiBusRequest, api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpiConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SpiServiceOuterClass.SpiBusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetSpiConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest,
      api.gravity.types.Types.BooleanResponse> getSetSpiConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSpiConfig",
      requestType = api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest,
      api.gravity.types.Types.BooleanResponse> getSetSpiConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest, api.gravity.types.Types.BooleanResponse> getSetSpiConfigMethod;
    if ((getSetSpiConfigMethod = SpiServiceGrpc.getSetSpiConfigMethod) == null) {
      synchronized (SpiServiceGrpc.class) {
        if ((getSetSpiConfigMethod = SpiServiceGrpc.getSetSpiConfigMethod) == null) {
          SpiServiceGrpc.getSetSpiConfigMethod = getSetSpiConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSpiConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetSpiConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest,
      api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse> getSpiTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpiTransfer",
      requestType = api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest.class,
      responseType = api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest,
      api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse> getSpiTransferMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest, api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse> getSpiTransferMethod;
    if ((getSpiTransferMethod = SpiServiceGrpc.getSpiTransferMethod) == null) {
      synchronized (SpiServiceGrpc.class) {
        if ((getSpiTransferMethod = SpiServiceGrpc.getSpiTransferMethod) == null) {
          SpiServiceGrpc.getSpiTransferMethod = getSpiTransferMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest, api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpiTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSpiTransferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpiServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpiServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpiServiceStub>() {
        @java.lang.Override
        public SpiServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpiServiceStub(channel, callOptions);
        }
      };
    return SpiServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpiServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpiServiceBlockingStub>() {
        @java.lang.Override
        public SpiServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpiServiceBlockingStub(channel, callOptions);
        }
      };
    return SpiServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpiServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpiServiceFutureStub>() {
        @java.lang.Override
        public SpiServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpiServiceFutureStub(channel, callOptions);
        }
      };
    return SpiServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * SPI
     * </pre>
     */
    default void listSpiBuses(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSpiBusesMethod(), responseObserver);
    }

    /**
     */
    default void getSpiConfig(api.gravity.v26.SpiServiceOuterClass.SpiBusRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpiConfigMethod(), responseObserver);
    }

    /**
     */
    default void setSpiConfig(api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSpiConfigMethod(), responseObserver);
    }

    /**
     */
    default void spiTransfer(api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpiTransferMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SpiService.
   */
  public static abstract class SpiServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SpiServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SpiService.
   */
  public static final class SpiServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SpiServiceStub> {
    private SpiServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpiServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpiServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * SPI
     * </pre>
     */
    public void listSpiBuses(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSpiBusesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSpiConfig(api.gravity.v26.SpiServiceOuterClass.SpiBusRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpiConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setSpiConfig(api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSpiConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void spiTransfer(api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpiTransferMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SpiService.
   */
  public static final class SpiServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SpiServiceBlockingStub> {
    private SpiServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpiServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpiServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SPI
     * </pre>
     */
    public api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse listSpiBuses(api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSpiBusesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse getSpiConfig(api.gravity.v26.SpiServiceOuterClass.SpiBusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpiConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setSpiConfig(api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSpiConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse spiTransfer(api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpiTransferMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SpiService.
   */
  public static final class SpiServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SpiServiceFutureStub> {
    private SpiServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpiServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpiServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SPI
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse> listSpiBuses(
        api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSpiBusesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse> getSpiConfig(
        api.gravity.v26.SpiServiceOuterClass.SpiBusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpiConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setSpiConfig(
        api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSpiConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse> spiTransfer(
        api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpiTransferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SPI_BUSES = 0;
  private static final int METHODID_GET_SPI_CONFIG = 1;
  private static final int METHODID_SET_SPI_CONFIG = 2;
  private static final int METHODID_SPI_TRANSFER = 3;

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
        case METHODID_LIST_SPI_BUSES:
          serviceImpl.listSpiBuses((api.gravity.types.Types.Void) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse>) responseObserver);
          break;
        case METHODID_GET_SPI_CONFIG:
          serviceImpl.getSpiConfig((api.gravity.v26.SpiServiceOuterClass.SpiBusRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse>) responseObserver);
          break;
        case METHODID_SET_SPI_CONFIG:
          serviceImpl.setSpiConfig((api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_SPI_TRANSFER:
          serviceImpl.spiTransfer((api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse>) responseObserver);
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
          getListSpiBusesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Void,
              api.gravity.v26.SpiServiceOuterClass.ListSpiBusesResponse>(
                service, METHODID_LIST_SPI_BUSES)))
        .addMethod(
          getGetSpiConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.SpiServiceOuterClass.SpiBusRequest,
              api.gravity.v26.SpiServiceOuterClass.SpiConfigResponse>(
                service, METHODID_GET_SPI_CONFIG)))
        .addMethod(
          getSetSpiConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.SpiServiceOuterClass.SpiConfigRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_SPI_CONFIG)))
        .addMethod(
          getSpiTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.SpiServiceOuterClass.SpiTransferRequest,
              api.gravity.v26.SpiServiceOuterClass.SpiTransferResponse>(
                service, METHODID_SPI_TRANSFER)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SpiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListSpiBusesMethod())
              .addMethod(getGetSpiConfigMethod())
              .addMethod(getSetSpiConfigMethod())
              .addMethod(getSpiTransferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
