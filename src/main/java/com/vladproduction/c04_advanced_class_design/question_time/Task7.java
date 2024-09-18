package com.vladproduction.c04_advanced_class_design.question_time;

public class Task7 {
    Print printerType;

    enum Print {A, B, C}

    public Task7(Print print) {
        this.printerType = print;
    }

    public static void main(String[] args) {
//        Print print = new Print(); //not allowed to create instance of enum
        Task7 test7 = new Task7(Print.A); //works fine
    }
}


