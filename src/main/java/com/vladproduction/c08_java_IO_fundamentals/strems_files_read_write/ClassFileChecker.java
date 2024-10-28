package com.vladproduction.c08_java_IO_fundamentals.strems_files_read_write;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * an example in Java that demonstrates how to read the first four bytes of a file using FileInputStream
 * and compare them to the specified byte sequence (0xCA, 0xFE, 0xBA, 0xBE)
 * to determine if the file is a .class file
 * */
public class ClassFileChecker {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/vladproduction/c08_java_IO_fundamentals/strems_files_read_write/ClassFileChecker.java";
        byte[] expectedBytes = new byte[]{(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE};
        byte[] buffer = new byte[4];

        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Read the first four bytes
            int bytesRead = fis.read(buffer);

            // Check if we read exactly four bytes
            if (bytesRead != 4) {
                System.out.println("The file is too short to be a .class file.");
                return;
            }

            // Compare the contents of the buffer and expectedBytes
            boolean isClassFile = true;
            for (int i = 0; i < 4; i++) {
                if (buffer[i] != expectedBytes[i]) {
                    isClassFile = false;
                    break;
                }
            }

            // Output the result
            if (isClassFile) {
                System.out.println("The file is a valid .class file.");
            } else {
                System.out.println("The file is NOT a valid .class file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
