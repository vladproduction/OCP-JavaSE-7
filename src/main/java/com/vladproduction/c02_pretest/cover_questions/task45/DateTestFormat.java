package com.vladproduction.c02_pretest.cover_questions.task45;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTestFormat {
    public static void main(String[] args) {
        /*Which one of the following is the correct implementation of a custom time formatter implementation that
        prints the current time in the format 10:42:30 where 10 is hours (value in range 1–12), 42 is
        minutes, and 30 is seconds?*/

        //+++a) System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
        System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));

        //b) System.out.println(new CustomDateFormat("hh:mm:ss").format(new Date()));
//        System.out.println(new CustomDateFormat("hh:mm:ss").format(new Date())); //need to create a class

        //c) System.out.println(new SimpleTimeFormat("hh:mm:ss").format(new Date()));
//        System.out.println(new SimpleTimeFormat("hh:mm:ss").format(new Date())); //need to create a class

        //d) System.out.println(new CustomDateTimeFormat("HH:MM:SS").format(new Date()));
//        System.out.println(new CustomDateTimeFormat("HH:MM:SS").format(new Date())); //need to create a class

    }
}
