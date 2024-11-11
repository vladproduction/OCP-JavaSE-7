package com.vladproduction.c02_pretest.cover_questions.task24;

/**
 * regex pattern ^severity[\\s+][1–5] can be analyzed as follows:
 *
 * ^: Asserts that the match must start at the beginning of the string.
 * severity: Matches the literal string "severity".
 * [\\s+]: This part is intended to match a whitespace character followed by a + sign.
 * [1–5]: Matches a single character that can be either '1' or '5'.
 *      However, the dash (–) here should be a hyphen (-) for it to represent a range from 1 to 5 correctly.
 * */
public class MatchCheck {
    public static void main(String[] args) {
        String[] strings = {"Severity 1", "severity 2", "severity3", "severity five"};
        for (String str : strings) {
            if (!str.matches("^severity[\\s+][1-5]")) {
                System.out.println(str + " does not match");
            }
        }
    }
}

/*Which one of the following options correctly shows the output of this program?
a)
Severity 1 does not match
severity 2 does not match
severity five does not match
b)
severity3 does not match
severity five does not match
c)
Severity 1 does not match
severity 2 does not match
+++d)
Severity 1 does not match
severity3 does not match
severity five does not match*/
