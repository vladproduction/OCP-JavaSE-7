package com.vladproduction.c03_java_class_design.question_time;

public class Task2 {
    public static void main(String[] args) {
        ColorClass color = new ColorClass();
        color.printColor(); //red: 0 green: 0 blue: 0
    }
}

class ColorClass {
    int red, green, blue;

    ColorClass() {
//        Color(10, 10, 10); //compile error: need to add 'new' keyword
    }

    ColorClass(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    void printColor() {
        System.out.println("red: " + red + " green: " + green + " blue: " +
                blue);
    }
}
