package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AppHubService is the gRPC registry that apps use to announce their WebUI.
 * The HTTP portal (port 80) reads from this registry to populate the dashboard
 * and to route proxy requests to the correct backend port.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: app_hub_service/v26/app_hub_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppHubServiceGrpc {

  private AppHubServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.AppHubService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest,
      api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse> getRegisterServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterService",
      requestType = api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest.class,
      responseType = api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest,
      api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse> getRegisterServiceMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest, api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse> getRegisterServiceMethod;
    if ((getRegisterServiceMethod = AppHubServiceGrpc.getRegisterServiceMethod) == null) {
      synchronized (AppHubServiceGrpc.class) {
        if ((getRegisterServiceMethod = AppHubServiceGrpc.getRegisterServiceMethod) == null) {
          AppHubServiceGrpc.getRegisterServiceMethod = getRegisterServiceMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest, api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRegisterServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getUnregisterServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnregisterService",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getUnregisterServiceMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getUnregisterServiceMethod;
    if ((getUnregisterServiceMethod = AppHubServiceGrpc.getUnregisterServiceMethod) == null) {
      synchronized (AppHubServiceGrpc.class) {
        if ((getUnregisterServiceMethod = AppHubServiceGrpc.getUnregisterServiceMethod) == null) {
          AppHubServiceGrpc.getUnregisterServiceMethod = getUnregisterServiceMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnregisterService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUnregisterServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest,
      api.gravity.v26.AppHubServiceOuterClass.ServiceResponse> getGetServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetService",
      requestType = api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest.class,
      responseType = api.gravity.v26.AppHubServiceOuterClass.ServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest,
      api.gravity.v26.AppHubServiceOuterClass.ServiceResponse> getGetServiceMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest, api.gravity.v26.AppHubServiceOuterClass.ServiceResponse> getGetServiceMethod;
    if ((getGetServiceMethod = AppHubServiceGrpc.getGetServiceMethod) == null) {
      synchronized (AppHubServiceGrpc.class) {
        if ((getGetServiceMethod = AppHubServiceGrpc.getGetServiceMethod) == null) {
          AppHubServiceGrpc.getGetServiceMethod = getGetServiceMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest, api.gravity.v26.AppHubServiceOuterClass.ServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.ServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.AppHubServiceOuterClass.ServicesResponse> getListServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServices",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.AppHubServiceOuterClass.ServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.AppHubServiceOuterClass.ServicesResponse> getListServicesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.AppHubServiceOuterClass.ServicesResponse> getListServicesMethod;
    if ((getListServicesMethod = AppHubServiceGrpc.getListServicesMethod) == null) {
      synchronized (AppHubServiceGrpc.class) {
        if ((getListServicesMethod = AppHubServiceGrpc.getListServicesMethod) == null) {
          AppHubServiceGrpc.getListServicesMethod = getListServicesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.AppHubServiceOuterClass.ServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.ServicesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest,
      api.gravity.types.Types.BooleanResponse> getAddRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRoute",
      requestType = api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest,
      api.gravity.types.Types.BooleanResponse> getAddRouteMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest, api.gravity.types.Types.BooleanResponse> getAddRouteMethod;
    if ((getAddRouteMethod = AppHubServiceGrpc.getAddRouteMethod) == null) {
      synchronized (AppHubServiceGrpc.class) {
        if ((getAddRouteMethod = AppHubServiceGrpc.getAddRouteMethod) == null) {
          AppHubServiceGrpc.getAddRouteMethod = getAddRouteMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRoute",
      requestType = api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveRouteMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest, api.gravity.types.Types.BooleanResponse> getRemoveRouteMethod;
    if ((getRemoveRouteMethod = AppHubServiceGrpc.getRemoveRouteMethod) == null) {
      synchronized (AppHubServiceGrpc.class) {
        if ((getRemoveRouteMethod = AppHubServiceGrpc.getRemoveRouteMethod) == null) {
          AppHubServiceGrpc.getRemoveRouteMethod = getRemoveRouteMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse> getGetRoutingTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoutingTable",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse> getGetRoutingTableMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse> getGetRoutingTableMethod;
    if ((getGetRoutingTableMethod = AppHubServiceGrpc.getGetRoutingTableMethod) == null) {
      synchronized (AppHubServiceGrpc.class) {
        if ((getGetRoutingTableMethod = AppHubServiceGrpc.getGetRoutingTableMethod) == null) {
          AppHubServiceGrpc.getGetRoutingTableMethod = getGetRoutingTableMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoutingTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRoutingTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.AppHubServiceOuterClass.ServiceEvent> getWatchServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchServices",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.AppHubServiceOuterClass.ServiceEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.AppHubServiceOuterClass.ServiceEvent> getWatchServicesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.AppHubServiceOuterClass.ServiceEvent> getWatchServicesMethod;
    if ((getWatchServicesMethod = AppHubServiceGrpc.getWatchServicesMethod) == null) {
      synchronized (AppHubServiceGrpc.class) {
        if ((getWatchServicesMethod = AppHubServiceGrpc.getWatchServicesMethod) == null) {
          AppHubServiceGrpc.getWatchServicesMethod = getWatchServicesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.AppHubServiceOuterClass.ServiceEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AppHubServiceOuterClass.ServiceEvent.getDefaultInstance()))
              .build();
        }
      }
    }
    return getWatchServicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppHubServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppHubServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppHubServiceStub>() {
        @java.lang.Override
        public AppHubServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppHubServiceStub(channel, callOptions);
        }
      };
    return AppHubServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppHubServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppHubServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppHubServiceBlockingStub>() {
        @java.lang.Override
        public AppHubServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppHubServiceBlockingStub(channel, callOptions);
        }
      };
    return AppHubServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppHubServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppHubServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppHubServiceFutureStub>() {
        @java.lang.Override
        public AppHubServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppHubServiceFutureStub(channel, callOptions);
        }
      };
    return AppHubServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AppHubService is the gRPC registry that apps use to announce their WebUI.
   * The HTTP portal (port 80) reads from this registry to populate the dashboard
   * and to route proxy requests to the correct backend port.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Registry — server identifies the caller from launch context (no service_id needed)
     * </pre>
     */
    default void registerService(api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterServiceMethod(), responseObserver);
    }

    /**
     */
    default void unregisterService(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnregisterServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Discovery
     * </pre>
     */
    default void getService(api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceMethod(), responseObserver);
    }

    /**
     */
    default void listServices(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Routing
     * </pre>
     */
    default void addRoute(api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRouteMethod(), responseObserver);
    }

    /**
     */
    default void removeRoute(api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRouteMethod(), responseObserver);
    }

    /**
     */
    default void getRoutingTable(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoutingTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    default void watchServices(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServiceEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchServicesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AppHubService.
   * <pre>
   * AppHubService is the gRPC registry that apps use to announce their WebUI.
   * The HTTP portal (port 80) reads from this registry to populate the dashboard
   * and to route proxy requests to the correct backend port.
   * </pre>
   */
  public static abstract class AppHubServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AppHubServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AppHubService.
   * <pre>
   * AppHubService is the gRPC registry that apps use to announce their WebUI.
   * The HTTP portal (port 80) reads from this registry to populate the dashboard
   * and to route proxy requests to the correct backend port.
   * </pre>
   */
  public static final class AppHubServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AppHubServiceStub> {
    private AppHubServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppHubServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppHubServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registry — server identifies the caller from launch context (no service_id needed)
     * </pre>
     */
    public void registerService(api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterService(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnregisterServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Discovery
     * </pre>
     */
    public void getService(api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listServices(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Routing
     * </pre>
     */
    public void addRoute(api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRoute(api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoutingTable(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoutingTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    public void watchServices(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServiceEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchServicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AppHubService.
   * <pre>
   * AppHubService is the gRPC registry that apps use to announce their WebUI.
   * The HTTP portal (port 80) reads from this registry to populate the dashboard
   * and to route proxy requests to the correct backend port.
   * </pre>
   */
  public static final class AppHubServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AppHubServiceBlockingStub> {
    private AppHubServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppHubServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppHubServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registry — server identifies the caller from launch context (no service_id needed)
     * </pre>
     */
    public api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse registerService(api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse unregisterService(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Discovery
     * </pre>
     */
    public api.gravity.v26.AppHubServiceOuterClass.ServiceResponse getService(api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.AppHubServiceOuterClass.ServicesResponse listServices(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Routing
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse addRoute(api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse removeRoute(api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse getRoutingTable(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoutingTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.AppHubServiceOuterClass.ServiceEvent> watchServices(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchServicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AppHubService.
   * <pre>
   * AppHubService is the gRPC registry that apps use to announce their WebUI.
   * The HTTP portal (port 80) reads from this registry to populate the dashboard
   * and to route proxy requests to the correct backend port.
   * </pre>
   */
  public static final class AppHubServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AppHubServiceFutureStub> {
    private AppHubServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppHubServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppHubServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registry — server identifies the caller from launch context (no service_id needed)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse> registerService(
        api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> unregisterService(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnregisterServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Discovery
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AppHubServiceOuterClass.ServiceResponse> getService(
        api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AppHubServiceOuterClass.ServicesResponse> listServices(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Routing
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> addRoute(
        api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> removeRoute(
        api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse> getRoutingTable(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoutingTableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_SERVICE = 0;
  private static final int METHODID_UNREGISTER_SERVICE = 1;
  private static final int METHODID_GET_SERVICE = 2;
  private static final int METHODID_LIST_SERVICES = 3;
  private static final int METHODID_ADD_ROUTE = 4;
  private static final int METHODID_REMOVE_ROUTE = 5;
  private static final int METHODID_GET_ROUTING_TABLE = 6;
  private static final int METHODID_WATCH_SERVICES = 7;

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
        case METHODID_REGISTER_SERVICE:
          serviceImpl.registerService((api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER_SERVICE:
          serviceImpl.unregisterService((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE:
          serviceImpl.getService((api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServiceResponse>) responseObserver);
          break;
        case METHODID_LIST_SERVICES:
          serviceImpl.listServices((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServicesResponse>) responseObserver);
          break;
        case METHODID_ADD_ROUTE:
          serviceImpl.addRoute((api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROUTE:
          serviceImpl.removeRoute((api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_ROUTING_TABLE:
          serviceImpl.getRoutingTable((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse>) responseObserver);
          break;
        case METHODID_WATCH_SERVICES:
          serviceImpl.watchServices((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AppHubServiceOuterClass.ServiceEvent>) responseObserver);
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
          getRegisterServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AppHubServiceOuterClass.RegisterServiceRequest,
              api.gravity.v26.AppHubServiceOuterClass.RegisterServiceResponse>(
                service, METHODID_REGISTER_SERVICE)))
        .addMethod(
          getUnregisterServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_UNREGISTER_SERVICE)))
        .addMethod(
          getGetServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AppHubServiceOuterClass.ServiceIdRequest,
              api.gravity.v26.AppHubServiceOuterClass.ServiceResponse>(
                service, METHODID_GET_SERVICE)))
        .addMethod(
          getListServicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.AppHubServiceOuterClass.ServicesResponse>(
                service, METHODID_LIST_SERVICES)))
        .addMethod(
          getAddRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AppHubServiceOuterClass.AddRouteRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ADD_ROUTE)))
        .addMethod(
          getRemoveRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AppHubServiceOuterClass.RemoveRouteRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_REMOVE_ROUTE)))
        .addMethod(
          getGetRoutingTableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.AppHubServiceOuterClass.RoutingTableResponse>(
                service, METHODID_GET_ROUTING_TABLE)))
        .addMethod(
          getWatchServicesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.AppHubServiceOuterClass.ServiceEvent>(
                service, METHODID_WATCH_SERVICES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AppHubServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getRegisterServiceMethod())
              .addMethod(getUnregisterServiceMethod())
              .addMethod(getGetServiceMethod())
              .addMethod(getListServicesMethod())
              .addMethod(getAddRouteMethod())
              .addMethod(getRemoveRouteMethod())
              .addMethod(getGetRoutingTableMethod())
              .addMethod(getWatchServicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
