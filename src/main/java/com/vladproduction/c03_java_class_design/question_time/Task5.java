package com.vladproduction.c03_java_class_design.question_time;

public class Task5 {
    public static void main(String[] args) {
        // implicitly invoke toString method
        System.out.println(new ColorB());

        /*Answer: A. Compiler error: attempting to assign weaker access privileges; toString was public in Object.
        (No access modifier is specified for the toString() method. Object's toString() method has a public access
        modifier; you cannot reduce the visibility of the method. Hence, it will result in a compiler error).*/

    }
}

class ColorB {
    int red, green, blue;
    ColorB() {
        this(10, 10, 10);
    }
    ColorB(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }
    /*String toString() {
        return "The color is: " + " red = " + red + " green = " + green +
                " blue = " + blue;
    }*/
}
