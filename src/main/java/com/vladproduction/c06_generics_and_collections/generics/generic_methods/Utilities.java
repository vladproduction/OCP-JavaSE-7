package com.vladproduction.c06_generics_and_collections.generics.generic_methods;

import java.util.Collections;
import java.util.List;

public class Utilities {
    public static <T> void fill1(List<T> list, T value){
        for (int i = 0; i < list.size(); i++) {
             list.set(i, value);
        }
    }
    public static <T> void fill2(List<T> list, T value){
        Collections.fill(list, value);
    }
}
