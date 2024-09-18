package com.vladproduction.c04_advanced_class_design.question_time;

public class Task4 {
    public static void main(String []args) {
//        Shape.ColorRGB red = new Shape.ColorRGB(); // method ColorRGB() is undefined for the type Shape
        //1)need to create an instance of outer class shape in order to create an inner class instance
        //or
        //2)make ColorRgb class as static

        //task 5:
        Shape.ColorRGB black = new Shape().new ColorRGB(); //if ColorRGB class marked as static it will compile error
        //otherwise output (both constructors are invoke):
        /*Shape constructor
        Color constructor*/

    }
}

class Shape {
    public Shape() {
        System.out.println("Shape constructor");
    }
    public  class ColorRGB {
        public ColorRGB() {
            System.out.println("Color constructor");
        }
    }
}

