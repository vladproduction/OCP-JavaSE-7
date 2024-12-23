package com.vladproduction.c12_localization.formatting_for_local_culture;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalizedCurrency {
    public static void main(String []args) {
        long tenMillion = 10000000L; // this is ten million
        Locale[] locales =
                { Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.TAIWAN };
        // for each of the four locales,
        // print the currency amount as it looks in that locale
        for(Locale locale : locales) {
            System.out.println("Ten million in " + locale.getDisplayName() + " is " + NumberFormat.getCurrencyInstance(locale).format(tenMillion));
        }
    }
}
