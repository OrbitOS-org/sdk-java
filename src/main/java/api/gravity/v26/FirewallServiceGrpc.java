package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: firewall_service/v26/firewall_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FirewallServiceGrpc {

  private FirewallServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.FirewallService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.FirewallServiceOuterClass.ZonesResponse> getListZonesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListZones",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.FirewallServiceOuterClass.ZonesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.FirewallServiceOuterClass.ZonesResponse> getListZonesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.FirewallServiceOuterClass.ZonesResponse> getListZonesMethod;
    if ((getListZonesMethod = FirewallServiceGrpc.getListZonesMethod) == null) {
      synchronized (FirewallServiceGrpc.class) {
        if ((getListZonesMethod = FirewallServiceGrpc.getListZonesMethod) == null) {
          FirewallServiceGrpc.getListZonesMethod = getListZonesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.FirewallServiceOuterClass.ZonesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListZones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.FirewallServiceOuterClass.ZonesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListZonesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.ZoneRequest,
      api.gravity.types.Types.BooleanResponse> getAddZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddZone",
      requestType = api.gravity.v26.FirewallServiceOuterClass.ZoneRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.ZoneRequest,
      api.gravity.types.Types.BooleanResponse> getAddZoneMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.ZoneRequest, api.gravity.types.Types.BooleanResponse> getAddZoneMethod;
    if ((getAddZoneMethod = FirewallServiceGrpc.getAddZoneMethod) == null) {
      synchronized (FirewallServiceGrpc.class) {
        if ((getAddZoneMethod = FirewallServiceGrpc.getAddZoneMethod) == null) {
          FirewallServiceGrpc.getAddZoneMethod = getAddZoneMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.FirewallServiceOuterClass.ZoneRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.FirewallServiceOuterClass.ZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveZone",
      requestType = api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveZoneMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest, api.gravity.types.Types.BooleanResponse> getRemoveZoneMethod;
    if ((getRemoveZoneMethod = FirewallServiceGrpc.getRemoveZoneMethod) == null) {
      synchronized (FirewallServiceGrpc.class) {
        if ((getRemoveZoneMethod = FirewallServiceGrpc.getRemoveZoneMethod) == null) {
          FirewallServiceGrpc.getRemoveZoneMethod = getRemoveZoneMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse> getListRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRules",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse> getListRulesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse> getListRulesMethod;
    if ((getListRulesMethod = FirewallServiceGrpc.getListRulesMethod) == null) {
      synchronized (FirewallServiceGrpc.class) {
        if ((getListRulesMethod = FirewallServiceGrpc.getListRulesMethod) == null) {
          FirewallServiceGrpc.getListRulesMethod = getListRulesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest,
      api.gravity.types.Types.BooleanResponse> getAddRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRule",
      requestType = api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest,
      api.gravity.types.Types.BooleanResponse> getAddRuleMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest, api.gravity.types.Types.BooleanResponse> getAddRuleMethod;
    if ((getAddRuleMethod = FirewallServiceGrpc.getAddRuleMethod) == null) {
      synchronized (FirewallServiceGrpc.class) {
        if ((getAddRuleMethod = FirewallServiceGrpc.getAddRuleMethod) == null) {
          FirewallServiceGrpc.getAddRuleMethod = getAddRuleMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRule",
      requestType = api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveRuleMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest, api.gravity.types.Types.BooleanResponse> getRemoveRuleMethod;
    if ((getRemoveRuleMethod = FirewallServiceGrpc.getRemoveRuleMethod) == null) {
      synchronized (FirewallServiceGrpc.class) {
        if ((getRemoveRuleMethod = FirewallServiceGrpc.getRemoveRuleMethod) == null) {
          FirewallServiceGrpc.getRemoveRuleMethod = getRemoveRuleMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getFlushRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FlushRules",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getFlushRulesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getFlushRulesMethod;
    if ((getFlushRulesMethod = FirewallServiceGrpc.getFlushRulesMethod) == null) {
      synchronized (FirewallServiceGrpc.class) {
        if ((getFlushRulesMethod = FirewallServiceGrpc.getFlushRulesMethod) == null) {
          FirewallServiceGrpc.getFlushRulesMethod = getFlushRulesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FlushRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFlushRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getApplyFirewallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyFirewall",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getApplyFirewallMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getApplyFirewallMethod;
    if ((getApplyFirewallMethod = FirewallServiceGrpc.getApplyFirewallMethod) == null) {
      synchronized (FirewallServiceGrpc.class) {
        if ((getApplyFirewallMethod = FirewallServiceGrpc.getApplyFirewallMethod) == null) {
          FirewallServiceGrpc.getApplyFirewallMethod = getApplyFirewallMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyFirewall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getApplyFirewallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FirewallServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FirewallServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FirewallServiceStub>() {
        @java.lang.Override
        public FirewallServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FirewallServiceStub(channel, callOptions);
        }
      };
    return FirewallServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FirewallServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FirewallServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FirewallServiceBlockingStub>() {
        @java.lang.Override
        public FirewallServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FirewallServiceBlockingStub(channel, callOptions);
        }
      };
    return FirewallServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FirewallServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FirewallServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FirewallServiceFutureStub>() {
        @java.lang.Override
        public FirewallServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FirewallServiceFutureStub(channel, callOptions);
        }
      };
    return FirewallServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Zonas
     * </pre>
     */
    default void listZones(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.FirewallServiceOuterClass.ZonesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListZonesMethod(), responseObserver);
    }

    /**
     */
    default void addZone(api.gravity.v26.FirewallServiceOuterClass.ZoneRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddZoneMethod(), responseObserver);
    }

    /**
     */
    default void removeZone(api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveZoneMethod(), responseObserver);
    }

    /**
     * <pre>
     * Traffic rules (exceptions to the zone policies)
     * </pre>
     */
    default void listRules(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRulesMethod(), responseObserver);
    }

    /**
     */
    default void addRule(api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRuleMethod(), responseObserver);
    }

    /**
     */
    default void removeRule(api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRuleMethod(), responseObserver);
    }

    /**
     */
    default void flushRules(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushRulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Datapath: applies the persisted configuration (zones + rules) to the running firewall in a single transaction.
     * </pre>
     */
    default void applyFirewall(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyFirewallMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FirewallService.
   */
  public static abstract class FirewallServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FirewallServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FirewallService.
   */
  public static final class FirewallServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FirewallServiceStub> {
    private FirewallServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirewallServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FirewallServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Zonas
     * </pre>
     */
    public void listZones(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.FirewallServiceOuterClass.ZonesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListZonesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addZone(api.gravity.v26.FirewallServiceOuterClass.ZoneRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeZone(api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Traffic rules (exceptions to the zone policies)
     * </pre>
     */
    public void listRules(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRule(api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRule(api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flushRules(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlushRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Datapath: applies the persisted configuration (zones + rules) to the running firewall in a single transaction.
     * </pre>
     */
    public void applyFirewall(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyFirewallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FirewallService.
   */
  public static final class FirewallServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FirewallServiceBlockingStub> {
    private FirewallServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirewallServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FirewallServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Zonas
     * </pre>
     */
    public api.gravity.v26.FirewallServiceOuterClass.ZonesResponse listZones(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListZonesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse addZone(api.gravity.v26.FirewallServiceOuterClass.ZoneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddZoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse removeZone(api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Traffic rules (exceptions to the zone policies)
     * </pre>
     */
    public api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse listRules(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse addRule(api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse removeRule(api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse flushRules(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlushRulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Datapath: applies the persisted configuration (zones + rules) to the running firewall in a single transaction.
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse applyFirewall(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyFirewallMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FirewallService.
   */
  public static final class FirewallServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FirewallServiceFutureStub> {
    private FirewallServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirewallServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FirewallServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Zonas
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.FirewallServiceOuterClass.ZonesResponse> listZones(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListZonesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> addZone(
        api.gravity.v26.FirewallServiceOuterClass.ZoneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddZoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> removeZone(
        api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveZoneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Traffic rules (exceptions to the zone policies)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse> listRules(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> addRule(
        api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> removeRule(
        api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> flushRules(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlushRulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Datapath: applies the persisted configuration (zones + rules) to the running firewall in a single transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> applyFirewall(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyFirewallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ZONES = 0;
  private static final int METHODID_ADD_ZONE = 1;
  private static final int METHODID_REMOVE_ZONE = 2;
  private static final int METHODID_LIST_RULES = 3;
  private static final int METHODID_ADD_RULE = 4;
  private static final int METHODID_REMOVE_RULE = 5;
  private static final int METHODID_FLUSH_RULES = 6;
  private static final int METHODID_APPLY_FIREWALL = 7;

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
        case METHODID_LIST_ZONES:
          serviceImpl.listZones((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.FirewallServiceOuterClass.ZonesResponse>) responseObserver);
          break;
        case METHODID_ADD_ZONE:
          serviceImpl.addZone((api.gravity.v26.FirewallServiceOuterClass.ZoneRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ZONE:
          serviceImpl.removeZone((api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_LIST_RULES:
          serviceImpl.listRules((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse>) responseObserver);
          break;
        case METHODID_ADD_RULE:
          serviceImpl.addRule((api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_REMOVE_RULE:
          serviceImpl.removeRule((api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_FLUSH_RULES:
          serviceImpl.flushRules((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_APPLY_FIREWALL:
          serviceImpl.applyFirewall((api.gravity.types.Types.Empty) request,
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
          getListZonesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.FirewallServiceOuterClass.ZonesResponse>(
                service, METHODID_LIST_ZONES)))
        .addMethod(
          getAddZoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.FirewallServiceOuterClass.ZoneRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ADD_ZONE)))
        .addMethod(
          getRemoveZoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.FirewallServiceOuterClass.ZoneNameRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_REMOVE_ZONE)))
        .addMethod(
          getListRulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.FirewallServiceOuterClass.FirewallRulesResponse>(
                service, METHODID_LIST_RULES)))
        .addMethod(
          getAddRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.FirewallServiceOuterClass.FirewallRuleRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ADD_RULE)))
        .addMethod(
          getRemoveRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.FirewallServiceOuterClass.FirewallRuleIdRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_REMOVE_RULE)))
        .addMethod(
          getFlushRulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_FLUSH_RULES)))
        .addMethod(
          getApplyFirewallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_APPLY_FIREWALL)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FirewallServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListZonesMethod())
              .addMethod(getAddZoneMethod())
              .addMethod(getRemoveZoneMethod())
              .addMethod(getListRulesMethod())
              .addMethod(getAddRuleMethod())
              .addMethod(getRemoveRuleMethod())
              .addMethod(getFlushRulesMethod())
              .addMethod(getApplyFirewallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
