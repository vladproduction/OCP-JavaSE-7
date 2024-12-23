package com.vladproduction.c09_java_File_IO.path_interface;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * // Class to illustrate how to use Path interface and its methods
 * */
public class PathInfo1 {
    public static void main(String[] args) {
        // create a Path object by calling static method get() in Paths class
        Path testFilePath = Paths.get("D:\\test\\testfile.txt");

        // retrieve basic information about path
        System.out.println("Printing file information: ");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: " + testFilePath.getParent());

        // print path elements
        System.out.println("Printing elements of the path: ");
        int countElements = 0;
        for(Path element : testFilePath) {
            System.out.println("\t path element: " + element);
            countElements++;
        }
        System.out.println("Count total elements is: " + countElements);
    }
}
