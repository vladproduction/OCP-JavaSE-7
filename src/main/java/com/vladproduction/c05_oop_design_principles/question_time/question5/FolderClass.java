package com.vladproduction.c05_oop_design_principles.question_time.question5;

import java.util.ArrayList;
import java.util.List;

public class FolderClass extends FolderItem{

    private List<FolderItem> items = new ArrayList<>();

    public FolderClass(String name) {
        super(name);
    }

    public void add(FolderItem folderItem){
        items.add(folderItem);
    }

    public void remove(FolderItem folderItem){
        items.remove(folderItem);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FolderItem item : items) {
            item.display();
        }
    }
}
