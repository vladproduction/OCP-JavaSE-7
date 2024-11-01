package com.vladproduction.c12_localization.date_format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Using an example, illustrates the use of "pattern strings" for printing dates
 * */
public class CustomDatePatterns {
    public static void main(String []args) {
        // patterns from simple to complex ones
        String [] dateFormats = {
                "dd-MM-yyyy", /* d is day (in month), M is month, y is year */
                "d '('E')' MMM, YYYY", /*E is name of the day (in week), Y is year*/
                "w'th week of' YYYY", /* w is the week of the year */
                "EEEE, dd'th' MMMM, YYYY" /*E is day name in the week */
        };
        Date today = new Date();
        System.out.println("Default format for the date is " +
                DateFormat.getDateInstance().format(today));
        for(String dateFormat : dateFormats) {
            System.out.printf("Date in pattern \"%s\" is %s %n", dateFormat,
                    new SimpleDateFormat(dateFormat).format(today));
        }
    }
}
