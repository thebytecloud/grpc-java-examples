package com.thebytecloud.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = ServerBuilder.forPort(7070)
                .addService(new CalculatorServiceImpl())
                .build();

        System.out.println("Stating gRPC Server...!");

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("Received shutdown request!");
            server.shutdown();
            System.out.println("Server stopped.!");
        }));

        server.awaitTermination();

    }
}
