package com.vladproduction.c06_generics_and_collections.generics.wildcard_in_collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * static <T> void copy(List<? super T> dest, List<? extends T> src);
 * The copy() method copies all the elements from src List to dest List. Here is an example to understand why
 * dest is <? super T> and src is <? extends T>;
 *
 * substitute the T with the actual type and visualize how the replaced type would look.
 * This is the easiest way to understand the correct usage of generics;
 * */
public class Example_copy {
    public static void main(String[] args) {

        //the source List type to use for the Collections.copy method
        List<? extends Number> intList = Collections.nCopies(5, 10);

        //going to use this List as the target for Collections.copy.
        List<Object> objList = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            objList.add(new Object());
        }

        // objList as the destination (target) and intList as the source for the
        //Collections.copy method
        Collections.copy(objList, intList);
        System.out.println("The objList is: " + objList);

    }
}
