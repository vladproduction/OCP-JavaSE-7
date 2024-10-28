package com.vladproduction.c09_java_File_IO.files_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The Files class provides a delete() method to delete a file/directory/symbolic link. Listing 9-11 contains a simple
 * program to delete a specified file.
 * In the case of a directory, the
 * delete() method should be invoked on an empty directory; otherwise the method will fail.
 * */
public class FileDelete {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("usage: FileDelete <source-path>");
            System.exit(1);
        }
        Path pathSource = Paths.get(args[0]);
        try {
            Files.delete(pathSource);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
