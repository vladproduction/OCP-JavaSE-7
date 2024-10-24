package com.vladproduction.c05_oop_design_principles.some_design_patterns.factory;

import java.util.Calendar;

public class Main01Factory {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.addNewShape("CircleObj");
        canvas.addNewShape("RectObj");
        canvas.redraw();
        canvas.refillColor();

        System.out.println("-----------");
        //example of standard factory of java lang:
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getWeekYear()); //could be any choice

    }
}
