package com.vladproduction.c05_oop_design_principles.question_time.question5;

public class FileClass extends FolderItem{

    public FileClass(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}
