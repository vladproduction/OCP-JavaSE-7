package com.vladproduction.c07_string_processing.processing.searching;

/**
 * // This example demonstrates how to search multiple occurrences of a search string
 * */
public class SearchString3 {
    public static void main(String[] args) {
        String str = "I am a student. I am preparing for OCPJP";
        int fromIndex = 0;
        while (str.indexOf("am", fromIndex) > -1) {
            fromIndex = str.indexOf("am", fromIndex);
            System.out.println("Substring \"am\" occurs at index: " + fromIndex);
            fromIndex++;
        }
    }
}
