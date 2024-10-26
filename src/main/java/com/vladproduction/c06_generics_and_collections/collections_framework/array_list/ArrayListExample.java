package com.vladproduction.c06_generics_and_collections.collections_framework.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> languageList = new ArrayList<>();
        languageList.add("C");
        languageList.add("C++");
        languageList.add("Java");
        //for-each loop
        for (String language : languageList) {
            System.out.println(language);
        }

        System.out.println("----iterator()----");
        /*for-each is equivalent to the following code, which explicitly uses an Iterator:*/
        for (Iterator<String> languageIter = languageList.iterator(); languageIter.hasNext();) {
            System.out.println(languageIter.next());
        }
        //description:
        /*
        1. You use the iterator() method to get the iterator for that container. Since languageList
        is an ArrayList of type <String>, you should create Iterator with String. Name it
        languageIter.
        2. Before entering the loop, you check if there are any elements to visit. You call the
        hasNext() method for checking that. If it returns true, there are more elements to visit; if it
        returns false, the iteration is over and you exit the loop.
        3. Once you enter the body of the loop, the first thing you have to do is call next() and move
        the iterator. The next() method returns the iterated value. You capture that return value in
        the language variable.
        4. You print the language value, and then the loop continues.
        */

    }
}
