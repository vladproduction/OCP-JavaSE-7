package com.vladproduction.c03_java_class_design.question_time;

public class Task3 {
    public static void main(String[] args) {

    }
}
/*In the FunPaint application, you need to code classes to draw rectangles. A rectangle can
have plain or rounded edges. You also need to color a (plain or rounded) rectangle. How
will you define classes for creating these plain, colored, and rounded rectangles? You can
use is-a relationships as needed.*/

class Rectangle { /* */ }
class ColoredRectangle extends Rectangle { /* */ }
class RoundedRectangle extends Rectangle { /* */ }
//class ColoredRoundedRectangle extends ColoredRectangle, RoundedRectangle { /* */ } //compile error: no multiple inheritance

