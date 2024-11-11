package com.vladproduction.c02_pretest.cover_questions.task28;

import java.io.File;

public class CreateFilesInFolder {
    public static void main(String []args) {
        String[] fileList = { "/file1.txt", "/subdir/file2.txt", "/file3.txt" };
        for (String file : fileList) {
            try {
                new File(file).mkdirs();
            }
            catch (Exception e) {
                System.out.println("file creation failed");
                System.exit(-1);
            }
        }
    }
}
/*Assume that underlying file system has necessary permissions to create files, and that the program executed
successfully without printing the message “file creation failed.” (In the answers, note that the term “current
directory” means the directory from which you execute this program, and the term “root directory” in Windows
OS means the root path of the current drive from which you execute this program.) What is the most likely
behavior when you execute this program?
a) This program will create file1.txt and file3.txt files in the current directory, and file2.txt file in the subdir directory of
the current directory.
b) This program will create file1.txt and file3.txt directories in the current directory and the file2.txt directory in the
 “subdir” directory in the current directory.
c) This program will create file1.txt and file3.txt files in the root directory, and a file2.txt file in the “subdir” directory in
the root directory.
+++d) This program will create file1.txt and file3.txt directories in the root directory, and a file2.txt directory in the
 “subdir” directory in the root directory.*/
