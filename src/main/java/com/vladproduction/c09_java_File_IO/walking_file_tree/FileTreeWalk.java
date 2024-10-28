package com.vladproduction.c09_java_File_IO.walking_file_tree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTreeWalk {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("usage: FileWalkTree <source-path>");
            System.exit(-1);
        }
        Path pathSource = Paths.get(args[0]);
        try {
            Files.walkFileTree(pathSource, new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
