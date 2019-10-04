package com.thebytecloud.server;

import com.thebytecloud.greeting.GreetingServiceGrpc;
import com.thebytecloud.greeting.HelloRequest;
import com.thebytecloud.greeting.HelloResponse;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        final HelloResponse response = HelloResponse.newBuilder()
                .setResponse("Hello " + request.getName() + ", from " + System.getenv("HOSTNAME"))
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }
}
