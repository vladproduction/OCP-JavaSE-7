package com.vladproduction.c02_pretest.cover_questions.task04;

public class ArrayCompare {
    public static void main(String[] args) {
        int []arr1 = {1, 2, 3, 4, 5};
        int []arr2 = {1, 2, 3, 4, 5};

        System.out.println("arr1 == arr2 is " + (arr1 == arr2));//false
        //This line compares the references of arr1 and arr2, not their contents.

        System.out.println("arr1.equals(arr2) is " + arr1.equals(arr2));//false
        //defaults to the Object class's equals() method, which compares references.

        System.out.println("Arrays.equals(arr1, arr2) is " + java.util.Arrays.equals(arr1, arr2));//true
        //The java.util.Arrays.equals(arr1, arr2) method is specifically designed for comparing the contents of arrays.

        //output:
        /*arr1 == arr2 is false
        arr1.equals(arr2) is false
        Arrays.equals(arr1, arr2) is true*/
    }
}
/*Which one of the following options provides the output of this program when executed?
+++a) arr1 == arr2 is false
        arr1.equals(arr2) is false
        Arrays.equals(arr1, arr2) is true
b) arr1 == arr2 is true
        arr1.equals(arr2) is false
        Arrays.equals(arr1, arr2) is true
c) arr1 == arr2 is false
        arr1.equals(arr2) is true
        Arrays.equals(arr1, arr2) is true
d) arr1 == arr2 is true
        arr1.equals(arr2) is true
        Arrays.equals(arr1, arr2) is false
e) arr1 == arr2 is true
        arr1.equals(arr2) is true
        Arrays.equals(arr1, arr2) is true*/
