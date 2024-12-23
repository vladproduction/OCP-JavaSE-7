package com.vladproduction.c09_java_File_IO.files_class;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * In this program, you are accepting a file/directory name from the command line and creating a Path object.
 * Then, you are using the exists() method from the Files class to find out whether the file/directory exists or not
 * */
public class PathExists {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);

        if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("The file/directory " + path.getFileName() + " exists");
            // check whether it is a file or a directory
            if(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(path.getFileName() + " is a directory");
            }
            else {
                System.out.println(path.getFileName() + " is a file");
            }
        }
        else {
            System.out.println("The file/directory " + path.getFileName() + " does not exist");
        }
    }
}
