package com.vladproduction.c02_pretest.cover_questions.task22;

import java.util.regex.Pattern;

public class Split {
    public static void main(String []args) {
        String date = "10-01-2012"; // 10th January 2012 in dd-mm-yyyy format
        String [] dateParts = date.split("-");
        System.out.print("Using String.split method: ");
        for(String part : dateParts) {
            System.out.print(part + " ");
        }
        System.out.print("\nUsing regex pattern: ");
        Pattern datePattern = Pattern.compile("-");
        dateParts = datePattern.split(date);
        for(String part : dateParts) {
            System.out.print(part + " ");
        }
    }
}

/*Which one of the following options correctly provides the output of this program?
a)
Using String.split method: 10-01-2012
Using regex pattern: 10 01 2012
+++b)
Using String.split method: 10 01 2012
Using regex pattern: 10 01 2012
c)
Using String.split method: 10-01-2012
Using regex pattern: 10-01-2012
d)
Using String.split method:
Using regex pattern: 10 01 2012
e)
Using String.split method: 10 01 2012
Using regex pattern:
f)
Using String.split method:
Using regex pattern:*/
