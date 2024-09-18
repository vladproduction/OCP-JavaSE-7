package com.vladproduction.c04_advanced_class_design.nested_classes;

public class AnonymousInnerClasses {
    void someFunction() {
        new Object() {
        };
    }
}

class StatusReporter2 {
    static Shape.Color getDesciptiveColor(final Shape.Color color) {
        // note the use of anonymous inner classes here -- specifically, there is no name
        // for the class and we construct and use the class "on the fly" in the return statement!
        return new Shape.Color() {
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        };
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor =
                StatusReporter2.getDesciptiveColor(new Shape.Color(0, 0, 0));
        System.out.println(descriptiveColor);
    }
}
