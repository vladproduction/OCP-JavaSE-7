package com.vladproduction.c04_advanced_class_design.nested_classes;

public class LocalClassExample {
    void someFunction() {
        class LocalClass {
        }
    }
}

//example of base structure
abstract class Shape {
    public static class Color {
        int m_red, m_green, m_blue;

        public Color() {
            this(0, 0, 0);
        }

        public Color(int red, int green, int blue) {
            m_red = red;
            m_green = green;
            m_blue = blue;
        }

        public String toString() {
            return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
        }
        // other color members elided
    }
    // other Shape members elided
}

//example of local class related to Shape
class StatusReporter {
    // important to note that the argument "color" is declared final
    // must be effectively final
    static Shape.Color getDesciptiveColor(final Shape.Color color) { //final variables to a local inner class.
        // local class DescriptiveColor that extends Shape.Color class
        class DescriptiveColor extends Shape.Color {
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        }
        return new DescriptiveColor();
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor =
                StatusReporter.getDesciptiveColor(new Shape.Color(0, 0, 0));
        System.out.println(descriptiveColor); //checks if the StatusReporter works fine
    }
}
