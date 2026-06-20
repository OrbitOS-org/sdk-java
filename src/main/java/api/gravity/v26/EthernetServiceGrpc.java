package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * EthernetService definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: ethernet_service/v26/ethernet_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EthernetServiceGrpc {

  private EthernetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.EthernetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse> getListEthernetInterfacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEthernetInterfaces",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse> getListEthernetInterfacesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse> getListEthernetInterfacesMethod;
    if ((getListEthernetInterfacesMethod = EthernetServiceGrpc.getListEthernetInterfacesMethod) == null) {
      synchronized (EthernetServiceGrpc.class) {
        if ((getListEthernetInterfacesMethod = EthernetServiceGrpc.getListEthernetInterfacesMethod) == null) {
          EthernetServiceGrpc.getListEthernetInterfacesMethod = getListEthernetInterfacesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEthernetInterfaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListEthernetInterfacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getIsEthernetConnectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsEthernetConnected",
      requestType = api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getIsEthernetConnectedMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest, api.gravity.types.Types.BooleanResponse> getIsEthernetConnectedMethod;
    if ((getIsEthernetConnectedMethod = EthernetServiceGrpc.getIsEthernetConnectedMethod) == null) {
      synchronized (EthernetServiceGrpc.class) {
        if ((getIsEthernetConnectedMethod = EthernetServiceGrpc.getIsEthernetConnectedMethod) == null) {
          EthernetServiceGrpc.getIsEthernetConnectedMethod = getIsEthernetConnectedMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsEthernetConnected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsEthernetConnectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
      api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse> getGetEthernetLinkPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEthernetLinkProperties",
      requestType = api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest.class,
      responseType = api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
      api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse> getGetEthernetLinkPropertiesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest, api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse> getGetEthernetLinkPropertiesMethod;
    if ((getGetEthernetLinkPropertiesMethod = EthernetServiceGrpc.getGetEthernetLinkPropertiesMethod) == null) {
      synchronized (EthernetServiceGrpc.class) {
        if ((getGetEthernetLinkPropertiesMethod = EthernetServiceGrpc.getGetEthernetLinkPropertiesMethod) == null) {
          EthernetServiceGrpc.getGetEthernetLinkPropertiesMethod = getGetEthernetLinkPropertiesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest, api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEthernetLinkProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetEthernetLinkPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.EthernetConfig,
      api.gravity.types.Types.BooleanResponse> getSetEthernetConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetEthernetConfig",
      requestType = api.gravity.v26.EthernetServiceOuterClass.EthernetConfig.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.EthernetConfig,
      api.gravity.types.Types.BooleanResponse> getSetEthernetConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.EthernetConfig, api.gravity.types.Types.BooleanResponse> getSetEthernetConfigMethod;
    if ((getSetEthernetConfigMethod = EthernetServiceGrpc.getSetEthernetConfigMethod) == null) {
      synchronized (EthernetServiceGrpc.class) {
        if ((getSetEthernetConfigMethod = EthernetServiceGrpc.getSetEthernetConfigMethod) == null) {
          EthernetServiceGrpc.getSetEthernetConfigMethod = getSetEthernetConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.EthernetServiceOuterClass.EthernetConfig, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetEthernetConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EthernetServiceOuterClass.EthernetConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetEthernetConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getEnableEthernetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableEthernet",
      requestType = api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getEnableEthernetMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest, api.gravity.types.Types.BooleanResponse> getEnableEthernetMethod;
    if ((getEnableEthernetMethod = EthernetServiceGrpc.getEnableEthernetMethod) == null) {
      synchronized (EthernetServiceGrpc.class) {
        if ((getEnableEthernetMethod = EthernetServiceGrpc.getEnableEthernetMethod) == null) {
          EthernetServiceGrpc.getEnableEthernetMethod = getEnableEthernetMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableEthernet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableEthernetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getDisableEthernetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableEthernet",
      requestType = api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getDisableEthernetMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest, api.gravity.types.Types.BooleanResponse> getDisableEthernetMethod;
    if ((getDisableEthernetMethod = EthernetServiceGrpc.getDisableEthernetMethod) == null) {
      synchronized (EthernetServiceGrpc.class) {
        if ((getDisableEthernetMethod = EthernetServiceGrpc.getDisableEthernetMethod) == null) {
          EthernetServiceGrpc.getDisableEthernetMethod = getDisableEthernetMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableEthernet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableEthernetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EthernetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EthernetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EthernetServiceStub>() {
        @java.lang.Override
        public EthernetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EthernetServiceStub(channel, callOptions);
        }
      };
    return EthernetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EthernetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EthernetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EthernetServiceBlockingStub>() {
        @java.lang.Override
        public EthernetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EthernetServiceBlockingStub(channel, callOptions);
        }
      };
    return EthernetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EthernetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EthernetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EthernetServiceFutureStub>() {
        @java.lang.Override
        public EthernetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EthernetServiceFutureStub(channel, callOptions);
        }
      };
    return EthernetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * EthernetService definition
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists all Ethernet interfaces and their states
     * </pre>
     */
    default void listEthernetInterfaces(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEthernetInterfacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if an Ethernet interface is connected
     * </pre>
     */
    default void isEthernetConnected(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsEthernetConnectedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns link properties of an interface
     * </pre>
     */
    default void getEthernetLinkProperties(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEthernetLinkPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configures static IP or DHCP for an interface
     * </pre>
     */
    default void setEthernetConfig(api.gravity.v26.EthernetServiceOuterClass.EthernetConfig request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetEthernetConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enables the Ethernet interface
     * </pre>
     */
    default void enableEthernet(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableEthernetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disables the Ethernet interface
     * </pre>
     */
    default void disableEthernet(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableEthernetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EthernetService.
   * <pre>
   * EthernetService definition
   * </pre>
   */
  public static abstract class EthernetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EthernetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EthernetService.
   * <pre>
   * EthernetService definition
   * </pre>
   */
  public static final class EthernetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EthernetServiceStub> {
    private EthernetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EthernetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EthernetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all Ethernet interfaces and their states
     * </pre>
     */
    public void listEthernetInterfaces(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEthernetInterfacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if an Ethernet interface is connected
     * </pre>
     */
    public void isEthernetConnected(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsEthernetConnectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns link properties of an interface
     * </pre>
     */
    public void getEthernetLinkProperties(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEthernetLinkPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configures static IP or DHCP for an interface
     * </pre>
     */
    public void setEthernetConfig(api.gravity.v26.EthernetServiceOuterClass.EthernetConfig request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetEthernetConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables the Ethernet interface
     * </pre>
     */
    public void enableEthernet(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableEthernetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disables the Ethernet interface
     * </pre>
     */
    public void disableEthernet(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableEthernetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EthernetService.
   * <pre>
   * EthernetService definition
   * </pre>
   */
  public static final class EthernetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EthernetServiceBlockingStub> {
    private EthernetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EthernetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EthernetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all Ethernet interfaces and their states
     * </pre>
     */
    public api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse listEthernetInterfaces(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEthernetInterfacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if an Ethernet interface is connected
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse isEthernetConnected(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsEthernetConnectedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns link properties of an interface
     * </pre>
     */
    public api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse getEthernetLinkProperties(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEthernetLinkPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configures static IP or DHCP for an interface
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse setEthernetConfig(api.gravity.v26.EthernetServiceOuterClass.EthernetConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetEthernetConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables the Ethernet interface
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse enableEthernet(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableEthernetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables the Ethernet interface
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse disableEthernet(api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableEthernetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EthernetService.
   * <pre>
   * EthernetService definition
   * </pre>
   */
  public static final class EthernetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EthernetServiceFutureStub> {
    private EthernetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EthernetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EthernetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all Ethernet interfaces and their states
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse> listEthernetInterfaces(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEthernetInterfacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if an Ethernet interface is connected
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> isEthernetConnected(
        api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsEthernetConnectedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns link properties of an interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse> getEthernetLinkProperties(
        api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEthernetLinkPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configures static IP or DHCP for an interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setEthernetConfig(
        api.gravity.v26.EthernetServiceOuterClass.EthernetConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetEthernetConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables the Ethernet interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> enableEthernet(
        api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableEthernetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disables the Ethernet interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disableEthernet(
        api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableEthernetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ETHERNET_INTERFACES = 0;
  private static final int METHODID_IS_ETHERNET_CONNECTED = 1;
  private static final int METHODID_GET_ETHERNET_LINK_PROPERTIES = 2;
  private static final int METHODID_SET_ETHERNET_CONFIG = 3;
  private static final int METHODID_ENABLE_ETHERNET = 4;
  private static final int METHODID_DISABLE_ETHERNET = 5;

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
        case METHODID_LIST_ETHERNET_INTERFACES:
          serviceImpl.listEthernetInterfaces((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse>) responseObserver);
          break;
        case METHODID_IS_ETHERNET_CONNECTED:
          serviceImpl.isEthernetConnected((api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_ETHERNET_LINK_PROPERTIES:
          serviceImpl.getEthernetLinkProperties((api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse>) responseObserver);
          break;
        case METHODID_SET_ETHERNET_CONFIG:
          serviceImpl.setEthernetConfig((api.gravity.v26.EthernetServiceOuterClass.EthernetConfig) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_ENABLE_ETHERNET:
          serviceImpl.enableEthernet((api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISABLE_ETHERNET:
          serviceImpl.disableEthernet((api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest) request,
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
          getListEthernetInterfacesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.EthernetServiceOuterClass.EthernetInterfacesResponse>(
                service, METHODID_LIST_ETHERNET_INTERFACES)))
        .addMethod(
          getIsEthernetConnectedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_IS_ETHERNET_CONNECTED)))
        .addMethod(
          getGetEthernetLinkPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
              api.gravity.v26.EthernetServiceOuterClass.EthernetLinkPropertiesResponse>(
                service, METHODID_GET_ETHERNET_LINK_PROPERTIES)))
        .addMethod(
          getSetEthernetConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.EthernetServiceOuterClass.EthernetConfig,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_ETHERNET_CONFIG)))
        .addMethod(
          getEnableEthernetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ENABLE_ETHERNET)))
        .addMethod(
          getDisableEthernetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.EthernetServiceOuterClass.InterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISABLE_ETHERNET)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EthernetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListEthernetInterfacesMethod())
              .addMethod(getIsEthernetConnectedMethod())
              .addMethod(getGetEthernetLinkPropertiesMethod())
              .addMethod(getSetEthernetConfigMethod())
              .addMethod(getEnableEthernetMethod())
              .addMethod(getDisableEthernetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
