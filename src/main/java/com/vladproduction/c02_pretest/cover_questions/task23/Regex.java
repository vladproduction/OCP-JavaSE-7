package com.vladproduction.c02_pretest.cover_questions.task23;

import java.util.regex.Pattern;

/**
 * regex pattern a*b+c{3} can be broken down as follows:
 *
 * a*: Matches zero or more occurrences of the character 'a'.
 * b+: Matches one or more occurrences of the character 'b'.
 * c{3}: Matches exactly three occurrences of the character 'c'.
 * */
public class Regex {
    public static void main(String []args) {
        String pattern = "a*b+c{3}";
        String []strings = { "abc", "abbccc", "aabbcc", "aaabbbccc" };
        for(String str : strings) {
            System.out.print(Pattern.matches(pattern, str) + " ");
        }
    }
}

/*Which one of the following options correctly shows the output of this program?
a) true true true true
b) true false false false
c) true false true false
+++d) false true false true
e) false false false true
f) false false false false*/
