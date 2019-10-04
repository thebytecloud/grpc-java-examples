package com.thebytecloud.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        int serverBindPort = 7070;

        if(System.getenv("BIND_PORT") != null)
            serverBindPort = Integer.parseInt(System.getenv("BIND_PORT"));

        System.out.println("serverBindPort = " + serverBindPort);

        final Server server = ServerBuilder.forPort(serverBindPort)
                .addService(new CalculatorServiceImpl())
                .addService(new GreetingServiceImpl())
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
