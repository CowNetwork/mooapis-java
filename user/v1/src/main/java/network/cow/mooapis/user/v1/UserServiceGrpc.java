package network.cow.mooapis.user.v1;

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
    comments = "Source: cow/user/v1/user_service_api.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "cow.user.v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayerRequest,
      network.cow.mooapis.user.v1.GetPlayerResponse> getGetPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayer",
      requestType = network.cow.mooapis.user.v1.GetPlayerRequest.class,
      responseType = network.cow.mooapis.user.v1.GetPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayerRequest,
      network.cow.mooapis.user.v1.GetPlayerResponse> getGetPlayerMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayerRequest, network.cow.mooapis.user.v1.GetPlayerResponse> getGetPlayerMethod;
    if ((getGetPlayerMethod = UserServiceGrpc.getGetPlayerMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetPlayerMethod = UserServiceGrpc.getGetPlayerMethod) == null) {
          UserServiceGrpc.getGetPlayerMethod = getGetPlayerMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.user.v1.GetPlayerRequest, network.cow.mooapis.user.v1.GetPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetPlayer"))
              .build();
        }
      }
    }
    return getGetPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayerByIdRequest,
      network.cow.mooapis.user.v1.GetPlayerByIdResponse> getGetPlayerByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerById",
      requestType = network.cow.mooapis.user.v1.GetPlayerByIdRequest.class,
      responseType = network.cow.mooapis.user.v1.GetPlayerByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayerByIdRequest,
      network.cow.mooapis.user.v1.GetPlayerByIdResponse> getGetPlayerByIdMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayerByIdRequest, network.cow.mooapis.user.v1.GetPlayerByIdResponse> getGetPlayerByIdMethod;
    if ((getGetPlayerByIdMethod = UserServiceGrpc.getGetPlayerByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetPlayerByIdMethod = UserServiceGrpc.getGetPlayerByIdMethod) == null) {
          UserServiceGrpc.getGetPlayerByIdMethod = getGetPlayerByIdMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.user.v1.GetPlayerByIdRequest, network.cow.mooapis.user.v1.GetPlayerByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetPlayerByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetPlayerByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetPlayerById"))
              .build();
        }
      }
    }
    return getGetPlayerByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayersRequest,
      network.cow.mooapis.user.v1.GetPlayersResponse> getGetPlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayers",
      requestType = network.cow.mooapis.user.v1.GetPlayersRequest.class,
      responseType = network.cow.mooapis.user.v1.GetPlayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayersRequest,
      network.cow.mooapis.user.v1.GetPlayersResponse> getGetPlayersMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayersRequest, network.cow.mooapis.user.v1.GetPlayersResponse> getGetPlayersMethod;
    if ((getGetPlayersMethod = UserServiceGrpc.getGetPlayersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetPlayersMethod = UserServiceGrpc.getGetPlayersMethod) == null) {
          UserServiceGrpc.getGetPlayersMethod = getGetPlayersMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.user.v1.GetPlayersRequest, network.cow.mooapis.user.v1.GetPlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetPlayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetPlayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetPlayers"))
              .build();
        }
      }
    }
    return getGetPlayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayersByIdRequest,
      network.cow.mooapis.user.v1.GetPlayersByIdResponse> getGetPlayersByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayersById",
      requestType = network.cow.mooapis.user.v1.GetPlayersByIdRequest.class,
      responseType = network.cow.mooapis.user.v1.GetPlayersByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayersByIdRequest,
      network.cow.mooapis.user.v1.GetPlayersByIdResponse> getGetPlayersByIdMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetPlayersByIdRequest, network.cow.mooapis.user.v1.GetPlayersByIdResponse> getGetPlayersByIdMethod;
    if ((getGetPlayersByIdMethod = UserServiceGrpc.getGetPlayersByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetPlayersByIdMethod = UserServiceGrpc.getGetPlayersByIdMethod) == null) {
          UserServiceGrpc.getGetPlayersByIdMethod = getGetPlayersByIdMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.user.v1.GetPlayersByIdRequest, network.cow.mooapis.user.v1.GetPlayersByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayersById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetPlayersByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetPlayersByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetPlayersById"))
              .build();
        }
      }
    }
    return getGetPlayersByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetUserRequest,
      network.cow.mooapis.user.v1.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = network.cow.mooapis.user.v1.GetUserRequest.class,
      responseType = network.cow.mooapis.user.v1.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetUserRequest,
      network.cow.mooapis.user.v1.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetUserRequest, network.cow.mooapis.user.v1.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.user.v1.GetUserRequest, network.cow.mooapis.user.v1.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetUserPlayersRequest,
      network.cow.mooapis.user.v1.GetUserPlayersResponse> getGetUserPlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPlayers",
      requestType = network.cow.mooapis.user.v1.GetUserPlayersRequest.class,
      responseType = network.cow.mooapis.user.v1.GetUserPlayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetUserPlayersRequest,
      network.cow.mooapis.user.v1.GetUserPlayersResponse> getGetUserPlayersMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.GetUserPlayersRequest, network.cow.mooapis.user.v1.GetUserPlayersResponse> getGetUserPlayersMethod;
    if ((getGetUserPlayersMethod = UserServiceGrpc.getGetUserPlayersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserPlayersMethod = UserServiceGrpc.getGetUserPlayersMethod) == null) {
          UserServiceGrpc.getGetUserPlayersMethod = getGetUserPlayersMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.user.v1.GetUserPlayersRequest, network.cow.mooapis.user.v1.GetUserPlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetUserPlayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.GetUserPlayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserPlayers"))
              .build();
        }
      }
    }
    return getGetUserPlayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest,
      network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse> getUpdatePlayerMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlayerMetadata",
      requestType = network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest.class,
      responseType = network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest,
      network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse> getUpdatePlayerMetadataMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest, network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse> getUpdatePlayerMetadataMethod;
    if ((getUpdatePlayerMetadataMethod = UserServiceGrpc.getUpdatePlayerMetadataMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdatePlayerMetadataMethod = UserServiceGrpc.getUpdatePlayerMetadataMethod) == null) {
          UserServiceGrpc.getUpdatePlayerMetadataMethod = getUpdatePlayerMetadataMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest, network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlayerMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdatePlayerMetadata"))
              .build();
        }
      }
    }
    return getUpdatePlayerMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.UpdateUserMetadataRequest,
      network.cow.mooapis.user.v1.UpdateUserMetadataResponse> getUpdateUserMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserMetadata",
      requestType = network.cow.mooapis.user.v1.UpdateUserMetadataRequest.class,
      responseType = network.cow.mooapis.user.v1.UpdateUserMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.UpdateUserMetadataRequest,
      network.cow.mooapis.user.v1.UpdateUserMetadataResponse> getUpdateUserMetadataMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.user.v1.UpdateUserMetadataRequest, network.cow.mooapis.user.v1.UpdateUserMetadataResponse> getUpdateUserMetadataMethod;
    if ((getUpdateUserMetadataMethod = UserServiceGrpc.getUpdateUserMetadataMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMetadataMethod = UserServiceGrpc.getUpdateUserMetadataMethod) == null) {
          UserServiceGrpc.getUpdateUserMetadataMethod = getUpdateUserMetadataMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.user.v1.UpdateUserMetadataRequest, network.cow.mooapis.user.v1.UpdateUserMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.UpdateUserMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.user.v1.UpdateUserMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUserMetadata"))
              .build();
        }
      }
    }
    return getUpdateUserMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the player or creates/updates it.
     * </pre>
     */
    public void getPlayer(network.cow.mooapis.user.v1.GetPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the player or creates/updates it.
     * </pre>
     */
    public void getPlayerById(network.cow.mooapis.user.v1.GetPlayerByIdRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayerByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the players or creates/updates them.
     * </pre>
     */
    public void getPlayers(network.cow.mooapis.user.v1.GetPlayersRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the players or creates/updates them.
     * </pre>
     */
    public void getPlayersById(network.cow.mooapis.user.v1.GetPlayersByIdRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayersByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayersByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the user by id.
     * </pre>
     */
    public void getUser(network.cow.mooapis.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the players assigned to this user.
     * </pre>
     */
    public void getUserPlayers(network.cow.mooapis.user.v1.GetUserPlayersRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetUserPlayersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserPlayersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata and returns the player.
     * </pre>
     */
    public void updatePlayerMetadata(network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePlayerMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata and returns the user.
     * </pre>
     */
    public void updateUserMetadata(network.cow.mooapis.user.v1.UpdateUserMetadataRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.UpdateUserMetadataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMetadataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.user.v1.GetPlayerRequest,
                network.cow.mooapis.user.v1.GetPlayerResponse>(
                  this, METHODID_GET_PLAYER)))
          .addMethod(
            getGetPlayerByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.user.v1.GetPlayerByIdRequest,
                network.cow.mooapis.user.v1.GetPlayerByIdResponse>(
                  this, METHODID_GET_PLAYER_BY_ID)))
          .addMethod(
            getGetPlayersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.user.v1.GetPlayersRequest,
                network.cow.mooapis.user.v1.GetPlayersResponse>(
                  this, METHODID_GET_PLAYERS)))
          .addMethod(
            getGetPlayersByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.user.v1.GetPlayersByIdRequest,
                network.cow.mooapis.user.v1.GetPlayersByIdResponse>(
                  this, METHODID_GET_PLAYERS_BY_ID)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.user.v1.GetUserRequest,
                network.cow.mooapis.user.v1.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetUserPlayersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.user.v1.GetUserPlayersRequest,
                network.cow.mooapis.user.v1.GetUserPlayersResponse>(
                  this, METHODID_GET_USER_PLAYERS)))
          .addMethod(
            getUpdatePlayerMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest,
                network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse>(
                  this, METHODID_UPDATE_PLAYER_METADATA)))
          .addMethod(
            getUpdateUserMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.user.v1.UpdateUserMetadataRequest,
                network.cow.mooapis.user.v1.UpdateUserMetadataResponse>(
                  this, METHODID_UPDATE_USER_METADATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the player or creates/updates it.
     * </pre>
     */
    public void getPlayer(network.cow.mooapis.user.v1.GetPlayerRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the player or creates/updates it.
     * </pre>
     */
    public void getPlayerById(network.cow.mooapis.user.v1.GetPlayerByIdRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayerByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the players or creates/updates them.
     * </pre>
     */
    public void getPlayers(network.cow.mooapis.user.v1.GetPlayersRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the players or creates/updates them.
     * </pre>
     */
    public void getPlayersById(network.cow.mooapis.user.v1.GetPlayersByIdRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayersByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayersByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the user by id.
     * </pre>
     */
    public void getUser(network.cow.mooapis.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the players assigned to this user.
     * </pre>
     */
    public void getUserPlayers(network.cow.mooapis.user.v1.GetUserPlayersRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetUserPlayersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserPlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata and returns the player.
     * </pre>
     */
    public void updatePlayerMetadata(network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePlayerMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata and returns the user.
     * </pre>
     */
    public void updateUserMetadata(network.cow.mooapis.user.v1.UpdateUserMetadataRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.UpdateUserMetadataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the player or creates/updates it.
     * </pre>
     */
    public network.cow.mooapis.user.v1.GetPlayerResponse getPlayer(network.cow.mooapis.user.v1.GetPlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the player or creates/updates it.
     * </pre>
     */
    public network.cow.mooapis.user.v1.GetPlayerByIdResponse getPlayerById(network.cow.mooapis.user.v1.GetPlayerByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the players or creates/updates them.
     * </pre>
     */
    public network.cow.mooapis.user.v1.GetPlayersResponse getPlayers(network.cow.mooapis.user.v1.GetPlayersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the players or creates/updates them.
     * </pre>
     */
    public network.cow.mooapis.user.v1.GetPlayersByIdResponse getPlayersById(network.cow.mooapis.user.v1.GetPlayersByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayersByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the user by id.
     * </pre>
     */
    public network.cow.mooapis.user.v1.GetUserResponse getUser(network.cow.mooapis.user.v1.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the players assigned to this user.
     * </pre>
     */
    public network.cow.mooapis.user.v1.GetUserPlayersResponse getUserPlayers(network.cow.mooapis.user.v1.GetUserPlayersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserPlayersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the metadata and returns the player.
     * </pre>
     */
    public network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse updatePlayerMetadata(network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePlayerMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the metadata and returns the user.
     * </pre>
     */
    public network.cow.mooapis.user.v1.UpdateUserMetadataResponse updateUserMetadata(network.cow.mooapis.user.v1.UpdateUserMetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the player or creates/updates it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.user.v1.GetPlayerResponse> getPlayer(
        network.cow.mooapis.user.v1.GetPlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the player or creates/updates it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.user.v1.GetPlayerByIdResponse> getPlayerById(
        network.cow.mooapis.user.v1.GetPlayerByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the players or creates/updates them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.user.v1.GetPlayersResponse> getPlayers(
        network.cow.mooapis.user.v1.GetPlayersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the players or creates/updates them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.user.v1.GetPlayersByIdResponse> getPlayersById(
        network.cow.mooapis.user.v1.GetPlayersByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayersByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the user by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.user.v1.GetUserResponse> getUser(
        network.cow.mooapis.user.v1.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the players assigned to this user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.user.v1.GetUserPlayersResponse> getUserPlayers(
        network.cow.mooapis.user.v1.GetUserPlayersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserPlayersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the metadata and returns the player.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse> updatePlayerMetadata(
        network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePlayerMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the metadata and returns the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.user.v1.UpdateUserMetadataResponse> updateUserMetadata(
        network.cow.mooapis.user.v1.UpdateUserMetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PLAYER = 0;
  private static final int METHODID_GET_PLAYER_BY_ID = 1;
  private static final int METHODID_GET_PLAYERS = 2;
  private static final int METHODID_GET_PLAYERS_BY_ID = 3;
  private static final int METHODID_GET_USER = 4;
  private static final int METHODID_GET_USER_PLAYERS = 5;
  private static final int METHODID_UPDATE_PLAYER_METADATA = 6;
  private static final int METHODID_UPDATE_USER_METADATA = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PLAYER:
          serviceImpl.getPlayer((network.cow.mooapis.user.v1.GetPlayerRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayerResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_BY_ID:
          serviceImpl.getPlayerById((network.cow.mooapis.user.v1.GetPlayerByIdRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayerByIdResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYERS:
          serviceImpl.getPlayers((network.cow.mooapis.user.v1.GetPlayersRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayersResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYERS_BY_ID:
          serviceImpl.getPlayersById((network.cow.mooapis.user.v1.GetPlayersByIdRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetPlayersByIdResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((network.cow.mooapis.user.v1.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PLAYERS:
          serviceImpl.getUserPlayers((network.cow.mooapis.user.v1.GetUserPlayersRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.GetUserPlayersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PLAYER_METADATA:
          serviceImpl.updatePlayerMetadata((network.cow.mooapis.user.v1.UpdatePlayerMetadataRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.UpdatePlayerMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_METADATA:
          serviceImpl.updateUserMetadata((network.cow.mooapis.user.v1.UpdateUserMetadataRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.user.v1.UpdateUserMetadataResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return network.cow.mooapis.user.v1.UserServiceApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetPlayerMethod())
              .addMethod(getGetPlayerByIdMethod())
              .addMethod(getGetPlayersMethod())
              .addMethod(getGetPlayersByIdMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUserPlayersMethod())
              .addMethod(getUpdatePlayerMetadataMethod())
              .addMethod(getUpdateUserMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
