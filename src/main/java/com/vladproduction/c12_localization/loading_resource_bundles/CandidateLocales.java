package com.vladproduction.c12_localization.loading_resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class CandidateLocales {
    public static void main(String[] args) {
        // trace how ResourceBundle_it_IT_Rome.properties is resolved
        loadResourceBundle("ResourceBundle", new Locale("it", "IT", "Rome"));
    }
    public static void loadResourceBundle(String resourceBundleName, Locale locale) {
        // Pass an instance of TalkativeResourceBundleControl
        // to print candidate locales
        ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceBundleName, locale,
                new TalkativeResourceBundleControl());
        String rbLocaleName = resourceBundle.getLocale().toString();
        // if the resource bundle locale name is empty,
        // it means default property file
        if(rbLocaleName.equals("")) {
            System.out.println("Loaded the default property file with name: " +
                    resourceBundleName);
        } else {
            System.out.println("Loaded the resource bundle for the locale: " +
                    resourceBundleName + "." + rbLocaleName);
        }
    }
}
