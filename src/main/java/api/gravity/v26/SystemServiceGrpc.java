package api.gravity.v26;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: system_service/v26/system_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SystemServiceGrpc {

  private SystemServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.gravity.v26.SystemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.types.Types.APIVersionResponse> getGetApiVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetApiVersion",
      requestType = api.gravity.types.Types.Void.class,
      responseType = api.gravity.types.Types.APIVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.types.Types.APIVersionResponse> getGetApiVersionMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Void, api.gravity.types.Types.APIVersionResponse> getGetApiVersionMethod;
    if ((getGetApiVersionMethod = SystemServiceGrpc.getGetApiVersionMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetApiVersionMethod = SystemServiceGrpc.getGetApiVersionMethod) == null) {
          SystemServiceGrpc.getGetApiVersionMethod = getGetApiVersionMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Void, api.gravity.types.Types.APIVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetApiVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.APIVersionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetApiVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.types.Types.StringResponse> getGetApiVersionInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetApiVersionInfo",
      requestType = api.gravity.types.Types.Void.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Void,
      api.gravity.types.Types.StringResponse> getGetApiVersionInfoMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Void, api.gravity.types.Types.StringResponse> getGetApiVersionInfoMethod;
    if ((getGetApiVersionInfoMethod = SystemServiceGrpc.getGetApiVersionInfoMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetApiVersionInfoMethod = SystemServiceGrpc.getGetApiVersionInfoMethod) == null) {
          SystemServiceGrpc.getGetApiVersionInfoMethod = getGetApiVersionInfoMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Void, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetApiVersionInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetApiVersionInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetDeviceNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeviceName",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetDeviceNameMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetDeviceNameMethod;
    if ((getGetDeviceNameMethod = SystemServiceGrpc.getGetDeviceNameMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetDeviceNameMethod = SystemServiceGrpc.getGetDeviceNameMethod) == null) {
          SystemServiceGrpc.getGetDeviceNameMethod = getGetDeviceNameMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeviceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDeviceNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetSocModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSocModel",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetSocModelMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetSocModelMethod;
    if ((getGetSocModelMethod = SystemServiceGrpc.getGetSocModelMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetSocModelMethod = SystemServiceGrpc.getGetSocModelMethod) == null) {
          SystemServiceGrpc.getGetSocModelMethod = getGetSocModelMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSocModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetSocModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetSocVendorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSocVendor",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetSocVendorMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetSocVendorMethod;
    if ((getGetSocVendorMethod = SystemServiceGrpc.getGetSocVendorMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetSocVendorMethod = SystemServiceGrpc.getGetSocVendorMethod) == null) {
          SystemServiceGrpc.getGetSocVendorMethod = getGetSocVendorMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSocVendor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetSocVendorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetBoardModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBoardModel",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetBoardModelMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetBoardModelMethod;
    if ((getGetBoardModelMethod = SystemServiceGrpc.getGetBoardModelMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetBoardModelMethod = SystemServiceGrpc.getGetBoardModelMethod) == null) {
          SystemServiceGrpc.getGetBoardModelMethod = getGetBoardModelMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBoardModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBoardModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetBoardVendorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBoardVendor",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetBoardVendorMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetBoardVendorMethod;
    if ((getGetBoardVendorMethod = SystemServiceGrpc.getGetBoardVendorMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetBoardVendorMethod = SystemServiceGrpc.getGetBoardVendorMethod) == null) {
          SystemServiceGrpc.getGetBoardVendorMethod = getGetBoardVendorMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBoardVendor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBoardVendorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetHardwareVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHardwareVersion",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetHardwareVersionMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetHardwareVersionMethod;
    if ((getGetHardwareVersionMethod = SystemServiceGrpc.getGetHardwareVersionMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetHardwareVersionMethod = SystemServiceGrpc.getGetHardwareVersionMethod) == null) {
          SystemServiceGrpc.getGetHardwareVersionMethod = getGetHardwareVersionMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHardwareVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetHardwareVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetHardwareModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHardwareModel",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetHardwareModelMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetHardwareModelMethod;
    if ((getGetHardwareModelMethod = SystemServiceGrpc.getGetHardwareModelMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetHardwareModelMethod = SystemServiceGrpc.getGetHardwareModelMethod) == null) {
          SystemServiceGrpc.getGetHardwareModelMethod = getGetHardwareModelMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHardwareModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetHardwareModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetSystemUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSystemUuid",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetSystemUuidMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetSystemUuidMethod;
    if ((getGetSystemUuidMethod = SystemServiceGrpc.getGetSystemUuidMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetSystemUuidMethod = SystemServiceGrpc.getGetSystemUuidMethod) == null) {
          SystemServiceGrpc.getGetSystemUuidMethod = getGetSystemUuidMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSystemUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetSystemUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetBoardSerialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBoardSerial",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetBoardSerialMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetBoardSerialMethod;
    if ((getGetBoardSerialMethod = SystemServiceGrpc.getGetBoardSerialMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetBoardSerialMethod = SystemServiceGrpc.getGetBoardSerialMethod) == null) {
          SystemServiceGrpc.getGetBoardSerialMethod = getGetBoardSerialMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBoardSerial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBoardSerialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetCpuSerialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCpuSerial",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetCpuSerialMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetCpuSerialMethod;
    if ((getGetCpuSerialMethod = SystemServiceGrpc.getGetCpuSerialMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetCpuSerialMethod = SystemServiceGrpc.getGetCpuSerialMethod) == null) {
          SystemServiceGrpc.getGetCpuSerialMethod = getGetCpuSerialMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCpuSerial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCpuSerialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetMachineIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMachineId",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetMachineIdMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetMachineIdMethod;
    if ((getGetMachineIdMethod = SystemServiceGrpc.getGetMachineIdMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetMachineIdMethod = SystemServiceGrpc.getGetMachineIdMethod) == null) {
          SystemServiceGrpc.getGetMachineIdMethod = getGetMachineIdMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMachineId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMachineIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetArchitectureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArchitecture",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetArchitectureMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetArchitectureMethod;
    if ((getGetArchitectureMethod = SystemServiceGrpc.getGetArchitectureMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetArchitectureMethod = SystemServiceGrpc.getGetArchitectureMethod) == null) {
          SystemServiceGrpc.getGetArchitectureMethod = getGetArchitectureMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetArchitecture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetArchitectureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.UInt64Response> getGetTotalRAMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalRAM",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.UInt64Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.UInt64Response> getGetTotalRAMMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.UInt64Response> getGetTotalRAMMethod;
    if ((getGetTotalRAMMethod = SystemServiceGrpc.getGetTotalRAMMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetTotalRAMMethod = SystemServiceGrpc.getGetTotalRAMMethod) == null) {
          SystemServiceGrpc.getGetTotalRAMMethod = getGetTotalRAMMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.UInt64Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTotalRAM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.UInt64Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTotalRAMMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetCpuModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCpuModel",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetCpuModelMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetCpuModelMethod;
    if ((getGetCpuModelMethod = SystemServiceGrpc.getGetCpuModelMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetCpuModelMethod = SystemServiceGrpc.getGetCpuModelMethod) == null) {
          SystemServiceGrpc.getGetCpuModelMethod = getGetCpuModelMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCpuModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCpuModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.IntegerResponse> getGetCpuCoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCpuCores",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.IntegerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.IntegerResponse> getGetCpuCoresMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.IntegerResponse> getGetCpuCoresMethod;
    if ((getGetCpuCoresMethod = SystemServiceGrpc.getGetCpuCoresMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetCpuCoresMethod = SystemServiceGrpc.getGetCpuCoresMethod) == null) {
          SystemServiceGrpc.getGetCpuCoresMethod = getGetCpuCoresMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.IntegerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCpuCores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.IntegerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCpuCoresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.IntegerResponse> getGetCpuThreadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCpuThreads",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.IntegerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.IntegerResponse> getGetCpuThreadsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.IntegerResponse> getGetCpuThreadsMethod;
    if ((getGetCpuThreadsMethod = SystemServiceGrpc.getGetCpuThreadsMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetCpuThreadsMethod = SystemServiceGrpc.getGetCpuThreadsMethod) == null) {
          SystemServiceGrpc.getGetCpuThreadsMethod = getGetCpuThreadsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.IntegerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCpuThreads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.IntegerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCpuThreadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.DoubleResponse> getGetCpuMinMhzMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCpuMinMhz",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.DoubleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.DoubleResponse> getGetCpuMinMhzMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.DoubleResponse> getGetCpuMinMhzMethod;
    if ((getGetCpuMinMhzMethod = SystemServiceGrpc.getGetCpuMinMhzMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetCpuMinMhzMethod = SystemServiceGrpc.getGetCpuMinMhzMethod) == null) {
          SystemServiceGrpc.getGetCpuMinMhzMethod = getGetCpuMinMhzMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.DoubleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCpuMinMhz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.DoubleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCpuMinMhzMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.DoubleResponse> getGetCpuMaxMhzMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCpuMaxMhz",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.DoubleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.DoubleResponse> getGetCpuMaxMhzMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.DoubleResponse> getGetCpuMaxMhzMethod;
    if ((getGetCpuMaxMhzMethod = SystemServiceGrpc.getGetCpuMaxMhzMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetCpuMaxMhzMethod = SystemServiceGrpc.getGetCpuMaxMhzMethod) == null) {
          SystemServiceGrpc.getGetCpuMaxMhzMethod = getGetCpuMaxMhzMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.DoubleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCpuMaxMhz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.DoubleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCpuMaxMhzMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetOsNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOsName",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetOsNameMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetOsNameMethod;
    if ((getGetOsNameMethod = SystemServiceGrpc.getGetOsNameMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetOsNameMethod = SystemServiceGrpc.getGetOsNameMethod) == null) {
          SystemServiceGrpc.getGetOsNameMethod = getGetOsNameMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOsName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOsNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetOsVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOsVersion",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetOsVersionMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetOsVersionMethod;
    if ((getGetOsVersionMethod = SystemServiceGrpc.getGetOsVersionMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetOsVersionMethod = SystemServiceGrpc.getGetOsVersionMethod) == null) {
          SystemServiceGrpc.getGetOsVersionMethod = getGetOsVersionMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOsVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOsVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetOsRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOsRevision",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetOsRevisionMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetOsRevisionMethod;
    if ((getGetOsRevisionMethod = SystemServiceGrpc.getGetOsRevisionMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetOsRevisionMethod = SystemServiceGrpc.getGetOsRevisionMethod) == null) {
          SystemServiceGrpc.getGetOsRevisionMethod = getGetOsRevisionMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOsRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOsRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetRuntimeVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRuntimeVersion",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetRuntimeVersionMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetRuntimeVersionMethod;
    if ((getGetRuntimeVersionMethod = SystemServiceGrpc.getGetRuntimeVersionMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetRuntimeVersionMethod = SystemServiceGrpc.getGetRuntimeVersionMethod) == null) {
          SystemServiceGrpc.getGetRuntimeVersionMethod = getGetRuntimeVersionMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRuntimeVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRuntimeVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetRuntimeBuildDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRuntimeBuildDate",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetRuntimeBuildDateMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetRuntimeBuildDateMethod;
    if ((getGetRuntimeBuildDateMethod = SystemServiceGrpc.getGetRuntimeBuildDateMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetRuntimeBuildDateMethod = SystemServiceGrpc.getGetRuntimeBuildDateMethod) == null) {
          SystemServiceGrpc.getGetRuntimeBuildDateMethod = getGetRuntimeBuildDateMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRuntimeBuildDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRuntimeBuildDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetDistroMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDistro",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetDistroMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetDistroMethod;
    if ((getGetDistroMethod = SystemServiceGrpc.getGetDistroMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetDistroMethod = SystemServiceGrpc.getGetDistroMethod) == null) {
          SystemServiceGrpc.getGetDistroMethod = getGetDistroMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDistro"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDistroMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetDistroVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDistroVersion",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetDistroVersionMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetDistroVersionMethod;
    if ((getGetDistroVersionMethod = SystemServiceGrpc.getGetDistroVersionMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetDistroVersionMethod = SystemServiceGrpc.getGetDistroVersionMethod) == null) {
          SystemServiceGrpc.getGetDistroVersionMethod = getGetDistroVersionMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDistroVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDistroVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetKernelVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKernelVersion",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.StringResponse> getGetKernelVersionMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse> getGetKernelVersionMethod;
    if ((getGetKernelVersionMethod = SystemServiceGrpc.getGetKernelVersionMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetKernelVersionMethod = SystemServiceGrpc.getGetKernelVersionMethod) == null) {
          SystemServiceGrpc.getGetKernelVersionMethod = getGetKernelVersionMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKernelVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.StringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetKernelVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse> getGetMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetrics",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse> getGetMetricsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse> getGetMetricsMethod;
    if ((getGetMetricsMethod = SystemServiceGrpc.getGetMetricsMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getGetMetricsMethod = SystemServiceGrpc.getGetMetricsMethod) == null) {
          SystemServiceGrpc.getGetMetricsMethod = getGetMetricsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getAllowUntrustedAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllowUntrustedApps",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getAllowUntrustedAppsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getAllowUntrustedAppsMethod;
    if ((getAllowUntrustedAppsMethod = SystemServiceGrpc.getAllowUntrustedAppsMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getAllowUntrustedAppsMethod = SystemServiceGrpc.getAllowUntrustedAppsMethod) == null) {
          SystemServiceGrpc.getAllowUntrustedAppsMethod = getAllowUntrustedAppsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllowUntrustedApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAllowUntrustedAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisallowUntrustedAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisallowUntrustedApps",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisallowUntrustedAppsMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getDisallowUntrustedAppsMethod;
    if ((getDisallowUntrustedAppsMethod = SystemServiceGrpc.getDisallowUntrustedAppsMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getDisallowUntrustedAppsMethod = SystemServiceGrpc.getDisallowUntrustedAppsMethod) == null) {
          SystemServiceGrpc.getDisallowUntrustedAppsMethod = getDisallowUntrustedAppsMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisallowUntrustedApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisallowUntrustedAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsUntrustedAppsAllowedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsUntrustedAppsAllowed",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsUntrustedAppsAllowedMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getIsUntrustedAppsAllowedMethod;
    if ((getIsUntrustedAppsAllowedMethod = SystemServiceGrpc.getIsUntrustedAppsAllowedMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getIsUntrustedAppsAllowedMethod = SystemServiceGrpc.getIsUntrustedAppsAllowedMethod) == null) {
          SystemServiceGrpc.getIsUntrustedAppsAllowedMethod = getIsUntrustedAppsAllowedMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsUntrustedAppsAllowed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsUntrustedAppsAllowedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableRebootOnFailureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableRebootOnFailure",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableRebootOnFailureMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getEnableRebootOnFailureMethod;
    if ((getEnableRebootOnFailureMethod = SystemServiceGrpc.getEnableRebootOnFailureMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getEnableRebootOnFailureMethod = SystemServiceGrpc.getEnableRebootOnFailureMethod) == null) {
          SystemServiceGrpc.getEnableRebootOnFailureMethod = getEnableRebootOnFailureMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableRebootOnFailure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableRebootOnFailureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableRebootOnFailureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableRebootOnFailure",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableRebootOnFailureMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getDisableRebootOnFailureMethod;
    if ((getDisableRebootOnFailureMethod = SystemServiceGrpc.getDisableRebootOnFailureMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getDisableRebootOnFailureMethod = SystemServiceGrpc.getDisableRebootOnFailureMethod) == null) {
          SystemServiceGrpc.getDisableRebootOnFailureMethod = getDisableRebootOnFailureMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableRebootOnFailure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableRebootOnFailureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsRebootOnFailureEnabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsRebootOnFailureEnabled",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsRebootOnFailureEnabledMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getIsRebootOnFailureEnabledMethod;
    if ((getIsRebootOnFailureEnabledMethod = SystemServiceGrpc.getIsRebootOnFailureEnabledMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getIsRebootOnFailureEnabledMethod = SystemServiceGrpc.getIsRebootOnFailureEnabledMethod) == null) {
          SystemServiceGrpc.getIsRebootOnFailureEnabledMethod = getIsRebootOnFailureEnabledMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsRebootOnFailureEnabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsRebootOnFailureEnabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableDeveModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableDeveMode",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableDeveModeMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getEnableDeveModeMethod;
    if ((getEnableDeveModeMethod = SystemServiceGrpc.getEnableDeveModeMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getEnableDeveModeMethod = SystemServiceGrpc.getEnableDeveModeMethod) == null) {
          SystemServiceGrpc.getEnableDeveModeMethod = getEnableDeveModeMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableDeveMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableDeveModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableDevModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableDevMode",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableDevModeMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getDisableDevModeMethod;
    if ((getDisableDevModeMethod = SystemServiceGrpc.getDisableDevModeMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getDisableDevModeMethod = SystemServiceGrpc.getDisableDevModeMethod) == null) {
          SystemServiceGrpc.getDisableDevModeMethod = getDisableDevModeMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableDevMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableDevModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsDevModeEnabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsDevModeEnabled",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsDevModeEnabledMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getIsDevModeEnabledMethod;
    if ((getIsDevModeEnabledMethod = SystemServiceGrpc.getIsDevModeEnabledMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getIsDevModeEnabledMethod = SystemServiceGrpc.getIsDevModeEnabledMethod) == null) {
          SystemServiceGrpc.getIsDevModeEnabledMethod = getIsDevModeEnabledMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDevModeEnabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsDevModeEnabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableSSHServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableSSHServer",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getEnableSSHServerMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getEnableSSHServerMethod;
    if ((getEnableSSHServerMethod = SystemServiceGrpc.getEnableSSHServerMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getEnableSSHServerMethod = SystemServiceGrpc.getEnableSSHServerMethod) == null) {
          SystemServiceGrpc.getEnableSSHServerMethod = getEnableSSHServerMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableSSHServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableSSHServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableSSHServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableSSHServer",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getDisableSSHServerMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getDisableSSHServerMethod;
    if ((getDisableSSHServerMethod = SystemServiceGrpc.getDisableSSHServerMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getDisableSSHServerMethod = SystemServiceGrpc.getDisableSSHServerMethod) == null) {
          SystemServiceGrpc.getDisableSSHServerMethod = getDisableSSHServerMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableSSHServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableSSHServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsSSHServerEnabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsSSHServerEnabled",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getIsSSHServerEnabledMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getIsSSHServerEnabledMethod;
    if ((getIsSSHServerEnabledMethod = SystemServiceGrpc.getIsSSHServerEnabledMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getIsSSHServerEnabledMethod = SystemServiceGrpc.getIsSSHServerEnabledMethod) == null) {
          SystemServiceGrpc.getIsSSHServerEnabledMethod = getIsSSHServerEnabledMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsSSHServerEnabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsSSHServerEnabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Attach",
      requestType = api.gravity.types.Types.Empty.class,
      responseType = api.gravity.types.Types.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.gravity.types.Types.Empty,
      api.gravity.types.Types.BooleanResponse> getAttachMethod() {
    io.grpc.MethodDescriptor<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse> getAttachMethod;
    if ((getAttachMethod = SystemServiceGrpc.getAttachMethod) == null) {
      synchronized (SystemServiceGrpc.class) {
        if ((getAttachMethod = SystemServiceGrpc.getAttachMethod) == null) {
          SystemServiceGrpc.getAttachMethod = getAttachMethod =
              io.grpc.MethodDescriptor.<api.gravity.types.Types.Empty, api.gravity.types.Types.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Attach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  api.gravity.types.Types.BooleanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAttachMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SystemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SystemServiceStub>() {
        @java.lang.Override
        public SystemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SystemServiceStub(channel, callOptions);
        }
      };
    return SystemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SystemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SystemServiceBlockingStub>() {
        @java.lang.Override
        public SystemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SystemServiceBlockingStub(channel, callOptions);
        }
      };
    return SystemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SystemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SystemServiceFutureStub>() {
        @java.lang.Override
        public SystemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SystemServiceFutureStub(channel, callOptions);
        }
      };
    return SystemServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get API Version and Revision
     * </pre>
     */
    default void getApiVersion(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.APIVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetApiVersionMethod(), responseObserver);
    }

    /**
     */
    default void getApiVersionInfo(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetApiVersionInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the user-friendly device name (e.g., hostname or descriptive identifier)
     * </pre>
     */
    default void getDeviceName(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceNameMethod(), responseObserver);
    }

    /**
     */
    default void getSocModel(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSocModelMethod(), responseObserver);
    }

    /**
     */
    default void getSocVendor(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSocVendorMethod(), responseObserver);
    }

    /**
     */
    default void getBoardModel(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBoardModelMethod(), responseObserver);
    }

    /**
     */
    default void getBoardVendor(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBoardVendorMethod(), responseObserver);
    }

    /**
     */
    default void getHardwareVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHardwareVersionMethod(), responseObserver);
    }

    /**
     */
    default void getHardwareModel(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHardwareModelMethod(), responseObserver);
    }

    /**
     */
    default void getSystemUuid(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSystemUuidMethod(), responseObserver);
    }

    /**
     */
    default void getBoardSerial(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBoardSerialMethod(), responseObserver);
    }

    /**
     */
    default void getCpuSerial(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCpuSerialMethod(), responseObserver);
    }

    /**
     */
    default void getMachineId(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMachineIdMethod(), responseObserver);
    }

    /**
     */
    default void getArchitecture(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetArchitectureMethod(), responseObserver);
    }

    /**
     */
    default void getTotalRAM(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.UInt64Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTotalRAMMethod(), responseObserver);
    }

    /**
     */
    default void getCpuModel(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCpuModelMethod(), responseObserver);
    }

    /**
     */
    default void getCpuCores(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.IntegerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCpuCoresMethod(), responseObserver);
    }

    /**
     */
    default void getCpuThreads(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.IntegerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCpuThreadsMethod(), responseObserver);
    }

    /**
     */
    default void getCpuMinMhz(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.DoubleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCpuMinMhzMethod(), responseObserver);
    }

    /**
     */
    default void getCpuMaxMhz(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.DoubleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCpuMaxMhzMethod(), responseObserver);
    }

    /**
     * <pre>
     * Logic OS
     * </pre>
     */
    default void getOsName(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOsNameMethod(), responseObserver);
    }

    /**
     */
    default void getOsVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOsVersionMethod(), responseObserver);
    }

    /**
     */
    default void getOsRevision(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOsRevisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runtime
     * </pre>
     */
    default void getRuntimeVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRuntimeVersionMethod(), responseObserver);
    }

    /**
     */
    default void getRuntimeBuildDate(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRuntimeBuildDateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Linux Distro
     * </pre>
     */
    default void getDistro(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDistroMethod(), responseObserver);
    }

    /**
     */
    default void getDistroVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDistroVersionMethod(), responseObserver);
    }

    /**
     */
    default void getKernelVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKernelVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * System Metrics
     * </pre>
     */
    default void getMetrics(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Untrusted apps installation
     * </pre>
     */
    default void allowUntrustedApps(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllowUntrustedAppsMethod(), responseObserver);
    }

    /**
     */
    default void disallowUntrustedApps(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisallowUntrustedAppsMethod(), responseObserver);
    }

    /**
     */
    default void isUntrustedAppsAllowed(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsUntrustedAppsAllowedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reboot on failure
     * </pre>
     */
    default void enableRebootOnFailure(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableRebootOnFailureMethod(), responseObserver);
    }

    /**
     */
    default void disableRebootOnFailure(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableRebootOnFailureMethod(), responseObserver);
    }

    /**
     */
    default void isRebootOnFailureEnabled(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsRebootOnFailureEnabledMethod(), responseObserver);
    }

    /**
     * <pre>
     * Development mode enable/disable
     * </pre>
     */
    default void enableDeveMode(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableDeveModeMethod(), responseObserver);
    }

    /**
     */
    default void disableDevMode(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableDevModeMethod(), responseObserver);
    }

    /**
     */
    default void isDevModeEnabled(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsDevModeEnabledMethod(), responseObserver);
    }

    /**
     * <pre>
     * SSH Server enable/disable
     * </pre>
     */
    default void enableSSHServer(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableSSHServerMethod(), responseObserver);
    }

    /**
     */
    default void disableSSHServer(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableSSHServerMethod(), responseObserver);
    }

    /**
     */
    default void isSSHServerEnabled(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsSSHServerEnabledMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attach — mandatory environment binding call.
     * Every app must call this within the launch timeout or Gravity kills the process.
     * Allowed for any installed app regardless of permissions declared in identity.json.
     * </pre>
     */
    default void attach(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttachMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SystemService.
   */
  public static abstract class SystemServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SystemServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SystemService.
   */
  public static final class SystemServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SystemServiceStub> {
    private SystemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get API Version and Revision
     * </pre>
     */
    public void getApiVersion(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.APIVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetApiVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getApiVersionInfo(api.gravity.types.Types.Void request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetApiVersionInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the user-friendly device name (e.g., hostname or descriptive identifier)
     * </pre>
     */
    public void getDeviceName(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSocModel(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSocModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSocVendor(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSocVendorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBoardModel(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBoardModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBoardVendor(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBoardVendorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHardwareVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHardwareVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHardwareModel(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHardwareModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSystemUuid(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSystemUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBoardSerial(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBoardSerialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCpuSerial(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCpuSerialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMachineId(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMachineIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArchitecture(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetArchitectureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTotalRAM(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.UInt64Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTotalRAMMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCpuModel(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCpuModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCpuCores(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.IntegerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCpuCoresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCpuThreads(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.IntegerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCpuThreadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCpuMinMhz(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.DoubleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCpuMinMhzMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCpuMaxMhz(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.DoubleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCpuMaxMhzMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Logic OS
     * </pre>
     */
    public void getOsName(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOsNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOsVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOsVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOsRevision(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOsRevisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runtime
     * </pre>
     */
    public void getRuntimeVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRuntimeVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRuntimeBuildDate(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRuntimeBuildDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Linux Distro
     * </pre>
     */
    public void getDistro(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDistroMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDistroVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDistroVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKernelVersion(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKernelVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * System Metrics
     * </pre>
     */
    public void getMetrics(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Untrusted apps installation
     * </pre>
     */
    public void allowUntrustedApps(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllowUntrustedAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disallowUntrustedApps(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisallowUntrustedAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isUntrustedAppsAllowed(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsUntrustedAppsAllowedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reboot on failure
     * </pre>
     */
    public void enableRebootOnFailure(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableRebootOnFailureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableRebootOnFailure(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableRebootOnFailureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isRebootOnFailureEnabled(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsRebootOnFailureEnabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Development mode enable/disable
     * </pre>
     */
    public void enableDeveMode(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableDeveModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableDevMode(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableDevModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isDevModeEnabled(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsDevModeEnabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SSH Server enable/disable
     * </pre>
     */
    public void enableSSHServer(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableSSHServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableSSHServer(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableSSHServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isSSHServerEnabled(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsSSHServerEnabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attach — mandatory environment binding call.
     * Every app must call this within the launch timeout or Gravity kills the process.
     * Allowed for any installed app regardless of permissions declared in identity.json.
     * </pre>
     */
    public void attach(api.gravity.types.Types.Empty request,
        io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttachMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SystemService.
   */
  public static final class SystemServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SystemServiceBlockingStub> {
    private SystemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get API Version and Revision
     * </pre>
     */
    public api.gravity.types.Types.APIVersionResponse getApiVersion(api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetApiVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getApiVersionInfo(api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetApiVersionInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the user-friendly device name (e.g., hostname or descriptive identifier)
     * </pre>
     */
    public api.gravity.types.Types.StringResponse getDeviceName(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getSocModel(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSocModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getSocVendor(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSocVendorMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getBoardModel(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBoardModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getBoardVendor(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBoardVendorMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getHardwareVersion(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHardwareVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getHardwareModel(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHardwareModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getSystemUuid(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSystemUuidMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getBoardSerial(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBoardSerialMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getCpuSerial(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCpuSerialMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getMachineId(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMachineIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getArchitecture(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetArchitectureMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.UInt64Response getTotalRAM(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTotalRAMMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getCpuModel(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCpuModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.IntegerResponse getCpuCores(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCpuCoresMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.IntegerResponse getCpuThreads(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCpuThreadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.DoubleResponse getCpuMinMhz(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCpuMinMhzMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.DoubleResponse getCpuMaxMhz(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCpuMaxMhzMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Logic OS
     * </pre>
     */
    public api.gravity.types.Types.StringResponse getOsName(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOsNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getOsVersion(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOsVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getOsRevision(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOsRevisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runtime
     * </pre>
     */
    public api.gravity.types.Types.StringResponse getRuntimeVersion(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRuntimeVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getRuntimeBuildDate(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRuntimeBuildDateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Linux Distro
     * </pre>
     */
    public api.gravity.types.Types.StringResponse getDistro(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDistroMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getDistroVersion(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDistroVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.StringResponse getKernelVersion(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKernelVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * System Metrics
     * </pre>
     */
    public api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse getMetrics(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Untrusted apps installation
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse allowUntrustedApps(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllowUntrustedAppsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disallowUntrustedApps(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisallowUntrustedAppsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse isUntrustedAppsAllowed(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsUntrustedAppsAllowedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reboot on failure
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse enableRebootOnFailure(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableRebootOnFailureMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disableRebootOnFailure(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableRebootOnFailureMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse isRebootOnFailureEnabled(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsRebootOnFailureEnabledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Development mode enable/disable
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse enableDeveMode(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableDeveModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disableDevMode(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableDevModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse isDevModeEnabled(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsDevModeEnabledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SSH Server enable/disable
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse enableSSHServer(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableSSHServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse disableSSHServer(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableSSHServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.gravity.types.Types.BooleanResponse isSSHServerEnabled(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsSSHServerEnabledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attach — mandatory environment binding call.
     * Every app must call this within the launch timeout or Gravity kills the process.
     * Allowed for any installed app regardless of permissions declared in identity.json.
     * </pre>
     */
    public api.gravity.types.Types.BooleanResponse attach(api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttachMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SystemService.
   */
  public static final class SystemServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SystemServiceFutureStub> {
    private SystemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get API Version and Revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.APIVersionResponse> getApiVersion(
        api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetApiVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getApiVersionInfo(
        api.gravity.types.Types.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetApiVersionInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the user-friendly device name (e.g., hostname or descriptive identifier)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getDeviceName(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getSocModel(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSocModelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getSocVendor(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSocVendorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getBoardModel(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBoardModelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getBoardVendor(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBoardVendorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getHardwareVersion(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHardwareVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getHardwareModel(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHardwareModelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getSystemUuid(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSystemUuidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getBoardSerial(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBoardSerialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getCpuSerial(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCpuSerialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getMachineId(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMachineIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getArchitecture(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetArchitectureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.UInt64Response> getTotalRAM(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTotalRAMMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getCpuModel(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCpuModelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.IntegerResponse> getCpuCores(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCpuCoresMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.IntegerResponse> getCpuThreads(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCpuThreadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.DoubleResponse> getCpuMinMhz(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCpuMinMhzMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.DoubleResponse> getCpuMaxMhz(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCpuMaxMhzMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Logic OS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getOsName(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOsNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getOsVersion(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOsVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getOsRevision(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOsRevisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runtime
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getRuntimeVersion(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRuntimeVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getRuntimeBuildDate(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRuntimeBuildDateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Linux Distro
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getDistro(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDistroMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getDistroVersion(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDistroVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.StringResponse> getKernelVersion(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKernelVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * System Metrics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse> getMetrics(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Untrusted apps installation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> allowUntrustedApps(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllowUntrustedAppsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disallowUntrustedApps(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisallowUntrustedAppsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> isUntrustedAppsAllowed(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsUntrustedAppsAllowedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reboot on failure
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> enableRebootOnFailure(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableRebootOnFailureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disableRebootOnFailure(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableRebootOnFailureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> isRebootOnFailureEnabled(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsRebootOnFailureEnabledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Development mode enable/disable
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> enableDeveMode(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableDeveModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disableDevMode(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableDevModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> isDevModeEnabled(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsDevModeEnabledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SSH Server enable/disable
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> enableSSHServer(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableSSHServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> disableSSHServer(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableSSHServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> isSSHServerEnabled(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsSSHServerEnabledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attach — mandatory environment binding call.
     * Every app must call this within the launch timeout or Gravity kills the process.
     * Allowed for any installed app regardless of permissions declared in identity.json.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.gravity.types.Types.BooleanResponse> attach(
        api.gravity.types.Types.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttachMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_API_VERSION = 0;
  private static final int METHODID_GET_API_VERSION_INFO = 1;
  private static final int METHODID_GET_DEVICE_NAME = 2;
  private static final int METHODID_GET_SOC_MODEL = 3;
  private static final int METHODID_GET_SOC_VENDOR = 4;
  private static final int METHODID_GET_BOARD_MODEL = 5;
  private static final int METHODID_GET_BOARD_VENDOR = 6;
  private static final int METHODID_GET_HARDWARE_VERSION = 7;
  private static final int METHODID_GET_HARDWARE_MODEL = 8;
  private static final int METHODID_GET_SYSTEM_UUID = 9;
  private static final int METHODID_GET_BOARD_SERIAL = 10;
  private static final int METHODID_GET_CPU_SERIAL = 11;
  private static final int METHODID_GET_MACHINE_ID = 12;
  private static final int METHODID_GET_ARCHITECTURE = 13;
  private static final int METHODID_GET_TOTAL_RAM = 14;
  private static final int METHODID_GET_CPU_MODEL = 15;
  private static final int METHODID_GET_CPU_CORES = 16;
  private static final int METHODID_GET_CPU_THREADS = 17;
  private static final int METHODID_GET_CPU_MIN_MHZ = 18;
  private static final int METHODID_GET_CPU_MAX_MHZ = 19;
  private static final int METHODID_GET_OS_NAME = 20;
  private static final int METHODID_GET_OS_VERSION = 21;
  private static final int METHODID_GET_OS_REVISION = 22;
  private static final int METHODID_GET_RUNTIME_VERSION = 23;
  private static final int METHODID_GET_RUNTIME_BUILD_DATE = 24;
  private static final int METHODID_GET_DISTRO = 25;
  private static final int METHODID_GET_DISTRO_VERSION = 26;
  private static final int METHODID_GET_KERNEL_VERSION = 27;
  private static final int METHODID_GET_METRICS = 28;
  private static final int METHODID_ALLOW_UNTRUSTED_APPS = 29;
  private static final int METHODID_DISALLOW_UNTRUSTED_APPS = 30;
  private static final int METHODID_IS_UNTRUSTED_APPS_ALLOWED = 31;
  private static final int METHODID_ENABLE_REBOOT_ON_FAILURE = 32;
  private static final int METHODID_DISABLE_REBOOT_ON_FAILURE = 33;
  private static final int METHODID_IS_REBOOT_ON_FAILURE_ENABLED = 34;
  private static final int METHODID_ENABLE_DEVE_MODE = 35;
  private static final int METHODID_DISABLE_DEV_MODE = 36;
  private static final int METHODID_IS_DEV_MODE_ENABLED = 37;
  private static final int METHODID_ENABLE_SSHSERVER = 38;
  private static final int METHODID_DISABLE_SSHSERVER = 39;
  private static final int METHODID_IS_SSHSERVER_ENABLED = 40;
  private static final int METHODID_ATTACH = 41;

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
        case METHODID_GET_API_VERSION:
          serviceImpl.getApiVersion((api.gravity.types.Types.Void) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.APIVersionResponse>) responseObserver);
          break;
        case METHODID_GET_API_VERSION_INFO:
          serviceImpl.getApiVersionInfo((api.gravity.types.Types.Void) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICE_NAME:
          serviceImpl.getDeviceName((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_SOC_MODEL:
          serviceImpl.getSocModel((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_SOC_VENDOR:
          serviceImpl.getSocVendor((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_BOARD_MODEL:
          serviceImpl.getBoardModel((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_BOARD_VENDOR:
          serviceImpl.getBoardVendor((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_HARDWARE_VERSION:
          serviceImpl.getHardwareVersion((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_HARDWARE_MODEL:
          serviceImpl.getHardwareModel((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_SYSTEM_UUID:
          serviceImpl.getSystemUuid((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_BOARD_SERIAL:
          serviceImpl.getBoardSerial((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_CPU_SERIAL:
          serviceImpl.getCpuSerial((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_MACHINE_ID:
          serviceImpl.getMachineId((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_ARCHITECTURE:
          serviceImpl.getArchitecture((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_TOTAL_RAM:
          serviceImpl.getTotalRAM((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.UInt64Response>) responseObserver);
          break;
        case METHODID_GET_CPU_MODEL:
          serviceImpl.getCpuModel((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_CPU_CORES:
          serviceImpl.getCpuCores((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.IntegerResponse>) responseObserver);
          break;
        case METHODID_GET_CPU_THREADS:
          serviceImpl.getCpuThreads((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.IntegerResponse>) responseObserver);
          break;
        case METHODID_GET_CPU_MIN_MHZ:
          serviceImpl.getCpuMinMhz((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.DoubleResponse>) responseObserver);
          break;
        case METHODID_GET_CPU_MAX_MHZ:
          serviceImpl.getCpuMaxMhz((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.DoubleResponse>) responseObserver);
          break;
        case METHODID_GET_OS_NAME:
          serviceImpl.getOsName((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_OS_VERSION:
          serviceImpl.getOsVersion((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_OS_REVISION:
          serviceImpl.getOsRevision((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_RUNTIME_VERSION:
          serviceImpl.getRuntimeVersion((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_RUNTIME_BUILD_DATE:
          serviceImpl.getRuntimeBuildDate((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_DISTRO:
          serviceImpl.getDistro((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_DISTRO_VERSION:
          serviceImpl.getDistroVersion((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_KERNEL_VERSION:
          serviceImpl.getKernelVersion((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.StringResponse>) responseObserver);
          break;
        case METHODID_GET_METRICS:
          serviceImpl.getMetrics((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse>) responseObserver);
          break;
        case METHODID_ALLOW_UNTRUSTED_APPS:
          serviceImpl.allowUntrustedApps((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISALLOW_UNTRUSTED_APPS:
          serviceImpl.disallowUntrustedApps((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_IS_UNTRUSTED_APPS_ALLOWED:
          serviceImpl.isUntrustedAppsAllowed((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_ENABLE_REBOOT_ON_FAILURE:
          serviceImpl.enableRebootOnFailure((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISABLE_REBOOT_ON_FAILURE:
          serviceImpl.disableRebootOnFailure((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_IS_REBOOT_ON_FAILURE_ENABLED:
          serviceImpl.isRebootOnFailureEnabled((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_ENABLE_DEVE_MODE:
          serviceImpl.enableDeveMode((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISABLE_DEV_MODE:
          serviceImpl.disableDevMode((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_IS_DEV_MODE_ENABLED:
          serviceImpl.isDevModeEnabled((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_ENABLE_SSHSERVER:
          serviceImpl.enableSSHServer((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_DISABLE_SSHSERVER:
          serviceImpl.disableSSHServer((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_IS_SSHSERVER_ENABLED:
          serviceImpl.isSSHServerEnabled((api.gravity.types.Types.Empty) request,
              (io.grpc.stub.StreamObserver<api.gravity.types.Types.BooleanResponse>) responseObserver);
          break;
        case METHODID_ATTACH:
          serviceImpl.attach((api.gravity.types.Types.Empty) request,
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
          getGetApiVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Void,
              api.gravity.types.Types.APIVersionResponse>(
                service, METHODID_GET_API_VERSION)))
        .addMethod(
          getGetApiVersionInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Void,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_API_VERSION_INFO)))
        .addMethod(
          getGetDeviceNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_DEVICE_NAME)))
        .addMethod(
          getGetSocModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_SOC_MODEL)))
        .addMethod(
          getGetSocVendorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_SOC_VENDOR)))
        .addMethod(
          getGetBoardModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_BOARD_MODEL)))
        .addMethod(
          getGetBoardVendorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_BOARD_VENDOR)))
        .addMethod(
          getGetHardwareVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_HARDWARE_VERSION)))
        .addMethod(
          getGetHardwareModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_HARDWARE_MODEL)))
        .addMethod(
          getGetSystemUuidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_SYSTEM_UUID)))
        .addMethod(
          getGetBoardSerialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_BOARD_SERIAL)))
        .addMethod(
          getGetCpuSerialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_CPU_SERIAL)))
        .addMethod(
          getGetMachineIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_MACHINE_ID)))
        .addMethod(
          getGetArchitectureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_ARCHITECTURE)))
        .addMethod(
          getGetTotalRAMMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.UInt64Response>(
                service, METHODID_GET_TOTAL_RAM)))
        .addMethod(
          getGetCpuModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_CPU_MODEL)))
        .addMethod(
          getGetCpuCoresMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.IntegerResponse>(
                service, METHODID_GET_CPU_CORES)))
        .addMethod(
          getGetCpuThreadsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.IntegerResponse>(
                service, METHODID_GET_CPU_THREADS)))
        .addMethod(
          getGetCpuMinMhzMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.DoubleResponse>(
                service, METHODID_GET_CPU_MIN_MHZ)))
        .addMethod(
          getGetCpuMaxMhzMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.DoubleResponse>(
                service, METHODID_GET_CPU_MAX_MHZ)))
        .addMethod(
          getGetOsNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_OS_NAME)))
        .addMethod(
          getGetOsVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_OS_VERSION)))
        .addMethod(
          getGetOsRevisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_OS_REVISION)))
        .addMethod(
          getGetRuntimeVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_RUNTIME_VERSION)))
        .addMethod(
          getGetRuntimeBuildDateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_RUNTIME_BUILD_DATE)))
        .addMethod(
          getGetDistroMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_DISTRO)))
        .addMethod(
          getGetDistroVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_DISTRO_VERSION)))
        .addMethod(
          getGetKernelVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.StringResponse>(
                service, METHODID_GET_KERNEL_VERSION)))
        .addMethod(
          getGetMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.v26.SystemServiceOuterClass.MetricsInfoResponse>(
                service, METHODID_GET_METRICS)))
        .addMethod(
          getAllowUntrustedAppsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ALLOW_UNTRUSTED_APPS)))
        .addMethod(
          getDisallowUntrustedAppsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISALLOW_UNTRUSTED_APPS)))
        .addMethod(
          getIsUntrustedAppsAllowedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_IS_UNTRUSTED_APPS_ALLOWED)))
        .addMethod(
          getEnableRebootOnFailureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ENABLE_REBOOT_ON_FAILURE)))
        .addMethod(
          getDisableRebootOnFailureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISABLE_REBOOT_ON_FAILURE)))
        .addMethod(
          getIsRebootOnFailureEnabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_IS_REBOOT_ON_FAILURE_ENABLED)))
        .addMethod(
          getEnableDeveModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ENABLE_DEVE_MODE)))
        .addMethod(
          getDisableDevModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISABLE_DEV_MODE)))
        .addMethod(
          getIsDevModeEnabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_IS_DEV_MODE_ENABLED)))
        .addMethod(
          getEnableSSHServerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ENABLE_SSHSERVER)))
        .addMethod(
          getDisableSSHServerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_DISABLE_SSHSERVER)))
        .addMethod(
          getIsSSHServerEnabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_IS_SSHSERVER_ENABLED)))
        .addMethod(
          getAttachMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.gravity.types.Types.Empty,
              api.gravity.types.Types.BooleanResponse>(
                service, METHODID_ATTACH)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SystemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetApiVersionMethod())
              .addMethod(getGetApiVersionInfoMethod())
              .addMethod(getGetDeviceNameMethod())
              .addMethod(getGetSocModelMethod())
              .addMethod(getGetSocVendorMethod())
              .addMethod(getGetBoardModelMethod())
              .addMethod(getGetBoardVendorMethod())
              .addMethod(getGetHardwareVersionMethod())
              .addMethod(getGetHardwareModelMethod())
              .addMethod(getGetSystemUuidMethod())
              .addMethod(getGetBoardSerialMethod())
              .addMethod(getGetCpuSerialMethod())
              .addMethod(getGetMachineIdMethod())
              .addMethod(getGetArchitectureMethod())
              .addMethod(getGetTotalRAMMethod())
              .addMethod(getGetCpuModelMethod())
              .addMethod(getGetCpuCoresMethod())
              .addMethod(getGetCpuThreadsMethod())
              .addMethod(getGetCpuMinMhzMethod())
              .addMethod(getGetCpuMaxMhzMethod())
              .addMethod(getGetOsNameMethod())
              .addMethod(getGetOsVersionMethod())
              .addMethod(getGetOsRevisionMethod())
              .addMethod(getGetRuntimeVersionMethod())
              .addMethod(getGetRuntimeBuildDateMethod())
              .addMethod(getGetDistroMethod())
              .addMethod(getGetDistroVersionMethod())
              .addMethod(getGetKernelVersionMethod())
              .addMethod(getGetMetricsMethod())
              .addMethod(getAllowUntrustedAppsMethod())
              .addMethod(getDisallowUntrustedAppsMethod())
              .addMethod(getIsUntrustedAppsAllowedMethod())
              .addMethod(getEnableRebootOnFailureMethod())
              .addMethod(getDisableRebootOnFailureMethod())
              .addMethod(getIsRebootOnFailureEnabledMethod())
              .addMethod(getEnableDeveModeMethod())
              .addMethod(getDisableDevModeMethod())
              .addMethod(getIsDevModeEnabledMethod())
              .addMethod(getEnableSSHServerMethod())
              .addMethod(getDisableSSHServerMethod())
              .addMethod(getIsSSHServerEnabledMethod())
              .addMethod(getAttachMethod())
              .build();
        }
      }
    }
    return result;
  }
}
