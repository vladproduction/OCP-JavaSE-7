package com.vladproduction.c07_string_processing.question_time;

/**
 * Consider this program, which intends to print the word delimited by the characters ‘*’ in
 * its both ends
 * */
public class Quest1 {
    public static void main(String[] args) {
        String quote = "An *onion* a day keeps everyone away!";
        // match the word delimited by *'s
        int startDelimit = quote.indexOf('*');
        int endDelimit = quote.lastIndexOf("*");
        System.out.println(quote.substring(startDelimit, endDelimit));
    }
    /*Answer: A. *onion
    (The substring (beginIndex, endIndex) consists of characters beginning from the character at
    beginIndex till the character at the endIndex – 1.)*/

}
