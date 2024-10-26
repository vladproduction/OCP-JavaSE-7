package com.vladproduction.c06_generics_and_collections.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * list using wildcard can be passed list of integers as well as list of strings. This happens
 * because of the parameter type of printList() method—List<?>
 * */
public class WildCardUse {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);

    }

    private static void printList(List<?> list){
        for (Object object : list) {
            System.out.println("[" + object + "]");
        }
    }

}
