package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: time_service/v26/time_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TimeServiceGrpc {

  private TimeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.TimeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse> getGetNTPConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNTPConfig",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse> getGetNTPConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse> getGetNTPConfigMethod;
    if ((getGetNTPConfigMethod = TimeServiceGrpc.getGetNTPConfigMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getGetNTPConfigMethod = TimeServiceGrpc.getGetNTPConfigMethod) == null) {
          TimeServiceGrpc.getGetNTPConfigMethod = getGetNTPConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNTPConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetNTPConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest,
      api.gravity.types.Types.BooleanResponse> getSetNTPConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetNTPConfig",
      requestType = api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest,
      api.gravity.types.Types.BooleanResponse> getSetNTPConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest, api.gravity.types.Types.BooleanResponse> getSetNTPConfigMethod;
    if ((getSetNTPConfigMethod = TimeServiceGrpc.getSetNTPConfigMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getSetNTPConfigMethod = TimeServiceGrpc.getSetNTPConfigMethod) == null) {
          TimeServiceGrpc.getSetNTPConfigMethod = getSetNTPConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetNTPConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetNTPConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsNTPSyncEnabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsNTPSyncEnabled",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsNTPSyncEnabledMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getIsNTPSyncEnabledMethod;
    if ((getIsNTPSyncEnabledMethod = TimeServiceGrpc.getIsNTPSyncEnabledMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getIsNTPSyncEnabledMethod = TimeServiceGrpc.getIsNTPSyncEnabledMethod) == null) {
          TimeServiceGrpc.getIsNTPSyncEnabledMethod = getIsNTPSyncEnabledMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsNTPSyncEnabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsNTPSyncEnabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableNTPSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableNTPSync",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableNTPSyncMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getEnableNTPSyncMethod;
    if ((getEnableNTPSyncMethod = TimeServiceGrpc.getEnableNTPSyncMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getEnableNTPSyncMethod = TimeServiceGrpc.getEnableNTPSyncMethod) == null) {
          TimeServiceGrpc.getEnableNTPSyncMethod = getEnableNTPSyncMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableNTPSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableNTPSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableNTPSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableNTPSync",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableNTPSyncMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getDisableNTPSyncMethod;
    if ((getDisableNTPSyncMethod = TimeServiceGrpc.getDisableNTPSyncMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getDisableNTPSyncMethod = TimeServiceGrpc.getDisableNTPSyncMethod) == null) {
          TimeServiceGrpc.getDisableNTPSyncMethod = getDisableNTPSyncMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableNTPSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableNTPSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> getGetTimeSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTimeSeconds",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.TimeServiceOuterClass.GetTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> getGetTimeSecondsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> getGetTimeSecondsMethod;
    if ((getGetTimeSecondsMethod = TimeServiceGrpc.getGetTimeSecondsMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getGetTimeSecondsMethod = TimeServiceGrpc.getGetTimeSecondsMethod) == null) {
          TimeServiceGrpc.getGetTimeSecondsMethod = getGetTimeSecondsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.TimeServiceOuterClass.GetTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTimeSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.TimeServiceOuterClass.GetTimeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTimeSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.SetTimeRequest,
      api.gravity.types.Types.BooleanResponse> getSetTimeSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTimeSeconds",
      requestType = api.gravity.v26.TimeServiceOuterClass.SetTimeRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.SetTimeRequest,
      api.gravity.types.Types.BooleanResponse> getSetTimeSecondsMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.SetTimeRequest, api.gravity.types.Types.BooleanResponse> getSetTimeSecondsMethod;
    if ((getSetTimeSecondsMethod = TimeServiceGrpc.getSetTimeSecondsMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getSetTimeSecondsMethod = TimeServiceGrpc.getSetTimeSecondsMethod) == null) {
          TimeServiceGrpc.getSetTimeSecondsMethod = getSetTimeSecondsMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.TimeServiceOuterClass.SetTimeRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTimeSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.TimeServiceOuterClass.SetTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetTimeSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> getGetTimeMillisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTimeMillis",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.TimeServiceOuterClass.GetTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> getGetTimeMillisMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> getGetTimeMillisMethod;
    if ((getGetTimeMillisMethod = TimeServiceGrpc.getGetTimeMillisMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getGetTimeMillisMethod = TimeServiceGrpc.getGetTimeMillisMethod) == null) {
          TimeServiceGrpc.getGetTimeMillisMethod = getGetTimeMillisMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.TimeServiceOuterClass.GetTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTimeMillis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.TimeServiceOuterClass.GetTimeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTimeMillisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.SetTimeRequest,
      api.gravity.types.Types.BooleanResponse> getSetTimeMillisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTimeMillis",
      requestType = api.gravity.v26.TimeServiceOuterClass.SetTimeRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.SetTimeRequest,
      api.gravity.types.Types.BooleanResponse> getSetTimeMillisMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.TimeServiceOuterClass.SetTimeRequest, api.gravity.types.Types.BooleanResponse> getSetTimeMillisMethod;
    if ((getSetTimeMillisMethod = TimeServiceGrpc.getSetTimeMillisMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getSetTimeMillisMethod = TimeServiceGrpc.getSetTimeMillisMethod) == null) {
          TimeServiceGrpc.getSetTimeMillisMethod = getSetTimeMillisMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.TimeServiceOuterClass.SetTimeRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTimeMillis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.TimeServiceOuterClass.SetTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetTimeMillisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.TimeServiceOuterClass.UptimeResponse> getGetUptimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUptime",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.TimeServiceOuterClass.UptimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.TimeServiceOuterClass.UptimeResponse> getGetUptimeMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.TimeServiceOuterClass.UptimeResponse> getGetUptimeMethod;
    if ((getGetUptimeMethod = TimeServiceGrpc.getGetUptimeMethod) == null) {
      synchronized (TimeServiceGrpc.class) {
        if ((getGetUptimeMethod = TimeServiceGrpc.getGetUptimeMethod) == null) {
          TimeServiceGrpc.getGetUptimeMethod = getGetUptimeMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.TimeServiceOuterClass.UptimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUptime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.TimeServiceOuterClass.UptimeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetUptimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeServiceStub>() {
        @java.lang.Override
        public TimeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeServiceStub(channel, callOptions);
        }
      };
    return TimeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeServiceBlockingStub>() {
        @java.lang.Override
        public TimeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeServiceBlockingStub(channel, callOptions);
        }
      };
    return TimeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TimeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeServiceFutureStub>() {
        @java.lang.Override
        public TimeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeServiceFutureStub(channel, callOptions);
        }
      };
    return TimeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * NTP config — atomic, applies all settings in one reload
     * </pre>
     */
    default void getNTPConfig(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNTPConfigMethod(), responseObserver);
    }

    /**
     */
    default void setNTPConfig(api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetNTPConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * NTP Sync — convenience wrappers (internally call SetNTPConfig)
     * </pre>
     */
    default void isNTPSyncEnabled(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsNTPSyncEnabledMethod(), responseObserver);
    }

    /**
     */
    default void enableNTPSync(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableNTPSyncMethod(), responseObserver);
    }

    /**
     */
    default void disableNTPSync(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableNTPSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Time
     * </pre>
     */
    default void getTimeSeconds(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTimeSecondsMethod(), responseObserver);
    }

    /**
     */
    default void setTimeSeconds(api.gravity.v26.TimeServiceOuterClass.SetTimeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTimeSecondsMethod(), responseObserver);
    }

    /**
     */
    default void getTimeMillis(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTimeMillisMethod(), responseObserver);
    }

    /**
     */
    default void setTimeMillis(api.gravity.v26.TimeServiceOuterClass.SetTimeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTimeMillisMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uptime
     * </pre>
     */
    default void getUptime(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.UptimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUptimeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TimeService.
   */
  public static abstract class TimeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TimeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TimeService.
   */
  public static final class TimeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TimeServiceStub> {
    private TimeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * NTP config — atomic, applies all settings in one reload
     * </pre>
     */
    public void getNTPConfig(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNTPConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setNTPConfig(api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetNTPConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NTP Sync — convenience wrappers (internally call SetNTPConfig)
     * </pre>
     */
    public void isNTPSyncEnabled(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsNTPSyncEnabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableNTPSync(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableNTPSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableNTPSync(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableNTPSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Time
     * </pre>
     */
    public void getTimeSeconds(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTimeSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTimeSeconds(api.gravity.v26.TimeServiceOuterClass.SetTimeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTimeSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTimeMillis(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTimeMillisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTimeMillis(api.gravity.v26.TimeServiceOuterClass.SetTimeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTimeMillisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uptime
     * </pre>
     */
    public void getUptime(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.UptimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUptimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TimeService.
   */
  public static final class TimeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TimeServiceBlockingStub> {
    private TimeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * NTP config — atomic, applies all settings in one reload
     * </pre>
     */
    public api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse getNTPConfig(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNTPConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setNTPConfig(api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetNTPConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NTP Sync — convenience wrappers (internally call SetNTPConfig)
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse isNTPSyncEnabled(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsNTPSyncEnabledMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse enableNTPSync(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableNTPSyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disableNTPSync(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableNTPSyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Time
     * </pre>
     */
    public api.gravity.v26.TimeServiceOuterClass.GetTimeResponse getTimeSeconds(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTimeSecondsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setTimeSeconds(api.gravity.v26.TimeServiceOuterClass.SetTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTimeSecondsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.TimeServiceOuterClass.GetTimeResponse getTimeMillis(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTimeMillisMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setTimeMillis(api.gravity.v26.TimeServiceOuterClass.SetTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTimeMillisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uptime
     * </pre>
     */
    public api.gravity.v26.TimeServiceOuterClass.UptimeResponse getUptime(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUptimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TimeService.
   */
  public static final class TimeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TimeServiceFutureStub> {
    private TimeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * NTP config — atomic, applies all settings in one reload
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse> getNTPConfig(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNTPConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setNTPConfig(
        api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetNTPConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NTP Sync — convenience wrappers (internally call SetNTPConfig)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> isNTPSyncEnabled(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsNTPSyncEnabledMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> enableNTPSync(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableNTPSyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disableNTPSync(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableNTPSyncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> getTimeSeconds(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTimeSecondsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setTimeSeconds(
        api.gravity.v26.TimeServiceOuterClass.SetTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTimeSecondsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.TimeServiceOuterClass.GetTimeResponse> getTimeMillis(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTimeMillisMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setTimeMillis(
        api.gravity.v26.TimeServiceOuterClass.SetTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTimeMillisMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Uptime
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.TimeServiceOuterClass.UptimeResponse> getUptime(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUptimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NTPCONFIG = 0;
  private static final int METHODID_SET_NTPCONFIG = 1;
  private static final int METHODID_IS_NTPSYNC_ENABLED = 2;
  private static final int METHODID_ENABLE_NTPSYNC = 3;
  private static final int METHODID_DISABLE_NTPSYNC = 4;
  private static final int METHODID_GET_TIME_SECONDS = 5;
  private static final int METHODID_SET_TIME_SECONDS = 6;
  private static final int METHODID_GET_TIME_MILLIS = 7;
  private static final int METHODID_SET_TIME_MILLIS = 8;
  private static final int METHODID_GET_UPTIME = 9;

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
        case METHODID_GET_NTPCONFIG:
          serviceImpl.getNTPConfig((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse>) responseObserver);
          break;
        case METHODID_SET_NTPCONFIG:
          serviceImpl.setNTPConfig((api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_IS_NTPSYNC_ENABLED:
          serviceImpl.isNTPSyncEnabled((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_ENABLE_NTPSYNC:
          serviceImpl.enableNTPSync((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISABLE_NTPSYNC:
          serviceImpl.disableNTPSync((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_TIME_SECONDS:
          serviceImpl.getTimeSeconds((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.GetTimeResponse>) responseObserver);
          break;
        case METHODID_SET_TIME_SECONDS:
          serviceImpl.setTimeSeconds((api.gravity.v26.TimeServiceOuterClass.SetTimeRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_TIME_MILLIS:
          serviceImpl.getTimeMillis((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.GetTimeResponse>) responseObserver);
          break;
        case METHODID_SET_TIME_MILLIS:
          serviceImpl.setTimeMillis((api.gravity.v26.TimeServiceOuterClass.SetTimeRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_UPTIME:
          serviceImpl.getUptime((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.TimeServiceOuterClass.UptimeResponse>) responseObserver);
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
          getGetNTPConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.TimeServiceOuterClass.NTPConfigResponse>(
                service, METHODID_GET_NTPCONFIG)))
        .addMethod(
          getSetNTPConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.TimeServiceOuterClass.NTPConfigRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_NTPCONFIG)))
        .addMethod(
          getIsNTPSyncEnabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_IS_NTPSYNC_ENABLED)))
        .addMethod(
          getEnableNTPSyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ENABLE_NTPSYNC)))
        .addMethod(
          getDisableNTPSyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISABLE_NTPSYNC)))
        .addMethod(
          getGetTimeSecondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.TimeServiceOuterClass.GetTimeResponse>(
                service, METHODID_GET_TIME_SECONDS)))
        .addMethod(
          getSetTimeSecondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.TimeServiceOuterClass.SetTimeRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_TIME_SECONDS)))
        .addMethod(
          getGetTimeMillisMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.TimeServiceOuterClass.GetTimeResponse>(
                service, METHODID_GET_TIME_MILLIS)))
        .addMethod(
          getSetTimeMillisMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.TimeServiceOuterClass.SetTimeRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_TIME_MILLIS)))
        .addMethod(
          getGetUptimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.TimeServiceOuterClass.UptimeResponse>(
                service, METHODID_GET_UPTIME)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TimeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetNTPConfigMethod())
              .addMethod(getSetNTPConfigMethod())
              .addMethod(getIsNTPSyncEnabledMethod())
              .addMethod(getEnableNTPSyncMethod())
              .addMethod(getDisableNTPSyncMethod())
              .addMethod(getGetTimeSecondsMethod())
              .addMethod(getSetTimeSecondsMethod())
              .addMethod(getGetTimeMillisMethod())
              .addMethod(getSetTimeMillisMethod())
              .addMethod(getGetUptimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
