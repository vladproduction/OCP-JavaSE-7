package com.vladproduction.c09_java_File_IO.files_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Files.copy() to copy the file from source to target;
 * this method to write a simple file copy program;
 * */
public class FileCopy {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("usage: FileCopy <source-path> <destination-path>");
            System.exit(1);
        }
        Path pathSource = Paths.get(args[0]);
        Path pathDestination = Paths.get(args[1]);
        try {
//            Files.copy(pathSource, pathDestination);
            Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING); //in case we want to override existing file
            System.out.println("Source file copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*If you copy a directory using the copy() method, it will not copy the files/directories contained in the
    source directory; you need to explicitly copy them to the destination folder.*/
}
