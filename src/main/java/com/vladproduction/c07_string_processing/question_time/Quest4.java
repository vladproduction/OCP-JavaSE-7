package com.vladproduction.c07_string_processing.question_time;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quest4 {
    public static void main(String[] args) {

        // Define the regular expression pattern
        String regex = "\\+\\d{2}-\\d{10}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Test mobile numbers
        String[] mobileNumbers = {
                "+91-9876543210", // Valid
                "+01-1234567890", // Valid
                "+99-123456789",   // Invalid (too short)
                "+123-9876543210", // Invalid (country code too long)
                "91-9876543210",   // Invalid (missing '+' sign)
                "+91-987654321012" // Invalid (too long)
        };

        // Validate each mobile number
        for (String mobileNumber : mobileNumbers) {
            Matcher matcher = pattern.matcher(mobileNumber);
            if (matcher.matches()) {
                System.out.println(mobileNumber + " is valid.");
            } else {
                System.out.println(mobileNumber + " is invalid.");
            }
        }

    }
}

/*Which of the following regular expressions is the correct expression for matching a
mobile number stored in following format: +YY-XXXXXXXXXX (YY is the country code, the
rest of the number is a mobile number)?
A. “\+\d{2}-\d{10}”
B. “\b\+\d{2}-\d{10}\b”
C. “+\d{2}-\d{10}”
D. “\b+\d{2}-\d{10}\b”
Answer: A.
(You need to provide a backslash as an escape character for “+”. Another important point is that you
cannot use “\b” in starting and ending if the first or last character of the string is not a word character.)*/
