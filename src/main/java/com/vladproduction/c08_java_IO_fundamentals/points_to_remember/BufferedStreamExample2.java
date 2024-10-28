package com.vladproduction.c08_java_IO_fundamentals.points_to_remember;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * is a simple example demonstrating how to combine FileInputStream and BufferedInputStream in Java.
 * In this example, we will read data from a file using BufferedInputStream, which allows for efficient reading by buffering the input data.
 * */
public class BufferedStreamExample2 {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Input file

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            // Create a buffer to hold the read data
            byte[] buffer = new byte[1024]; // Read 1 KB at a time
            int bytesRead;

            // Read data from the file into the buffer
            while ((bytesRead = bis.read(buffer)) != -1) {
                // Convert the bytes to a string and print it
                String data = new String(buffer, 0, bytesRead);
                System.out.print(data);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
