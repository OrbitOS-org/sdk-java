package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: wifi_service/v26/wifi_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WiFiServiceGrpc {

  private WiFiServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.WiFiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.WifiService.WiFiInterfacesResponse> getListWiFiInterfacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWiFiInterfaces",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.WifiService.WiFiInterfacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.WifiService.WiFiInterfacesResponse> getListWiFiInterfacesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.WifiService.WiFiInterfacesResponse> getListWiFiInterfacesMethod;
    if ((getListWiFiInterfacesMethod = WiFiServiceGrpc.getListWiFiInterfacesMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getListWiFiInterfacesMethod = WiFiServiceGrpc.getListWiFiInterfacesMethod) == null) {
          WiFiServiceGrpc.getListWiFiInterfacesMethod = getListWiFiInterfacesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.WifiService.WiFiInterfacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWiFiInterfaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfacesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListWiFiInterfacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.WiFiLinkPropertiesResponse> getGetWiFiLinkPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWiFiLinkProperties",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.v26.WifiService.WiFiLinkPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.WiFiLinkPropertiesResponse> getGetWiFiLinkPropertiesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.WiFiLinkPropertiesResponse> getGetWiFiLinkPropertiesMethod;
    if ((getGetWiFiLinkPropertiesMethod = WiFiServiceGrpc.getGetWiFiLinkPropertiesMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getGetWiFiLinkPropertiesMethod = WiFiServiceGrpc.getGetWiFiLinkPropertiesMethod) == null) {
          WiFiServiceGrpc.getGetWiFiLinkPropertiesMethod = getGetWiFiLinkPropertiesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.WiFiLinkPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWiFiLinkProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiLinkPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetWiFiLinkPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getIsWiFiConnectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsWiFiConnected",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getIsWiFiConnectedMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse> getIsWiFiConnectedMethod;
    if ((getIsWiFiConnectedMethod = WiFiServiceGrpc.getIsWiFiConnectedMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getIsWiFiConnectedMethod = WiFiServiceGrpc.getIsWiFiConnectedMethod) == null) {
          WiFiServiceGrpc.getIsWiFiConnectedMethod = getIsWiFiConnectedMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsWiFiConnected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsWiFiConnectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.WiFiModeResponse> getGetWiFiModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWiFiMode",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.v26.WifiService.WiFiModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.WiFiModeResponse> getGetWiFiModeMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.WiFiModeResponse> getGetWiFiModeMethod;
    if ((getGetWiFiModeMethod = WiFiServiceGrpc.getGetWiFiModeMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getGetWiFiModeMethod = WiFiServiceGrpc.getGetWiFiModeMethod) == null) {
          WiFiServiceGrpc.getGetWiFiModeMethod = getGetWiFiModeMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.WiFiModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWiFiMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiModeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetWiFiModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.SetWiFiModeRequest,
      api.gravity.types.Types.BooleanResponse> getSetWiFiModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWiFiMode",
      requestType = api.gravity.v26.WifiService.SetWiFiModeRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.SetWiFiModeRequest,
      api.gravity.types.Types.BooleanResponse> getSetWiFiModeMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.SetWiFiModeRequest, api.gravity.types.Types.BooleanResponse> getSetWiFiModeMethod;
    if ((getSetWiFiModeMethod = WiFiServiceGrpc.getSetWiFiModeMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getSetWiFiModeMethod = WiFiServiceGrpc.getSetWiFiModeMethod) == null) {
          WiFiServiceGrpc.getSetWiFiModeMethod = getSetWiFiModeMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.SetWiFiModeRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWiFiMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.SetWiFiModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetWiFiModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.APConfig,
      api.gravity.types.Types.BooleanResponse> getSetAPConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAPConfig",
      requestType = api.gravity.v26.WifiService.APConfig.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.APConfig,
      api.gravity.types.Types.BooleanResponse> getSetAPConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.APConfig, api.gravity.types.Types.BooleanResponse> getSetAPConfigMethod;
    if ((getSetAPConfigMethod = WiFiServiceGrpc.getSetAPConfigMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getSetAPConfigMethod = WiFiServiceGrpc.getSetAPConfigMethod) == null) {
          WiFiServiceGrpc.getSetAPConfigMethod = getSetAPConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.APConfig, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAPConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.APConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetAPConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.APPropertiesResponse> getGetAPPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAPProperties",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.v26.WifiService.APPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.APPropertiesResponse> getGetAPPropertiesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.APPropertiesResponse> getGetAPPropertiesMethod;
    if ((getGetAPPropertiesMethod = WiFiServiceGrpc.getGetAPPropertiesMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getGetAPPropertiesMethod = WiFiServiceGrpc.getGetAPPropertiesMethod) == null) {
          WiFiServiceGrpc.getGetAPPropertiesMethod = getGetAPPropertiesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.APPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAPProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.APPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAPPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getStartAPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartAP",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getStartAPMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse> getStartAPMethod;
    if ((getStartAPMethod = WiFiServiceGrpc.getStartAPMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getStartAPMethod = WiFiServiceGrpc.getStartAPMethod) == null) {
          WiFiServiceGrpc.getStartAPMethod = getStartAPMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartAP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartAPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getStopAPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopAP",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getStopAPMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse> getStopAPMethod;
    if ((getStopAPMethod = WiFiServiceGrpc.getStopAPMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getStopAPMethod = WiFiServiceGrpc.getStopAPMethod) == null) {
          WiFiServiceGrpc.getStopAPMethod = getStopAPMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopAP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopAPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.ClientConfig,
      api.gravity.types.Types.BooleanResponse> getSetClientConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetClientConfig",
      requestType = api.gravity.v26.WifiService.ClientConfig.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.ClientConfig,
      api.gravity.types.Types.BooleanResponse> getSetClientConfigMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.ClientConfig, api.gravity.types.Types.BooleanResponse> getSetClientConfigMethod;
    if ((getSetClientConfigMethod = WiFiServiceGrpc.getSetClientConfigMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getSetClientConfigMethod = WiFiServiceGrpc.getSetClientConfigMethod) == null) {
          WiFiServiceGrpc.getSetClientConfigMethod = getSetClientConfigMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.ClientConfig, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetClientConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.ClientConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetClientConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.ClientPropertiesResponse> getGetClientPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientProperties",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.v26.WifiService.ClientPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.ClientPropertiesResponse> getGetClientPropertiesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.ClientPropertiesResponse> getGetClientPropertiesMethod;
    if ((getGetClientPropertiesMethod = WiFiServiceGrpc.getGetClientPropertiesMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getGetClientPropertiesMethod = WiFiServiceGrpc.getGetClientPropertiesMethod) == null) {
          WiFiServiceGrpc.getGetClientPropertiesMethod = getGetClientPropertiesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.ClientPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClientProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.ClientPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetClientPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getConnectMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse> getConnectMethod;
    if ((getConnectMethod = WiFiServiceGrpc.getConnectMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getConnectMethod = WiFiServiceGrpc.getConnectMethod) == null) {
          WiFiServiceGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disconnect",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.types.Types.BooleanResponse> getDisconnectMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse> getDisconnectMethod;
    if ((getDisconnectMethod = WiFiServiceGrpc.getDisconnectMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getDisconnectMethod = WiFiServiceGrpc.getDisconnectMethod) == null) {
          WiFiServiceGrpc.getDisconnectMethod = getDisconnectMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.ScanWiFiRequest,
      api.gravity.v26.WifiService.ScanWiFiResponse> getScanWiFiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanWiFi",
      requestType = api.gravity.v26.WifiService.ScanWiFiRequest.class,
      responseType = api.gravity.v26.WifiService.ScanWiFiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.ScanWiFiRequest,
      api.gravity.v26.WifiService.ScanWiFiResponse> getScanWiFiMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.ScanWiFiRequest, api.gravity.v26.WifiService.ScanWiFiResponse> getScanWiFiMethod;
    if ((getScanWiFiMethod = WiFiServiceGrpc.getScanWiFiMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getScanWiFiMethod = WiFiServiceGrpc.getScanWiFiMethod) == null) {
          WiFiServiceGrpc.getScanWiFiMethod = getScanWiFiMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.ScanWiFiRequest, api.gravity.v26.WifiService.ScanWiFiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanWiFi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.ScanWiFiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.ScanWiFiResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getScanWiFiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.WiFiLinkProperties> getSubscribeWiFiEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeWiFiEvents",
      requestType = api.gravity.v26.WifiService.WiFiInterfaceRequest.class,
      responseType = api.gravity.v26.WifiService.WiFiLinkProperties.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest,
      api.gravity.v26.WifiService.WiFiLinkProperties> getSubscribeWiFiEventsMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.WiFiLinkProperties> getSubscribeWiFiEventsMethod;
    if ((getSubscribeWiFiEventsMethod = WiFiServiceGrpc.getSubscribeWiFiEventsMethod) == null) {
      synchronized (WiFiServiceGrpc.class) {
        if ((getSubscribeWiFiEventsMethod = WiFiServiceGrpc.getSubscribeWiFiEventsMethod) == null) {
          WiFiServiceGrpc.getSubscribeWiFiEventsMethod = getSubscribeWiFiEventsMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.WifiService.WiFiInterfaceRequest, api.gravity.v26.WifiService.WiFiLinkProperties>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeWiFiEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.WifiService.WiFiLinkProperties.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeWiFiEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WiFiServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WiFiServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WiFiServiceStub>() {
        @java.lang.Override
        public WiFiServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WiFiServiceStub(channel, callOptions);
        }
      };
    return WiFiServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WiFiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WiFiServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WiFiServiceBlockingStub>() {
        @java.lang.Override
        public WiFiServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WiFiServiceBlockingStub(channel, callOptions);
        }
      };
    return WiFiServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WiFiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WiFiServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WiFiServiceFutureStub>() {
        @java.lang.Override
        public WiFiServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WiFiServiceFutureStub(channel, callOptions);
        }
      };
    return WiFiServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Interface info
     * </pre>
     */
    default void listWiFiInterfaces(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiInterfacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWiFiInterfacesMethod(), responseObserver);
    }

    /**
     */
    default void getWiFiLinkProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiLinkPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWiFiLinkPropertiesMethod(), responseObserver);
    }

    /**
     */
    default void isWiFiConnected(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsWiFiConnectedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mode
     * </pre>
     */
    default void getWiFiMode(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWiFiModeMethod(), responseObserver);
    }

    /**
     */
    default void setWiFiMode(api.gravity.v26.WifiService.SetWiFiModeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetWiFiModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Access Point
     * </pre>
     */
    default void setAPConfig(api.gravity.v26.WifiService.APConfig request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAPConfigMethod(), responseObserver);
    }

    /**
     */
    default void getAPProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.APPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAPPropertiesMethod(), responseObserver);
    }

    /**
     */
    default void startAP(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartAPMethod(), responseObserver);
    }

    /**
     */
    default void stopAP(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopAPMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client
     * </pre>
     */
    default void setClientConfig(api.gravity.v26.WifiService.ClientConfig request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetClientConfigMethod(), responseObserver);
    }

    /**
     */
    default void getClientProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.ClientPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientPropertiesMethod(), responseObserver);
    }

    /**
     */
    default void connect(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     */
    default void disconnect(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Scan
     * </pre>
     */
    default void scanWiFi(api.gravity.v26.WifiService.ScanWiFiRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.ScanWiFiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanWiFiMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    default void subscribeWiFiEvents(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiLinkProperties> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeWiFiEventsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WiFiService.
   */
  public static abstract class WiFiServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WiFiServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WiFiService.
   */
  public static final class WiFiServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WiFiServiceStub> {
    private WiFiServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WiFiServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WiFiServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface info
     * </pre>
     */
    public void listWiFiInterfaces(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiInterfacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWiFiInterfacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWiFiLinkProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiLinkPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWiFiLinkPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isWiFiConnected(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsWiFiConnectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mode
     * </pre>
     */
    public void getWiFiMode(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWiFiModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setWiFiMode(api.gravity.v26.WifiService.SetWiFiModeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetWiFiModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Access Point
     * </pre>
     */
    public void setAPConfig(api.gravity.v26.WifiService.APConfig request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAPConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAPProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.APPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAPPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startAP(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartAPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopAP(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopAPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client
     * </pre>
     */
    public void setClientConfig(api.gravity.v26.WifiService.ClientConfig request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetClientConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.ClientPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void connect(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disconnect(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Scan
     * </pre>
     */
    public void scanWiFi(api.gravity.v26.WifiService.ScanWiFiRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.ScanWiFiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanWiFiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    public void subscribeWiFiEvents(api.gravity.v26.WifiService.WiFiInterfaceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiLinkProperties> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeWiFiEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WiFiService.
   */
  public static final class WiFiServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WiFiServiceBlockingStub> {
    private WiFiServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WiFiServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WiFiServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface info
     * </pre>
     */
    public api.gravity.v26.WifiService.WiFiInterfacesResponse listWiFiInterfaces(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWiFiInterfacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.WifiService.WiFiLinkPropertiesResponse getWiFiLinkProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWiFiLinkPropertiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse isWiFiConnected(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsWiFiConnectedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mode
     * </pre>
     */
    public api.gravity.v26.WifiService.WiFiModeResponse getWiFiMode(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWiFiModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setWiFiMode(api.gravity.v26.WifiService.SetWiFiModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetWiFiModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Access Point
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse setAPConfig(api.gravity.v26.WifiService.APConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAPConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.WifiService.APPropertiesResponse getAPProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAPPropertiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse startAP(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartAPMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse stopAP(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopAPMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Client
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse setClientConfig(api.gravity.v26.WifiService.ClientConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetClientConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.WifiService.ClientPropertiesResponse getClientProperties(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientPropertiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse connect(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disconnect(api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisconnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Scan
     * </pre>
     */
    public api.gravity.v26.WifiService.ScanWiFiResponse scanWiFi(api.gravity.v26.WifiService.ScanWiFiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanWiFiMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.WifiService.WiFiLinkProperties> subscribeWiFiEvents(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeWiFiEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WiFiService.
   */
  public static final class WiFiServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WiFiServiceFutureStub> {
    private WiFiServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WiFiServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WiFiServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.WifiService.WiFiInterfacesResponse> listWiFiInterfaces(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWiFiInterfacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.WifiService.WiFiLinkPropertiesResponse> getWiFiLinkProperties(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWiFiLinkPropertiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> isWiFiConnected(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsWiFiConnectedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mode
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.WifiService.WiFiModeResponse> getWiFiMode(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWiFiModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setWiFiMode(
        api.gravity.v26.WifiService.SetWiFiModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetWiFiModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Access Point
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setAPConfig(
        api.gravity.v26.WifiService.APConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAPConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.WifiService.APPropertiesResponse> getAPProperties(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAPPropertiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> startAP(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartAPMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> stopAP(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopAPMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setClientConfig(
        api.gravity.v26.WifiService.ClientConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetClientConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.WifiService.ClientPropertiesResponse> getClientProperties(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientPropertiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> connect(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disconnect(
        api.gravity.v26.WifiService.WiFiInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Scan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.WifiService.ScanWiFiResponse> scanWiFi(
        api.gravity.v26.WifiService.ScanWiFiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanWiFiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_WI_FI_INTERFACES = 0;
  private static final int METHODID_GET_WI_FI_LINK_PROPERTIES = 1;
  private static final int METHODID_IS_WI_FI_CONNECTED = 2;
  private static final int METHODID_GET_WI_FI_MODE = 3;
  private static final int METHODID_SET_WI_FI_MODE = 4;
  private static final int METHODID_SET_APCONFIG = 5;
  private static final int METHODID_GET_APPROPERTIES = 6;
  private static final int METHODID_START_AP = 7;
  private static final int METHODID_STOP_AP = 8;
  private static final int METHODID_SET_CLIENT_CONFIG = 9;
  private static final int METHODID_GET_CLIENT_PROPERTIES = 10;
  private static final int METHODID_CONNECT = 11;
  private static final int METHODID_DISCONNECT = 12;
  private static final int METHODID_SCAN_WI_FI = 13;
  private static final int METHODID_SUBSCRIBE_WI_FI_EVENTS = 14;

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
        case METHODID_LIST_WI_FI_INTERFACES:
          serviceImpl.listWiFiInterfaces((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiInterfacesResponse>) responseObserver);
          break;
        case METHODID_GET_WI_FI_LINK_PROPERTIES:
          serviceImpl.getWiFiLinkProperties((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiLinkPropertiesResponse>) responseObserver);
          break;
        case METHODID_IS_WI_FI_CONNECTED:
          serviceImpl.isWiFiConnected((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_WI_FI_MODE:
          serviceImpl.getWiFiMode((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiModeResponse>) responseObserver);
          break;
        case METHODID_SET_WI_FI_MODE:
          serviceImpl.setWiFiMode((api.gravity.v26.WifiService.SetWiFiModeRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_SET_APCONFIG:
          serviceImpl.setAPConfig((api.gravity.v26.WifiService.APConfig) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_APPROPERTIES:
          serviceImpl.getAPProperties((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.APPropertiesResponse>) responseObserver);
          break;
        case METHODID_START_AP:
          serviceImpl.startAP((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_STOP_AP:
          serviceImpl.stopAP((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_SET_CLIENT_CONFIG:
          serviceImpl.setClientConfig((api.gravity.v26.WifiService.ClientConfig) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT_PROPERTIES:
          serviceImpl.getClientProperties((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.ClientPropertiesResponse>) responseObserver);
          break;
        case METHODID_CONNECT:
          serviceImpl.connect((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISCONNECT:
          serviceImpl.disconnect((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_SCAN_WI_FI:
          serviceImpl.scanWiFi((api.gravity.v26.WifiService.ScanWiFiRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.ScanWiFiResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_WI_FI_EVENTS:
          serviceImpl.subscribeWiFiEvents((api.gravity.v26.WifiService.WiFiInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.WifiService.WiFiLinkProperties>) responseObserver);
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
          getListWiFiInterfacesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.WifiService.WiFiInterfacesResponse>(
                service, METHODID_LIST_WI_FI_INTERFACES)))
        .addMethod(
          getGetWiFiLinkPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.v26.WifiService.WiFiLinkPropertiesResponse>(
                service, METHODID_GET_WI_FI_LINK_PROPERTIES)))
        .addMethod(
          getIsWiFiConnectedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_IS_WI_FI_CONNECTED)))
        .addMethod(
          getGetWiFiModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.v26.WifiService.WiFiModeResponse>(
                service, METHODID_GET_WI_FI_MODE)))
        .addMethod(
          getSetWiFiModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.SetWiFiModeRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_WI_FI_MODE)))
        .addMethod(
          getSetAPConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.APConfig,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_APCONFIG)))
        .addMethod(
          getGetAPPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.v26.WifiService.APPropertiesResponse>(
                service, METHODID_GET_APPROPERTIES)))
        .addMethod(
          getStartAPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_START_AP)))
        .addMethod(
          getStopAPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_STOP_AP)))
        .addMethod(
          getSetClientConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.ClientConfig,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_CLIENT_CONFIG)))
        .addMethod(
          getGetClientPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.v26.WifiService.ClientPropertiesResponse>(
                service, METHODID_GET_CLIENT_PROPERTIES)))
        .addMethod(
          getConnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_CONNECT)))
        .addMethod(
          getDisconnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISCONNECT)))
        .addMethod(
          getScanWiFiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.ScanWiFiRequest,
              api.gravity.v26.WifiService.ScanWiFiResponse>(
                service, METHODID_SCAN_WI_FI)))
        .addMethod(
          getSubscribeWiFiEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.WifiService.WiFiInterfaceRequest,
              api.gravity.v26.WifiService.WiFiLinkProperties>(
                service, METHODID_SUBSCRIBE_WI_FI_EVENTS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WiFiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListWiFiInterfacesMethod())
              .addMethod(getGetWiFiLinkPropertiesMethod())
              .addMethod(getIsWiFiConnectedMethod())
              .addMethod(getGetWiFiModeMethod())
              .addMethod(getSetWiFiModeMethod())
              .addMethod(getSetAPConfigMethod())
              .addMethod(getGetAPPropertiesMethod())
              .addMethod(getStartAPMethod())
              .addMethod(getStopAPMethod())
              .addMethod(getSetClientConfigMethod())
              .addMethod(getGetClientPropertiesMethod())
              .addMethod(getConnectMethod())
              .addMethod(getDisconnectMethod())
              .addMethod(getScanWiFiMethod())
              .addMethod(getSubscribeWiFiEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
