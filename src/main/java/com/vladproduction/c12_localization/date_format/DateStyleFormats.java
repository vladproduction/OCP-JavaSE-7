package com.vladproduction.c12_localization.date_format;

import java.text.DateFormat;
import java.util.Date;

/**
 * Demonstrates the use of constants in DateFormat that determines the display style
 */
public class DateStyleFormats {
    public static void main(String[] args) {
        Date now = new Date();
        int[] dateStyleFormats = {DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG,
                DateFormat.FULL, DateFormat.DEFAULT};
        System.out.println("Today's date in different styles are: ");
        // print today's date in all four formats plus
        // the default format in the default Locale
        for (int dateStyleFormat : dateStyleFormats) {
            DateFormat dateFormat = DateFormat.getDateInstance(dateStyleFormat);
            System.out.println(dateFormat.format(now));
        }
    }

}
