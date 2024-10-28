package com.vladproduction.c08_java_IO_fundamentals.question_time;

import java.io.IOException;

public class Quest3 {
}
/*A. class AResource implements Closeable {
 protected void close() / throws IOException / {
        // body of close to release the resource } }

declares open() protected; since the close() method is
declared public in the base interface, you cannot reduce its visibility to protected, so this
will result in a compiler error */

/*B. class AResource implements Closeable {
 public void autoClose() / throws IOException / {
        // body of close to release the resource } }

declares autoClose(); a correct implementation
would define the close() method
*/

/*C. class AResource implements AutoCloseable {
 void close() / throws IOException / {
        // body of close to release the resource } }

declares close() with default access;
since the close method is declared public in the base interface, you cannot reduce its
visibility to default accesses, so it will result in a compiler error
*/

/** D. the following definitions of the AResource class implementation is correct
  so that it can be used with try-with-resources statement
 is a correct implementation of the AResource class that overrides the close() method*/
class AResource implements AutoCloseable {
    public void close() throws IOException {
        // body of close to release the resource
    }
}
