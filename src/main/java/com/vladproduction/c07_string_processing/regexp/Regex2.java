package com.vladproduction.c07_string_processing.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * // This program demonstrates how we can search numbers of a specified length
 * */
public class Regex2 {
    public static void main(String[] args) {
        allNumbersUsed();
        System.out.println("---");
        correctWithComma();
        System.out.println("---");
        correctNoComma();
    }

    private static void allNumbersUsed() {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone," +
        "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post" +
        "office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
        Pattern pattern = Pattern.compile("\\d{5}");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
        /*  56010
            98765
            43210
            56000
            98765
            01234*/
        //Ph: 9876543210 and ph: 9876501234 were split also
    }

    //new version to correct search elements by pattern:
    //Pattern pattern = Pattern.compile("\\D\\d{5}\\D");
    private static void correctWithComma() {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone," +
                "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post" +
                "office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
        Pattern pattern = Pattern.compile("\\D\\d{5}\\D");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
        /*  56010,
            56000,
        */
    }

    private static void correctNoComma() {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone," +
                "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post" +
                "office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
        Pattern pattern = Pattern.compile("\\b\\d{5}\\b");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
        /*  56010
            56000
        */
    }

}
