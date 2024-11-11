package com.vladproduction.c02_pretest.cover_questions.task32;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * correct expression: *o*.{java,class} with the expected file extension at the end.
 *
 * However, the above syntax will throw a PatternSyntaxException
 * because {} is not valid to specify alternatives in a simple glob expression.
 * */
public class Matcher {
    public static void main(String []args) {
        Path currPath = Paths.get(".");
        try (DirectoryStream<Path> stream =
                     Files.newDirectoryStream(currPath, "*o*?{java,class}")) { //not valid glob expression
            for(Path file : stream) {
                System.out.print(file.getFileName() + " ");
            }
        } catch (IOException ioe) {
            System.err.println("An I/O error occurred... exiting ");
        }
    }
}
/*Assume that the current path in which the program is run has the following files: Copy.class, Copy.java, Dir.
class, Dir.java, Hello.class, hello.html, Matcher.class, Matcher.java, OddEven.class, and PhotoCopy.
java. Assuming that the program ran without throwing IOException. Which one of the following options
correctly describes the behavior of this program when it is executed?
a) Prints the following: Copy.class Copy.java Hello.class hello.html OddEven.class PhotoCopy.java
b) Prints the following: Copy.class Copy.java PhotoCopy.java
c) Prints the following: Hello.class hello.html OddEven.class PhotoCopy.java
+++d) Prints the following: Copy.class Copy.java Hello.class OddEven.class PhotoCopy.java
e) Prints the following: PhotoCopy.java
f) Does not print any output in console
g) Throws the exception java.util.regex.PatternSyntaxException because the pattern is invalid.*/

/*d) Prints the following: Copy.class Copy.java Hello.class OddEven.class PhotoCopy.java.
In the Glob pattern “*o*?{java,class,html}”, the character * matches any number of characters, so *o* matches
any string that has “o” in it. The ? matches exactly one character. The pattern {java,class} matches files with the
suffixes of “java” or “class”. Hence, from the given files, the matching file names are Copy.class, Copy.java,
Hello.class, OddEven.class, PhotoCopy.java.*/