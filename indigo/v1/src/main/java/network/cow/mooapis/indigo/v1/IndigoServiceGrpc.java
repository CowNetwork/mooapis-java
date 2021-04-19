package network.cow.mooapis.indigo.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: cow/indigo/v1/indigo.proto")
public final class IndigoServiceGrpc {

  private IndigoServiceGrpc() {}

  public static final String SERVICE_NAME = "cow.indigo.v1.IndigoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.ListRolesRequest,
      network.cow.mooapis.indigo.v1.ListRolesResponse> getListRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoles",
      requestType = network.cow.mooapis.indigo.v1.ListRolesRequest.class,
      responseType = network.cow.mooapis.indigo.v1.ListRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.ListRolesRequest,
      network.cow.mooapis.indigo.v1.ListRolesResponse> getListRolesMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.ListRolesRequest, network.cow.mooapis.indigo.v1.ListRolesResponse> getListRolesMethod;
    if ((getListRolesMethod = IndigoServiceGrpc.getListRolesMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getListRolesMethod = IndigoServiceGrpc.getListRolesMethod) == null) {
          IndigoServiceGrpc.getListRolesMethod = getListRolesMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.ListRolesRequest, network.cow.mooapis.indigo.v1.ListRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.ListRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.ListRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("ListRoles"))
              .build();
        }
      }
    }
    return getListRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetRoleRequest,
      network.cow.mooapis.indigo.v1.GetRoleResponse> getGetRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRole",
      requestType = network.cow.mooapis.indigo.v1.GetRoleRequest.class,
      responseType = network.cow.mooapis.indigo.v1.GetRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetRoleRequest,
      network.cow.mooapis.indigo.v1.GetRoleResponse> getGetRoleMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetRoleRequest, network.cow.mooapis.indigo.v1.GetRoleResponse> getGetRoleMethod;
    if ((getGetRoleMethod = IndigoServiceGrpc.getGetRoleMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getGetRoleMethod = IndigoServiceGrpc.getGetRoleMethod) == null) {
          IndigoServiceGrpc.getGetRoleMethod = getGetRoleMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.GetRoleRequest, network.cow.mooapis.indigo.v1.GetRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.GetRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.GetRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("GetRole"))
              .build();
        }
      }
    }
    return getGetRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.InsertRoleRequest,
      network.cow.mooapis.indigo.v1.InsertRoleResponse> getInsertRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertRole",
      requestType = network.cow.mooapis.indigo.v1.InsertRoleRequest.class,
      responseType = network.cow.mooapis.indigo.v1.InsertRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.InsertRoleRequest,
      network.cow.mooapis.indigo.v1.InsertRoleResponse> getInsertRoleMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.InsertRoleRequest, network.cow.mooapis.indigo.v1.InsertRoleResponse> getInsertRoleMethod;
    if ((getInsertRoleMethod = IndigoServiceGrpc.getInsertRoleMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getInsertRoleMethod = IndigoServiceGrpc.getInsertRoleMethod) == null) {
          IndigoServiceGrpc.getInsertRoleMethod = getInsertRoleMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.InsertRoleRequest, network.cow.mooapis.indigo.v1.InsertRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.InsertRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.InsertRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("InsertRole"))
              .build();
        }
      }
    }
    return getInsertRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.UpdateRoleRequest,
      network.cow.mooapis.indigo.v1.UpdateRoleResponse> getUpdateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRole",
      requestType = network.cow.mooapis.indigo.v1.UpdateRoleRequest.class,
      responseType = network.cow.mooapis.indigo.v1.UpdateRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.UpdateRoleRequest,
      network.cow.mooapis.indigo.v1.UpdateRoleResponse> getUpdateRoleMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.UpdateRoleRequest, network.cow.mooapis.indigo.v1.UpdateRoleResponse> getUpdateRoleMethod;
    if ((getUpdateRoleMethod = IndigoServiceGrpc.getUpdateRoleMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getUpdateRoleMethod = IndigoServiceGrpc.getUpdateRoleMethod) == null) {
          IndigoServiceGrpc.getUpdateRoleMethod = getUpdateRoleMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.UpdateRoleRequest, network.cow.mooapis.indigo.v1.UpdateRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.UpdateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.UpdateRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("UpdateRole"))
              .build();
        }
      }
    }
    return getUpdateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.DeleteRoleRequest,
      network.cow.mooapis.indigo.v1.DeleteRoleResponse> getDeleteRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRole",
      requestType = network.cow.mooapis.indigo.v1.DeleteRoleRequest.class,
      responseType = network.cow.mooapis.indigo.v1.DeleteRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.DeleteRoleRequest,
      network.cow.mooapis.indigo.v1.DeleteRoleResponse> getDeleteRoleMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.DeleteRoleRequest, network.cow.mooapis.indigo.v1.DeleteRoleResponse> getDeleteRoleMethod;
    if ((getDeleteRoleMethod = IndigoServiceGrpc.getDeleteRoleMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getDeleteRoleMethod = IndigoServiceGrpc.getDeleteRoleMethod) == null) {
          IndigoServiceGrpc.getDeleteRoleMethod = getDeleteRoleMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.DeleteRoleRequest, network.cow.mooapis.indigo.v1.DeleteRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.DeleteRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.DeleteRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("DeleteRole"))
              .build();
        }
      }
    }
    return getDeleteRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddRolePermissionRequest,
      network.cow.mooapis.indigo.v1.AddRolePermissionResponse> getAddRolePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRolePermission",
      requestType = network.cow.mooapis.indigo.v1.AddRolePermissionRequest.class,
      responseType = network.cow.mooapis.indigo.v1.AddRolePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddRolePermissionRequest,
      network.cow.mooapis.indigo.v1.AddRolePermissionResponse> getAddRolePermissionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddRolePermissionRequest, network.cow.mooapis.indigo.v1.AddRolePermissionResponse> getAddRolePermissionMethod;
    if ((getAddRolePermissionMethod = IndigoServiceGrpc.getAddRolePermissionMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getAddRolePermissionMethod = IndigoServiceGrpc.getAddRolePermissionMethod) == null) {
          IndigoServiceGrpc.getAddRolePermissionMethod = getAddRolePermissionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.AddRolePermissionRequest, network.cow.mooapis.indigo.v1.AddRolePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRolePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddRolePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddRolePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("AddRolePermission"))
              .build();
        }
      }
    }
    return getAddRolePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest,
      network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse> getRemoveRolePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRolePermission",
      requestType = network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest.class,
      responseType = network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest,
      network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse> getRemoveRolePermissionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest, network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse> getRemoveRolePermissionMethod;
    if ((getRemoveRolePermissionMethod = IndigoServiceGrpc.getRemoveRolePermissionMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getRemoveRolePermissionMethod = IndigoServiceGrpc.getRemoveRolePermissionMethod) == null) {
          IndigoServiceGrpc.getRemoveRolePermissionMethod = getRemoveRolePermissionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest, network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRolePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("RemoveRolePermission"))
              .build();
        }
      }
    }
    return getRemoveRolePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserRolesRequest,
      network.cow.mooapis.indigo.v1.GetUserRolesResponse> getGetUserRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserRoles",
      requestType = network.cow.mooapis.indigo.v1.GetUserRolesRequest.class,
      responseType = network.cow.mooapis.indigo.v1.GetUserRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserRolesRequest,
      network.cow.mooapis.indigo.v1.GetUserRolesResponse> getGetUserRolesMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserRolesRequest, network.cow.mooapis.indigo.v1.GetUserRolesResponse> getGetUserRolesMethod;
    if ((getGetUserRolesMethod = IndigoServiceGrpc.getGetUserRolesMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getGetUserRolesMethod = IndigoServiceGrpc.getGetUserRolesMethod) == null) {
          IndigoServiceGrpc.getGetUserRolesMethod = getGetUserRolesMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.GetUserRolesRequest, network.cow.mooapis.indigo.v1.GetUserRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.GetUserRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.GetUserRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("GetUserRoles"))
              .build();
        }
      }
    }
    return getGetUserRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserRoleRequest,
      network.cow.mooapis.indigo.v1.AddUserRoleResponse> getAddUserRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserRole",
      requestType = network.cow.mooapis.indigo.v1.AddUserRoleRequest.class,
      responseType = network.cow.mooapis.indigo.v1.AddUserRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserRoleRequest,
      network.cow.mooapis.indigo.v1.AddUserRoleResponse> getAddUserRoleMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserRoleRequest, network.cow.mooapis.indigo.v1.AddUserRoleResponse> getAddUserRoleMethod;
    if ((getAddUserRoleMethod = IndigoServiceGrpc.getAddUserRoleMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getAddUserRoleMethod = IndigoServiceGrpc.getAddUserRoleMethod) == null) {
          IndigoServiceGrpc.getAddUserRoleMethod = getAddUserRoleMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.AddUserRoleRequest, network.cow.mooapis.indigo.v1.AddUserRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddUserRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddUserRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("AddUserRole"))
              .build();
        }
      }
    }
    return getAddUserRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserRoleRequest,
      network.cow.mooapis.indigo.v1.RemoveUserRoleResponse> getRemoveUserRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserRole",
      requestType = network.cow.mooapis.indigo.v1.RemoveUserRoleRequest.class,
      responseType = network.cow.mooapis.indigo.v1.RemoveUserRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserRoleRequest,
      network.cow.mooapis.indigo.v1.RemoveUserRoleResponse> getRemoveUserRoleMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserRoleRequest, network.cow.mooapis.indigo.v1.RemoveUserRoleResponse> getRemoveUserRoleMethod;
    if ((getRemoveUserRoleMethod = IndigoServiceGrpc.getRemoveUserRoleMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getRemoveUserRoleMethod = IndigoServiceGrpc.getRemoveUserRoleMethod) == null) {
          IndigoServiceGrpc.getRemoveUserRoleMethod = getRemoveUserRoleMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.RemoveUserRoleRequest, network.cow.mooapis.indigo.v1.RemoveUserRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveUserRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveUserRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("RemoveUserRole"))
              .build();
        }
      }
    }
    return getRemoveUserRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserPermissionRequest,
      network.cow.mooapis.indigo.v1.AddUserPermissionResponse> getAddUserPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserPermission",
      requestType = network.cow.mooapis.indigo.v1.AddUserPermissionRequest.class,
      responseType = network.cow.mooapis.indigo.v1.AddUserPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserPermissionRequest,
      network.cow.mooapis.indigo.v1.AddUserPermissionResponse> getAddUserPermissionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserPermissionRequest, network.cow.mooapis.indigo.v1.AddUserPermissionResponse> getAddUserPermissionMethod;
    if ((getAddUserPermissionMethod = IndigoServiceGrpc.getAddUserPermissionMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getAddUserPermissionMethod = IndigoServiceGrpc.getAddUserPermissionMethod) == null) {
          IndigoServiceGrpc.getAddUserPermissionMethod = getAddUserPermissionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.AddUserPermissionRequest, network.cow.mooapis.indigo.v1.AddUserPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddUserPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddUserPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("AddUserPermission"))
              .build();
        }
      }
    }
    return getAddUserPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest,
      network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse> getRemoveUserPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserPermission",
      requestType = network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest.class,
      responseType = network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest,
      network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse> getRemoveUserPermissionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest, network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse> getRemoveUserPermissionMethod;
    if ((getRemoveUserPermissionMethod = IndigoServiceGrpc.getRemoveUserPermissionMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getRemoveUserPermissionMethod = IndigoServiceGrpc.getRemoveUserPermissionMethod) == null) {
          IndigoServiceGrpc.getRemoveUserPermissionMethod = getRemoveUserPermissionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest, network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("RemoveUserPermission"))
              .build();
        }
      }
    }
    return getRemoveUserPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.HasUserPermissionRequest,
      network.cow.mooapis.indigo.v1.HasUserPermissionResponse> getHasUserPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasUserPermission",
      requestType = network.cow.mooapis.indigo.v1.HasUserPermissionRequest.class,
      responseType = network.cow.mooapis.indigo.v1.HasUserPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.HasUserPermissionRequest,
      network.cow.mooapis.indigo.v1.HasUserPermissionResponse> getHasUserPermissionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.HasUserPermissionRequest, network.cow.mooapis.indigo.v1.HasUserPermissionResponse> getHasUserPermissionMethod;
    if ((getHasUserPermissionMethod = IndigoServiceGrpc.getHasUserPermissionMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getHasUserPermissionMethod = IndigoServiceGrpc.getHasUserPermissionMethod) == null) {
          IndigoServiceGrpc.getHasUserPermissionMethod = getHasUserPermissionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.HasUserPermissionRequest, network.cow.mooapis.indigo.v1.HasUserPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasUserPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.HasUserPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.HasUserPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("HasUserPermission"))
              .build();
        }
      }
    }
    return getHasUserPermissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IndigoServiceStub newStub(io.grpc.Channel channel) {
    return new IndigoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IndigoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IndigoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IndigoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IndigoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static abstract class IndigoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listRoles(network.cow.mooapis.indigo.v1.ListRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.ListRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRolesMethod(), responseObserver);
    }

    /**
     */
    public void getRole(network.cow.mooapis.indigo.v1.GetRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoleMethod(), responseObserver);
    }

    /**
     */
    public void insertRole(network.cow.mooapis.indigo.v1.InsertRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.InsertRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertRoleMethod(), responseObserver);
    }

    /**
     */
    public void updateRole(network.cow.mooapis.indigo.v1.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.UpdateRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRoleMethod(), responseObserver);
    }

    /**
     */
    public void deleteRole(network.cow.mooapis.indigo.v1.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.DeleteRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoleMethod(), responseObserver);
    }

    /**
     */
    public void addRolePermission(network.cow.mooapis.indigo.v1.AddRolePermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddRolePermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRolePermissionMethod(), responseObserver);
    }

    /**
     */
    public void removeRolePermission(network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveRolePermissionMethod(), responseObserver);
    }

    /**
     */
    public void getUserRoles(network.cow.mooapis.indigo.v1.GetUserRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserRolesMethod(), responseObserver);
    }

    /**
     */
    public void addUserRole(network.cow.mooapis.indigo.v1.AddUserRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserRoleMethod(), responseObserver);
    }

    /**
     */
    public void removeUserRole(network.cow.mooapis.indigo.v1.RemoveUserRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserRoleMethod(), responseObserver);
    }

    /**
     */
    public void addUserPermission(network.cow.mooapis.indigo.v1.AddUserPermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserPermissionMethod(), responseObserver);
    }

    /**
     */
    public void removeUserPermission(network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserPermissionMethod(), responseObserver);
    }

    /**
     */
    public void hasUserPermission(network.cow.mooapis.indigo.v1.HasUserPermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.HasUserPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHasUserPermissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.ListRolesRequest,
                network.cow.mooapis.indigo.v1.ListRolesResponse>(
                  this, METHODID_LIST_ROLES)))
          .addMethod(
            getGetRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.GetRoleRequest,
                network.cow.mooapis.indigo.v1.GetRoleResponse>(
                  this, METHODID_GET_ROLE)))
          .addMethod(
            getInsertRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.InsertRoleRequest,
                network.cow.mooapis.indigo.v1.InsertRoleResponse>(
                  this, METHODID_INSERT_ROLE)))
          .addMethod(
            getUpdateRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.UpdateRoleRequest,
                network.cow.mooapis.indigo.v1.UpdateRoleResponse>(
                  this, METHODID_UPDATE_ROLE)))
          .addMethod(
            getDeleteRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.DeleteRoleRequest,
                network.cow.mooapis.indigo.v1.DeleteRoleResponse>(
                  this, METHODID_DELETE_ROLE)))
          .addMethod(
            getAddRolePermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.AddRolePermissionRequest,
                network.cow.mooapis.indigo.v1.AddRolePermissionResponse>(
                  this, METHODID_ADD_ROLE_PERMISSION)))
          .addMethod(
            getRemoveRolePermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest,
                network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse>(
                  this, METHODID_REMOVE_ROLE_PERMISSION)))
          .addMethod(
            getGetUserRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.GetUserRolesRequest,
                network.cow.mooapis.indigo.v1.GetUserRolesResponse>(
                  this, METHODID_GET_USER_ROLES)))
          .addMethod(
            getAddUserRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.AddUserRoleRequest,
                network.cow.mooapis.indigo.v1.AddUserRoleResponse>(
                  this, METHODID_ADD_USER_ROLE)))
          .addMethod(
            getRemoveUserRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.RemoveUserRoleRequest,
                network.cow.mooapis.indigo.v1.RemoveUserRoleResponse>(
                  this, METHODID_REMOVE_USER_ROLE)))
          .addMethod(
            getAddUserPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.AddUserPermissionRequest,
                network.cow.mooapis.indigo.v1.AddUserPermissionResponse>(
                  this, METHODID_ADD_USER_PERMISSION)))
          .addMethod(
            getRemoveUserPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest,
                network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse>(
                  this, METHODID_REMOVE_USER_PERMISSION)))
          .addMethod(
            getHasUserPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.HasUserPermissionRequest,
                network.cow.mooapis.indigo.v1.HasUserPermissionResponse>(
                  this, METHODID_HAS_USER_PERMISSION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class IndigoServiceStub extends io.grpc.stub.AbstractStub<IndigoServiceStub> {
    private IndigoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IndigoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndigoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IndigoServiceStub(channel, callOptions);
    }

    /**
     */
    public void listRoles(network.cow.mooapis.indigo.v1.ListRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.ListRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRole(network.cow.mooapis.indigo.v1.GetRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertRole(network.cow.mooapis.indigo.v1.InsertRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.InsertRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRole(network.cow.mooapis.indigo.v1.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.UpdateRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRole(network.cow.mooapis.indigo.v1.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.DeleteRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRolePermission(network.cow.mooapis.indigo.v1.AddRolePermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddRolePermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRolePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRolePermission(network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveRolePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserRoles(network.cow.mooapis.indigo.v1.GetUserRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserRole(network.cow.mooapis.indigo.v1.AddUserRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserRole(network.cow.mooapis.indigo.v1.RemoveUserRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserPermission(network.cow.mooapis.indigo.v1.AddUserPermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserPermission(network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasUserPermission(network.cow.mooapis.indigo.v1.HasUserPermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.HasUserPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHasUserPermissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class IndigoServiceBlockingStub extends io.grpc.stub.AbstractStub<IndigoServiceBlockingStub> {
    private IndigoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IndigoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndigoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IndigoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.ListRolesResponse listRoles(network.cow.mooapis.indigo.v1.ListRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.GetRoleResponse getRole(network.cow.mooapis.indigo.v1.GetRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.InsertRoleResponse insertRole(network.cow.mooapis.indigo.v1.InsertRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getInsertRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.UpdateRoleResponse updateRole(network.cow.mooapis.indigo.v1.UpdateRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.DeleteRoleResponse deleteRole(network.cow.mooapis.indigo.v1.DeleteRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.AddRolePermissionResponse addRolePermission(network.cow.mooapis.indigo.v1.AddRolePermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRolePermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse removeRolePermission(network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveRolePermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.GetUserRolesResponse getUserRoles(network.cow.mooapis.indigo.v1.GetUserRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.AddUserRoleResponse addUserRole(network.cow.mooapis.indigo.v1.AddUserRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.RemoveUserRoleResponse removeUserRole(network.cow.mooapis.indigo.v1.RemoveUserRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.AddUserPermissionResponse addUserPermission(network.cow.mooapis.indigo.v1.AddUserPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserPermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse removeUserPermission(network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserPermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public network.cow.mooapis.indigo.v1.HasUserPermissionResponse hasUserPermission(network.cow.mooapis.indigo.v1.HasUserPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getHasUserPermissionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class IndigoServiceFutureStub extends io.grpc.stub.AbstractStub<IndigoServiceFutureStub> {
    private IndigoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IndigoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndigoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IndigoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.ListRolesResponse> listRoles(
        network.cow.mooapis.indigo.v1.ListRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.GetRoleResponse> getRole(
        network.cow.mooapis.indigo.v1.GetRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.InsertRoleResponse> insertRole(
        network.cow.mooapis.indigo.v1.InsertRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.UpdateRoleResponse> updateRole(
        network.cow.mooapis.indigo.v1.UpdateRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.DeleteRoleResponse> deleteRole(
        network.cow.mooapis.indigo.v1.DeleteRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.AddRolePermissionResponse> addRolePermission(
        network.cow.mooapis.indigo.v1.AddRolePermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRolePermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse> removeRolePermission(
        network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveRolePermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.GetUserRolesResponse> getUserRoles(
        network.cow.mooapis.indigo.v1.GetUserRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.AddUserRoleResponse> addUserRole(
        network.cow.mooapis.indigo.v1.AddUserRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.RemoveUserRoleResponse> removeUserRole(
        network.cow.mooapis.indigo.v1.RemoveUserRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.AddUserPermissionResponse> addUserPermission(
        network.cow.mooapis.indigo.v1.AddUserPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserPermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse> removeUserPermission(
        network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserPermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.HasUserPermissionResponse> hasUserPermission(
        network.cow.mooapis.indigo.v1.HasUserPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHasUserPermissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ROLES = 0;
  private static final int METHODID_GET_ROLE = 1;
  private static final int METHODID_INSERT_ROLE = 2;
  private static final int METHODID_UPDATE_ROLE = 3;
  private static final int METHODID_DELETE_ROLE = 4;
  private static final int METHODID_ADD_ROLE_PERMISSION = 5;
  private static final int METHODID_REMOVE_ROLE_PERMISSION = 6;
  private static final int METHODID_GET_USER_ROLES = 7;
  private static final int METHODID_ADD_USER_ROLE = 8;
  private static final int METHODID_REMOVE_USER_ROLE = 9;
  private static final int METHODID_ADD_USER_PERMISSION = 10;
  private static final int METHODID_REMOVE_USER_PERMISSION = 11;
  private static final int METHODID_HAS_USER_PERMISSION = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IndigoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IndigoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ROLES:
          serviceImpl.listRoles((network.cow.mooapis.indigo.v1.ListRolesRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.ListRolesResponse>) responseObserver);
          break;
        case METHODID_GET_ROLE:
          serviceImpl.getRole((network.cow.mooapis.indigo.v1.GetRoleRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetRoleResponse>) responseObserver);
          break;
        case METHODID_INSERT_ROLE:
          serviceImpl.insertRole((network.cow.mooapis.indigo.v1.InsertRoleRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.InsertRoleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROLE:
          serviceImpl.updateRole((network.cow.mooapis.indigo.v1.UpdateRoleRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.UpdateRoleResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROLE:
          serviceImpl.deleteRole((network.cow.mooapis.indigo.v1.DeleteRoleRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.DeleteRoleResponse>) responseObserver);
          break;
        case METHODID_ADD_ROLE_PERMISSION:
          serviceImpl.addRolePermission((network.cow.mooapis.indigo.v1.AddRolePermissionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddRolePermissionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE_PERMISSION:
          serviceImpl.removeRolePermission((network.cow.mooapis.indigo.v1.RemoveRolePermissionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveRolePermissionResponse>) responseObserver);
          break;
        case METHODID_GET_USER_ROLES:
          serviceImpl.getUserRoles((network.cow.mooapis.indigo.v1.GetUserRolesRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserRolesResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_ROLE:
          serviceImpl.addUserRole((network.cow.mooapis.indigo.v1.AddUserRoleRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserRoleResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_ROLE:
          serviceImpl.removeUserRole((network.cow.mooapis.indigo.v1.RemoveUserRoleRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserRoleResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_PERMISSION:
          serviceImpl.addUserPermission((network.cow.mooapis.indigo.v1.AddUserPermissionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserPermissionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_PERMISSION:
          serviceImpl.removeUserPermission((network.cow.mooapis.indigo.v1.RemoveUserPermissionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserPermissionResponse>) responseObserver);
          break;
        case METHODID_HAS_USER_PERMISSION:
          serviceImpl.hasUserPermission((network.cow.mooapis.indigo.v1.HasUserPermissionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.HasUserPermissionResponse>) responseObserver);
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

  private static abstract class IndigoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IndigoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return network.cow.mooapis.indigo.v1.Indigo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IndigoService");
    }
  }

  private static final class IndigoServiceFileDescriptorSupplier
      extends IndigoServiceBaseDescriptorSupplier {
    IndigoServiceFileDescriptorSupplier() {}
  }

  private static final class IndigoServiceMethodDescriptorSupplier
      extends IndigoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IndigoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IndigoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IndigoServiceFileDescriptorSupplier())
              .addMethod(getListRolesMethod())
              .addMethod(getGetRoleMethod())
              .addMethod(getInsertRoleMethod())
              .addMethod(getUpdateRoleMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getAddRolePermissionMethod())
              .addMethod(getRemoveRolePermissionMethod())
              .addMethod(getGetUserRolesMethod())
              .addMethod(getAddUserRoleMethod())
              .addMethod(getRemoveUserRoleMethod())
              .addMethod(getAddUserPermissionMethod())
              .addMethod(getRemoveUserPermissionMethod())
              .addMethod(getHasUserPermissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
