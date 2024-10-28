package com.vladproduction.c09_java_File_IO.question_time;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Quest4 {
    public static void main(String []args) {
        Path aPath = Paths.get("D:\\OCPJP7\\programs\\..\\NIO2\\src\\.\\SubPath.java");
        aPath = aPath.normalize();
        System.out.println(aPath.subpath(2, 3));
    }
}
/*This program prints the following:
A) ..
B) src
C) NIO2
D) NIO2\src
E) ..\NIO2
Answer: B) src
        (The normalize() method removes redundant name elements in the given path, so after the call to
the normalize() method, the aPath value is D:\OCPJP7\NIO2\src\SubPath.java.
        The subpath(int beginIndex, int endIndex) method returns a path based on the values of
beginIndex and endIndex. The name that is closest to the root has index 0; note that the root itself
        (in this case D:\) is not considered as an element in the path. Hence, the name elements “OCPJP7”,
        “NIO2”, “src”, “SubPath.java” are in index positions 0, 1, 2, and 3, respectively.
Note that beginIndex is the index of the first element, inclusive of that element; endIndex is the
index of the last element, exclusive of that element. Hence, the subpath is “sub”, which is at index
position 2 in this path.)*/
