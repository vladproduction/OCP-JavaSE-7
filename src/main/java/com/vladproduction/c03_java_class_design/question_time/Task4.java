package com.vladproduction.c03_java_class_design.question_time;

public class Task4 {
    public static void main(String[] args) {
        // implicitly invoke toString method
        System.out.println(new ColorA());
        //Compiles without errors, and when run, it prints the following: The color is: 101010

        /*(The toString() implementation has the expression “The color is: “ + red + blue + green. Since the first entry
        is String, the + operation becomes the string concatenation operator with resulting string “The color is: 10”.
        Following that, again there is a concatenation operator + and so on until finally it prints “The color is: 101010”).*/
    }
}

class ColorA {
    int red, green, blue;

    ColorA() {
        this(10, 10, 10);
    }

    ColorA(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    public String toString() {
        return "The color is: " + red + green + blue;
    }

}
