package com.vladproduction.c06_generics_and_collections.generics.interoperability_raw_generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * demonstrates usage of raw types along with generics
 */
public class RawTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        List<String> strList = list; //#1
        for (String s : strList) {
            System.out.println("Item : " + s);
        }

        List<String> strList2 = new LinkedList<>();
        strList2.add("First");
        strList2.add("Second");
        List list2 = strList2; //#2
        for (String o : (Iterable<String>) list2) {
            System.out.println("Item : " + o);
        }
    }
}
