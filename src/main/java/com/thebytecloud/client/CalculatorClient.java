package com.thebytecloud.client;

import com.thebytecloud.calculator.*;
import com.thebytecloud.greeting.GreetingServiceGrpc;
import com.thebytecloud.greeting.HelloRequest;
import com.thebytecloud.greeting.HelloResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {

    private final ManagedChannel managedChannel;

    public CalculatorClient(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
    }


    public static void main(String[] args) throws InterruptedException {

        String server = "localhost";
        int serverPort = 7070;

        if(System.getenv("SERVER_PORT") != null)
            serverPort = Integer.parseInt(System.getenv("SERVER_PORT"));

        if(System.getenv("SERVER") != null)
            server = System.getenv("SERVER");


        System.out.println("server = " + server+":"+serverPort);

        Thread.sleep(2000);

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(server, serverPort)
                .usePlaintext()
                .build();

        CalculatorClient calculatorClient = new CalculatorClient(managedChannel);
        //calculatorClient.unaryCall();
        //calculatorClient.serverStreamingCall();
        //calculatorClient.clientStreamingCall();
        //calculatorClient.biDirectionalStreamingCall();
        //calculatorClient.errorHandling();
        calculatorClient.sayHello();

    }

    private void unaryCall() {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(managedChannel);

        SumRequest request = SumRequest.newBuilder()
                .setFirstNumber(10)
                .setSecondNumber(20)
                .build();

        SumResponse response = stub.sum(request);

        System.out.println(request.getFirstNumber() + " + " + request.getSecondNumber() + "=" + response.getSumResult());

    }

    private void serverStreamingCall() {

        long number = 500L;

        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(managedChannel);

        PrimeNumberDecompositionRequest request = PrimeNumberDecompositionRequest.newBuilder()
                .setNumber(number).build();

        final Iterator<PrimeNumberDecompositionResponse> iterator = stub.primeNumbeDecomposition(request);
        iterator.forEachRemaining(primeNumberDecompositionResponse -> {
            System.out.println("Prime Factor = " + primeNumberDecompositionResponse);
        });

    }

    private void clientStreamingCall() {

        final CalculatorServiceGrpc.CalculatorServiceStub asyncStub = CalculatorServiceGrpc.newStub(managedChannel);

        CountDownLatch latch = new CountDownLatch(1);

        //Creating response observer. This will be called whenever response received from server.
        StreamObserver<ComputeAverageResponse> responseObserver = new StreamObserver<ComputeAverageResponse>() {
            @Override
            public void onNext(ComputeAverageResponse computeAverageResponse) {
                System.out.println("Received average = " + computeAverageResponse.getAverage());
            }

            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending response!");
                latch.countDown();
            }
        };

        //Getting request observer to send the request messages
        StreamObserver<ComputeAverageRequest> requestObserver = asyncStub.computeAverage(responseObserver);

        //sending 10000 messages to server (Client streaming)
        for (int i = 0; i < 10000; i++) {
            requestObserver.onNext(ComputeAverageRequest.newBuilder()
                    .setNumber(i)
                    .build());
        }

        //done with streaming. should call completed.
        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void biDirectionalStreamingCall() {

        final CalculatorServiceGrpc.CalculatorServiceStub asyncStub = CalculatorServiceGrpc.newStub(managedChannel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<FindMaxResponse> responseObserver = new StreamObserver<FindMaxResponse>() {
            @Override
            public void onNext(FindMaxResponse findMaxResponse) {
                System.out.println("Got maximum from server = "+findMaxResponse.getResponse());
            }

            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done with messages");
                latch.countDown();
            }
        };

        StreamObserver<FindMaxRequest> requestObserver = asyncStub.findMax(responseObserver);

        Arrays.asList(3,5,17,9,8,30,12).forEach(number -> {
            requestObserver.onNext(FindMaxRequest.newBuilder()
                    .setNumber(number)
                    .build());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void errorHandling() {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(managedChannel);

        int number = -1;
        try{
            stub.findSquareRoot(SquareRootRequest.newBuilder().setNumber(number).build());
        } catch (StatusRuntimeException e){
            System.out.println("Exception on Square Root..."+ e.getLocalizedMessage());
            e.printStackTrace();
        }

    }

    private void sayHello() throws InterruptedException {
        final GreetingServiceGrpc.GreetingServiceBlockingStub
                blockingStub = GreetingServiceGrpc.newBlockingStub(managedChannel);

        final HelloRequest request = HelloRequest.newBuilder().setName("Nantha").build();

        while (true){
            HelloResponse response = blockingStub.sayHello(request);
            System.out.println("response = " + response.getResponse());
            Thread.sleep(2000);
        }
    }

}
