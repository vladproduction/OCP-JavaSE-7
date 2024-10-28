package com.vladproduction.c08_java_IO_fundamentals.points_to_remember.over_socket_connection;

import com.vladproduction.c08_java_IO_fundamentals.points_to_remember.custom_serialization_example.Person;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server started. Waiting for client connection...");

            try (Socket socket = serverSocket.accept();
                 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
                System.out.println("Client connected.");

                // Read the serialized Player object from the client
                Player player = (Player) ois.readObject();
                System.out.println("Received player: " + player.introduce());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
