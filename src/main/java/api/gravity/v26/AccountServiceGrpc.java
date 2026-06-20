package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: account_service/v26/account_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AccountServiceOuterClass.AddAccountRequest,
      api.gravity.v26.AccountServiceOuterClass.AddAccountResponse> getAddAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAccount",
      requestType = api.gravity.v26.AccountServiceOuterClass.AddAccountRequest.class,
      responseType = api.gravity.v26.AccountServiceOuterClass.AddAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AccountServiceOuterClass.AddAccountRequest,
      api.gravity.v26.AccountServiceOuterClass.AddAccountResponse> getAddAccountMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AccountServiceOuterClass.AddAccountRequest, api.gravity.v26.AccountServiceOuterClass.AddAccountResponse> getAddAccountMethod;
    if ((getAddAccountMethod = AccountServiceGrpc.getAddAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAddAccountMethod = AccountServiceGrpc.getAddAccountMethod) == null) {
          AccountServiceGrpc.getAddAccountMethod = getAddAccountMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AccountServiceOuterClass.AddAccountRequest, api.gravity.v26.AccountServiceOuterClass.AddAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AccountServiceOuterClass.AddAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AccountServiceOuterClass.AddAccountResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse> getGetAccountStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountStatus",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse> getGetAccountStatusMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse> getGetAccountStatusMethod;
    if ((getGetAccountStatusMethod = AccountServiceGrpc.getGetAccountStatusMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetAccountStatusMethod = AccountServiceGrpc.getGetAccountStatusMethod) == null) {
          AccountServiceGrpc.getGetAccountStatusMethod = getGetAccountStatusMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAccountStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest,
      api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse> getRemoveAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveAccount",
      requestType = api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest.class,
      responseType = api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest,
      api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse> getRemoveAccountMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest, api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse> getRemoveAccountMethod;
    if ((getRemoveAccountMethod = AccountServiceGrpc.getRemoveAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getRemoveAccountMethod = AccountServiceGrpc.getRemoveAccountMethod) == null) {
          AccountServiceGrpc.getRemoveAccountMethod = getRemoveAccountMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest, api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Account management
     * </pre>
     */
    default void addAccount(api.gravity.v26.AccountServiceOuterClass.AddAccountRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.AddAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAccountMethod(), responseObserver);
    }

    /**
     */
    default void getAccountStatus(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountStatusMethod(), responseObserver);
    }

    /**
     */
    default void removeAccount(api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveAccountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AccountService.
   */
  public static abstract class AccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Account management
     * </pre>
     */
    public void addAccount(api.gravity.v26.AccountServiceOuterClass.AddAccountRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.AddAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountStatus(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeAccount(api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Account management
     * </pre>
     */
    public api.gravity.v26.AccountServiceOuterClass.AddAccountResponse addAccount(api.gravity.v26.AccountServiceOuterClass.AddAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse getAccountStatus(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse removeAccount(api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AccountService.
   */
  public static final class AccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Account management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AccountServiceOuterClass.AddAccountResponse> addAccount(
        api.gravity.v26.AccountServiceOuterClass.AddAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse> getAccountStatus(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse> removeAccount(
        api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ACCOUNT = 0;
  private static final int METHODID_GET_ACCOUNT_STATUS = 1;
  private static final int METHODID_REMOVE_ACCOUNT = 2;

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
        case METHODID_ADD_ACCOUNT:
          serviceImpl.addAccount((api.gravity.v26.AccountServiceOuterClass.AddAccountRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.AddAccountResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_STATUS:
          serviceImpl.getAccountStatus((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ACCOUNT:
          serviceImpl.removeAccount((api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse>) responseObserver);
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
          getAddAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AccountServiceOuterClass.AddAccountRequest,
              api.gravity.v26.AccountServiceOuterClass.AddAccountResponse>(
                service, METHODID_ADD_ACCOUNT)))
        .addMethod(
          getGetAccountStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.AccountServiceOuterClass.AccountStatusResponse>(
                service, METHODID_GET_ACCOUNT_STATUS)))
        .addMethod(
          getRemoveAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.AccountServiceOuterClass.RemoveAccountRequest,
              api.gravity.v26.AccountServiceOuterClass.RemoveAccountResponse>(
                service, METHODID_REMOVE_ACCOUNT)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getAddAccountMethod())
              .addMethod(getGetAccountStatusMethod())
              .addMethod(getRemoveAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
