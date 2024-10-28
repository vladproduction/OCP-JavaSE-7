package com.vladproduction.c08_java_IO_fundamentals.points_to_remember;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * is a simple example in Java that demonstrates how to use BufferedOutputStream along with flush() and close().
 * The example writes data to a file, and you can see the effect of calling flush() explicitly before closing the stream
 * */
public class BufferedStreamExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Output file

        // Data to be written to the file
        String data = "Hello, Buffered Streams!";

        // Convert the string to bytes
        byte[] dataBytes = data.getBytes();

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            // Write data to the buffered stream
            bos.write(dataBytes);
            System.out.println("Data written to the buffer.");

            // Flush the buffered data to the file
            bos.flush();
            System.out.println("Buffer flushed to the file.");

            // Note: Closing the stream will also call flush() automatically
        } catch (IOException e) {
            e.printStackTrace();
        }

        // The data is now written to "example.txt"
        System.out.println("Process completed.");
    }
}
