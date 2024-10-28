package com.vladproduction.c09_java_File_IO.files_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * program illustrate how to use File class to compare two paths
 * */
public class PathCompare2 {
    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("Test");
        Path path2 = Paths.get("C:\\Users\\admin\\Desktop\\GIT_HUB\\OCP-JavaSE-7\\Test");

        System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));
    }
}
