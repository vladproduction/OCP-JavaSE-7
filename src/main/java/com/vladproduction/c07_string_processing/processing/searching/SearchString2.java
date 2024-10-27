package com.vladproduction.c07_string_processing.processing.searching;

/**
 * // Demonstrates searching a substring within a string using indexOf() method
 * */
public class SearchString2 {
    public static void main(String[] args) {
        String str = "I am preparing for OCPJP";
        System.out.println("Substring \"for\" occurs at index: " + str.indexOf("for"));
        System.out.println("Substring \"for\" occurs at index: " + str.indexOf("fort")); //failed example return '-1'
    }

}
