package com.vladproduction.c12_localization.locales;

import java.util.Locale;

public class AvailableLocales_english {
    public static void main(String[] args) {
//        allLocales();
        englishLocales();
    }

    private static void englishLocales() {
        System.out.println("The default locale is: " + Locale.getDefault());
        Locale[] locales = Locale.getAvailableLocales();
        System.out.printf("No. of other available locales is: %d, and they are: %n",
                locales.length);
        for(Locale locale : locales) {
            // filter and display only English locales
            if(locale.getLanguage().equals("en")) {
                System.out.printf("Locale code: %s and it stands for %s %n",
                        locale, locale.getDisplayName());
            }
        }
    }

    private static void allLocales(){
        System.out.println("The default locale is: " + Locale.getDefault());
        Locale[] locales = Locale.getAvailableLocales();
        System.out.printf("No. of other available locales is: %d, and they are: %n",
                locales.length);
        for(Locale locale : locales) {
            System.out.printf("Locale code: %s and it stands for %s %n",
                    locale, locale.getDisplayName());
        }
    }
}
