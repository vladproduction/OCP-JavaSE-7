package com.vladproduction.c11_exceptions_and_assertions.throws_clause;

import java.io.IOException;

/**
 * // This interface is meant for implemented by classes that would read an integer from a file
 * */
public interface IntReader {
    int readIntFromFile() throws IOException; //is more general class exception
    int readIntFromFile2() throws IOException; //example if some unchecked exception added to the clause of overridden method
}
