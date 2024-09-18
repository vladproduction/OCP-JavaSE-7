package com.vladproduction.c03_java_class_design.question_time;

public class Task1 {
    public static void main(String[] args) {

        Color color = new Color();
        color.printColor(); //red: 0 green: 0 blue: 0

        //after we define constructor (public instead void):
        //output:
        //red: 10 green: 10 blue: 10

        /*a constructor does not have a return type; if a return type is provided, it is treated as a method in
        that class. In this case, since Color had void return type, it became a method named Color() in the Color class,
        with the default Color constructor provided by the compiler. By default, data values are initialized to zero, hence
        the output*/

    }
}

class Color{
    int red, green, blue;

    public Color() { //it`s method, not a constructor
        red = 10;
        green = 10;
        blue = 10;
    }
    void printColor() { //just printing method
        System.out.println("red: " + red + " green: " + green + " blue: " + blue);
    }
}
