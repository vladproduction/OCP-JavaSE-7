package com.vladproduction.c09_java_File_IO.question_time;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Quest1 {
    public static void main(String[] args) {
        Path aFilePath = Paths.get("D:\\dir\\file.txt"); // FILEPATH

        while(aFilePath.iterator().hasNext()) {
            System.out.println("path element: " + aFilePath.iterator().next());
        }
    }
}
/*A) The program gives a compiler error in the line marked with the comment FILEPATH because the
checked exception FileNotFoundException is not handled.
B) The program gives a compiler error in the line marked with the comment FILEPATH because the
checked exception InvalidPathException is not handled.
C) The program gets into an infinite loop printing “path element: dir” forever.
        D) The program prints the following:
path element: dir
path element: file.txt
Answer: C) The program gets into an infinite loop printing “path element: dir” forever.
        (In the while loop, you use iterator() to get a temporary iterator object. So, the call to next()
on the temporary variable is lost, so the while loop gets into an infinite loop. In other words, the
following loop will terminate after printing the “dir” and “file.txt” parts of the path:
Iterator<Path> paths = aFilePath.iterator();
while(paths.hasNext()) {
        System.out.println("path element: " + paths.next());
        }*/
