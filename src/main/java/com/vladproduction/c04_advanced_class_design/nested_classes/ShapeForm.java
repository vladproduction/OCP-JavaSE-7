package com.vladproduction.c04_advanced_class_design.nested_classes;

public abstract class ShapeForm {

        public static void main(String []args) {
            // since Color is a static nested class,
            // we access it using the name of the outer class, as in ShapeForm.Color
            // note that we do not (and cannot) instantiate Shape class for using Color class
            ShapeForm.Color white = new ShapeForm.Color(255, 255, 255);
            System.out.println("White color has values:" + white);
    }

    public static class Color{
        int red, green, blue;

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public Color() {
            this(0, 0, 0);
        }

        public String toString() {
            return " red = " + red + " green = " + green + " blue = " + blue;
        }
    }

}
