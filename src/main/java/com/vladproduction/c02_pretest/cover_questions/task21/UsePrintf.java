package com.vladproduction.c02_pretest.cover_questions.task21;

public class UsePrintf {
    public static void main(String []args) {
        int c = 'a';
        float f = 10;
        long ell = 100L;
//        System.out.printf("char val is %c, float val is %f, long int val is %ld \n", c, f, ell);//UnknownFormatConversionException: Conversion = 'l'
        System.out.printf("char val is %c, float val is %f, long int val is %d \n", c, f, ell); //correct
    }
}
/*Which one of the following options best describes the behavior of this program when executed?
a) The program prints the following: char val is a, float val is 10.000000, long int val is 100.
b) The program prints the following: char val is 65, float val is 10.000000, long int val is 100.
c) The program prints the following: char val is a, float val is 10, long int val is 100L.
d) The program prints the following: char val is 65, float val is 10.000000, long int val is 100L.
e) The program prints the following: char val is 65, float val is 10, long int val is 100L.
+++f) The program throws an exception of java.util.UnknownFormatConversionException: Conversion = 'l'.*/
