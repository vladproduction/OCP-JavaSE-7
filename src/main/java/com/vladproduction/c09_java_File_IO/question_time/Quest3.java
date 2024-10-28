package com.vladproduction.c09_java_File_IO.question_time;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Quest3 {
    public static void main(String []args) {
        Path javaPath = Paths.get("D:\\OCPJP7\\programs\\NIO2\\src\\Relativize.java").normalize();
        Path classPath = Paths.get("D:\\OCPJP7\\programs\\NIO2\\src\\Relativize.class").normalize();
        Path result = javaPath.relativize(classPath);
        if(result == null) {
            System.out.println("relativize failed");
        } else if(result.equals(Paths.get(""))) {
            System.out.println("relative paths are same, so relativize returned empty path");
        } else {
            System.out.println(result);
        }
    }
}

/*Which of the following options correctly shows the output of this program?
a) the program prints the following: relativize failed.
B) the program prints the following: relative paths are same, so relativize returned empty path.
c) the program prints the following: ..\relativize.class.
D) the program prints the following: ..\relativize.java.
        Answer: c) the program prints the following: ..\relativize.class.*/

/*(the relativize() method constructs a relative path between this path and a given path. in this
case, the paths for both the files are the same and they differ only in the file names (Relativize.
java and Relativize.class). the relative comparison of paths is performed from the given path to
the passed path to the relativize method, so it prints ..\relativize.class.*/
