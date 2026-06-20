package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: ai_service/v26/ai_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AiServiceGrpc {

  private AiServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.AiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.LoadModelRequest,
      api.gravity.v26.AiServiceOuterClass.LoadModelResponse> getLoadModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadModel",
      requestType = api.gravity.v26.AiServiceOuterClass.LoadModelRequest.class,
      responseType = api.gravity.v26.AiServiceOuterClass.LoadModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.LoadModelRequest,
      api.gravity.v26.AiServiceOuterClass.LoadModelResponse> getLoadModelMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.LoadModelRequest, api.gravity.v26.AiServiceOuterClass.LoadModelResponse> getLoadModelMethod;
    if ((getLoadModelMethod = AiServiceGrpc.getLoadModelMethod) == null) {
      synchronized (AiServiceGrpc.class) {
        if ((getLoadModelMethod = AiServiceGrpc.getLoadModelMethod) == null) {
          AiServiceGrpc.getLoadModelMethod = getLoadModelMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AiServiceOuterClass.LoadModelRequest, api.gravity.v26.AiServiceOuterClass.LoadModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.LoadModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.LoadModelResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLoadModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.UploadModelChunk,
      api.gravity.v26.AiServiceOuterClass.LoadModelResponse> getUploadAndLoadModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadAndLoadModel",
      requestType = api.gravity.v26.AiServiceOuterClass.UploadModelChunk.class,
      responseType = api.gravity.v26.AiServiceOuterClass.LoadModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.UploadModelChunk,
      api.gravity.v26.AiServiceOuterClass.LoadModelResponse> getUploadAndLoadModelMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.UploadModelChunk, api.gravity.v26.AiServiceOuterClass.LoadModelResponse> getUploadAndLoadModelMethod;
    if ((getUploadAndLoadModelMethod = AiServiceGrpc.getUploadAndLoadModelMethod) == null) {
      synchronized (AiServiceGrpc.class) {
        if ((getUploadAndLoadModelMethod = AiServiceGrpc.getUploadAndLoadModelMethod) == null) {
          AiServiceGrpc.getUploadAndLoadModelMethod = getUploadAndLoadModelMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AiServiceOuterClass.UploadModelChunk, api.gravity.v26.AiServiceOuterClass.LoadModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadAndLoadModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.UploadModelChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.LoadModelResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadAndLoadModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.UnloadModelRequest,
      api.gravity.v26.AiServiceOuterClass.UnloadModelResponse> getUnloadModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnloadModel",
      requestType = api.gravity.v26.AiServiceOuterClass.UnloadModelRequest.class,
      responseType = api.gravity.v26.AiServiceOuterClass.UnloadModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.UnloadModelRequest,
      api.gravity.v26.AiServiceOuterClass.UnloadModelResponse> getUnloadModelMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.UnloadModelRequest, api.gravity.v26.AiServiceOuterClass.UnloadModelResponse> getUnloadModelMethod;
    if ((getUnloadModelMethod = AiServiceGrpc.getUnloadModelMethod) == null) {
      synchronized (AiServiceGrpc.class) {
        if ((getUnloadModelMethod = AiServiceGrpc.getUnloadModelMethod) == null) {
          AiServiceGrpc.getUnloadModelMethod = getUnloadModelMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AiServiceOuterClass.UnloadModelRequest, api.gravity.v26.AiServiceOuterClass.UnloadModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnloadModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.UnloadModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.UnloadModelResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUnloadModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.ListModelsRequest,
      api.gravity.v26.AiServiceOuterClass.ListModelsResponse> getListModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModels",
      requestType = api.gravity.v26.AiServiceOuterClass.ListModelsRequest.class,
      responseType = api.gravity.v26.AiServiceOuterClass.ListModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.ListModelsRequest,
      api.gravity.v26.AiServiceOuterClass.ListModelsResponse> getListModelsMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.ListModelsRequest, api.gravity.v26.AiServiceOuterClass.ListModelsResponse> getListModelsMethod;
    if ((getListModelsMethod = AiServiceGrpc.getListModelsMethod) == null) {
      synchronized (AiServiceGrpc.class) {
        if ((getListModelsMethod = AiServiceGrpc.getListModelsMethod) == null) {
          AiServiceGrpc.getListModelsMethod = getListModelsMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AiServiceOuterClass.ListModelsRequest, api.gravity.v26.AiServiceOuterClass.ListModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.ListModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.ListModelsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest,
      api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse> getIsModelLoadedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsModelLoaded",
      requestType = api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest.class,
      responseType = api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest,
      api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse> getIsModelLoadedMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest, api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse> getIsModelLoadedMethod;
    if ((getIsModelLoadedMethod = AiServiceGrpc.getIsModelLoadedMethod) == null) {
      synchronized (AiServiceGrpc.class) {
        if ((getIsModelLoadedMethod = AiServiceGrpc.getIsModelLoadedMethod) == null) {
          AiServiceGrpc.getIsModelLoadedMethod = getIsModelLoadedMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest, api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsModelLoaded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsModelLoadedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.InferRequest,
      api.gravity.v26.AiServiceOuterClass.InferResponse> getInferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Infer",
      requestType = api.gravity.v26.AiServiceOuterClass.InferRequest.class,
      responseType = api.gravity.v26.AiServiceOuterClass.InferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.InferRequest,
      api.gravity.v26.AiServiceOuterClass.InferResponse> getInferMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.InferRequest, api.gravity.v26.AiServiceOuterClass.InferResponse> getInferMethod;
    if ((getInferMethod = AiServiceGrpc.getInferMethod) == null) {
      synchronized (AiServiceGrpc.class) {
        if ((getInferMethod = AiServiceGrpc.getInferMethod) == null) {
          AiServiceGrpc.getInferMethod = getInferMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AiServiceOuterClass.InferRequest, api.gravity.v26.AiServiceOuterClass.InferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Infer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.InferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.InferResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getInferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.InferRequest,
      api.gravity.v26.AiServiceOuterClass.InferResponse> getStreamInferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamInfer",
      requestType = api.gravity.v26.AiServiceOuterClass.InferRequest.class,
      responseType = api.gravity.v26.AiServiceOuterClass.InferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.InferRequest,
      api.gravity.v26.AiServiceOuterClass.InferResponse> getStreamInferMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AiServiceOuterClass.InferRequest, api.gravity.v26.AiServiceOuterClass.InferResponse> getStreamInferMethod;
    if ((getStreamInferMethod = AiServiceGrpc.getStreamInferMethod) == null) {
      synchronized (AiServiceGrpc.class) {
        if ((getStreamInferMethod = AiServiceGrpc.getStreamInferMethod) == null) {
          AiServiceGrpc.getStreamInferMethod = getStreamInferMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AiServiceOuterClass.InferRequest, api.gravity.v26.AiServiceOuterClass.InferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.InferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AiServiceOuterClass.InferResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStreamInferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AiServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AiServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AiServiceStub>() {
        @java.lang.Override
        public AiServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AiServiceStub(channel, callOptions);
        }
      };
    return AiServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AiServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AiServiceBlockingStub>() {
        @java.lang.Override
        public AiServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AiServiceBlockingStub(channel, callOptions);
        }
      };
    return AiServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AiServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AiServiceFutureStub>() {
        @java.lang.Override
        public AiServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AiServiceFutureStub(channel, callOptions);
        }
      };
    return AiServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Load a model that already exists on the device filesystem.
     * </pre>
     */
    default void loadModel(api.gravity.v26.AiServiceOuterClass.LoadModelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.LoadModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload a model file from the client in chunks, then load it.
     * First chunk must contain UploadModelChunk.meta; subsequent chunks contain data.
     * The server streams back a single LoadModelResponse when done.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.UploadModelChunk> uploadAndLoadModel(
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.LoadModelResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadAndLoadModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unload a model
     * </pre>
     */
    default void unloadModel(api.gravity.v26.AiServiceOuterClass.UnloadModelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.UnloadModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnloadModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * List loaded models
     * </pre>
     */
    default void listModels(api.gravity.v26.AiServiceOuterClass.ListModelsRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.ListModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check whether a specific model is currently loaded.
     * Returns loaded=true and the tensor schema if it is, loaded=false otherwise.
     * Cheaper than ListModels when you only need to check one model.
     * </pre>
     */
    default void isModelLoaded(api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsModelLoadedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Run inference
     * </pre>
     */
    default void infer(api.gravity.v26.AiServiceOuterClass.InferRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.InferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream inference (bidi: send frames, receive results)
     * </pre>
     */
    default io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.InferRequest> streamInfer(
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.InferResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamInferMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AiService.
   */
  public static abstract class AiServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AiServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AiService.
   */
  public static final class AiServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AiServiceStub> {
    private AiServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AiServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AiServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Load a model that already exists on the device filesystem.
     * </pre>
     */
    public void loadModel(api.gravity.v26.AiServiceOuterClass.LoadModelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.LoadModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload a model file from the client in chunks, then load it.
     * First chunk must contain UploadModelChunk.meta; subsequent chunks contain data.
     * The server streams back a single LoadModelResponse when done.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.UploadModelChunk> uploadAndLoadModel(
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.LoadModelResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadAndLoadModelMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Unload a model
     * </pre>
     */
    public void unloadModel(api.gravity.v26.AiServiceOuterClass.UnloadModelRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.UnloadModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnloadModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List loaded models
     * </pre>
     */
    public void listModels(api.gravity.v26.AiServiceOuterClass.ListModelsRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.ListModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check whether a specific model is currently loaded.
     * Returns loaded=true and the tensor schema if it is, loaded=false otherwise.
     * Cheaper than ListModels when you only need to check one model.
     * </pre>
     */
    public void isModelLoaded(api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsModelLoadedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run inference
     * </pre>
     */
    public void infer(api.gravity.v26.AiServiceOuterClass.InferRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.InferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream inference (bidi: send frames, receive results)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.InferRequest> streamInfer(
        io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.InferResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamInferMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AiService.
   */
  public static final class AiServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AiServiceBlockingStub> {
    private AiServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AiServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AiServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Load a model that already exists on the device filesystem.
     * </pre>
     */
    public api.gravity.v26.AiServiceOuterClass.LoadModelResponse loadModel(api.gravity.v26.AiServiceOuterClass.LoadModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unload a model
     * </pre>
     */
    public api.gravity.v26.AiServiceOuterClass.UnloadModelResponse unloadModel(api.gravity.v26.AiServiceOuterClass.UnloadModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnloadModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List loaded models
     * </pre>
     */
    public api.gravity.v26.AiServiceOuterClass.ListModelsResponse listModels(api.gravity.v26.AiServiceOuterClass.ListModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check whether a specific model is currently loaded.
     * Returns loaded=true and the tensor schema if it is, loaded=false otherwise.
     * Cheaper than ListModels when you only need to check one model.
     * </pre>
     */
    public api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse isModelLoaded(api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsModelLoadedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run inference
     * </pre>
     */
    public api.gravity.v26.AiServiceOuterClass.InferResponse infer(api.gravity.v26.AiServiceOuterClass.InferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInferMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AiService.
   */
  public static final class AiServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AiServiceFutureStub> {
    private AiServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AiServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AiServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Load a model that already exists on the device filesystem.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AiServiceOuterClass.LoadModelResponse> loadModel(
        api.gravity.v26.AiServiceOuterClass.LoadModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unload a model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AiServiceOuterClass.UnloadModelResponse> unloadModel(
        api.gravity.v26.AiServiceOuterClass.UnloadModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnloadModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List loaded models
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AiServiceOuterClass.ListModelsResponse> listModels(
        api.gravity.v26.AiServiceOuterClass.ListModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check whether a specific model is currently loaded.
     * Returns loaded=true and the tensor schema if it is, loaded=false otherwise.
     * Cheaper than ListModels when you only need to check one model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse> isModelLoaded(
        api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsModelLoadedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Run inference
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AiServiceOuterClass.InferResponse> infer(
        api.gravity.v26.AiServiceOuterClass.InferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOAD_MODEL = 0;
  private static final int METHODID_UNLOAD_MODEL = 1;
  private static final int METHODID_LIST_MODELS = 2;
  private static final int METHODID_IS_MODEL_LOADED = 3;
  private static final int METHODID_INFER = 4;
  private static final int METHODID_UPLOAD_AND_LOAD_MODEL = 5;
  private static final int METHODID_STREAM_INFER = 6;

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
        case METHODID_LOAD_MODEL:
          serviceImpl.loadModel((api.gravity.v26.AiServiceOuterClass.LoadModelRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.LoadModelResponse>) responseObserver);
          break;
        case METHODID_UNLOAD_MODEL:
          serviceImpl.unloadModel((api.gravity.v26.AiServiceOuterClass.UnloadModelRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.UnloadModelResponse>) responseObserver);
          break;
        case METHODID_LIST_MODELS:
          serviceImpl.listModels((api.gravity.v26.AiServiceOuterClass.ListModelsRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.ListModelsResponse>) responseObserver);
          break;
        case METHODID_IS_MODEL_LOADED:
          serviceImpl.isModelLoaded((api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse>) responseObserver);
          break;
        case METHODID_INFER:
          serviceImpl.infer((api.gravity.v26.AiServiceOuterClass.InferRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.InferResponse>) responseObserver);
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
        case METHODID_UPLOAD_AND_LOAD_MODEL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadAndLoadModel(
              (io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.LoadModelResponse>) responseObserver);
        case METHODID_STREAM_INFER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamInfer(
              (io.grpc.stub.StreamObserver<api.gravity.v26.AiServiceOuterClass.InferResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getLoadModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AiServiceOuterClass.LoadModelRequest,
              api.gravity.v26.AiServiceOuterClass.LoadModelResponse>(
                service, METHODID_LOAD_MODEL)))
        .addMethod(
          getUploadAndLoadModelMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              api.gravity.v26.AiServiceOuterClass.UploadModelChunk,
              api.gravity.v26.AiServiceOuterClass.LoadModelResponse>(
                service, METHODID_UPLOAD_AND_LOAD_MODEL)))
        .addMethod(
          getUnloadModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AiServiceOuterClass.UnloadModelRequest,
              api.gravity.v26.AiServiceOuterClass.UnloadModelResponse>(
                service, METHODID_UNLOAD_MODEL)))
        .addMethod(
          getListModelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AiServiceOuterClass.ListModelsRequest,
              api.gravity.v26.AiServiceOuterClass.ListModelsResponse>(
                service, METHODID_LIST_MODELS)))
        .addMethod(
          getIsModelLoadedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AiServiceOuterClass.IsModelLoadedRequest,
              api.gravity.v26.AiServiceOuterClass.IsModelLoadedResponse>(
                service, METHODID_IS_MODEL_LOADED)))
        .addMethod(
          getInferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AiServiceOuterClass.InferRequest,
              api.gravity.v26.AiServiceOuterClass.InferResponse>(
                service, METHODID_INFER)))
        .addMethod(
          getStreamInferMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              api.gravity.v26.AiServiceOuterClass.InferRequest,
              api.gravity.v26.AiServiceOuterClass.InferResponse>(
                service, METHODID_STREAM_INFER)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getLoadModelMethod())
              .addMethod(getUploadAndLoadModelMethod())
              .addMethod(getUnloadModelMethod())
              .addMethod(getListModelsMethod())
              .addMethod(getIsModelLoadedMethod())
              .addMethod(getInferMethod())
              .addMethod(getStreamInferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
