package com.vladproduction.c06_generics_and_collections.generics.upper_bounded_wildcard;

import java.util.ArrayList;
import java.util.List;

public class ExtendsNumber {
    public static void main(String[] args) {
        /*In List<? extends Number>, the wildcard (?) is bounded with extends Number.
        This means that any type you substitute for wildcard (?) should satisfy the condition extends Number.
        For example, in ? extends Number, if you substitute ? with type Integer, you get
        Integer extends Number—which is logically true.*/

        List<? extends Number> listNumbers = new ArrayList<Integer>();
        //or:
        listNumbers = new ArrayList<Double>();
        //or as well:
        listNumbers = new ArrayList<Float>();

    }
}
