package com.vladproduction.c08_java_IO_fundamentals.points_to_remember.over_socket_connection;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Change to the address of the server if needed

        // Create a Person object to send
        Player player = new Player("Zidane", 30);

        try (Socket socket = new Socket(serverAddress, 1234);
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {

            // Send the serialized Person object to the server
            oos.writeObject(player);
            System.out.println("Person object sent to server.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
