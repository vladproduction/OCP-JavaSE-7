package com.vladproduction.c02_pretest.cover_questions.task01;

class StrEqual {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = new String("hi");
        String s3 = "hi";
        if (s1 == s2) {
            System.out.println("s1 and s2 equal");
        } else {
            System.out.println("s1 and s2 not equal");
        }

        if (s1 == s3) {
            System.out.println("s1 and s3 equal");
        } else {
            System.out.println("s1 and s3 not equal");
        }

        //output:
     /*s1 and s2 not equal --> two diff references (keyword 'new')
     s1 and s3 equal --> string pool in action*/
    }
}

/*
Which one of the following options provides the output of this program when executed?
a)
s1 and s2 equal
s1 and s3 equal
b)
s1 and s2 equal
s1 and s3 not equal
c)
s1 and s2 not equal
s1 and s3 equal
d)
s1 and s2 not equal
s1 and s3 not equal*/
