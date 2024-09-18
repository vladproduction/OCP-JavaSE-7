package com.vladproduction.c04_advanced_class_design.question_time;

public class Task6 {
    public static void main(String[] args) {

        ShapeCan.ColorCan black = new ShapeCan().new ColorCan();
        black.display();//an inner class can access all members of an outer class, including the private members of the outer class
        //isDisplayed: false
        //canvasID: 0

    }
}

class ShapeCan { //outer class
    private boolean isDisplayed;
    protected int canvasID;
    public ShapeCan() {
        isDisplayed = false;
        canvasID = 0;
    }
    public class ColorCan { //inner class
        public void display() {
            System.out.println("isDisplayed: "+isDisplayed);
            System.out.println("canvasID: "+canvasID);
        }
    }
}
