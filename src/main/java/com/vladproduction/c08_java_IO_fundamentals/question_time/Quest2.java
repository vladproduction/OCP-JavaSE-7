package com.vladproduction.c08_java_IO_fundamentals.question_time;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Quest2 {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream os = new FileOutputStream("log.txt");
        System.setErr(new PrintStream(os)); // SET SYSTEM.ERR
        System.err.println("Error");
    }
}

/*Consider the following code segment:
OutputStream os = new FileOutputStream("log.txt");
System.setErr(new PrintStream(os)); // SET SYSTEM.ERR
        System.err.println("Error");
Which one of the following statements is true regarding this code segment?
A. The line with comment SET SYSTEM.ERR will not compile and will result in a
compiler error.
B. The line with comment SET SYSTEM.ERR will result in throwing a runtime exception
since System.err cannot be programmatically redirected.
C. The program will print the text “Error” in console since System.err by default sends
the output to console.
D. This code segment redirects the System.err to the log.txt file and will write the
text “Error” to that file.*/
/*Answer: d. this code segment redirects the System.err to the log.txt file and will
write the text “error” to that file.
        (note that you can redirect the System.err programmatically using the setErr()
method. System.err is of type PrintStream, and the System.setErr() method takes a
PrintStream as an argument. Once the error stream is set, all writes to System.err will
be redirected to it. hence, this program will create log.txt with the text “error” in it.*/
