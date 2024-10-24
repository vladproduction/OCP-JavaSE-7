package com.vladproduction.c05_oop_design_principles.question_time.question5;

public abstract class FolderItem {

    protected String name;

    public FolderItem(String name) {
        this.name = name;
    }

    public abstract void display();
}
