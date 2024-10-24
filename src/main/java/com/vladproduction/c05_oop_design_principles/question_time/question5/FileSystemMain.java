package com.vladproduction.c05_oop_design_principles.question_time.question5;

public class FileSystemMain {
    public static void main(String[] args) {
        FolderClass rootFolder = new FolderClass("Root");
        FileClass file1 = new FileClass("file1.txt");
        FolderClass subFolder = new FolderClass("SubFolder");
        FileClass file2 = new FileClass("file2.txt");

        rootFolder.add(file1);
        rootFolder.add(subFolder);
        subFolder.add(file2);

        rootFolder.display(); // Displays the entire structure
    }
}
