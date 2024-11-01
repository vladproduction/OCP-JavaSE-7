package com.vladproduction.c12_localization.question_time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Use SimpleDateFormat for creating custom date and time formats as a "pattern string"
 * */
public class PatternStringExample {
    public static void main(String []args) {
        String pattern = "EEEE";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);
        Date today = new Date();
        System.out.println(formatter.format(today));
    }
    /*Which of the following is the most likely output (i.e., the output that would match with the string pattern
            EEEE given in this code segment)?
    A) F
    B) Friday
    C) Sept
    D) September
    Answer: B) Friday
            (E is the day name in the week; the pattern EEEE prints the name of the day in its full format. Fri is a short form
    which would be printed by the pattern E, but EEEE will print the day of the week in full form, i.e., Friday. Since the
    locale is us Locale.US, it will print in English. Sept or September is impossible since E refers to the name in the
    week, not in a month.*/
}
