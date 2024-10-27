package com.vladproduction.c07_string_processing.question_time;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * What kind of strings will the regex "\d*[02468]" match?
 * A. Any number containing at least one of the 0, 2, 4, 6, or 8 digits.
 * B. Any number starting from one of the 0, 2, 4, 6, or 8 digits.
 * C. Any number containing all the specified (0, 2, 4, 6, 8) digits at the end of the number.
 * D. Any number ending with one of the specified (0, 2, 4, 6, 8) digits.
 * Answer: D. Any number ending with one of the specified (0, 2, 4, 6, 8) digits.
 * (All even numbers.)
 * */
public class Quest6 {
    public static void main(String[] args) {

        // Define the regex pattern
        String regex = "\\d*[02468]";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Test strings to evaluate against the regex
        String[] testStrings = {
                "123456",     // Valid (ends with 6)
                "543210",     // Valid (ends with 0)
                "98745",      // Invalid (ends with 5)
                "777",        // Invalid (ends with 7)
                "2468",       // Valid (ends with 8)
                "13579",      // Invalid (ends with 9)
                "0000",       // Valid (ends with 0)
                "10",         // Valid (ends with 0)
                "22",         // Valid (ends with 2)
                "119",        // Invalid (ends with 9)
                "88"          // Valid (ends with 8)
        };

        // Validate and print results for each test string
        for (String str : testStrings) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println(str + " matches the regex (ending with an even digit).");
            } else {
                System.out.println(str + " does not match the regex.");
            }
        }

    }
}
