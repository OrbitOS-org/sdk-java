package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: cellular_service/v26/cellular_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CellularServiceGrpc {

  private CellularServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.CellularService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse> getListCellularInterfacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCellularInterfaces",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse> getListCellularInterfacesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse> getListCellularInterfacesMethod;
    if ((getListCellularInterfacesMethod = CellularServiceGrpc.getListCellularInterfacesMethod) == null) {
      synchronized (CellularServiceGrpc.class) {
        if ((getListCellularInterfacesMethod = CellularServiceGrpc.getListCellularInterfacesMethod) == null) {
          CellularServiceGrpc.getListCellularInterfacesMethod = getListCellularInterfacesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCellularInterfaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListCellularInterfacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getIsCellularConnectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsCellularConnected",
      requestType = api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getIsCellularConnectedMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.types.Types.BooleanResponse> getIsCellularConnectedMethod;
    if ((getIsCellularConnectedMethod = CellularServiceGrpc.getIsCellularConnectedMethod) == null) {
      synchronized (CellularServiceGrpc.class) {
        if ((getIsCellularConnectedMethod = CellularServiceGrpc.getIsCellularConnectedMethod) == null) {
          CellularServiceGrpc.getIsCellularConnectedMethod = getIsCellularConnectedMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCellularConnected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsCellularConnectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse> getGetCellularLinkPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCellularLinkProperties",
      requestType = api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.class,
      responseType = api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse> getGetCellularLinkPropertiesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse> getGetCellularLinkPropertiesMethod;
    if ((getGetCellularLinkPropertiesMethod = CellularServiceGrpc.getGetCellularLinkPropertiesMethod) == null) {
      synchronized (CellularServiceGrpc.class) {
        if ((getGetCellularLinkPropertiesMethod = CellularServiceGrpc.getGetCellularLinkPropertiesMethod) == null) {
          CellularServiceGrpc.getGetCellularLinkPropertiesMethod = getGetCellularLinkPropertiesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCellularLinkProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCellularLinkPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularConfig,
      api.gravity.types.Types.BooleanResponse> getSetCellularConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCellularConfig",
      requestType = api.gravity.v26.CellularServiceOuterClass.CellularConfig.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularConfig,
      api.gravity.types.Types.BooleanResponse> getSetCellularConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularConfig, api.gravity.types.Types.BooleanResponse> getSetCellularConfigMethod;
    if ((getSetCellularConfigMethod = CellularServiceGrpc.getSetCellularConfigMethod) == null) {
      synchronized (CellularServiceGrpc.class) {
        if ((getSetCellularConfigMethod = CellularServiceGrpc.getSetCellularConfigMethod) == null) {
          CellularServiceGrpc.getSetCellularConfigMethod = getSetCellularConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CellularServiceOuterClass.CellularConfig, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCellularConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetCellularConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getConnectMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.types.Types.BooleanResponse> getConnectMethod;
    if ((getConnectMethod = CellularServiceGrpc.getConnectMethod) == null) {
      synchronized (CellularServiceGrpc.class) {
        if ((getConnectMethod = CellularServiceGrpc.getConnectMethod) == null) {
          CellularServiceGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disconnect",
      requestType = api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getDisconnectMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.types.Types.BooleanResponse> getDisconnectMethod;
    if ((getDisconnectMethod = CellularServiceGrpc.getDisconnectMethod) == null) {
      synchronized (CellularServiceGrpc.class) {
        if ((getDisconnectMethod = CellularServiceGrpc.getDisconnectMethod) == null) {
          CellularServiceGrpc.getDisconnectMethod = getDisconnectMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties> getSubscribeCellularEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCellularEvents",
      requestType = api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.class,
      responseType = api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
      api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties> getSubscribeCellularEventsMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties> getSubscribeCellularEventsMethod;
    if ((getSubscribeCellularEventsMethod = CellularServiceGrpc.getSubscribeCellularEventsMethod) == null) {
      synchronized (CellularServiceGrpc.class) {
        if ((getSubscribeCellularEventsMethod = CellularServiceGrpc.getSubscribeCellularEventsMethod) == null) {
          CellularServiceGrpc.getSubscribeCellularEventsMethod = getSubscribeCellularEventsMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest, api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCellularEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCellularEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CellularServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CellularServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CellularServiceStub>() {
        @java.lang.Override
        public CellularServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CellularServiceStub(channel, callOptions);
        }
      };
    return CellularServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CellularServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CellularServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CellularServiceBlockingStub>() {
        @java.lang.Override
        public CellularServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CellularServiceBlockingStub(channel, callOptions);
        }
      };
    return CellularServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CellularServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CellularServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CellularServiceFutureStub>() {
        @java.lang.Override
        public CellularServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CellularServiceFutureStub(channel, callOptions);
        }
      };
    return CellularServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists all cellular interfaces and their states
     * </pre>
     */
    default void listCellularInterfaces(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCellularInterfacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if a cellular interface is connected
     * </pre>
     */
    default void isCellularConnected(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsCellularConnectedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns link properties of an interface
     * </pre>
     */
    default void getCellularLinkProperties(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCellularLinkPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configures static IP or DHCP for an interface
     * </pre>
     */
    default void setCellularConfig(api.gravity.v26.CellularServiceOuterClass.CellularConfig request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCellularConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Connects / activates the cellular connection
     * </pre>
     */
    default void connect(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disconnects / deactivates the cellular connection
     * </pre>
     */
    default void disconnect(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Observes modem / network state changes
     * </pre>
     */
    default void subscribeCellularEvents(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCellularEventsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CellularService.
   */
  public static abstract class CellularServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CellularServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CellularService.
   */
  public static final class CellularServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CellularServiceStub> {
    private CellularServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CellularServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CellularServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all cellular interfaces and their states
     * </pre>
     */
    public void listCellularInterfaces(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCellularInterfacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if a cellular interface is connected
     * </pre>
     */
    public void isCellularConnected(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsCellularConnectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns link properties of an interface
     * </pre>
     */
    public void getCellularLinkProperties(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCellularLinkPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configures static IP or DHCP for an interface
     * </pre>
     */
    public void setCellularConfig(api.gravity.v26.CellularServiceOuterClass.CellularConfig request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCellularConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Connects / activates the cellular connection
     * </pre>
     */
    public void connect(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disconnects / deactivates the cellular connection
     * </pre>
     */
    public void disconnect(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Observes modem / network state changes
     * </pre>
     */
    public void subscribeCellularEvents(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCellularEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CellularService.
   */
  public static final class CellularServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CellularServiceBlockingStub> {
    private CellularServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CellularServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CellularServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all cellular interfaces and their states
     * </pre>
     */
    public api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse listCellularInterfaces(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCellularInterfacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if a cellular interface is connected
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse isCellularConnected(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsCellularConnectedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns link properties of an interface
     * </pre>
     */
    public api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse getCellularLinkProperties(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCellularLinkPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configures static IP or DHCP for an interface
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse setCellularConfig(api.gravity.v26.CellularServiceOuterClass.CellularConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCellularConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Connects / activates the cellular connection
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse connect(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disconnects / deactivates the cellular connection
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse disconnect(api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisconnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Observes modem / network state changes
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties> subscribeCellularEvents(
        api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCellularEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CellularService.
   */
  public static final class CellularServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CellularServiceFutureStub> {
    private CellularServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CellularServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CellularServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all cellular interfaces and their states
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse> listCellularInterfaces(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCellularInterfacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if a cellular interface is connected
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> isCellularConnected(
        api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsCellularConnectedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns link properties of an interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse> getCellularLinkProperties(
        api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCellularLinkPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configures static IP or DHCP for an interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setCellularConfig(
        api.gravity.v26.CellularServiceOuterClass.CellularConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCellularConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Connects / activates the cellular connection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> connect(
        api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disconnects / deactivates the cellular connection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disconnect(
        api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CELLULAR_INTERFACES = 0;
  private static final int METHODID_IS_CELLULAR_CONNECTED = 1;
  private static final int METHODID_GET_CELLULAR_LINK_PROPERTIES = 2;
  private static final int METHODID_SET_CELLULAR_CONFIG = 3;
  private static final int METHODID_CONNECT = 4;
  private static final int METHODID_DISCONNECT = 5;
  private static final int METHODID_SUBSCRIBE_CELLULAR_EVENTS = 6;

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
        case METHODID_LIST_CELLULAR_INTERFACES:
          serviceImpl.listCellularInterfaces((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse>) responseObserver);
          break;
        case METHODID_IS_CELLULAR_CONNECTED:
          serviceImpl.isCellularConnected((api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_CELLULAR_LINK_PROPERTIES:
          serviceImpl.getCellularLinkProperties((api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse>) responseObserver);
          break;
        case METHODID_SET_CELLULAR_CONFIG:
          serviceImpl.setCellularConfig((api.gravity.v26.CellularServiceOuterClass.CellularConfig) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_CONNECT:
          serviceImpl.connect((api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISCONNECT:
          serviceImpl.disconnect((api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CELLULAR_EVENTS:
          serviceImpl.subscribeCellularEvents((api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties>) responseObserver);
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
          getListCellularInterfacesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.CellularServiceOuterClass.CellularInterfacesResponse>(
                service, METHODID_LIST_CELLULAR_INTERFACES)))
        .addMethod(
          getIsCellularConnectedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_IS_CELLULAR_CONNECTED)))
        .addMethod(
          getGetCellularLinkPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
              api.gravity.v26.CellularServiceOuterClass.CellularLinkPropertiesResponse>(
                service, METHODID_GET_CELLULAR_LINK_PROPERTIES)))
        .addMethod(
          getSetCellularConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CellularServiceOuterClass.CellularConfig,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_CELLULAR_CONFIG)))
        .addMethod(
          getConnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_CONNECT)))
        .addMethod(
          getDisconnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISCONNECT)))
        .addMethod(
          getSubscribeCellularEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.CellularServiceOuterClass.CellularInterfaceRequest,
              api.gravity.v26.CellularServiceOuterClass.CellularLinkProperties>(
                service, METHODID_SUBSCRIBE_CELLULAR_EVENTS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CellularServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListCellularInterfacesMethod())
              .addMethod(getIsCellularConnectedMethod())
              .addMethod(getGetCellularLinkPropertiesMethod())
              .addMethod(getSetCellularConfigMethod())
              .addMethod(getConnectMethod())
              .addMethod(getDisconnectMethod())
              .addMethod(getSubscribeCellularEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
