package network.cow.mooapis.instance.v1;

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
 * InstanceService handles operations regarding instances.
 * Currently only CRUD like operations are supported.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: cow/instance/v1/instance_service_api.proto")
public final class InstanceServiceGrpc {

  private InstanceServiceGrpc() {}

  public static final String SERVICE_NAME = "cow.instance.v1.InstanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.CreateInstanceRequest,
      network.cow.mooapis.instance.v1.CreateInstanceResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = network.cow.mooapis.instance.v1.CreateInstanceRequest.class,
      responseType = network.cow.mooapis.instance.v1.CreateInstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.CreateInstanceRequest,
      network.cow.mooapis.instance.v1.CreateInstanceResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.CreateInstanceRequest, network.cow.mooapis.instance.v1.CreateInstanceResponse> getCreateMethod;
    if ((getCreateMethod = InstanceServiceGrpc.getCreateMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getCreateMethod = InstanceServiceGrpc.getCreateMethod) == null) {
          InstanceServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.instance.v1.CreateInstanceRequest, network.cow.mooapis.instance.v1.CreateInstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.instance.v1.CreateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.instance.v1.CreateInstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.EndInstanceRequest,
      network.cow.mooapis.instance.v1.EndInstanceResponse> getEndMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "End",
      requestType = network.cow.mooapis.instance.v1.EndInstanceRequest.class,
      responseType = network.cow.mooapis.instance.v1.EndInstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.EndInstanceRequest,
      network.cow.mooapis.instance.v1.EndInstanceResponse> getEndMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.EndInstanceRequest, network.cow.mooapis.instance.v1.EndInstanceResponse> getEndMethod;
    if ((getEndMethod = InstanceServiceGrpc.getEndMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getEndMethod = InstanceServiceGrpc.getEndMethod) == null) {
          InstanceServiceGrpc.getEndMethod = getEndMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.instance.v1.EndInstanceRequest, network.cow.mooapis.instance.v1.EndInstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "End"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.instance.v1.EndInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.instance.v1.EndInstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("End"))
              .build();
        }
      }
    }
    return getEndMethod;
  }

  private static volatile io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.GetInstanceRequest,
      network.cow.mooapis.instance.v1.GetInstanceResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = network.cow.mooapis.instance.v1.GetInstanceRequest.class,
      responseType = network.cow.mooapis.instance.v1.GetInstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.GetInstanceRequest,
      network.cow.mooapis.instance.v1.GetInstanceResponse> getGetMethod() {
    io.grpc.MethodDescriptor<network.cow.mooapis.instance.v1.GetInstanceRequest, network.cow.mooapis.instance.v1.GetInstanceResponse> getGetMethod;
    if ((getGetMethod = InstanceServiceGrpc.getGetMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getGetMethod = InstanceServiceGrpc.getGetMethod) == null) {
          InstanceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<network.cow.mooapis.instance.v1.GetInstanceRequest, network.cow.mooapis.instance.v1.GetInstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.instance.v1.GetInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  network.cow.mooapis.instance.v1.GetInstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceServiceStub newStub(io.grpc.Channel channel) {
    return new InstanceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstanceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstanceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * InstanceService handles operations regarding instances.
   * Currently only CRUD like operations are supported.
   * </pre>
   */
  public static abstract class InstanceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a new instance in the cluster
     * </pre>
     */
    public void create(network.cow.mooapis.instance.v1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.CreateInstanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * End marks Instance as ended
     * </pre>
     */
    public void end(network.cow.mooapis.instance.v1.EndInstanceRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.EndInstanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEndMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get retrieves information about an existing instance
     * </pre>
     */
    public void get(network.cow.mooapis.instance.v1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.GetInstanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.instance.v1.CreateInstanceRequest,
                network.cow.mooapis.instance.v1.CreateInstanceResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getEndMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.instance.v1.EndInstanceRequest,
                network.cow.mooapis.instance.v1.EndInstanceResponse>(
                  this, METHODID_END)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                network.cow.mooapis.instance.v1.GetInstanceRequest,
                network.cow.mooapis.instance.v1.GetInstanceResponse>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   * <pre>
   * InstanceService handles operations regarding instances.
   * Currently only CRUD like operations are supported.
   * </pre>
   */
  public static final class InstanceServiceStub extends io.grpc.stub.AbstractStub<InstanceServiceStub> {
    private InstanceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new instance in the cluster
     * </pre>
     */
    public void create(network.cow.mooapis.instance.v1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.CreateInstanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * End marks Instance as ended
     * </pre>
     */
    public void end(network.cow.mooapis.instance.v1.EndInstanceRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.EndInstanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEndMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get retrieves information about an existing instance
     * </pre>
     */
    public void get(network.cow.mooapis.instance.v1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.GetInstanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * InstanceService handles operations regarding instances.
   * Currently only CRUD like operations are supported.
   * </pre>
   */
  public static final class InstanceServiceBlockingStub extends io.grpc.stub.AbstractStub<InstanceServiceBlockingStub> {
    private InstanceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new instance in the cluster
     * </pre>
     */
    public network.cow.mooapis.instance.v1.CreateInstanceResponse create(network.cow.mooapis.instance.v1.CreateInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * End marks Instance as ended
     * </pre>
     */
    public network.cow.mooapis.instance.v1.EndInstanceResponse end(network.cow.mooapis.instance.v1.EndInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getEndMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get retrieves information about an existing instance
     * </pre>
     */
    public network.cow.mooapis.instance.v1.GetInstanceResponse get(network.cow.mooapis.instance.v1.GetInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * InstanceService handles operations regarding instances.
   * Currently only CRUD like operations are supported.
   * </pre>
   */
  public static final class InstanceServiceFutureStub extends io.grpc.stub.AbstractStub<InstanceServiceFutureStub> {
    private InstanceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new instance in the cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.instance.v1.CreateInstanceResponse> create(
        network.cow.mooapis.instance.v1.CreateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * End marks Instance as ended
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.instance.v1.EndInstanceResponse> end(
        network.cow.mooapis.instance.v1.EndInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEndMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get retrieves information about an existing instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<network.cow.mooapis.instance.v1.GetInstanceResponse> get(
        network.cow.mooapis.instance.v1.GetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_END = 1;
  private static final int METHODID_GET = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((network.cow.mooapis.instance.v1.CreateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.CreateInstanceResponse>) responseObserver);
          break;
        case METHODID_END:
          serviceImpl.end((network.cow.mooapis.instance.v1.EndInstanceRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.EndInstanceResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((network.cow.mooapis.instance.v1.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<network.cow.mooapis.instance.v1.GetInstanceResponse>) responseObserver);
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

  private static abstract class InstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return network.cow.mooapis.instance.v1.InstanceServiceApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstanceService");
    }
  }

  private static final class InstanceServiceFileDescriptorSupplier
      extends InstanceServiceBaseDescriptorSupplier {
    InstanceServiceFileDescriptorSupplier() {}
  }

  private static final class InstanceServiceMethodDescriptorSupplier
      extends InstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InstanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getEndMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
