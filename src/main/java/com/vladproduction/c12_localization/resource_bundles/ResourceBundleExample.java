package com.vladproduction.c12_localization.resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        //English locale
        Locale englishLocale = new Locale("en", "US");
        ResourceBundle englishBundle = ResourceBundle.getBundle("com.vladproduction.c12_localization.resource_bundles.MyResourceBundle", englishLocale);
        System.out.println(englishBundle.getString("greeting")); // Outputs: Hello, World!
        System.out.println(englishBundle.getString("farewell"));  // Outputs: Goodbye!
        System.out.println(englishBundle.getString("thanks"));     // Outputs: Thank you!

        //Spain locale
        Locale spanishLocale = new Locale("es", "ES");
        ResourceBundle spanishBundle = ResourceBundle.getBundle("com.vladproduction.c12_localization.resource_bundles.MyResourceBundle", spanishLocale);
        System.out.println(spanishBundle.getString("greeting")); // Outputs: ¡Hola, Mundo!
        System.out.println(spanishBundle.getString("farewell"));  // Outputs: ¡Adiós!
        System.out.println(spanishBundle.getString("thanks"));     // Outputs: ¡Gracias!

    }
}
