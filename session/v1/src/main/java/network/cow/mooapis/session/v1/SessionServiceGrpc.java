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
      network.cow.mooapis.session.v1.CreateSessionResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = network.cow.mooapis.session.v1.CreateSessionRequest.class,
      responseType = network.cow.mooapis.session.v1.CreateSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.CreateSessionRequest,
      network.cow.mooapis.session.v1.CreateSessionResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.CreateSessionRequest, network.cow.mooapis.session.v1.CreateSessionResponse> getCreateMethod;
    if ((getCreateMethod = SessionServiceGrpc.getCreateMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getCreateMethod = SessionServiceGrpc.getCreateMethod) == null) {
          SessionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.CreateSessionRequest, network.cow.mooapis.session.v1.CreateSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.CreateSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.CreateSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.StopSessionRequest,
      network.cow.mooapis.session.v1.StopSessionResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = network.cow.mooapis.session.v1.StopSessionRequest.class,
      responseType = network.cow.mooapis.session.v1.StopSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.StopSessionRequest,
      network.cow.mooapis.session.v1.StopSessionResponse> getStopMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.StopSessionRequest, network.cow.mooapis.session.v1.StopSessionResponse> getStopMethod;
    if ((getStopMethod = SessionServiceGrpc.getStopMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getStopMethod = SessionServiceGrpc.getStopMethod) == null) {
          SessionServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.StopSessionRequest, network.cow.mooapis.session.v1.StopSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.StopSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.StopSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetSessionRequest,
      network.cow.mooapis.session.v1.GetSessionResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = network.cow.mooapis.session.v1.GetSessionRequest.class,
      responseType = network.cow.mooapis.session.v1.GetSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetSessionRequest,
      network.cow.mooapis.session.v1.GetSessionResponse> getGetMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.session.v1.GetSessionRequest, network.cow.mooapis.session.v1.GetSessionResponse> getGetMethod;
    if ((getGetMethod = SessionServiceGrpc.getGetMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getGetMethod = SessionServiceGrpc.getGetMethod) == null) {
          SessionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.session.v1.GetSessionRequest, network.cow.mooapis.session.v1.GetSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.GetSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.session.v1.GetSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
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
     * Create creates a new session
     * </pre>
     */
    public void create(network.cow.mooapis.session.v1.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.CreateSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops and removes a session
     * </pre>
     */
    public void stop(network.cow.mooapis.session.v1.StopSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.StopSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get retrieves information about a existing session
     * </pre>
     */
    public void get(network.cow.mooapis.session.v1.GetSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.CreateSessionRequest,
                network.cow.mooapis.session.v1.CreateSessionResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.StopSessionRequest,
                network.cow.mooapis.session.v1.StopSessionResponse>(
                  this, METHODID_STOP)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.session.v1.GetSessionRequest,
                network.cow.mooapis.session.v1.GetSessionResponse>(
                  this, METHODID_GET)))
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
     * Create creates a new session
     * </pre>
     */
    public void create(network.cow.mooapis.session.v1.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.CreateSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop stops and removes a session
     * </pre>
     */
    public void stop(network.cow.mooapis.session.v1.StopSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.StopSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get retrieves information about a existing session
     * </pre>
     */
    public void get(network.cow.mooapis.session.v1.GetSessionRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
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
     * Create creates a new session
     * </pre>
     */
    public network.cow.mooapis.session.v1.CreateSessionResponse create(network.cow.mooapis.session.v1.CreateSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop stops and removes a session
     * </pre>
     */
    public network.cow.mooapis.session.v1.StopSessionResponse stop(network.cow.mooapis.session.v1.StopSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get retrieves information about a existing session
     * </pre>
     */
    public network.cow.mooapis.session.v1.GetSessionResponse get(network.cow.mooapis.session.v1.GetSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
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
     * Create creates a new session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.CreateSessionResponse> create(
        network.cow.mooapis.session.v1.CreateSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop stops and removes a session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.StopSessionResponse> stop(
        network.cow.mooapis.session.v1.StopSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get retrieves information about a existing session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.session.v1.GetSessionResponse> get(
        network.cow.mooapis.session.v1.GetSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_STOP = 1;
  private static final int METHODID_GET = 2;

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
        case METHODID_CREATE:
          serviceImpl.create((network.cow.mooapis.session.v1.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.CreateSessionResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((network.cow.mooapis.session.v1.StopSessionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.StopSessionResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((network.cow.mooapis.session.v1.GetSessionRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.session.v1.GetSessionResponse>) responseObserver);
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
              .addMethod(getCreateMethod())
              .addMethod(getStopMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
