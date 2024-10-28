package com.vladproduction.c08_java_IO_fundamentals.question_time;

import java.io.*;

public class Quest4 {
    public static void main(String[] args) throws IOException {
        FileInputStream findings = new FileInputStream("log.txt");
        DataInputStream dataStream = new DataInputStream(findings);
        BufferedReader br = new BufferedReader(new InputStreamReader(dataStream));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
/*Which two options are true regarding this code segment?
    A. br.close() statement will close only the BufferedReader object, and findings and dataStream will remain unclosed.
    B. The br.close() statement will close the BufferedReader object and the underlying stream objects referred by findings and dataStream.
    C. The readLine() method invoked in the statement br.readLine() can throw an IOException;
       if this exception is thrown, br.close() will not be called, resulting in a resource leak.
    D. The readLine() method invoked in the statement br.readLine() can throw an IOException;
       however, there will not be any resource leaks since Garbage Collector collects all resources.
    E. In this code segment, no exceptions can be thrown calling br.close(), so there is no possibility of resource leaks.*/

/*Answer: B and C. The br.close() statement will close the BufferedReader object and
the underlying stream objects referred to by findings and dataStream. The readLine()
method invoked in the statement br.readLine() can throw an IOException;if this
exception is thrown, br.close() will not be called, resulting in a resource leak. Note that
Garbage Collector will only collect unreferenced memory resources; it is the programmer’s
responsibility to ensure that all other resources such as stream objects are released.*/
