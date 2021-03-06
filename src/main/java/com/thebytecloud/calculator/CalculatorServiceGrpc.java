package com.thebytecloud.calculator;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: calculator.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.thebytecloud.calculator.SumRequest,
      com.thebytecloud.calculator.SumResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.thebytecloud.calculator.SumRequest.class,
      responseType = com.thebytecloud.calculator.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thebytecloud.calculator.SumRequest,
      com.thebytecloud.calculator.SumResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.thebytecloud.calculator.SumRequest, com.thebytecloud.calculator.SumResponse> getSumMethod;
    if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
          CalculatorServiceGrpc.getSumMethod = getSumMethod = 
              io.grpc.MethodDescriptor.<com.thebytecloud.calculator.SumRequest, com.thebytecloud.calculator.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.SumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Sum"))
                  .build();
          }
        }
     }
     return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thebytecloud.calculator.PrimeNumberDecompositionRequest,
      com.thebytecloud.calculator.PrimeNumberDecompositionResponse> getPrimeNumbeDecompositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrimeNumbeDecomposition",
      requestType = com.thebytecloud.calculator.PrimeNumberDecompositionRequest.class,
      responseType = com.thebytecloud.calculator.PrimeNumberDecompositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.thebytecloud.calculator.PrimeNumberDecompositionRequest,
      com.thebytecloud.calculator.PrimeNumberDecompositionResponse> getPrimeNumbeDecompositionMethod() {
    io.grpc.MethodDescriptor<com.thebytecloud.calculator.PrimeNumberDecompositionRequest, com.thebytecloud.calculator.PrimeNumberDecompositionResponse> getPrimeNumbeDecompositionMethod;
    if ((getPrimeNumbeDecompositionMethod = CalculatorServiceGrpc.getPrimeNumbeDecompositionMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPrimeNumbeDecompositionMethod = CalculatorServiceGrpc.getPrimeNumbeDecompositionMethod) == null) {
          CalculatorServiceGrpc.getPrimeNumbeDecompositionMethod = getPrimeNumbeDecompositionMethod = 
              io.grpc.MethodDescriptor.<com.thebytecloud.calculator.PrimeNumberDecompositionRequest, com.thebytecloud.calculator.PrimeNumberDecompositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "PrimeNumbeDecomposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.PrimeNumberDecompositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.PrimeNumberDecompositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("PrimeNumbeDecomposition"))
                  .build();
          }
        }
     }
     return getPrimeNumbeDecompositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thebytecloud.calculator.ComputeAverageRequest,
      com.thebytecloud.calculator.ComputeAverageResponse> getComputeAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ComputeAverage",
      requestType = com.thebytecloud.calculator.ComputeAverageRequest.class,
      responseType = com.thebytecloud.calculator.ComputeAverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.thebytecloud.calculator.ComputeAverageRequest,
      com.thebytecloud.calculator.ComputeAverageResponse> getComputeAverageMethod() {
    io.grpc.MethodDescriptor<com.thebytecloud.calculator.ComputeAverageRequest, com.thebytecloud.calculator.ComputeAverageResponse> getComputeAverageMethod;
    if ((getComputeAverageMethod = CalculatorServiceGrpc.getComputeAverageMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getComputeAverageMethod = CalculatorServiceGrpc.getComputeAverageMethod) == null) {
          CalculatorServiceGrpc.getComputeAverageMethod = getComputeAverageMethod = 
              io.grpc.MethodDescriptor.<com.thebytecloud.calculator.ComputeAverageRequest, com.thebytecloud.calculator.ComputeAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "ComputeAverage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.ComputeAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.ComputeAverageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("ComputeAverage"))
                  .build();
          }
        }
     }
     return getComputeAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thebytecloud.calculator.FindMaxRequest,
      com.thebytecloud.calculator.FindMaxResponse> getFindMaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMax",
      requestType = com.thebytecloud.calculator.FindMaxRequest.class,
      responseType = com.thebytecloud.calculator.FindMaxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.thebytecloud.calculator.FindMaxRequest,
      com.thebytecloud.calculator.FindMaxResponse> getFindMaxMethod() {
    io.grpc.MethodDescriptor<com.thebytecloud.calculator.FindMaxRequest, com.thebytecloud.calculator.FindMaxResponse> getFindMaxMethod;
    if ((getFindMaxMethod = CalculatorServiceGrpc.getFindMaxMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindMaxMethod = CalculatorServiceGrpc.getFindMaxMethod) == null) {
          CalculatorServiceGrpc.getFindMaxMethod = getFindMaxMethod = 
              io.grpc.MethodDescriptor.<com.thebytecloud.calculator.FindMaxRequest, com.thebytecloud.calculator.FindMaxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "FindMax"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.FindMaxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.FindMaxResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("FindMax"))
                  .build();
          }
        }
     }
     return getFindMaxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thebytecloud.calculator.SquareRootRequest,
      com.thebytecloud.calculator.SquareRootResponse> getFindSquareRootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindSquareRoot",
      requestType = com.thebytecloud.calculator.SquareRootRequest.class,
      responseType = com.thebytecloud.calculator.SquareRootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thebytecloud.calculator.SquareRootRequest,
      com.thebytecloud.calculator.SquareRootResponse> getFindSquareRootMethod() {
    io.grpc.MethodDescriptor<com.thebytecloud.calculator.SquareRootRequest, com.thebytecloud.calculator.SquareRootResponse> getFindSquareRootMethod;
    if ((getFindSquareRootMethod = CalculatorServiceGrpc.getFindSquareRootMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindSquareRootMethod = CalculatorServiceGrpc.getFindSquareRootMethod) == null) {
          CalculatorServiceGrpc.getFindSquareRootMethod = getFindSquareRootMethod = 
              io.grpc.MethodDescriptor.<com.thebytecloud.calculator.SquareRootRequest, com.thebytecloud.calculator.SquareRootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "FindSquareRoot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.SquareRootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thebytecloud.calculator.SquareRootResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("FindSquareRoot"))
                  .build();
          }
        }
     }
     return getFindSquareRootMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    return new CalculatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary call rpc
     * </pre>
     */
    public void sum(com.thebytecloud.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.SumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Server streaming rpc
     * </pre>
     */
    public void primeNumbeDecomposition(com.thebytecloud.calculator.PrimeNumberDecompositionRequest request,
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.PrimeNumberDecompositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimeNumbeDecompositionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Client streaming rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.thebytecloud.calculator.ComputeAverageRequest> computeAverage(
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.ComputeAverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getComputeAverageMethod(), responseObserver);
    }

    /**
     * <pre>
     *Bi directional rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.thebytecloud.calculator.FindMaxRequest> findMax(
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.FindMaxResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFindMaxMethod(), responseObserver);
    }

    /**
     * <pre>
     *Error handling
     *Error will be sent if request number is negative. Error type will be  INVALID_ARGUMENT
     * </pre>
     */
    public void findSquareRoot(com.thebytecloud.calculator.SquareRootRequest request,
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.SquareRootResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindSquareRootMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.thebytecloud.calculator.SumRequest,
                com.thebytecloud.calculator.SumResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getPrimeNumbeDecompositionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.thebytecloud.calculator.PrimeNumberDecompositionRequest,
                com.thebytecloud.calculator.PrimeNumberDecompositionResponse>(
                  this, METHODID_PRIME_NUMBE_DECOMPOSITION)))
          .addMethod(
            getComputeAverageMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.thebytecloud.calculator.ComputeAverageRequest,
                com.thebytecloud.calculator.ComputeAverageResponse>(
                  this, METHODID_COMPUTE_AVERAGE)))
          .addMethod(
            getFindMaxMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.thebytecloud.calculator.FindMaxRequest,
                com.thebytecloud.calculator.FindMaxResponse>(
                  this, METHODID_FIND_MAX)))
          .addMethod(
            getFindSquareRootMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.thebytecloud.calculator.SquareRootRequest,
                com.thebytecloud.calculator.SquareRootResponse>(
                  this, METHODID_FIND_SQUARE_ROOT)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractStub<CalculatorServiceStub> {
    private CalculatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary call rpc
     * </pre>
     */
    public void sum(com.thebytecloud.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.SumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Server streaming rpc
     * </pre>
     */
    public void primeNumbeDecomposition(com.thebytecloud.calculator.PrimeNumberDecompositionRequest request,
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.PrimeNumberDecompositionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPrimeNumbeDecompositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client streaming rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.thebytecloud.calculator.ComputeAverageRequest> computeAverage(
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.ComputeAverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getComputeAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Bi directional rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.thebytecloud.calculator.FindMaxRequest> findMax(
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.FindMaxResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFindMaxMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Error handling
     *Error will be sent if request number is negative. Error type will be  INVALID_ARGUMENT
     * </pre>
     */
    public void findSquareRoot(com.thebytecloud.calculator.SquareRootRequest request,
        io.grpc.stub.StreamObserver<com.thebytecloud.calculator.SquareRootResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindSquareRootMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary call rpc
     * </pre>
     */
    public com.thebytecloud.calculator.SumResponse sum(com.thebytecloud.calculator.SumRequest request) {
      return blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server streaming rpc
     * </pre>
     */
    public java.util.Iterator<com.thebytecloud.calculator.PrimeNumberDecompositionResponse> primeNumbeDecomposition(
        com.thebytecloud.calculator.PrimeNumberDecompositionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPrimeNumbeDecompositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Error handling
     *Error will be sent if request number is negative. Error type will be  INVALID_ARGUMENT
     * </pre>
     */
    public com.thebytecloud.calculator.SquareRootResponse findSquareRoot(com.thebytecloud.calculator.SquareRootRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindSquareRootMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary call rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thebytecloud.calculator.SumResponse> sum(
        com.thebytecloud.calculator.SumRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Error handling
     *Error will be sent if request number is negative. Error type will be  INVALID_ARGUMENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thebytecloud.calculator.SquareRootResponse> findSquareRoot(
        com.thebytecloud.calculator.SquareRootRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindSquareRootMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_PRIME_NUMBE_DECOMPOSITION = 1;
  private static final int METHODID_FIND_SQUARE_ROOT = 2;
  private static final int METHODID_COMPUTE_AVERAGE = 3;
  private static final int METHODID_FIND_MAX = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.thebytecloud.calculator.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.thebytecloud.calculator.SumResponse>) responseObserver);
          break;
        case METHODID_PRIME_NUMBE_DECOMPOSITION:
          serviceImpl.primeNumbeDecomposition((com.thebytecloud.calculator.PrimeNumberDecompositionRequest) request,
              (io.grpc.stub.StreamObserver<com.thebytecloud.calculator.PrimeNumberDecompositionResponse>) responseObserver);
          break;
        case METHODID_FIND_SQUARE_ROOT:
          serviceImpl.findSquareRoot((com.thebytecloud.calculator.SquareRootRequest) request,
              (io.grpc.stub.StreamObserver<com.thebytecloud.calculator.SquareRootResponse>) responseObserver);
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
        case METHODID_COMPUTE_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.computeAverage(
              (io.grpc.stub.StreamObserver<com.thebytecloud.calculator.ComputeAverageResponse>) responseObserver);
        case METHODID_FIND_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMax(
              (io.grpc.stub.StreamObserver<com.thebytecloud.calculator.FindMaxResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.thebytecloud.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getPrimeNumbeDecompositionMethod())
              .addMethod(getComputeAverageMethod())
              .addMethod(getFindMaxMethod())
              .addMethod(getFindSquareRootMethod())
              .build();
        }
      }
    }
    return result;
  }
}
