package com.vladproduction.c08_java_IO_fundamentals.strems_files_read_write;

import java.io.*;

/**
 * // implements a simplified version of "copy" command provided in Windows
 * // syntax: java Copy SrcFile DstFile
 * // copies ScrFile to DstFile; over-writes the DstFile if it already exits
 * */
public class Copy {
    public static void main(String []files) {
        if(files.length != 2) {
            System.err.println("Incorrect syntax. Correct syntax: Copy SrcFile DstFile");
            System.exit(-1);
        }
        String srcFile = files[0];
        String dstFile = files[1];
        // try opening the source and destination file
        // with FileReader and FileWriter
        try (BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile))) {
            int ch = 0;
            // while there are characters to fetch, read the characters from
            // source stream and write them to the destination stream
            while( (ch = inputFile.read()) != -1) {
                // ch is of type int - convert it back to char before
                // writing it
                outputFile.write( (char)ch );
            }
            // no need to call flush explicitly for outputFile - the close()
            // method will first call flush before closing the outputFile stream
        } catch (FileNotFoundException fnfe) {
            // the passed file is not found ...
            System.err.println("Cannot open the file " + fnfe.getMessage());
        }
        catch(IOException ioe) {
            // some IO error occurred when reading the file ...
            System.err.printf("Error when processing file; exiting ... ");
        }
        // try-with-resources will automatically release FileReader object
    }
}
