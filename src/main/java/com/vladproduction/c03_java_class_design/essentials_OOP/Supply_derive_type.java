package com.vladproduction.c03_java_class_design.essentials_OOP;

public class Supply_derive_type {

    public static void main(String[] args) {

        // Create a Number array
        Number []nums = new Number[4];
        // assign derived class objects
        byte b = 10;
        int i = 10;
        float f = 10.0f;
        float d = 10.0f;
        nums[0] = b;
        nums[1] = i;
        nums[2] = f;
        nums[3] = d;
        // pass the Number array to sum and print the result
        System.out.println("The sum of numbers is: " + sum(nums));

    }

    // take an array of numbers and sum them up
    public static double sum(Number [] numbers){
        double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

}
