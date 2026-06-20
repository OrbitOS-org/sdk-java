package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: bluetooth_service/v26/bluetooth_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BluetoothServiceGrpc {

  private BluetoothServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.BluetoothService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse> getGetAdapterInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdapterInfo",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse> getGetAdapterInfoMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse> getGetAdapterInfoMethod;
    if ((getGetAdapterInfoMethod = BluetoothServiceGrpc.getGetAdapterInfoMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGetAdapterInfoMethod = BluetoothServiceGrpc.getGetAdapterInfoMethod) == null) {
          BluetoothServiceGrpc.getGetAdapterInfoMethod = getGetAdapterInfoMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdapterInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAdapterInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableBluetoothMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableBluetooth",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableBluetoothMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getEnableBluetoothMethod;
    if ((getEnableBluetoothMethod = BluetoothServiceGrpc.getEnableBluetoothMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getEnableBluetoothMethod = BluetoothServiceGrpc.getEnableBluetoothMethod) == null) {
          BluetoothServiceGrpc.getEnableBluetoothMethod = getEnableBluetoothMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableBluetooth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableBluetoothMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableBluetoothMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableBluetooth",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableBluetoothMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getDisableBluetoothMethod;
    if ((getDisableBluetoothMethod = BluetoothServiceGrpc.getDisableBluetoothMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getDisableBluetoothMethod = BluetoothServiceGrpc.getDisableBluetoothMethod) == null) {
          BluetoothServiceGrpc.getDisableBluetoothMethod = getDisableBluetoothMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableBluetooth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableBluetoothMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetLocalNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocalName",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetLocalNameMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetLocalNameMethod;
    if ((getGetLocalNameMethod = BluetoothServiceGrpc.getGetLocalNameMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGetLocalNameMethod = BluetoothServiceGrpc.getGetLocalNameMethod) == null) {
          BluetoothServiceGrpc.getGetLocalNameMethod = getGetLocalNameMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocalName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLocalNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.StringRequest,
      api.gravity.types.Types.BooleanResponse> getSetLocalNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLocalName",
      requestType = api.gravity.types.Types.StringRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.StringRequest,
      api.gravity.types.Types.BooleanResponse> getSetLocalNameMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.StringRequest, api.gravity.types.Types.BooleanResponse> getSetLocalNameMethod;
    if ((getSetLocalNameMethod = BluetoothServiceGrpc.getSetLocalNameMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getSetLocalNameMethod = BluetoothServiceGrpc.getSetLocalNameMethod) == null) {
          BluetoothServiceGrpc.getSetLocalNameMethod = getSetLocalNameMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.StringRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetLocalName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetLocalNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest,
      api.gravity.types.Types.BooleanResponse> getSetDiscoverableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDiscoverable",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest,
      api.gravity.types.Types.BooleanResponse> getSetDiscoverableMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest, api.gravity.types.Types.BooleanResponse> getSetDiscoverableMethod;
    if ((getSetDiscoverableMethod = BluetoothServiceGrpc.getSetDiscoverableMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getSetDiscoverableMethod = BluetoothServiceGrpc.getSetDiscoverableMethod) == null) {
          BluetoothServiceGrpc.getSetDiscoverableMethod = getSetDiscoverableMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDiscoverable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetDiscoverableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult> getStartScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartScan",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult> getStartScanMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult> getStartScanMethod;
    if ((getStartScanMethod = BluetoothServiceGrpc.getStartScanMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getStartScanMethod = BluetoothServiceGrpc.getStartScanMethod) == null) {
          BluetoothServiceGrpc.getStartScanMethod = getStartScanMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartScan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartScanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse> getGetBondedDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondedDevices",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse> getGetBondedDevicesMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse> getGetBondedDevicesMethod;
    if ((getGetBondedDevicesMethod = BluetoothServiceGrpc.getGetBondedDevicesMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGetBondedDevicesMethod = BluetoothServiceGrpc.getGetBondedDevicesMethod) == null) {
          BluetoothServiceGrpc.getGetBondedDevicesMethod = getGetBondedDevicesMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBondedDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBondedDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.BondEvent> getBondDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BondDevice",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.BondEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.BondEvent> getBondDeviceMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.BondEvent> getBondDeviceMethod;
    if ((getBondDeviceMethod = BluetoothServiceGrpc.getBondDeviceMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getBondDeviceMethod = BluetoothServiceGrpc.getBondDeviceMethod) == null) {
          BluetoothServiceGrpc.getBondDeviceMethod = getBondDeviceMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.BondEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BondDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BondEvent.getDefaultInstance()))
              .build();
        }
      }
    }
    return getBondDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveBond",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getRemoveBondMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse> getRemoveBondMethod;
    if ((getRemoveBondMethod = BluetoothServiceGrpc.getRemoveBondMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getRemoveBondMethod = BluetoothServiceGrpc.getRemoveBondMethod) == null) {
          BluetoothServiceGrpc.getRemoveBondMethod = getRemoveBondMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveBond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getConnectDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectDevice",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getConnectDeviceMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse> getConnectDeviceMethod;
    if ((getConnectDeviceMethod = BluetoothServiceGrpc.getConnectDeviceMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getConnectDeviceMethod = BluetoothServiceGrpc.getConnectDeviceMethod) == null) {
          BluetoothServiceGrpc.getConnectDeviceMethod = getConnectDeviceMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConnectDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getConnectDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getDisconnectDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisconnectDevice",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getDisconnectDeviceMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse> getDisconnectDeviceMethod;
    if ((getDisconnectDeviceMethod = BluetoothServiceGrpc.getDisconnectDeviceMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getDisconnectDeviceMethod = BluetoothServiceGrpc.getDisconnectDeviceMethod) == null) {
          BluetoothServiceGrpc.getDisconnectDeviceMethod = getDisconnectDeviceMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisconnectDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisconnectDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse> getGetConnectionStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConnectionState",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse> getGetConnectionStateMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse> getGetConnectionStateMethod;
    if ((getGetConnectionStateMethod = BluetoothServiceGrpc.getGetConnectionStateMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGetConnectionStateMethod = BluetoothServiceGrpc.getGetConnectionStateMethod) == null) {
          BluetoothServiceGrpc.getGetConnectionStateMethod = getGetConnectionStateMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConnectionState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetConnectionStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest,
      api.gravity.v26.BluetoothServiceOuterClass.BleScanResult> getStartBleScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartBleScan",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.BleScanResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest,
      api.gravity.v26.BluetoothServiceOuterClass.BleScanResult> getStartBleScanMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest, api.gravity.v26.BluetoothServiceOuterClass.BleScanResult> getStartBleScanMethod;
    if ((getStartBleScanMethod = BluetoothServiceGrpc.getStartBleScanMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getStartBleScanMethod = BluetoothServiceGrpc.getStartBleScanMethod) == null) {
          BluetoothServiceGrpc.getStartBleScanMethod = getStartBleScanMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest, api.gravity.v26.BluetoothServiceOuterClass.BleScanResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartBleScan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BleScanResult.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartBleScanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getGattConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattConnect",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getGattConnectMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse> getGattConnectMethod;
    if ((getGattConnectMethod = BluetoothServiceGrpc.getGattConnectMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattConnectMethod = BluetoothServiceGrpc.getGattConnectMethod) == null) {
          BluetoothServiceGrpc.getGattConnectMethod = getGattConnectMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattConnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getGattDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattDisconnect",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.types.Types.BooleanResponse> getGattDisconnectMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse> getGattDisconnectMethod;
    if ((getGattDisconnectMethod = BluetoothServiceGrpc.getGattDisconnectMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattDisconnectMethod = BluetoothServiceGrpc.getGattDisconnectMethod) == null) {
          BluetoothServiceGrpc.getGattDisconnectMethod = getGattDisconnectMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattDisconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse> getGetGattStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGattState",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse> getGetGattStateMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse> getGetGattStateMethod;
    if ((getGetGattStateMethod = BluetoothServiceGrpc.getGetGattStateMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGetGattStateMethod = BluetoothServiceGrpc.getGetGattStateMethod) == null) {
          BluetoothServiceGrpc.getGetGattStateMethod = getGetGattStateMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGattState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetGattStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse> getGattDiscoverServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattDiscoverServices",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse> getGattDiscoverServicesMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse> getGattDiscoverServicesMethod;
    if ((getGattDiscoverServicesMethod = BluetoothServiceGrpc.getGattDiscoverServicesMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattDiscoverServicesMethod = BluetoothServiceGrpc.getGattDiscoverServicesMethod) == null) {
          BluetoothServiceGrpc.getGattDiscoverServicesMethod = getGattDiscoverServicesMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattDiscoverServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattDiscoverServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse> getGattReadCharacteristicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattReadCharacteristic",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse> getGattReadCharacteristicMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest, api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse> getGattReadCharacteristicMethod;
    if ((getGattReadCharacteristicMethod = BluetoothServiceGrpc.getGattReadCharacteristicMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattReadCharacteristicMethod = BluetoothServiceGrpc.getGattReadCharacteristicMethod) == null) {
          BluetoothServiceGrpc.getGattReadCharacteristicMethod = getGattReadCharacteristicMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest, api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattReadCharacteristic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattReadCharacteristicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest,
      api.gravity.types.Types.BooleanResponse> getGattWriteCharacteristicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattWriteCharacteristic",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest,
      api.gravity.types.Types.BooleanResponse> getGattWriteCharacteristicMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest, api.gravity.types.Types.BooleanResponse> getGattWriteCharacteristicMethod;
    if ((getGattWriteCharacteristicMethod = BluetoothServiceGrpc.getGattWriteCharacteristicMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattWriteCharacteristicMethod = BluetoothServiceGrpc.getGattWriteCharacteristicMethod) == null) {
          BluetoothServiceGrpc.getGattWriteCharacteristicMethod = getGattWriteCharacteristicMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattWriteCharacteristic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattWriteCharacteristicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattNotification> getGattSubscribeCharacteristicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattSubscribeCharacteristic",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.GattNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattNotification> getGattSubscribeCharacteristicMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest, api.gravity.v26.BluetoothServiceOuterClass.GattNotification> getGattSubscribeCharacteristicMethod;
    if ((getGattSubscribeCharacteristicMethod = BluetoothServiceGrpc.getGattSubscribeCharacteristicMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattSubscribeCharacteristicMethod = BluetoothServiceGrpc.getGattSubscribeCharacteristicMethod) == null) {
          BluetoothServiceGrpc.getGattSubscribeCharacteristicMethod = getGattSubscribeCharacteristicMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest, api.gravity.v26.BluetoothServiceOuterClass.GattNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattSubscribeCharacteristic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattNotification.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattSubscribeCharacteristicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse> getGattReadDescriptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattReadDescriptor",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse> getGattReadDescriptorMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest, api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse> getGattReadDescriptorMethod;
    if ((getGattReadDescriptorMethod = BluetoothServiceGrpc.getGattReadDescriptorMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattReadDescriptorMethod = BluetoothServiceGrpc.getGattReadDescriptorMethod) == null) {
          BluetoothServiceGrpc.getGattReadDescriptorMethod = getGattReadDescriptorMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest, api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattReadDescriptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattReadDescriptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest,
      api.gravity.types.Types.BooleanResponse> getGattWriteDescriptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattWriteDescriptor",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest,
      api.gravity.types.Types.BooleanResponse> getGattWriteDescriptorMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest, api.gravity.types.Types.BooleanResponse> getGattWriteDescriptorMethod;
    if ((getGattWriteDescriptorMethod = BluetoothServiceGrpc.getGattWriteDescriptorMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattWriteDescriptorMethod = BluetoothServiceGrpc.getGattWriteDescriptorMethod) == null) {
          BluetoothServiceGrpc.getGattWriteDescriptorMethod = getGattWriteDescriptorMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattWriteDescriptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattWriteDescriptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse> getGattReadRssiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GattReadRssi",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse> getGattReadRssiMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse> getGattReadRssiMethod;
    if ((getGattReadRssiMethod = BluetoothServiceGrpc.getGattReadRssiMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getGattReadRssiMethod = BluetoothServiceGrpc.getGattReadRssiMethod) == null) {
          BluetoothServiceGrpc.getGattReadRssiMethod = getGattReadRssiMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GattReadRssi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGattReadRssiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.MtuRequest,
      api.gravity.v26.BluetoothServiceOuterClass.MtuResponse> getRequestMtuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestMtu",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.MtuRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.MtuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.MtuRequest,
      api.gravity.v26.BluetoothServiceOuterClass.MtuResponse> getRequestMtuMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.MtuRequest, api.gravity.v26.BluetoothServiceOuterClass.MtuResponse> getRequestMtuMethod;
    if ((getRequestMtuMethod = BluetoothServiceGrpc.getRequestMtuMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getRequestMtuMethod = BluetoothServiceGrpc.getRequestMtuMethod) == null) {
          BluetoothServiceGrpc.getRequestMtuMethod = getRequestMtuMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.MtuRequest, api.gravity.v26.BluetoothServiceOuterClass.MtuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestMtu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.MtuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.MtuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRequestMtuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest,
      api.gravity.types.Types.BooleanResponse> getRequestConnectionPriorityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestConnectionPriority",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest,
      api.gravity.types.Types.BooleanResponse> getRequestConnectionPriorityMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest, api.gravity.types.Types.BooleanResponse> getRequestConnectionPriorityMethod;
    if ((getRequestConnectionPriorityMethod = BluetoothServiceGrpc.getRequestConnectionPriorityMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getRequestConnectionPriorityMethod = BluetoothServiceGrpc.getRequestConnectionPriorityMethod) == null) {
          BluetoothServiceGrpc.getRequestConnectionPriorityMethod = getRequestConnectionPriorityMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestConnectionPriority"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRequestConnectionPriorityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.PhyRequest,
      api.gravity.types.Types.BooleanResponse> getSetPreferredPhyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPreferredPhy",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.PhyRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.PhyRequest,
      api.gravity.types.Types.BooleanResponse> getSetPreferredPhyMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.PhyRequest, api.gravity.types.Types.BooleanResponse> getSetPreferredPhyMethod;
    if ((getSetPreferredPhyMethod = BluetoothServiceGrpc.getSetPreferredPhyMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getSetPreferredPhyMethod = BluetoothServiceGrpc.getSetPreferredPhyMethod) == null) {
          BluetoothServiceGrpc.getSetPreferredPhyMethod = getSetPreferredPhyMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.PhyRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPreferredPhy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.PhyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPreferredPhyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.PhyResponse> getReadPhyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadPhy",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.class,
      responseType = api.gravity.v26.BluetoothServiceOuterClass.PhyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
      api.gravity.v26.BluetoothServiceOuterClass.PhyResponse> getReadPhyMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.PhyResponse> getReadPhyMethod;
    if ((getReadPhyMethod = BluetoothServiceGrpc.getReadPhyMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getReadPhyMethod = BluetoothServiceGrpc.getReadPhyMethod) == null) {
          BluetoothServiceGrpc.getReadPhyMethod = getReadPhyMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest, api.gravity.v26.BluetoothServiceOuterClass.PhyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadPhy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.PhyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getReadPhyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest,
      api.gravity.types.Types.BooleanResponse> getStartAdvertisingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartAdvertising",
      requestType = api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest,
      api.gravity.types.Types.BooleanResponse> getStartAdvertisingMethod() {
    io.grpc.MethodDescriptor<api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest, api.gravity.types.Types.BooleanResponse> getStartAdvertisingMethod;
    if ((getStartAdvertisingMethod = BluetoothServiceGrpc.getStartAdvertisingMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getStartAdvertisingMethod = BluetoothServiceGrpc.getStartAdvertisingMethod) == null) {
          BluetoothServiceGrpc.getStartAdvertisingMethod = getStartAdvertisingMethod =
              io.grpc.MethodDescriptor.<api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartAdvertising"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartAdvertisingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getStopAdvertisingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopAdvertising",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getStopAdvertisingMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getStopAdvertisingMethod;
    if ((getStopAdvertisingMethod = BluetoothServiceGrpc.getStopAdvertisingMethod) == null) {
      synchronized (BluetoothServiceGrpc.class) {
        if ((getStopAdvertisingMethod = BluetoothServiceGrpc.getStopAdvertisingMethod) == null) {
          BluetoothServiceGrpc.getStopAdvertisingMethod = getStopAdvertisingMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopAdvertising"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopAdvertisingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BluetoothServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BluetoothServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BluetoothServiceStub>() {
        @java.lang.Override
        public BluetoothServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BluetoothServiceStub(channel, callOptions);
        }
      };
    return BluetoothServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BluetoothServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BluetoothServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BluetoothServiceBlockingStub>() {
        @java.lang.Override
        public BluetoothServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BluetoothServiceBlockingStub(channel, callOptions);
        }
      };
    return BluetoothServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BluetoothServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BluetoothServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BluetoothServiceFutureStub>() {
        @java.lang.Override
        public BluetoothServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BluetoothServiceFutureStub(channel, callOptions);
        }
      };
    return BluetoothServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Adapter
     * </pre>
     */
    default void getAdapterInfo(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdapterInfoMethod(), responseObserver);
    }

    /**
     */
    default void enableBluetooth(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableBluetoothMethod(), responseObserver);
    }

    /**
     */
    default void disableBluetooth(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableBluetoothMethod(), responseObserver);
    }

    /**
     */
    default void getLocalName(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocalNameMethod(), responseObserver);
    }

    /**
     */
    default void setLocalName(api.gravity.types.Types.StringRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetLocalNameMethod(), responseObserver);
    }

    /**
     */
    default void setDiscoverable(api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDiscoverableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Classic Bluetooth — discovery
     * Stream ends when the adapter finishes discovery or the client cancels the RPC
     * </pre>
     */
    default void startScan(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartScanMethod(), responseObserver);
    }

    /**
     */
    default void getBondedDevices(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBondedDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Classic Bluetooth — pairing
     * BondDevice streams pairing events (state changes, PIN requests) until bonding completes
     * </pre>
     */
    default void bondDevice(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BondEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondDeviceMethod(), responseObserver);
    }

    /**
     */
    default void removeBond(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveBondMethod(), responseObserver);
    }

    /**
     * <pre>
     * Classic Bluetooth — connection (profile-agnostic)
     * </pre>
     */
    default void connectDevice(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectDeviceMethod(), responseObserver);
    }

    /**
     */
    default void disconnectDevice(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectDeviceMethod(), responseObserver);
    }

    /**
     */
    default void getConnectionState(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConnectionStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * BLE — scan
     * Stream delivers results continuously; cancel the RPC to stop scanning
     * </pre>
     */
    default void startBleScan(api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BleScanResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartBleScanMethod(), responseObserver);
    }

    /**
     * <pre>
     * BLE — GATT client: lifecycle
     * </pre>
     */
    default void gattConnect(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattConnectMethod(), responseObserver);
    }

    /**
     */
    default void gattDisconnect(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattDisconnectMethod(), responseObserver);
    }

    /**
     */
    default void getGattState(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGattStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * BLE — GATT client: service &amp; characteristic operations
     * </pre>
     */
    default void gattDiscoverServices(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattDiscoverServicesMethod(), responseObserver);
    }

    /**
     */
    default void gattReadCharacteristic(api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattReadCharacteristicMethod(), responseObserver);
    }

    /**
     */
    default void gattWriteCharacteristic(api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattWriteCharacteristicMethod(), responseObserver);
    }

    /**
     */
    default void gattSubscribeCharacteristic(api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattNotification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattSubscribeCharacteristicMethod(), responseObserver);
    }

    /**
     * <pre>
     * BLE — GATT client: descriptor operations (e.g. manual CCCD management)
     * </pre>
     */
    default void gattReadDescriptor(api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattReadDescriptorMethod(), responseObserver);
    }

    /**
     */
    default void gattWriteDescriptor(api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattWriteDescriptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * BLE — GATT client: link tuning
     * </pre>
     */
    default void gattReadRssi(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGattReadRssiMethod(), responseObserver);
    }

    /**
     */
    default void requestMtu(api.gravity.v26.BluetoothServiceOuterClass.MtuRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.MtuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestMtuMethod(), responseObserver);
    }

    /**
     */
    default void requestConnectionPriority(api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestConnectionPriorityMethod(), responseObserver);
    }

    /**
     */
    default void setPreferredPhy(api.gravity.v26.BluetoothServiceOuterClass.PhyRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPreferredPhyMethod(), responseObserver);
    }

    /**
     */
    default void readPhy(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.PhyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadPhyMethod(), responseObserver);
    }

    /**
     * <pre>
     * BLE — advertising (Pi acts as peripheral)
     * </pre>
     */
    default void startAdvertising(api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartAdvertisingMethod(), responseObserver);
    }

    /**
     */
    default void stopAdvertising(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopAdvertisingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BluetoothService.
   */
  public static abstract class BluetoothServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BluetoothServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BluetoothService.
   */
  public static final class BluetoothServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BluetoothServiceStub> {
    private BluetoothServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BluetoothServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BluetoothServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adapter
     * </pre>
     */
    public void getAdapterInfo(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdapterInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableBluetooth(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableBluetoothMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableBluetooth(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableBluetoothMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocalName(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocalNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setLocalName(api.gravity.types.Types.StringRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetLocalNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDiscoverable(api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDiscoverableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Classic Bluetooth — discovery
     * Stream ends when the adapter finishes discovery or the client cancels the RPC
     * </pre>
     */
    public void startScan(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStartScanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBondedDevices(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBondedDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Classic Bluetooth — pairing
     * BondDevice streams pairing events (state changes, PIN requests) until bonding completes
     * </pre>
     */
    public void bondDevice(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BondEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBondDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeBond(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Classic Bluetooth — connection (profile-agnostic)
     * </pre>
     */
    public void connectDevice(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disconnectDevice(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisconnectDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConnectionState(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConnectionStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BLE — scan
     * Stream delivers results continuously; cancel the RPC to stop scanning
     * </pre>
     */
    public void startBleScan(api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BleScanResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStartBleScanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BLE — GATT client: lifecycle
     * </pre>
     */
    public void gattConnect(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGattConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void gattDisconnect(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGattDisconnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGattState(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGattStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BLE — GATT client: service &amp; characteristic operations
     * </pre>
     */
    public void gattDiscoverServices(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGattDiscoverServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void gattReadCharacteristic(api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGattReadCharacteristicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void gattWriteCharacteristic(api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGattWriteCharacteristicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void gattSubscribeCharacteristic(api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattNotification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGattSubscribeCharacteristicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BLE — GATT client: descriptor operations (e.g. manual CCCD management)
     * </pre>
     */
    public void gattReadDescriptor(api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGattReadDescriptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void gattWriteDescriptor(api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGattWriteDescriptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BLE — GATT client: link tuning
     * </pre>
     */
    public void gattReadRssi(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGattReadRssiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestMtu(api.gravity.v26.BluetoothServiceOuterClass.MtuRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.MtuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestMtuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestConnectionPriority(api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestConnectionPriorityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPreferredPhy(api.gravity.v26.BluetoothServiceOuterClass.PhyRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPreferredPhyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readPhy(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request,
        io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.PhyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadPhyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BLE — advertising (Pi acts as peripheral)
     * </pre>
     */
    public void startAdvertising(api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartAdvertisingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopAdvertising(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopAdvertisingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BluetoothService.
   */
  public static final class BluetoothServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BluetoothServiceBlockingStub> {
    private BluetoothServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BluetoothServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BluetoothServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adapter
     * </pre>
     */
    public api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse getAdapterInfo(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdapterInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse enableBluetooth(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableBluetoothMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disableBluetooth(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableBluetoothMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getLocalName(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocalNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setLocalName(api.gravity.types.Types.StringRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetLocalNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setDiscoverable(api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDiscoverableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Classic Bluetooth — discovery
     * Stream ends when the adapter finishes discovery or the client cancels the RPC
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult> startScan(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStartScanMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse getBondedDevices(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBondedDevicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Classic Bluetooth — pairing
     * BondDevice streams pairing events (state changes, PIN requests) until bonding completes
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.BluetoothServiceOuterClass.BondEvent> bondDevice(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBondDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse removeBond(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveBondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Classic Bluetooth — connection (profile-agnostic)
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse connectDevice(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disconnectDevice(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisconnectDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse getConnectionState(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConnectionStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BLE — scan
     * Stream delivers results continuously; cancel the RPC to stop scanning
     * </pre>
     */
    public java.util.Iterator<api.gravity.v26.BluetoothServiceOuterClass.BleScanResult> startBleScan(
        api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStartBleScanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BLE — GATT client: lifecycle
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse gattConnect(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGattConnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse gattDisconnect(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGattDisconnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse getGattState(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGattStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BLE — GATT client: service &amp; characteristic operations
     * </pre>
     */
    public api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse gattDiscoverServices(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGattDiscoverServicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse gattReadCharacteristic(api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGattReadCharacteristicMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse gattWriteCharacteristic(api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGattWriteCharacteristicMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<api.gravity.v26.BluetoothServiceOuterClass.GattNotification> gattSubscribeCharacteristic(
        api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGattSubscribeCharacteristicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BLE — GATT client: descriptor operations (e.g. manual CCCD management)
     * </pre>
     */
    public api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse gattReadDescriptor(api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGattReadDescriptorMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse gattWriteDescriptor(api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGattWriteDescriptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BLE — GATT client: link tuning
     * </pre>
     */
    public api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse gattReadRssi(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGattReadRssiMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.BluetoothServiceOuterClass.MtuResponse requestMtu(api.gravity.v26.BluetoothServiceOuterClass.MtuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestMtuMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse requestConnectionPriority(api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestConnectionPriorityMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse setPreferredPhy(api.gravity.v26.BluetoothServiceOuterClass.PhyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPreferredPhyMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.v26.BluetoothServiceOuterClass.PhyResponse readPhy(api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadPhyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BLE — advertising (Pi acts as peripheral)
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse startAdvertising(api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartAdvertisingMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse stopAdvertising(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopAdvertisingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BluetoothService.
   */
  public static final class BluetoothServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BluetoothServiceFutureStub> {
    private BluetoothServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BluetoothServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BluetoothServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adapter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse> getAdapterInfo(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdapterInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> enableBluetooth(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableBluetoothMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disableBluetooth(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableBluetoothMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getLocalName(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocalNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setLocalName(
        api.gravity.types.Types.StringRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetLocalNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setDiscoverable(
        api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDiscoverableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse> getBondedDevices(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBondedDevicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> removeBond(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveBondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Classic Bluetooth — connection (profile-agnostic)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> connectDevice(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disconnectDevice(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisconnectDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse> getConnectionState(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConnectionStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BLE — GATT client: lifecycle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> gattConnect(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGattConnectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> gattDisconnect(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGattDisconnectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse> getGattState(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGattStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BLE — GATT client: service &amp; characteristic operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse> gattDiscoverServices(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGattDiscoverServicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse> gattReadCharacteristic(
        api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGattReadCharacteristicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> gattWriteCharacteristic(
        api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGattWriteCharacteristicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BLE — GATT client: descriptor operations (e.g. manual CCCD management)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse> gattReadDescriptor(
        api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGattReadDescriptorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> gattWriteDescriptor(
        api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGattWriteDescriptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BLE — GATT client: link tuning
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse> gattReadRssi(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGattReadRssiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.MtuResponse> requestMtu(
        api.gravity.v26.BluetoothServiceOuterClass.MtuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestMtuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> requestConnectionPriority(
        api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestConnectionPriorityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> setPreferredPhy(
        api.gravity.v26.BluetoothServiceOuterClass.PhyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPreferredPhyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.BluetoothServiceOuterClass.PhyResponse> readPhy(
        api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadPhyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BLE — advertising (Pi acts as peripheral)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> startAdvertising(
        api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartAdvertisingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> stopAdvertising(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopAdvertisingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ADAPTER_INFO = 0;
  private static final int METHODID_ENABLE_BLUETOOTH = 1;
  private static final int METHODID_DISABLE_BLUETOOTH = 2;
  private static final int METHODID_GET_LOCAL_NAME = 3;
  private static final int METHODID_SET_LOCAL_NAME = 4;
  private static final int METHODID_SET_DISCOVERABLE = 5;
  private static final int METHODID_START_SCAN = 6;
  private static final int METHODID_GET_BONDED_DEVICES = 7;
  private static final int METHODID_BOND_DEVICE = 8;
  private static final int METHODID_REMOVE_BOND = 9;
  private static final int METHODID_CONNECT_DEVICE = 10;
  private static final int METHODID_DISCONNECT_DEVICE = 11;
  private static final int METHODID_GET_CONNECTION_STATE = 12;
  private static final int METHODID_START_BLE_SCAN = 13;
  private static final int METHODID_GATT_CONNECT = 14;
  private static final int METHODID_GATT_DISCONNECT = 15;
  private static final int METHODID_GET_GATT_STATE = 16;
  private static final int METHODID_GATT_DISCOVER_SERVICES = 17;
  private static final int METHODID_GATT_READ_CHARACTERISTIC = 18;
  private static final int METHODID_GATT_WRITE_CHARACTERISTIC = 19;
  private static final int METHODID_GATT_SUBSCRIBE_CHARACTERISTIC = 20;
  private static final int METHODID_GATT_READ_DESCRIPTOR = 21;
  private static final int METHODID_GATT_WRITE_DESCRIPTOR = 22;
  private static final int METHODID_GATT_READ_RSSI = 23;
  private static final int METHODID_REQUEST_MTU = 24;
  private static final int METHODID_REQUEST_CONNECTION_PRIORITY = 25;
  private static final int METHODID_SET_PREFERRED_PHY = 26;
  private static final int METHODID_READ_PHY = 27;
  private static final int METHODID_START_ADVERTISING = 28;
  private static final int METHODID_STOP_ADVERTISING = 29;

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
        case METHODID_GET_ADAPTER_INFO:
          serviceImpl.getAdapterInfo((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse>) responseObserver);
          break;
        case METHODID_ENABLE_BLUETOOTH:
          serviceImpl.enableBluetooth((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISABLE_BLUETOOTH:
          serviceImpl.disableBluetooth((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_LOCAL_NAME:
          serviceImpl.getLocalName((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_SET_LOCAL_NAME:
          serviceImpl.setLocalName((api.gravity.types.Types.StringRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_SET_DISCOVERABLE:
          serviceImpl.setDiscoverable((api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_START_SCAN:
          serviceImpl.startScan((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult>) responseObserver);
          break;
        case METHODID_GET_BONDED_DEVICES:
          serviceImpl.getBondedDevices((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse>) responseObserver);
          break;
        case METHODID_BOND_DEVICE:
          serviceImpl.bondDevice((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BondEvent>) responseObserver);
          break;
        case METHODID_REMOVE_BOND:
          serviceImpl.removeBond((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_CONNECT_DEVICE:
          serviceImpl.connectDevice((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISCONNECT_DEVICE:
          serviceImpl.disconnectDevice((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_CONNECTION_STATE:
          serviceImpl.getConnectionState((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse>) responseObserver);
          break;
        case METHODID_START_BLE_SCAN:
          serviceImpl.startBleScan((api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.BleScanResult>) responseObserver);
          break;
        case METHODID_GATT_CONNECT:
          serviceImpl.gattConnect((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GATT_DISCONNECT:
          serviceImpl.gattDisconnect((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GET_GATT_STATE:
          serviceImpl.getGattState((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse>) responseObserver);
          break;
        case METHODID_GATT_DISCOVER_SERVICES:
          serviceImpl.gattDiscoverServices((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse>) responseObserver);
          break;
        case METHODID_GATT_READ_CHARACTERISTIC:
          serviceImpl.gattReadCharacteristic((api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse>) responseObserver);
          break;
        case METHODID_GATT_WRITE_CHARACTERISTIC:
          serviceImpl.gattWriteCharacteristic((api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GATT_SUBSCRIBE_CHARACTERISTIC:
          serviceImpl.gattSubscribeCharacteristic((api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattNotification>) responseObserver);
          break;
        case METHODID_GATT_READ_DESCRIPTOR:
          serviceImpl.gattReadDescriptor((api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse>) responseObserver);
          break;
        case METHODID_GATT_WRITE_DESCRIPTOR:
          serviceImpl.gattWriteDescriptor((api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_GATT_READ_RSSI:
          serviceImpl.gattReadRssi((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse>) responseObserver);
          break;
        case METHODID_REQUEST_MTU:
          serviceImpl.requestMtu((api.gravity.v26.BluetoothServiceOuterClass.MtuRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.MtuResponse>) responseObserver);
          break;
        case METHODID_REQUEST_CONNECTION_PRIORITY:
          serviceImpl.requestConnectionPriority((api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_SET_PREFERRED_PHY:
          serviceImpl.setPreferredPhy((api.gravity.v26.BluetoothServiceOuterClass.PhyRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_READ_PHY:
          serviceImpl.readPhy((api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.BluetoothServiceOuterClass.PhyResponse>) responseObserver);
          break;
        case METHODID_START_ADVERTISING:
          serviceImpl.startAdvertising((api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_STOP_ADVERTISING:
          serviceImpl.stopAdvertising((api.gravity.types.Types.Empty) request,
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
          getGetAdapterInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.BluetoothServiceOuterClass.BluetoothAdapterInfoResponse>(
                service, METHODID_GET_ADAPTER_INFO)))
        .addMethod(
          getEnableBluetoothMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ENABLE_BLUETOOTH)))
        .addMethod(
          getDisableBluetoothMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISABLE_BLUETOOTH)))
        .addMethod(
          getGetLocalNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_LOCAL_NAME)))
        .addMethod(
          getSetLocalNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.StringRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_LOCAL_NAME)))
        .addMethod(
          getSetDiscoverableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.SetDiscoverableRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_DISCOVERABLE)))
        .addMethod(
          getStartScanMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.BluetoothServiceOuterClass.ClassicScanResult>(
                service, METHODID_START_SCAN)))
        .addMethod(
          getGetBondedDevicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.BluetoothServiceOuterClass.BondedDevicesResponse>(
                service, METHODID_GET_BONDED_DEVICES)))
        .addMethod(
          getBondDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.v26.BluetoothServiceOuterClass.BondEvent>(
                service, METHODID_BOND_DEVICE)))
        .addMethod(
          getRemoveBondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_REMOVE_BOND)))
        .addMethod(
          getConnectDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_CONNECT_DEVICE)))
        .addMethod(
          getDisconnectDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISCONNECT_DEVICE)))
        .addMethod(
          getGetConnectionStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.v26.BluetoothServiceOuterClass.BtConnectionStateResponse>(
                service, METHODID_GET_CONNECTION_STATE)))
        .addMethod(
          getStartBleScanMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BleScanRequest,
              api.gravity.v26.BluetoothServiceOuterClass.BleScanResult>(
                service, METHODID_START_BLE_SCAN)))
        .addMethod(
          getGattConnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_GATT_CONNECT)))
        .addMethod(
          getGattDisconnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_GATT_DISCONNECT)))
        .addMethod(
          getGetGattStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.v26.BluetoothServiceOuterClass.GattStateResponse>(
                service, METHODID_GET_GATT_STATE)))
        .addMethod(
          getGattDiscoverServicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.v26.BluetoothServiceOuterClass.GattServicesResponse>(
                service, METHODID_GATT_DISCOVER_SERVICES)))
        .addMethod(
          getGattReadCharacteristicMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.GattReadRequest,
              api.gravity.v26.BluetoothServiceOuterClass.GattReadResponse>(
                service, METHODID_GATT_READ_CHARACTERISTIC)))
        .addMethod(
          getGattWriteCharacteristicMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.GattWriteRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_GATT_WRITE_CHARACTERISTIC)))
        .addMethod(
          getGattSubscribeCharacteristicMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.GattSubscribeRequest,
              api.gravity.v26.BluetoothServiceOuterClass.GattNotification>(
                service, METHODID_GATT_SUBSCRIBE_CHARACTERISTIC)))
        .addMethod(
          getGattReadDescriptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorRequest,
              api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorReadResponse>(
                service, METHODID_GATT_READ_DESCRIPTOR)))
        .addMethod(
          getGattWriteDescriptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.GattDescriptorWriteRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_GATT_WRITE_DESCRIPTOR)))
        .addMethod(
          getGattReadRssiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.v26.BluetoothServiceOuterClass.GattRssiResponse>(
                service, METHODID_GATT_READ_RSSI)))
        .addMethod(
          getRequestMtuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.MtuRequest,
              api.gravity.v26.BluetoothServiceOuterClass.MtuResponse>(
                service, METHODID_REQUEST_MTU)))
        .addMethod(
          getRequestConnectionPriorityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.ConnectionPriorityRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_REQUEST_CONNECTION_PRIORITY)))
        .addMethod(
          getSetPreferredPhyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.PhyRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_SET_PREFERRED_PHY)))
        .addMethod(
          getReadPhyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.BtDeviceRequest,
              api.gravity.v26.BluetoothServiceOuterClass.PhyResponse>(
                service, METHODID_READ_PHY)))
        .addMethod(
          getStartAdvertisingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.v26.BluetoothServiceOuterClass.AdvertiseRequest,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_START_ADVERTISING)))
        .addMethod(
          getStopAdvertisingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_STOP_ADVERTISING)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BluetoothServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetAdapterInfoMethod())
              .addMethod(getEnableBluetoothMethod())
              .addMethod(getDisableBluetoothMethod())
              .addMethod(getGetLocalNameMethod())
              .addMethod(getSetLocalNameMethod())
              .addMethod(getSetDiscoverableMethod())
              .addMethod(getStartScanMethod())
              .addMethod(getGetBondedDevicesMethod())
              .addMethod(getBondDeviceMethod())
              .addMethod(getRemoveBondMethod())
              .addMethod(getConnectDeviceMethod())
              .addMethod(getDisconnectDeviceMethod())
              .addMethod(getGetConnectionStateMethod())
              .addMethod(getStartBleScanMethod())
              .addMethod(getGattConnectMethod())
              .addMethod(getGattDisconnectMethod())
              .addMethod(getGetGattStateMethod())
              .addMethod(getGattDiscoverServicesMethod())
              .addMethod(getGattReadCharacteristicMethod())
              .addMethod(getGattWriteCharacteristicMethod())
              .addMethod(getGattSubscribeCharacteristicMethod())
              .addMethod(getGattReadDescriptorMethod())
              .addMethod(getGattWriteDescriptorMethod())
              .addMethod(getGattReadRssiMethod())
              .addMethod(getRequestMtuMethod())
              .addMethod(getRequestConnectionPriorityMethod())
              .addMethod(getSetPreferredPhyMethod())
              .addMethod(getReadPhyMethod())
              .addMethod(getStartAdvertisingMethod())
              .addMethod(getStopAdvertisingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
