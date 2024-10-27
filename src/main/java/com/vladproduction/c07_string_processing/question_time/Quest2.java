package com.vladproduction.c07_string_processing.question_time;

public class Quest2 {
    public static void main(String[] args) {
        String quote = "Never lend books-nobody ever returns them!";
        String [] words = quote.split(" ", 2);
        // split strings based on the delimiter " " (space)
        for (String word : words) {
            System.out.println(word);
        }
    }
}
//A. It will result in a compile-time error.
//B. It will result in a runtime exception.
/*C. It will print the following output when executed
Never
lend*/
/*D. It will print the following output when executed
Never
lend books-nobody ever returns them!*/

//Answer: D
/*
(The second parameter of the split() method specifies the total number of strings that the split()
method needs to generate. In the last string (here, in the second string), the split() method puts the
remaining part of the string.)*/
