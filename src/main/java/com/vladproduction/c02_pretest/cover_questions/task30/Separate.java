package com.vladproduction.c02_pretest.cover_questions.task30;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Separate {
    public static void main(String []args) {
        String text = "<head>first program </head> <body>hello world</body>";
        Set<String> words = new TreeSet<>();
        try ( Scanner tokenizingScanner = new Scanner(text) ) {
            tokenizingScanner.useDelimiter("\\W");
            while(tokenizingScanner.hasNext()) {
                String word = tokenizingScanner.next();
                if(!word.trim().equals("")) {
                    words.add(word);
                }
            }
        }
        for(String word : words) {
            System.out.print(word + " ");
        }
    }
    //output:
    //body first head hello program world
}
/*Which one of the following options correctly provides the output of this program?
a) hello body program head first world
+++b) body first head hello program world
c) head first program head body hello world body
d) head first program body hello world
e) < </ >*/
