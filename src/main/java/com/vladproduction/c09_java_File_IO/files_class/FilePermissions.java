package com.vladproduction.c09_java_File_IO.files_class;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Existing files might not allow you to read, write, or execute based on your credentials. You can check the ability
 * of a program to read, write, or execute programmatically.
 * */
public class FilePermissions {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        System.out.printf( "Readable: %b, Writable: %b, Executable: %b ",
                Files.isReadable(path), Files.isWritable(path), Files.isExecutable(path));
    }
}
