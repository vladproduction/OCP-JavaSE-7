package com.vladproduction.c06_generics_and_collections.collections_framework.array_list;

import java.util.ArrayList;
import java.util.List;

public class Example_removeIf {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        System.out.println(letters);

        letters.removeIf(letter -> letter.equals("C"));

        System.out.println(letters);
    }
}
