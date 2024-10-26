package com.vladproduction.c06_generics_and_collections.generics.interoperability_raw_generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest2 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        List<String> strList = list;
//        strList.add(10); //#1: generates compiler error
        for (String s : strList){
            System.out.println("Item : " + s);
        }

        List<String> strList2 = new LinkedList<>();
        strList2.add("First");
        strList2.add("Second");
        List list2 = strList2;
//        list2.add(10); //#2: compiles fine, results in runtime exception
        for (String o : (Iterable<String>) list2) { //trying cast Integer into String
            System.out.println("Item : " + o);
        }

    }
}
