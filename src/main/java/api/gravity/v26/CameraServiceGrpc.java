package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: camera_service/v26/camera_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CameraServiceGrpc {

  private CameraServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.CameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest,
      api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse> getCaptureImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CaptureImage",
      requestType = api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest.class,
      responseType = api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest,
      api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse> getCaptureImageMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest, api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse> getCaptureImageMethod;
    if ((getCaptureImageMethod = CameraServiceGrpc.getCaptureImageMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getCaptureImageMethod = CameraServiceGrpc.getCaptureImageMethod) == null) {
          CameraServiceGrpc.getCaptureImageMethod = getCaptureImageMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest, api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CaptureImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCaptureImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest,
      api.gravity.v26.CameraServiceOuterClass.Frame> getStreamFramesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamFrames",
      requestType = api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest.class,
      responseType = api.gravity.v26.CameraServiceOuterClass.Frame.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest,
      api.gravity.v26.CameraServiceOuterClass.Frame> getStreamFramesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest, api.gravity.v26.CameraServiceOuterClass.Frame> getStreamFramesMethod;
    if ((getStreamFramesMethod = CameraServiceGrpc.getStreamFramesMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getStreamFramesMethod = CameraServiceGrpc.getStreamFramesMethod) == null) {
          CameraServiceGrpc.getStreamFramesMethod = getStreamFramesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest, api.gravity.v26.CameraServiceOuterClass.Frame>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamFrames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.Frame.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStreamFramesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.LockRequest,
      api.gravity.v26.CameraServiceOuterClass.LockResponse> getLockCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockCamera",
      requestType = api.gravity.v26.CameraServiceOuterClass.LockRequest.class,
      responseType = api.gravity.v26.CameraServiceOuterClass.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.LockRequest,
      api.gravity.v26.CameraServiceOuterClass.LockResponse> getLockCameraMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.LockRequest, api.gravity.v26.CameraServiceOuterClass.LockResponse> getLockCameraMethod;
    if ((getLockCameraMethod = CameraServiceGrpc.getLockCameraMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getLockCameraMethod = CameraServiceGrpc.getLockCameraMethod) == null) {
          CameraServiceGrpc.getLockCameraMethod = getLockCameraMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CameraServiceOuterClass.LockRequest, api.gravity.v26.CameraServiceOuterClass.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.LockResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLockCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.UnlockRequest,
      api.gravity.v26.CameraServiceOuterClass.UnlockResponse> getUnlockCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlockCamera",
      requestType = api.gravity.v26.CameraServiceOuterClass.UnlockRequest.class,
      responseType = api.gravity.v26.CameraServiceOuterClass.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.UnlockRequest,
      api.gravity.v26.CameraServiceOuterClass.UnlockResponse> getUnlockCameraMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.UnlockRequest, api.gravity.v26.CameraServiceOuterClass.UnlockResponse> getUnlockCameraMethod;
    if ((getUnlockCameraMethod = CameraServiceGrpc.getUnlockCameraMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getUnlockCameraMethod = CameraServiceGrpc.getUnlockCameraMethod) == null) {
          CameraServiceGrpc.getUnlockCameraMethod = getUnlockCameraMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CameraServiceOuterClass.UnlockRequest, api.gravity.v26.CameraServiceOuterClass.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlockCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.UnlockResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUnlockCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest,
      api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse> getGetDeviceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeviceInfo",
      requestType = api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest.class,
      responseType = api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest,
      api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse> getGetDeviceInfoMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest, api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse> getGetDeviceInfoMethod;
    if ((getGetDeviceInfoMethod = CameraServiceGrpc.getGetDeviceInfoMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetDeviceInfoMethod = CameraServiceGrpc.getGetDeviceInfoMethod) == null) {
          CameraServiceGrpc.getGetDeviceInfoMethod = getGetDeviceInfoMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest, api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeviceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDeviceInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest,
      api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse> getListDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDevices",
      requestType = api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest.class,
      responseType = api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest,
      api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse> getListDevicesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest, api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse> getListDevicesMethod;
    if ((getListDevicesMethod = CameraServiceGrpc.getListDevicesMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getListDevicesMethod = CameraServiceGrpc.getListDevicesMethod) == null) {
          CameraServiceGrpc.getListDevicesMethod = getListDevicesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest, api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListDevicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceStub>() {
        @java.lang.Override
        public CameraServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceStub(channel, callOptions);
        }
      };
    return CameraServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceBlockingStub>() {
        @java.lang.Override
        public CameraServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceBlockingStub(channel, callOptions);
        }
      };
    return CameraServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceFutureStub>() {
        @java.lang.Override
        public CameraServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceFutureStub(channel, callOptions);
        }
      };
    return CameraServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Capture a single image
     * </pre>
     */
    default void captureImage(api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCaptureImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Continuous stream (FPS camera)
     * </pre>
     */
    default void streamFrames(api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.Frame> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamFramesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lock the camera (prevents concurrent access)
     * </pre>
     */
    default void lockCamera(api.gravity.v26.CameraServiceOuterClass.LockRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.LockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * Release the camera
     * </pre>
     */
    default void unlockCamera(api.gravity.v26.CameraServiceOuterClass.UnlockRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.UnlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * Device information
     * </pre>
     */
    default void getDeviceInfo(api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all V4L2 devices available on the system
     * </pre>
     */
    default void listDevices(api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDevicesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CameraService.
   */
  public static abstract class CameraServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CameraServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CameraService.
   */
  public static final class CameraServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CameraServiceStub> {
    private CameraServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capture a single image
     * </pre>
     */
    public void captureImage(api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCaptureImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Continuous stream (FPS camera)
     * </pre>
     */
    public void streamFrames(api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.Frame> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamFramesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lock the camera (prevents concurrent access)
     * </pre>
     */
    public void lockCamera(api.gravity.v26.CameraServiceOuterClass.LockRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.LockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Release the camera
     * </pre>
     */
    public void unlockCamera(api.gravity.v26.CameraServiceOuterClass.UnlockRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.UnlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Device information
     * </pre>
     */
    public void getDeviceInfo(api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all V4L2 devices available on the system
     * </pre>
     */
    public void listDevices(api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CameraService.
   */
  public static final class CameraServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CameraServiceBlockingStub> {
    private CameraServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capture a single image
     * </pre>
     */
    public api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse captureImage(api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCaptureImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Continuous stream (FPS camera)
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.CameraServiceOuterClass.Frame> streamFrames(
        api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamFramesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lock the camera (prevents concurrent access)
     * </pre>
     */
    public api.gravity.v26.CameraServiceOuterClass.LockResponse lockCamera(api.gravity.v26.CameraServiceOuterClass.LockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockCameraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Release the camera
     * </pre>
     */
    public api.gravity.v26.CameraServiceOuterClass.UnlockResponse unlockCamera(api.gravity.v26.CameraServiceOuterClass.UnlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockCameraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Device information
     * </pre>
     */
    public api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse getDeviceInfo(api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all V4L2 devices available on the system
     * </pre>
     */
    public api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse listDevices(api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDevicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CameraService.
   */
  public static final class CameraServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CameraServiceFutureStub> {
    private CameraServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capture a single image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse> captureImage(
        api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCaptureImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lock the camera (prevents concurrent access)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.CameraServiceOuterClass.LockResponse> lockCamera(
        api.gravity.v26.CameraServiceOuterClass.LockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockCameraMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Release the camera
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.CameraServiceOuterClass.UnlockResponse> unlockCamera(
        api.gravity.v26.CameraServiceOuterClass.UnlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockCameraMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Device information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse> getDeviceInfo(
        api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all V4L2 devices available on the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse> listDevices(
        api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CAPTURE_IMAGE = 0;
  private static final int METHODID_STREAM_FRAMES = 1;
  private static final int METHODID_LOCK_CAMERA = 2;
  private static final int METHODID_UNLOCK_CAMERA = 3;
  private static final int METHODID_GET_DEVICE_INFO = 4;
  private static final int METHODID_LIST_DEVICES = 5;

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
        case METHODID_CAPTURE_IMAGE:
          serviceImpl.captureImage((api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse>) responseObserver);
          break;
        case METHODID_STREAM_FRAMES:
          serviceImpl.streamFrames((api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.Frame>) responseObserver);
          break;
        case METHODID_LOCK_CAMERA:
          serviceImpl.lockCamera((api.gravity.v26.CameraServiceOuterClass.LockRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.LockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK_CAMERA:
          serviceImpl.unlockCamera((api.gravity.v26.CameraServiceOuterClass.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.UnlockResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICE_INFO:
          serviceImpl.getDeviceInfo((api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse>) responseObserver);
          break;
        case METHODID_LIST_DEVICES:
          serviceImpl.listDevices((api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse>) responseObserver);
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
          getCaptureImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CameraServiceOuterClass.CaptureImageRequest,
              api.gravity.v26.CameraServiceOuterClass.CaptureImageResponse>(
                service, METHODID_CAPTURE_IMAGE)))
        .addMethod(
          getStreamFramesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.CameraServiceOuterClass.StreamFramesRequest,
              api.gravity.v26.CameraServiceOuterClass.Frame>(
                service, METHODID_STREAM_FRAMES)))
        .addMethod(
          getLockCameraMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CameraServiceOuterClass.LockRequest,
              api.gravity.v26.CameraServiceOuterClass.LockResponse>(
                service, METHODID_LOCK_CAMERA)))
        .addMethod(
          getUnlockCameraMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CameraServiceOuterClass.UnlockRequest,
              api.gravity.v26.CameraServiceOuterClass.UnlockResponse>(
                service, METHODID_UNLOCK_CAMERA)))
        .addMethod(
          getGetDeviceInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CameraServiceOuterClass.DeviceInfoRequest,
              api.gravity.v26.CameraServiceOuterClass.DeviceInfoResponse>(
                service, METHODID_GET_DEVICE_INFO)))
        .addMethod(
          getListDevicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.CameraServiceOuterClass.ListDevicesRequest,
              api.gravity.v26.CameraServiceOuterClass.ListDevicesResponse>(
                service, METHODID_LIST_DEVICES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCaptureImageMethod())
              .addMethod(getStreamFramesMethod())
              .addMethod(getLockCameraMethod())
              .addMethod(getUnlockCameraMethod())
              .addMethod(getGetDeviceInfoMethod())
              .addMethod(getListDevicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
