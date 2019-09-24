package com.thebytecloud.client;

import com.thebytecloud.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

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
        calculatorClient.serverStreamingCall();

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

}
