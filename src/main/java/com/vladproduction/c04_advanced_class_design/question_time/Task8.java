package com.vladproduction.c04_advanced_class_design.question_time;

public class Task8 {
    //need to past #2 as a first line
    //enum definition is incorrect  if #1 line and then #2 line and will result in compile error(s)
    //so
    //need to define enum elements first before any other attribute in an enum class
}


enum PType {
    R(5), G(10), B(50); // #2
    private int pagePrintCap; // #1
    private PType(int pagePrintCap) {
        this.pagePrintCap = pagePrintCap;
    }
    public int getPrintPageCap() {
        return pagePrintCap;
    }
}
