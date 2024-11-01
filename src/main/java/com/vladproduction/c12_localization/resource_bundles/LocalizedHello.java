package com.vladproduction.c12_localization.resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Change the default locale in the program by calling the setDefault() method:
 * Locale.setDefault(Locale.ITALY);
 */
public class LocalizedHello {
    public static void main(String args[]) {
        // Set the default locale to Italy
        Locale.setDefault(Locale.ITALY);

        Locale currentLocale = Locale.getDefault();
        ResourceBundle resBundle =
                ResourceBundle.getBundle("ResourceBundle", currentLocale);

        // Print the localized greeting
        System.out.printf(resBundle.getString("Greeting"));


    }
}
