package com.vladproduction.c06_generics_and_collections.generics.wildcard_in_collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * method fills the whole of the list with values obj. Here we use <? super T>;
 * */
public class Example_fill {
    public static void main(String[] args) {

        List<Object> objList = new ArrayList<>();
        objList.add(new Object());
        objList.add(new Object());
        Collections.fill(objList, "hello");
        System.out.println("The objList is: " + objList);

    }
}
