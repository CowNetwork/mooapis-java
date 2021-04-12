package network.cow.mooapis.session.v1;

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
    comments = "Source: cow/session/v1/session_service_api.proto")
public final class SessionServiceGrpc {

  private SessionServiceGrpc() {}

  public static final String SERVICE_NAME = "cow.session.v1.SessionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.CreateSessionRequest,
      network.cow.mooapis.session.v1.CreateSessionResponse> getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = network.cow.mooapis.session.v1.CreateSessionRequest.class,
      responseType = network.cow.mooapis.session.v1.CreateSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.CreateSessionRequest,
      network.cow.mooapis.session.v1.CreateSessionResponse> getCreateSessionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.CreateSessionRequest, network.cow.mooapis.session.v1.CreateSessionResponse> getCreateSessionMethod;
    if ((getCreateSessionMethod = SessionServiceGrpc.getCreateSessionMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getCreateSessionMethod = SessionServiceGrpc.getCreateSessionMethod) == null) {
          SessionServiceGrpc.getCreateSessionMethod = getCreateSessionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.CreateSessionRequest, network.cow.mooapis.session.v1.CreateSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.CreateSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.CreateSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("CreateSession"))
              .build();
        }
      }
    }
    return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.StopSessionRequest,
      network.cow.mooapis.session.v1.StopSessionResponse> getStopSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopSession",
      requestType = network.cow.mooapis.session.v1.StopSessionRequest.class,
      responseType = network.cow.mooapis.session.v1.StopSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.StopSessionRequest,
      network.cow.mooapis.session.v1.StopSessionResponse> getStopSessionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.StopSessionRequest, network.cow.mooapis.session.v1.StopSessionResponse> getStopSessionMethod;
    if ((getStopSessionMethod = SessionServiceGrpc.getStopSessionMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getStopSessionMethod = SessionServiceGrpc.getStopSessionMethod) == null) {
          SessionServiceGrpc.getStopSessionMethod = getStopSessionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.StopSessionRequest, network.cow.mooapis.session.v1.StopSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.StopSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.StopSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("StopSession"))
              .build();
        }
      }
    }
    return getStopSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetSessionRequest,
      network.cow.mooapis.session.v1.GetSessionResponse> getGetSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSession",
      requestType = network.cow.mooapis.session.v1.GetSessionRequest.class,
      responseType = network.cow.mooapis.session.v1.GetSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetSessionRequest,
      network.cow.mooapis.session.v1.GetSessionResponse> getGetSessionMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetSessionRequest, network.cow.mooapis.session.v1.GetSessionResponse> getGetSessionMethod;
    if ((getGetSessionMethod = SessionServiceGrpc.getGetSessionMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getGetSessionMethod = SessionServiceGrpc.getGetSessionMethod) == null) {
          SessionServiceGrpc.getGetSessionMethod = getGetSessionMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.GetSessionRequest, network.cow.mooapis.session.v1.GetSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.GetSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.GetSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("GetSession"))
              .build();
        }
      }
    }
    return getGetSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.KickPlayerRequest,
      network.cow.mooapis.session.v1.KickPlayerResponse> getKickPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KickPlayer",
      requestType = network.cow.mooapis.session.v1.KickPlayerRequest.class,
      responseType = network.cow.mooapis.session.v1.KickPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.KickPlayerRequest,
      network.cow.mooapis.session.v1.KickPlayerResponse> getKickPlayerMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.KickPlayerRequest, network.cow.mooapis.session.v1.KickPlayerResponse> getKickPlayerMethod;
    if ((getKickPlayerMethod = SessionServiceGrpc.getKickPlayerMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getKickPlayerMethod = SessionServiceGrpc.getKickPlayerMethod) == null) {
          SessionServiceGrpc.getKickPlayerMethod = getKickPlayerMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.KickPlayerRequest, network.cow.mooapis.session.v1.KickPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KickPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.KickPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.KickPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("KickPlayer"))
              .build();
        }
      }
    }
    return getKickPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.BanPlayerRequest,
      network.cow.mooapis.session.v1.BanPlayerResponse> getBanPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BanPlayer",
      requestType = network.cow.mooapis.session.v1.BanPlayerRequest.class,
      responseType = network.cow.mooapis.session.v1.BanPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.BanPlayerRequest,
      network.cow.mooapis.session.v1.BanPlayerResponse> getBanPlayerMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.BanPlayerRequest, network.cow.mooapis.session.v1.BanPlayerResponse> getBanPlayerMethod;
    if ((getBanPlayerMethod = SessionServiceGrpc.getBanPlayerMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getBanPlayerMethod = SessionServiceGrpc.getBanPlayerMethod) == null) {
          SessionServiceGrpc.getBanPlayerMethod = getBanPlayerMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.BanPlayerRequest, network.cow.mooapis.session.v1.BanPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BanPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.BanPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.BanPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("BanPlayer"))
              .build();
        }
      }
    }
    return getBanPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetBansRequest,
      network.cow.mooapis.session.v1.GetBansResponse> getGetBansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBans",
      requestType = network.cow.mooapis.session.v1.GetBansRequest.class,
      responseType = network.cow.mooapis.session.v1.GetBansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetBansRequest,
      network.cow.mooapis.session.v1.GetBansResponse> getGetBansMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetBansRequest, network.cow.mooapis.session.v1.GetBansResponse> getGetBansMethod;
    if ((getGetBansMethod = SessionServiceGrpc.getGetBansMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getGetBansMethod = SessionServiceGrpc.getGetBansMethod) == null) {
          SessionServiceGrpc.getGetBansMethod = getGetBansMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.GetBansRequest, network.cow.mooapis.session.v1.GetBansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.GetBansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.GetBansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("GetBans"))
              .build();
        }
      }
    }
    return getGetBansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.RevokeBanRequest,
      network.cow.mooapis.session.v1.RevokeBanResponse> getRevokeBanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeBan",
      requestType = network.cow.mooapis.session.v1.RevokeBanRequest.class,
      responseType = network.cow.mooapis.session.v1.RevokeBanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.RevokeBanRequest,
      network.cow.mooapis.session.v1.RevokeBanResponse> getRevokeBanMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.RevokeBanRequest, network.cow.mooapis.session.v1.RevokeBanResponse> getRevokeBanMethod;
    if ((getRevokeBanMethod = SessionServiceGrpc.getRevokeBanMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getRevokeBanMethod = SessionServiceGrpc.getRevokeBanMethod) == null) {
          SessionServiceGrpc.getRevokeBanMethod = getRevokeBanMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.RevokeBanRequest, network.cow.mooapis.session.v1.RevokeBanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeBan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.RevokeBanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.RevokeBanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("RevokeBan"))
              .build();
        }
      }
    }
    return getRevokeBanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.SetMaintenanceModeRequest,
      network.cow.mooapis.session.v1.SetMaintenanceModeResponse> getSetMaintenanceModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaintenanceMode",
      requestType = network.cow.mooapis.session.v1.SetMaintenanceModeRequest.class,
      responseType = network.cow.mooapis.session.v1.SetMaintenanceModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.SetMaintenanceModeRequest,
      network.cow.mooapis.session.v1.SetMaintenanceModeResponse> getSetMaintenanceModeMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.SetMaintenanceModeRequest, network.cow.mooapis.session.v1.SetMaintenanceModeResponse> getSetMaintenanceModeMethod;
    if ((getSetMaintenanceModeMethod = SessionServiceGrpc.getSetMaintenanceModeMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getSetMaintenanceModeMethod = SessionServiceGrpc.getSetMaintenanceModeMethod) == null) {
          SessionServiceGrpc.getSetMaintenanceModeMethod = getSetMaintenanceModeMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.SetMaintenanceModeRequest, network.cow.mooapis.session.v1.SetMaintenanceModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaintenanceMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.SetMaintenanceModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.SetMaintenanceModeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("SetMaintenanceMode"))
              .build();
        }
      }
    }
    return getSetMaintenanceModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.BlacklistPlayerRequest,
      network.cow.mooapis.session.v1.BlacklistPlayerResponse> getBlacklistPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlacklistPlayer",
      requestType = network.cow.mooapis.session.v1.BlacklistPlayerRequest.class,
      responseType = network.cow.mooapis.session.v1.BlacklistPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.BlacklistPlayerRequest,
      network.cow.mooapis.session.v1.BlacklistPlayerResponse> getBlacklistPlayerMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.BlacklistPlayerRequest, network.cow.mooapis.session.v1.BlacklistPlayerResponse> getBlacklistPlayerMethod;
    if ((getBlacklistPlayerMethod = SessionServiceGrpc.getBlacklistPlayerMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getBlacklistPlayerMethod = SessionServiceGrpc.getBlacklistPlayerMethod) == null) {
          SessionServiceGrpc.getBlacklistPlayerMethod = getBlacklistPlayerMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.BlacklistPlayerRequest, network.cow.mooapis.session.v1.BlacklistPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlacklistPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.BlacklistPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.BlacklistPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("BlacklistPlayer"))
              .build();
        }
      }
    }
    return getBlacklistPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest,
      network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse> getRevokeBlacklistPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeBlacklistPlayer",
      requestType = network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest.class,
      responseType = network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest,
      network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse> getRevokeBlacklistPlayerMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest, network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse> getRevokeBlacklistPlayerMethod;
    if ((getRevokeBlacklistPlayerMethod = SessionServiceGrpc.getRevokeBlacklistPlayerMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getRevokeBlacklistPlayerMethod = SessionServiceGrpc.getRevokeBlacklistPlayerMethod) == null) {
          SessionServiceGrpc.getRevokeBlacklistPlayerMethod = getRevokeBlacklistPlayerMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest, network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeBlacklistPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("RevokeBlacklistPlayer"))
              .build();
        }
      }
    }
    return getRevokeBlacklistPlayerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionServiceStub newStub(io.grpc.Channel channel) {
    return new SessionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SessionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SessionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SessionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static abstract class SessionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * creates a new session
     * </pre>
     */
    public void createSession(network.cow.mooapis.session.v1.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.CreateSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * stops and removes a session
     * </pre>
     */
    public void stopSession(network.cow.mooapis.session.v1.StopSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.StopSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * retrieves information about a existing session
     * </pre>
     */
    public void getSession(network.cow.mooapis.session.v1.GetSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * kicks the given player
     * </pre>
     */
    public void kickPlayer(network.cow.mooapis.session.v1.KickPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.KickPlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getKickPlayerMethod(), responseObserver);
    }

    /**
     * <pre>
     * bans the given player
     * </pre>
     */
    public void banPlayer(network.cow.mooapis.session.v1.BanPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.BanPlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBanPlayerMethod(), responseObserver);
    }

    /**
     * <pre>
     * retrieves all bans associated to a player
     * </pre>
     */
    public void getBans(network.cow.mooapis.session.v1.GetBansRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetBansResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBansMethod(), responseObserver);
    }

    /**
     * <pre>
     * revoke a ban
     * </pre>
     */
    public void revokeBan(network.cow.mooapis.session.v1.RevokeBanRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.RevokeBanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeBanMethod(), responseObserver);
    }

    /**
     * <pre>
     * enables or disabled maintenance mode
     * </pre>
     */
    public void setMaintenanceMode(network.cow.mooapis.session.v1.SetMaintenanceModeRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.SetMaintenanceModeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMaintenanceModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * blacklists a player
     * </pre>
     */
    public void blacklistPlayer(network.cow.mooapis.session.v1.BlacklistPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.BlacklistPlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklistPlayerMethod(), responseObserver);
    }

    /**
     * <pre>
     * revokes the blacklist entry of a player
     * </pre>
     */
    public void revokeBlacklistPlayer(network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeBlacklistPlayerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.CreateSessionRequest,
                network.cow.mooapis.session.v1.CreateSessionResponse>(
                  this, METHODID_CREATE_SESSION)))
          .addMethod(
            getStopSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.StopSessionRequest,
                network.cow.mooapis.session.v1.StopSessionResponse>(
                  this, METHODID_STOP_SESSION)))
          .addMethod(
            getGetSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.GetSessionRequest,
                network.cow.mooapis.session.v1.GetSessionResponse>(
                  this, METHODID_GET_SESSION)))
          .addMethod(
            getKickPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.KickPlayerRequest,
                network.cow.mooapis.session.v1.KickPlayerResponse>(
                  this, METHODID_KICK_PLAYER)))
          .addMethod(
            getBanPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.BanPlayerRequest,
                network.cow.mooapis.session.v1.BanPlayerResponse>(
                  this, METHODID_BAN_PLAYER)))
          .addMethod(
            getGetBansMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.GetBansRequest,
                network.cow.mooapis.session.v1.GetBansResponse>(
                  this, METHODID_GET_BANS)))
          .addMethod(
            getRevokeBanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.RevokeBanRequest,
                network.cow.mooapis.session.v1.RevokeBanResponse>(
                  this, METHODID_REVOKE_BAN)))
          .addMethod(
            getSetMaintenanceModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.SetMaintenanceModeRequest,
                network.cow.mooapis.session.v1.SetMaintenanceModeResponse>(
                  this, METHODID_SET_MAINTENANCE_MODE)))
          .addMethod(
            getBlacklistPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.BlacklistPlayerRequest,
                network.cow.mooapis.session.v1.BlacklistPlayerResponse>(
                  this, METHODID_BLACKLIST_PLAYER)))
          .addMethod(
            getRevokeBlacklistPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest,
                network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse>(
                  this, METHODID_REVOKE_BLACKLIST_PLAYER)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class SessionServiceStub extends io.grpc.stub.AbstractStub<SessionServiceStub> {
    private SessionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * creates a new session
     * </pre>
     */
    public void createSession(network.cow.mooapis.session.v1.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.CreateSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * stops and removes a session
     * </pre>
     */
    public void stopSession(network.cow.mooapis.session.v1.StopSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.StopSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * retrieves information about a existing session
     * </pre>
     */
    public void getSession(network.cow.mooapis.session.v1.GetSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * kicks the given player
     * </pre>
     */
    public void kickPlayer(network.cow.mooapis.session.v1.KickPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.KickPlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKickPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bans the given player
     * </pre>
     */
    public void banPlayer(network.cow.mooapis.session.v1.BanPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.BanPlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBanPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * retrieves all bans associated to a player
     * </pre>
     */
    public void getBans(network.cow.mooapis.session.v1.GetBansRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetBansResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * revoke a ban
     * </pre>
     */
    public void revokeBan(network.cow.mooapis.session.v1.RevokeBanRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.RevokeBanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeBanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * enables or disabled maintenance mode
     * </pre>
     */
    public void setMaintenanceMode(network.cow.mooapis.session.v1.SetMaintenanceModeRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.SetMaintenanceModeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMaintenanceModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * blacklists a player
     * </pre>
     */
    public void blacklistPlayer(network.cow.mooapis.session.v1.BlacklistPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.BlacklistPlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklistPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * revokes the blacklist entry of a player
     * </pre>
     */
    public void revokeBlacklistPlayer(network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeBlacklistPlayerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class SessionServiceBlockingStub extends io.grpc.stub.AbstractStub<SessionServiceBlockingStub> {
    private SessionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * creates a new session
     * </pre>
     */
    public network.cow.mooapis.session.v1.CreateSessionResponse createSession(network.cow.mooapis.session.v1.CreateSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * stops and removes a session
     * </pre>
     */
    public network.cow.mooapis.session.v1.StopSessionResponse stopSession(network.cow.mooapis.session.v1.StopSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * retrieves information about a existing session
     * </pre>
     */
    public network.cow.mooapis.session.v1.GetSessionResponse getSession(network.cow.mooapis.session.v1.GetSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * kicks the given player
     * </pre>
     */
    public network.cow.mooapis.session.v1.KickPlayerResponse kickPlayer(network.cow.mooapis.session.v1.KickPlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getKickPlayerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * bans the given player
     * </pre>
     */
    public network.cow.mooapis.session.v1.BanPlayerResponse banPlayer(network.cow.mooapis.session.v1.BanPlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getBanPlayerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * retrieves all bans associated to a player
     * </pre>
     */
    public network.cow.mooapis.session.v1.GetBansResponse getBans(network.cow.mooapis.session.v1.GetBansRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * revoke a ban
     * </pre>
     */
    public network.cow.mooapis.session.v1.RevokeBanResponse revokeBan(network.cow.mooapis.session.v1.RevokeBanRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevokeBanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * enables or disabled maintenance mode
     * </pre>
     */
    public network.cow.mooapis.session.v1.SetMaintenanceModeResponse setMaintenanceMode(network.cow.mooapis.session.v1.SetMaintenanceModeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetMaintenanceModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * blacklists a player
     * </pre>
     */
    public network.cow.mooapis.session.v1.BlacklistPlayerResponse blacklistPlayer(network.cow.mooapis.session.v1.BlacklistPlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlacklistPlayerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * revokes the blacklist entry of a player
     * </pre>
     */
    public network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse revokeBlacklistPlayer(network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevokeBlacklistPlayerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class SessionServiceFutureStub extends io.grpc.stub.AbstractStub<SessionServiceFutureStub> {
    private SessionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * creates a new session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.CreateSessionResponse> createSession(
        network.cow.mooapis.session.v1.CreateSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * stops and removes a session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.StopSessionResponse> stopSession(
        network.cow.mooapis.session.v1.StopSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * retrieves information about a existing session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.GetSessionResponse> getSession(
        network.cow.mooapis.session.v1.GetSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * kicks the given player
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.KickPlayerResponse> kickPlayer(
        network.cow.mooapis.session.v1.KickPlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKickPlayerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * bans the given player
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.BanPlayerResponse> banPlayer(
        network.cow.mooapis.session.v1.BanPlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBanPlayerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * retrieves all bans associated to a player
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.GetBansResponse> getBans(
        network.cow.mooapis.session.v1.GetBansRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * revoke a ban
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.RevokeBanResponse> revokeBan(
        network.cow.mooapis.session.v1.RevokeBanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeBanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * enables or disabled maintenance mode
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.SetMaintenanceModeResponse> setMaintenanceMode(
        network.cow.mooapis.session.v1.SetMaintenanceModeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMaintenanceModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * blacklists a player
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.BlacklistPlayerResponse> blacklistPlayer(
        network.cow.mooapis.session.v1.BlacklistPlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklistPlayerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * revokes the blacklist entry of a player
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse> revokeBlacklistPlayer(
        network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeBlacklistPlayerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SESSION = 0;
  private static final int METHODID_STOP_SESSION = 1;
  private static final int METHODID_GET_SESSION = 2;
  private static final int METHODID_KICK_PLAYER = 3;
  private static final int METHODID_BAN_PLAYER = 4;
  private static final int METHODID_GET_BANS = 5;
  private static final int METHODID_REVOKE_BAN = 6;
  private static final int METHODID_SET_MAINTENANCE_MODE = 7;
  private static final int METHODID_BLACKLIST_PLAYER = 8;
  private static final int METHODID_REVOKE_BLACKLIST_PLAYER = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((network.cow.mooapis.session.v1.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.CreateSessionResponse>) responseObserver);
          break;
        case METHODID_STOP_SESSION:
          serviceImpl.stopSession((network.cow.mooapis.session.v1.StopSessionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.StopSessionResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION:
          serviceImpl.getSession((network.cow.mooapis.session.v1.GetSessionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetSessionResponse>) responseObserver);
          break;
        case METHODID_KICK_PLAYER:
          serviceImpl.kickPlayer((network.cow.mooapis.session.v1.KickPlayerRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.KickPlayerResponse>) responseObserver);
          break;
        case METHODID_BAN_PLAYER:
          serviceImpl.banPlayer((network.cow.mooapis.session.v1.BanPlayerRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.BanPlayerResponse>) responseObserver);
          break;
        case METHODID_GET_BANS:
          serviceImpl.getBans((network.cow.mooapis.session.v1.GetBansRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetBansResponse>) responseObserver);
          break;
        case METHODID_REVOKE_BAN:
          serviceImpl.revokeBan((network.cow.mooapis.session.v1.RevokeBanRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.RevokeBanResponse>) responseObserver);
          break;
        case METHODID_SET_MAINTENANCE_MODE:
          serviceImpl.setMaintenanceMode((network.cow.mooapis.session.v1.SetMaintenanceModeRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.SetMaintenanceModeResponse>) responseObserver);
          break;
        case METHODID_BLACKLIST_PLAYER:
          serviceImpl.blacklistPlayer((network.cow.mooapis.session.v1.BlacklistPlayerRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.BlacklistPlayerResponse>) responseObserver);
          break;
        case METHODID_REVOKE_BLACKLIST_PLAYER:
          serviceImpl.revokeBlacklistPlayer((network.cow.mooapis.session.v1.RevokeBlacklistPlayerRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.RevokeBlacklistPlayerResponse>) responseObserver);
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

  private static abstract class SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return network.cow.mooapis.session.v1.SessionServiceApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SessionService");
    }
  }

  private static final class SessionServiceFileDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier {
    SessionServiceFileDescriptorSupplier() {}
  }

  private static final class SessionServiceMethodDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SessionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SessionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionServiceFileDescriptorSupplier())
              .addMethod(getCreateSessionMethod())
              .addMethod(getStopSessionMethod())
              .addMethod(getGetSessionMethod())
              .addMethod(getKickPlayerMethod())
              .addMethod(getBanPlayerMethod())
              .addMethod(getGetBansMethod())
              .addMethod(getRevokeBanMethod())
              .addMethod(getSetMaintenanceModeMethod())
              .addMethod(getBlacklistPlayerMethod())
              .addMethod(getRevokeBlacklistPlayerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
