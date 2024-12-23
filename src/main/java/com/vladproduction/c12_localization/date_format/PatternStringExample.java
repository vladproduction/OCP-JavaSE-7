package com.vladproduction.c12_localization.date_format;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Use SimpleDateFormat for creating custom date and time formats as a pattern string
 * */
public class PatternStringExample {
    public static void main(String []args) {
        String pattern = "dd-MM-yy"; /* d for day, M for month, y for year */
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        // the default Date constructor initializes to current date/time
        System.out.println(formatter.format(new Date()));
    }
}
