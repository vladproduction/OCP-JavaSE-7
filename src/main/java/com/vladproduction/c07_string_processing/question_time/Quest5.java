package com.vladproduction.c07_string_processing.question_time;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * You want to write a regex to match an e-mail address. The e-mail address should not
 * start with a digit and should end with “.com”. Which one of the following regex will
 * satisfy this requirement?
 * A. “\b\w+@\w+\.com\b”
 * B. “\b\D\w*@\w+\.com\b”
 * C. “\b\D\w+@\w+\.com\b”
 * D. None of the above
 * */
public class Quest5 {
    public static void main(String[] args) {

        String regex = "\\b\\D\\w*@\\w+\\.com\\b"; // Using option B
        Pattern pattern = Pattern.compile(regex);

        String[] emailAddresses = {
                "john.doe@example.com",  // Valid
                "1john.doe@example.com", // Invalid, starts with a digit
                "jane_doe@example.com",  // Valid
                "jane@domain.com",       // Valid
                "2jane@domain.com",      // Invalid, starts with a digit
                "jane.doe@abc.com"       // Valid
        };

        // Validate and print results for each email address
        for (String email : emailAddresses) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is an invalid email address.");
            }
        }

    }
}

/*Answer: B. “b\D\w*@\w+\.com\b”
(“\b” is used to mark word boundaries, “\D” is used to match any non-digit number, and
“\w*” is used to match any word of length zero or more. */
