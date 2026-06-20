package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: vpn_service/v26/vpn_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VPNServiceGrpc {

  private VPNServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.VPNService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.VpnService.VpnCapabilitiesResponse> getGetCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCapabilities",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.VpnService.VpnCapabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.VpnService.VpnCapabilitiesResponse> getGetCapabilitiesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.VpnService.VpnCapabilitiesResponse> getGetCapabilitiesMethod;
    if ((getGetCapabilitiesMethod = VPNServiceGrpc.getGetCapabilitiesMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getGetCapabilitiesMethod = VPNServiceGrpc.getGetCapabilitiesMethod) == null) {
          VPNServiceGrpc.getGetCapabilitiesMethod = getGetCapabilitiesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.VpnService.VpnCapabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCapabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.VpnCapabilitiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.VpnService.VpnProfilesResponse> getListProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProfiles",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.VpnService.VpnProfilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.VpnService.VpnProfilesResponse> getListProfilesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.VpnService.VpnProfilesResponse> getListProfilesMethod;
    if ((getListProfilesMethod = VPNServiceGrpc.getListProfilesMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getListProfilesMethod = VPNServiceGrpc.getListProfilesMethod) == null) {
          VPNServiceGrpc.getListProfilesMethod = getListProfilesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.VpnService.VpnProfilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.VpnProfilesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.VpnService.ApplyProfileRequest,
      api.gravity.v26.VpnService.ApplyProfileResponse> getApplyProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyProfile",
      requestType = api.gravity.v26.VpnService.ApplyProfileRequest.class,
      responseType = api.gravity.v26.VpnService.ApplyProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.VpnService.ApplyProfileRequest,
      api.gravity.v26.VpnService.ApplyProfileResponse> getApplyProfileMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.VpnService.ApplyProfileRequest, api.gravity.v26.VpnService.ApplyProfileResponse> getApplyProfileMethod;
    if ((getApplyProfileMethod = VPNServiceGrpc.getApplyProfileMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getApplyProfileMethod = VPNServiceGrpc.getApplyProfileMethod) == null) {
          VPNServiceGrpc.getApplyProfileMethod = getApplyProfileMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.VpnService.ApplyProfileRequest, api.gravity.v26.VpnService.ApplyProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.ApplyProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.ApplyProfileResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getApplyProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveProfile",
      requestType = api.gravity.v26.VpnService.VpnProfileRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveProfileMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest, api.gravity.types.Types.BooleanResponse> getRemoveProfileMethod;
    if ((getRemoveProfileMethod = VPNServiceGrpc.getRemoveProfileMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getRemoveProfileMethod = VPNServiceGrpc.getRemoveProfileMethod) == null) {
          VPNServiceGrpc.getRemoveProfileMethod = getRemoveProfileMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.VpnService.VpnProfileRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.VpnProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest,
      api.gravity.v26.VpnService.ConnectResponse> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = api.gravity.v26.VpnService.VpnProfileRequest.class,
      responseType = api.gravity.v26.VpnService.ConnectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest,
      api.gravity.v26.VpnService.ConnectResponse> getConnectMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest, api.gravity.v26.VpnService.ConnectResponse> getConnectMethod;
    if ((getConnectMethod = VPNServiceGrpc.getConnectMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getConnectMethod = VPNServiceGrpc.getConnectMethod) == null) {
          VPNServiceGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.VpnService.VpnProfileRequest, api.gravity.v26.VpnService.ConnectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.VpnProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.ConnectResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest,
      api.gravity.types.Types.BooleanResponse> getDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disconnect",
      requestType = api.gravity.v26.VpnService.VpnProfileRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest,
      api.gravity.types.Types.BooleanResponse> getDisconnectMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.VpnService.VpnProfileRequest, api.gravity.types.Types.BooleanResponse> getDisconnectMethod;
    if ((getDisconnectMethod = VPNServiceGrpc.getDisconnectMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getDisconnectMethod = VPNServiceGrpc.getDisconnectMethod) == null) {
          VPNServiceGrpc.getDisconnectMethod = getDisconnectMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.VpnService.VpnProfileRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.VpnProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.VpnService.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.VpnService.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.VpnService.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.VpnService.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = VPNServiceGrpc.getGetStatusMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getGetStatusMethod = VPNServiceGrpc.getGetStatusMethod) == null) {
          VPNServiceGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.VpnService.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.GetStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.VpnService.SessionsResponse> getListSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessions",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.VpnService.SessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.VpnService.SessionsResponse> getListSessionsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.VpnService.SessionsResponse> getListSessionsMethod;
    if ((getListSessionsMethod = VPNServiceGrpc.getListSessionsMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getListSessionsMethod = VPNServiceGrpc.getListSessionsMethod) == null) {
          VPNServiceGrpc.getListSessionsMethod = getListSessionsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.VpnService.SessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.SessionsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.VpnService.WatchEventsRequest,
      api.gravity.v26.VpnService.VPNEvent> getWatchEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchEvents",
      requestType = api.gravity.v26.VpnService.WatchEventsRequest.class,
      responseType = api.gravity.v26.VpnService.VPNEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.VpnService.WatchEventsRequest,
      api.gravity.v26.VpnService.VPNEvent> getWatchEventsMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.VpnService.WatchEventsRequest, api.gravity.v26.VpnService.VPNEvent> getWatchEventsMethod;
    if ((getWatchEventsMethod = VPNServiceGrpc.getWatchEventsMethod) == null) {
      synchronized (VPNServiceGrpc.class) {
        if ((getWatchEventsMethod = VPNServiceGrpc.getWatchEventsMethod) == null) {
          VPNServiceGrpc.getWatchEventsMethod = getWatchEventsMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.VpnService.WatchEventsRequest, api.gravity.v26.VpnService.VPNEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.WatchEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.VpnService.VPNEvent.getDefaultInstance()))
              .build();
        }
      }
    }
    return getWatchEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VPNServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VPNServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VPNServiceStub>() {
        @java.lang.Override
        public VPNServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VPNServiceStub(channel, callOptions);
        }
      };
    return VPNServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VPNServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VPNServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VPNServiceBlockingStub>() {
        @java.lang.Override
        public VPNServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VPNServiceBlockingStub(channel, callOptions);
        }
      };
    return VPNServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VPNServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VPNServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VPNServiceFutureStub>() {
        @java.lang.Override
        public VPNServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VPNServiceFutureStub(channel, callOptions);
        }
      };
    return VPNServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Capabilities
     * </pre>
     */
    default void getCapabilities(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VpnCapabilitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCapabilitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Profiles
     * </pre>
     */
    default void listProfiles(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VpnProfilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProfilesMethod(), responseObserver);
    }

    /**
     */
    default void applyProfile(api.gravity.v26.VpnService.ApplyProfileRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.ApplyProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyProfileMethod(), responseObserver);
    }

    /**
     */
    default void removeProfile(api.gravity.v26.VpnService.VpnProfileRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Connection
     * </pre>
     */
    default void connect(api.gravity.v26.VpnService.VpnProfileRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.ConnectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     */
    default void disconnect(api.gravity.v26.VpnService.VpnProfileRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Status
     * </pre>
     */
    default void getStatus(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.GetStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     */
    default void listSessions(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.SessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    default void watchEvents(api.gravity.v26.VpnService.WatchEventsRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VPNEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchEventsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VPNService.
   */
  public static abstract class VPNServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VPNServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VPNService.
   */
  public static final class VPNServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VPNServiceStub> {
    private VPNServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VPNServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VPNServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities
     * </pre>
     */
    public void getCapabilities(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VpnCapabilitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Profiles
     * </pre>
     */
    public void listProfiles(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VpnProfilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applyProfile(api.gravity.v26.VpnService.ApplyProfileRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.ApplyProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeProfile(api.gravity.v26.VpnService.VpnProfileRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Connection
     * </pre>
     */
    public void connect(api.gravity.v26.VpnService.VpnProfileRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.ConnectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disconnect(api.gravity.v26.VpnService.VpnProfileRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Status
     * </pre>
     */
    public void getStatus(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.GetStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSessions(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.SessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    public void watchEvents(api.gravity.v26.VpnService.WatchEventsRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VPNEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VPNService.
   */
  public static final class VPNServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VPNServiceBlockingStub> {
    private VPNServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VPNServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VPNServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities
     * </pre>
     */
    public api.gravity.v26.VpnService.VpnCapabilitiesResponse getCapabilities(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Profiles
     * </pre>
     */
    public api.gravity.v26.VpnService.VpnProfilesResponse listProfiles(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProfilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.VpnService.ApplyProfileResponse applyProfile(api.gravity.v26.VpnService.ApplyProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse removeProfile(api.gravity.v26.VpnService.VpnProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Connection
     * </pre>
     */
    public api.gravity.v26.VpnService.ConnectResponse connect(api.gravity.v26.VpnService.VpnProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disconnect(api.gravity.v26.VpnService.VpnProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisconnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Status
     * </pre>
     */
    public api.gravity.v26.VpnService.GetStatusResponse getStatus(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.VpnService.SessionsResponse listSessions(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.VpnService.VPNEvent> watchEvents(
        api.gravity.v26.VpnService.WatchEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VPNService.
   */
  public static final class VPNServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VPNServiceFutureStub> {
    private VPNServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VPNServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VPNServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.VpnService.VpnCapabilitiesResponse> getCapabilities(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Profiles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.VpnService.VpnProfilesResponse> listProfiles(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProfilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.VpnService.ApplyProfileResponse> applyProfile(
        api.gravity.v26.VpnService.ApplyProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> removeProfile(
        api.gravity.v26.VpnService.VpnProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Connection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.VpnService.ConnectResponse> connect(
        api.gravity.v26.VpnService.VpnProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disconnect(
        api.gravity.v26.VpnService.VpnProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.VpnService.GetStatusResponse> getStatus(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.VpnService.SessionsResponse> listSessions(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAPABILITIES = 0;
  private static final int METHODID_LIST_PROFILES = 1;
  private static final int METHODID_APPLY_PROFILE = 2;
  private static final int METHODID_REMOVE_PROFILE = 3;
  private static final int METHODID_CONNECT = 4;
  private static final int METHODID_DISCONNECT = 5;
  private static final int METHODID_GET_STATUS = 6;
  private static final int METHODID_LIST_SESSIONS = 7;
  private static final int METHODID_WATCH_EVENTS = 8;

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
              (io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VpnCapabilitiesResponse>) responseObserver);
          break;
        case METHODID_LIST_PROFILES:
          serviceImpl.listProfiles((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VpnProfilesResponse>) responseObserver);
          break;
        case METHODID_APPLY_PROFILE:
          serviceImpl.applyProfile((api.gravity.v26.VpnService.ApplyProfileRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.ApplyProfileResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PROFILE:
          serviceImpl.removeProfile((api.gravity.v26.VpnService.VpnProfileRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_CONNECT:
          serviceImpl.connect((api.gravity.v26.VpnService.VpnProfileRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.ConnectResponse>) responseObserver);
          break;
        case METHODID_DISCONNECT:
          serviceImpl.disconnect((api.gravity.v26.VpnService.VpnProfileRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.GetStatusResponse>) responseObserver);
          break;
        case METHODID_LIST_SESSIONS:
          serviceImpl.listSessions((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.SessionsResponse>) responseObserver);
          break;
        case METHODID_WATCH_EVENTS:
          serviceImpl.watchEvents((api.gravity.v26.VpnService.WatchEventsRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.VpnService.VPNEvent>) responseObserver);
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
              api.gravity.v26.VpnService.VpnCapabilitiesResponse>(
                service, METHODID_GET_CAPABILITIES)))
        .addMethod(
          getListProfilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.VpnService.VpnProfilesResponse>(
                service, METHODID_LIST_PROFILES)))
        .addMethod(
          getApplyProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.VpnService.ApplyProfileRequest,
              api.gravity.v26.VpnService.ApplyProfileResponse>(
                service, METHODID_APPLY_PROFILE)))
        .addMethod(
          getRemoveProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.VpnService.VpnProfileRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_REMOVE_PROFILE)))
        .addMethod(
          getConnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.VpnService.VpnProfileRequest,
              api.gravity.v26.VpnService.ConnectResponse>(
                service, METHODID_CONNECT)))
        .addMethod(
          getDisconnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.VpnService.VpnProfileRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISCONNECT)))
        .addMethod(
          getGetStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.VpnService.GetStatusResponse>(
                service, METHODID_GET_STATUS)))
        .addMethod(
          getListSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.VpnService.SessionsResponse>(
                service, METHODID_LIST_SESSIONS)))
        .addMethod(
          getWatchEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.VpnService.WatchEventsRequest,
              api.gravity.v26.VpnService.VPNEvent>(
                service, METHODID_WATCH_EVENTS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VPNServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetCapabilitiesMethod())
              .addMethod(getListProfilesMethod())
              .addMethod(getApplyProfileMethod())
              .addMethod(getRemoveProfileMethod())
              .addMethod(getConnectMethod())
              .addMethod(getDisconnectMethod())
              .addMethod(getGetStatusMethod())
              .addMethod(getListSessionsMethod())
              .addMethod(getWatchEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
