package com.vladproduction.c06_generics_and_collections.generics.wildcard_in_collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The reverse() method reverses the order of elements in the passed list. You can pass elements of any type; the
 * Collections class just uses the wildcard <?> for the List type.
 *
 * static void reverse(List<?> list);
 * */
public class Example_reverse {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>(List.of("C", "B", "A"));
        Collections.reverse(letters);
        System.out.println(letters); //[A, B, C]

    }
}
