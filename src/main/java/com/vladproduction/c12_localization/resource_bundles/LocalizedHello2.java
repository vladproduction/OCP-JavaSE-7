package com.vladproduction.c12_localization.resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello2 {
    public static void main(String[] args) {
        // Print the movie details for the default (US) locale
        Locale locale = Locale.getDefault();
        printMovieDetails(ResourceBundle.getBundle("ResourceBundle", locale));

        // Print the movie details for the Italian locale
        Locale.setDefault(Locale.ITALY);
        printMovieDetails(ResourceBundle.getBundle("ResourceBundle", Locale.getDefault()));
}
    public static void printMovieDetails(ResourceBundle resBundle) {
        String hello = resBundle.getString("Greeting");
        String movieName = resBundle.getString("movie");
        Long revenue = Long.parseLong(resBundle.getString("gross")); // Convert to Long
        Integer year = Integer.parseInt(resBundle.getString("year")); // Convert to Integer
        System.out.println(hello);
        System.out.println("Movie " + movieName + " (" + year + ") grossed " + revenue);
    }
}


