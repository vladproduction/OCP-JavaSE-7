package com.vladproduction.c11_exceptions_and_assertions.intro;

/**
 * A simple program without exception handling code
 * */
public class Echo {
    public static void main(String []args) {
//        model_no_exception_handling(args);
        model_with_exception_handling(args);
    }

    private static void model_no_exception_handling(String[] args) {
        if(args.length == 0) {
            // no arguments passed – display an error to the user
            System.out.println("Error: No input passed to echo command... ");
            System.exit(-1);
        }
        else {
            for(String str : args) {
                // command-line arguments are separated and passed as an array
                // print them by adding a space between the array elements
                System.out.print(str + " ");
            }
        }
    }

    private static void model_with_exception_handling(String[] args) {
        if(args.length == 0) {
            // no arguments passed - throw an exception
            throw new IllegalArgumentException("No input passed to echo command");
        }
        else {
            for(String str : args) {
                // command-line arguments are separated and passed as an array
                // print them by adding a space between the array elements
                System.out.print(str + " ");
            }
        }
    }


}
