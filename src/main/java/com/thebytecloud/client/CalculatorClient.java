package com.thebytecloud.client;

import com.thebytecloud.calculator.CalculatorServiceGrpc;
import com.thebytecloud.calculator.SumRequest;
import com.thebytecloud.calculator.SumResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

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
        calculatorClient.doUnaryCall();

    }

    private void doUnaryCall() {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(managedChannel);

        SumRequest request = SumRequest.newBuilder()
                .setFirstNumber(10)
                .setSecondNumber(20)
                .build();

        SumResponse response = stub.sum(request);

        System.out.println(request.getFirstNumber() + " + " + request.getSecondNumber() + "=" + response.getSumResult());

    }
}
