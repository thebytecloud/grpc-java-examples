package com.thebytecloud.server;

import com.thebytecloud.calculator.*;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {

        SumResponse sumResponse = SumResponse.newBuilder()
                .setSumResult(request.getFirstNumber() + request.getSecondNumber())
                .build();

        responseObserver.onNext(sumResponse);

        responseObserver.onCompleted();

    }

    @Override
    public void primeNumbeDecomposition(PrimeNumberDecompositionRequest request, StreamObserver<PrimeNumberDecompositionResponse> responseObserver) {

        long number = request.getNumber();
        long divisor = 2L;

        while(number > 1) {
            if(number % divisor == 0){
                number = number / divisor;
                responseObserver.onNext(
                        PrimeNumberDecompositionResponse.newBuilder()
                                .setPrimeFactor(divisor)
                                .build()
                );
                System.out.println("Prime Factor = "+ divisor);
            } else {
                divisor = divisor + 1;
            }
        }

        responseObserver.onCompleted();

    }

    @Override
    public StreamObserver<ComputeAverageRequest> computeAverage(StreamObserver<ComputeAverageResponse> responseObserver) {

        final StreamObserver<ComputeAverageRequest> requestStreamObserver = new StreamObserver<ComputeAverageRequest>() {

            int sum = 0;
            int count = 0;

            @Override
            public void onNext(ComputeAverageRequest computeAverageRequest) {
                sum += computeAverageRequest.getNumber();
                count++;
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                double average = (double) sum / count;
                responseObserver.onNext(ComputeAverageResponse.newBuilder()
                        .setAverage(average).build());
                responseObserver.onCompleted();
            }
        };

        return requestStreamObserver;
    }

    @Override
    public StreamObserver<FindMaxRequest> findMax(StreamObserver<FindMaxResponse> responseObserver) {
        StreamObserver<FindMaxRequest> requestObserver = new StreamObserver<FindMaxRequest>() {

            int currentMax = 0;

            @Override
            public void onNext(FindMaxRequest findMaxRequest) {
                int currentNumber = findMaxRequest.getNumber();
                System.out.println("Received number = " + currentNumber);

                if(currentNumber > currentMax) {
                    currentMax = currentNumber;
                    responseObserver.onNext(FindMaxResponse.newBuilder()
                            .setResponse(currentMax)
                            .build());
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(FindMaxResponse.newBuilder()
                        .setResponse(currentMax)
                        .build());
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
}
