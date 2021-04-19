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
  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.HasPermissionRequest,
      network.cow.mooapis.indigo.v1.HasPermissionResponse> getHasPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasPermission",
      requestType = network.cow.mooapis.indigo.v1.HasPermissionRequest.class,
      responseType = network.cow.mooapis.indigo.v1.HasPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.HasPermissionRequest,
      network.cow.mooapis.indigo.v1.HasPermissionResponse> getHasPermissionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.HasPermissionRequest, network.cow.mooapis.indigo.v1.HasPermissionResponse> getHasPermissionMethod;
    if ((getHasPermissionMethod = IndigoServiceGrpc.getHasPermissionMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getHasPermissionMethod = IndigoServiceGrpc.getHasPermissionMethod) == null) {
          IndigoServiceGrpc.getHasPermissionMethod = getHasPermissionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.HasPermissionRequest, network.cow.mooapis.indigo.v1.HasPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.HasPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.HasPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("HasPermission"))
              .build();
        }
      }
    }
    return getHasPermissionMethod;
  }

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

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddRolePermissionsRequest,
      network.cow.mooapis.indigo.v1.AddRolePermissionsResponse> getAddRolePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRolePermissions",
      requestType = network.cow.mooapis.indigo.v1.AddRolePermissionsRequest.class,
      responseType = network.cow.mooapis.indigo.v1.AddRolePermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddRolePermissionsRequest,
      network.cow.mooapis.indigo.v1.AddRolePermissionsResponse> getAddRolePermissionsMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddRolePermissionsRequest, network.cow.mooapis.indigo.v1.AddRolePermissionsResponse> getAddRolePermissionsMethod;
    if ((getAddRolePermissionsMethod = IndigoServiceGrpc.getAddRolePermissionsMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getAddRolePermissionsMethod = IndigoServiceGrpc.getAddRolePermissionsMethod) == null) {
          IndigoServiceGrpc.getAddRolePermissionsMethod = getAddRolePermissionsMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.AddRolePermissionsRequest, network.cow.mooapis.indigo.v1.AddRolePermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRolePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddRolePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddRolePermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("AddRolePermissions"))
              .build();
        }
      }
    }
    return getAddRolePermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest,
      network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse> getRemoveRolePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRolePermissions",
      requestType = network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest.class,
      responseType = network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest,
      network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse> getRemoveRolePermissionsMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest, network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse> getRemoveRolePermissionsMethod;
    if ((getRemoveRolePermissionsMethod = IndigoServiceGrpc.getRemoveRolePermissionsMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getRemoveRolePermissionsMethod = IndigoServiceGrpc.getRemoveRolePermissionsMethod) == null) {
          IndigoServiceGrpc.getRemoveRolePermissionsMethod = getRemoveRolePermissionsMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest, network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRolePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("RemoveRolePermissions"))
              .build();
        }
      }
    }
    return getRemoveRolePermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserRequest,
      network.cow.mooapis.indigo.v1.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = network.cow.mooapis.indigo.v1.GetUserRequest.class,
      responseType = network.cow.mooapis.indigo.v1.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserRequest,
      network.cow.mooapis.indigo.v1.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserRequest, network.cow.mooapis.indigo.v1.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = IndigoServiceGrpc.getGetUserMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getGetUserMethod = IndigoServiceGrpc.getGetUserMethod) == null) {
          IndigoServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.GetUserRequest, network.cow.mooapis.indigo.v1.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
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

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserRolesRequest,
      network.cow.mooapis.indigo.v1.AddUserRolesResponse> getAddUserRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserRoles",
      requestType = network.cow.mooapis.indigo.v1.AddUserRolesRequest.class,
      responseType = network.cow.mooapis.indigo.v1.AddUserRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserRolesRequest,
      network.cow.mooapis.indigo.v1.AddUserRolesResponse> getAddUserRolesMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserRolesRequest, network.cow.mooapis.indigo.v1.AddUserRolesResponse> getAddUserRolesMethod;
    if ((getAddUserRolesMethod = IndigoServiceGrpc.getAddUserRolesMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getAddUserRolesMethod = IndigoServiceGrpc.getAddUserRolesMethod) == null) {
          IndigoServiceGrpc.getAddUserRolesMethod = getAddUserRolesMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.AddUserRolesRequest, network.cow.mooapis.indigo.v1.AddUserRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddUserRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddUserRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("AddUserRoles"))
              .build();
        }
      }
    }
    return getAddUserRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserRolesRequest,
      network.cow.mooapis.indigo.v1.RemoveUserRolesResponse> getRemoveUserRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserRoles",
      requestType = network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.class,
      responseType = network.cow.mooapis.indigo.v1.RemoveUserRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserRolesRequest,
      network.cow.mooapis.indigo.v1.RemoveUserRolesResponse> getRemoveUserRolesMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserRolesRequest, network.cow.mooapis.indigo.v1.RemoveUserRolesResponse> getRemoveUserRolesMethod;
    if ((getRemoveUserRolesMethod = IndigoServiceGrpc.getRemoveUserRolesMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getRemoveUserRolesMethod = IndigoServiceGrpc.getRemoveUserRolesMethod) == null) {
          IndigoServiceGrpc.getRemoveUserRolesMethod = getRemoveUserRolesMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.RemoveUserRolesRequest, network.cow.mooapis.indigo.v1.RemoveUserRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveUserRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("RemoveUserRoles"))
              .build();
        }
      }
    }
    return getRemoveUserRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserPermissionsRequest,
      network.cow.mooapis.indigo.v1.GetUserPermissionsResponse> getGetUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPermissions",
      requestType = network.cow.mooapis.indigo.v1.GetUserPermissionsRequest.class,
      responseType = network.cow.mooapis.indigo.v1.GetUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserPermissionsRequest,
      network.cow.mooapis.indigo.v1.GetUserPermissionsResponse> getGetUserPermissionsMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.GetUserPermissionsRequest, network.cow.mooapis.indigo.v1.GetUserPermissionsResponse> getGetUserPermissionsMethod;
    if ((getGetUserPermissionsMethod = IndigoServiceGrpc.getGetUserPermissionsMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getGetUserPermissionsMethod = IndigoServiceGrpc.getGetUserPermissionsMethod) == null) {
          IndigoServiceGrpc.getGetUserPermissionsMethod = getGetUserPermissionsMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.GetUserPermissionsRequest, network.cow.mooapis.indigo.v1.GetUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.GetUserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.GetUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("GetUserPermissions"))
              .build();
        }
      }
    }
    return getGetUserPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserPermissionsRequest,
      network.cow.mooapis.indigo.v1.AddUserPermissionsResponse> getAddUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserPermissions",
      requestType = network.cow.mooapis.indigo.v1.AddUserPermissionsRequest.class,
      responseType = network.cow.mooapis.indigo.v1.AddUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserPermissionsRequest,
      network.cow.mooapis.indigo.v1.AddUserPermissionsResponse> getAddUserPermissionsMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.AddUserPermissionsRequest, network.cow.mooapis.indigo.v1.AddUserPermissionsResponse> getAddUserPermissionsMethod;
    if ((getAddUserPermissionsMethod = IndigoServiceGrpc.getAddUserPermissionsMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getAddUserPermissionsMethod = IndigoServiceGrpc.getAddUserPermissionsMethod) == null) {
          IndigoServiceGrpc.getAddUserPermissionsMethod = getAddUserPermissionsMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.AddUserPermissionsRequest, network.cow.mooapis.indigo.v1.AddUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddUserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.AddUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("AddUserPermissions"))
              .build();
        }
      }
    }
    return getAddUserPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest,
      network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse> getRemoveUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserPermissions",
      requestType = network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest.class,
      responseType = network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest,
      network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse> getRemoveUserPermissionsMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest, network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse> getRemoveUserPermissionsMethod;
    if ((getRemoveUserPermissionsMethod = IndigoServiceGrpc.getRemoveUserPermissionsMethod) == null) {
      synchronized (IndigoServiceGrpc.class) {
        if ((getRemoveUserPermissionsMethod = IndigoServiceGrpc.getRemoveUserPermissionsMethod) == null) {
          IndigoServiceGrpc.getRemoveUserPermissionsMethod = getRemoveUserPermissionsMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest, network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndigoServiceMethodDescriptorSupplier("RemoveUserPermissions"))
              .build();
        }
      }
    }
    return getRemoveUserPermissionsMethod;
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
     * <pre>
     * Checks if a given user account would succeed the permission
     * check of given permissions. For that the roles and the custom
     * permissions of the user will be used.
     * </pre>
     */
    public void hasPermission(network.cow.mooapis.indigo.v1.HasPermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.HasPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHasPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all existing roles.
     * </pre>
     */
    public void listRoles(network.cow.mooapis.indigo.v1.ListRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.ListRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the role with specific name.
     * </pre>
     */
    public void getRole(network.cow.mooapis.indigo.v1.GetRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Inserts a new role, if it doesn't exist.
     * </pre>
     */
    public void insertRole(network.cow.mooapis.indigo.v1.InsertRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.InsertRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a roles settings (like priority, ...).
     * </pre>
     */
    public void updateRole(network.cow.mooapis.indigo.v1.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.UpdateRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a role if it exists.
     * </pre>
     */
    public void deleteRole(network.cow.mooapis.indigo.v1.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.DeleteRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add multiple or one permission to given role, if the role exists.
     * </pre>
     */
    public void addRolePermissions(network.cow.mooapis.indigo.v1.AddRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddRolePermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRolePermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove multiple or one permission from given role, if the role exists.
     * </pre>
     */
    public void removeRolePermissions(network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveRolePermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a user by account id.
     * </pre>
     */
    public void getUser(network.cow.mooapis.indigo.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all roles that are bound to given user.
     * </pre>
     */
    public void getUserRoles(network.cow.mooapis.indigo.v1.GetUserRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Binds an existing role to the user.
     * </pre>
     */
    public void addUserRoles(network.cow.mooapis.indigo.v1.AddUserRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbinds a role from the user.
     * </pre>
     */
    public void removeUserRoles(network.cow.mooapis.indigo.v1.RemoveUserRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all custom bound permissions of given user. 
     * </pre>
     */
    public void getUserPermissions(network.cow.mooapis.indigo.v1.GetUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Binds custom permissions to given user.
     * </pre>
     */
    public void addUserPermissions(network.cow.mooapis.indigo.v1.AddUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbinds custom permissions from given user.
     * </pre>
     */
    public void removeUserPermissions(network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserPermissionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHasPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.HasPermissionRequest,
                network.cow.mooapis.indigo.v1.HasPermissionResponse>(
                  this, METHODID_HAS_PERMISSION)))
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
            getAddRolePermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.AddRolePermissionsRequest,
                network.cow.mooapis.indigo.v1.AddRolePermissionsResponse>(
                  this, METHODID_ADD_ROLE_PERMISSIONS)))
          .addMethod(
            getRemoveRolePermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest,
                network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse>(
                  this, METHODID_REMOVE_ROLE_PERMISSIONS)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.GetUserRequest,
                network.cow.mooapis.indigo.v1.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetUserRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.GetUserRolesRequest,
                network.cow.mooapis.indigo.v1.GetUserRolesResponse>(
                  this, METHODID_GET_USER_ROLES)))
          .addMethod(
            getAddUserRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.AddUserRolesRequest,
                network.cow.mooapis.indigo.v1.AddUserRolesResponse>(
                  this, METHODID_ADD_USER_ROLES)))
          .addMethod(
            getRemoveUserRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.RemoveUserRolesRequest,
                network.cow.mooapis.indigo.v1.RemoveUserRolesResponse>(
                  this, METHODID_REMOVE_USER_ROLES)))
          .addMethod(
            getGetUserPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.GetUserPermissionsRequest,
                network.cow.mooapis.indigo.v1.GetUserPermissionsResponse>(
                  this, METHODID_GET_USER_PERMISSIONS)))
          .addMethod(
            getAddUserPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.AddUserPermissionsRequest,
                network.cow.mooapis.indigo.v1.AddUserPermissionsResponse>(
                  this, METHODID_ADD_USER_PERMISSIONS)))
          .addMethod(
            getRemoveUserPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest,
                network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse>(
                  this, METHODID_REMOVE_USER_PERMISSIONS)))
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
     * <pre>
     * Checks if a given user account would succeed the permission
     * check of given permissions. For that the roles and the custom
     * permissions of the user will be used.
     * </pre>
     */
    public void hasPermission(network.cow.mooapis.indigo.v1.HasPermissionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.HasPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHasPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all existing roles.
     * </pre>
     */
    public void listRoles(network.cow.mooapis.indigo.v1.ListRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.ListRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the role with specific name.
     * </pre>
     */
    public void getRole(network.cow.mooapis.indigo.v1.GetRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Inserts a new role, if it doesn't exist.
     * </pre>
     */
    public void insertRole(network.cow.mooapis.indigo.v1.InsertRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.InsertRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a roles settings (like priority, ...).
     * </pre>
     */
    public void updateRole(network.cow.mooapis.indigo.v1.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.UpdateRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a role if it exists.
     * </pre>
     */
    public void deleteRole(network.cow.mooapis.indigo.v1.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.DeleteRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add multiple or one permission to given role, if the role exists.
     * </pre>
     */
    public void addRolePermissions(network.cow.mooapis.indigo.v1.AddRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddRolePermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRolePermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove multiple or one permission from given role, if the role exists.
     * </pre>
     */
    public void removeRolePermissions(network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveRolePermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a user by account id.
     * </pre>
     */
    public void getUser(network.cow.mooapis.indigo.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all roles that are bound to given user.
     * </pre>
     */
    public void getUserRoles(network.cow.mooapis.indigo.v1.GetUserRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Binds an existing role to the user.
     * </pre>
     */
    public void addUserRoles(network.cow.mooapis.indigo.v1.AddUserRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbinds a role from the user.
     * </pre>
     */
    public void removeUserRoles(network.cow.mooapis.indigo.v1.RemoveUserRolesRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all custom bound permissions of given user. 
     * </pre>
     */
    public void getUserPermissions(network.cow.mooapis.indigo.v1.GetUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Binds custom permissions to given user.
     * </pre>
     */
    public void addUserPermissions(network.cow.mooapis.indigo.v1.AddUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbinds custom permissions from given user.
     * </pre>
     */
    public void removeUserPermissions(network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserPermissionsMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * Checks if a given user account would succeed the permission
     * check of given permissions. For that the roles and the custom
     * permissions of the user will be used.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.HasPermissionResponse hasPermission(network.cow.mooapis.indigo.v1.HasPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getHasPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all existing roles.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.ListRolesResponse listRoles(network.cow.mooapis.indigo.v1.ListRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the role with specific name.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.GetRoleResponse getRole(network.cow.mooapis.indigo.v1.GetRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Inserts a new role, if it doesn't exist.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.InsertRoleResponse insertRole(network.cow.mooapis.indigo.v1.InsertRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getInsertRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a roles settings (like priority, ...).
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.UpdateRoleResponse updateRole(network.cow.mooapis.indigo.v1.UpdateRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a role if it exists.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.DeleteRoleResponse deleteRole(network.cow.mooapis.indigo.v1.DeleteRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add multiple or one permission to given role, if the role exists.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.AddRolePermissionsResponse addRolePermissions(network.cow.mooapis.indigo.v1.AddRolePermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRolePermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove multiple or one permission from given role, if the role exists.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse removeRolePermissions(network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveRolePermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a user by account id.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.GetUserResponse getUser(network.cow.mooapis.indigo.v1.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all roles that are bound to given user.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.GetUserRolesResponse getUserRoles(network.cow.mooapis.indigo.v1.GetUserRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Binds an existing role to the user.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.AddUserRolesResponse addUserRoles(network.cow.mooapis.indigo.v1.AddUserRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbinds a role from the user.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.RemoveUserRolesResponse removeUserRoles(network.cow.mooapis.indigo.v1.RemoveUserRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all custom bound permissions of given user. 
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.GetUserPermissionsResponse getUserPermissions(network.cow.mooapis.indigo.v1.GetUserPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Binds custom permissions to given user.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.AddUserPermissionsResponse addUserPermissions(network.cow.mooapis.indigo.v1.AddUserPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbinds custom permissions from given user.
     * </pre>
     */
    public network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse removeUserPermissions(network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserPermissionsMethod(), getCallOptions(), request);
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
     * <pre>
     * Checks if a given user account would succeed the permission
     * check of given permissions. For that the roles and the custom
     * permissions of the user will be used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.HasPermissionResponse> hasPermission(
        network.cow.mooapis.indigo.v1.HasPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHasPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all existing roles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.ListRolesResponse> listRoles(
        network.cow.mooapis.indigo.v1.ListRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the role with specific name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.GetRoleResponse> getRole(
        network.cow.mooapis.indigo.v1.GetRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Inserts a new role, if it doesn't exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.InsertRoleResponse> insertRole(
        network.cow.mooapis.indigo.v1.InsertRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a roles settings (like priority, ...).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.UpdateRoleResponse> updateRole(
        network.cow.mooapis.indigo.v1.UpdateRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a role if it exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.DeleteRoleResponse> deleteRole(
        network.cow.mooapis.indigo.v1.DeleteRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add multiple or one permission to given role, if the role exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.AddRolePermissionsResponse> addRolePermissions(
        network.cow.mooapis.indigo.v1.AddRolePermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRolePermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove multiple or one permission from given role, if the role exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse> removeRolePermissions(
        network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveRolePermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a user by account id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.GetUserResponse> getUser(
        network.cow.mooapis.indigo.v1.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all roles that are bound to given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.GetUserRolesResponse> getUserRoles(
        network.cow.mooapis.indigo.v1.GetUserRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Binds an existing role to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.AddUserRolesResponse> addUserRoles(
        network.cow.mooapis.indigo.v1.AddUserRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbinds a role from the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.RemoveUserRolesResponse> removeUserRoles(
        network.cow.mooapis.indigo.v1.RemoveUserRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all custom bound permissions of given user. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.GetUserPermissionsResponse> getUserPermissions(
        network.cow.mooapis.indigo.v1.GetUserPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Binds custom permissions to given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.AddUserPermissionsResponse> addUserPermissions(
        network.cow.mooapis.indigo.v1.AddUserPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbinds custom permissions from given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse> removeUserPermissions(
        network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HAS_PERMISSION = 0;
  private static final int METHODID_LIST_ROLES = 1;
  private static final int METHODID_GET_ROLE = 2;
  private static final int METHODID_INSERT_ROLE = 3;
  private static final int METHODID_UPDATE_ROLE = 4;
  private static final int METHODID_DELETE_ROLE = 5;
  private static final int METHODID_ADD_ROLE_PERMISSIONS = 6;
  private static final int METHODID_REMOVE_ROLE_PERMISSIONS = 7;
  private static final int METHODID_GET_USER = 8;
  private static final int METHODID_GET_USER_ROLES = 9;
  private static final int METHODID_ADD_USER_ROLES = 10;
  private static final int METHODID_REMOVE_USER_ROLES = 11;
  private static final int METHODID_GET_USER_PERMISSIONS = 12;
  private static final int METHODID_ADD_USER_PERMISSIONS = 13;
  private static final int METHODID_REMOVE_USER_PERMISSIONS = 14;

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
        case METHODID_HAS_PERMISSION:
          serviceImpl.hasPermission((network.cow.mooapis.indigo.v1.HasPermissionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.HasPermissionResponse>) responseObserver);
          break;
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
        case METHODID_ADD_ROLE_PERMISSIONS:
          serviceImpl.addRolePermissions((network.cow.mooapis.indigo.v1.AddRolePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddRolePermissionsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE_PERMISSIONS:
          serviceImpl.removeRolePermissions((network.cow.mooapis.indigo.v1.RemoveRolePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveRolePermissionsResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((network.cow.mooapis.indigo.v1.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_ROLES:
          serviceImpl.getUserRoles((network.cow.mooapis.indigo.v1.GetUserRolesRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserRolesResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_ROLES:
          serviceImpl.addUserRoles((network.cow.mooapis.indigo.v1.AddUserRolesRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserRolesResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_ROLES:
          serviceImpl.removeUserRoles((network.cow.mooapis.indigo.v1.RemoveUserRolesRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserRolesResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PERMISSIONS:
          serviceImpl.getUserPermissions((network.cow.mooapis.indigo.v1.GetUserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.GetUserPermissionsResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_PERMISSIONS:
          serviceImpl.addUserPermissions((network.cow.mooapis.indigo.v1.AddUserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.AddUserPermissionsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_PERMISSIONS:
          serviceImpl.removeUserPermissions((network.cow.mooapis.indigo.v1.RemoveUserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.indigo.v1.RemoveUserPermissionsResponse>) responseObserver);
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
              .addMethod(getHasPermissionMethod())
              .addMethod(getListRolesMethod())
              .addMethod(getGetRoleMethod())
              .addMethod(getInsertRoleMethod())
              .addMethod(getUpdateRoleMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getAddRolePermissionsMethod())
              .addMethod(getRemoveRolePermissionsMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUserRolesMethod())
              .addMethod(getAddUserRolesMethod())
              .addMethod(getRemoveUserRolesMethod())
              .addMethod(getGetUserPermissionsMethod())
              .addMethod(getAddUserPermissionsMethod())
              .addMethod(getRemoveUserPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
