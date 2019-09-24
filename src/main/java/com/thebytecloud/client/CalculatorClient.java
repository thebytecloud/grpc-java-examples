package com.thebytecloud.client;

import com.thebytecloud.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
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


    public static void main(String[] args) {

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 7070)
                .usePlaintext()
                .build();

        CalculatorClient calculatorClient = new CalculatorClient(managedChannel);
        //calculatorClient.unaryCall();
        //calculatorClient.serverStreamingCall();
        //calculatorClient.clientStreamingCall();
        calculatorClient.biDirectionalStreamingCall();

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

}
