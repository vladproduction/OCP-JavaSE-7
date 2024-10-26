package com.vladproduction.c06_generics_and_collections.collections_framework.iterator_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i < 10; i++)
            nums.add(i);
        System.out.println("Original list " + nums);

        Iterator<Integer> numsIter = nums.iterator();
        while(numsIter.hasNext()) {
            numsIter.next();// if not exist this next() method --> IllegalStateException
            numsIter.remove();
        }
        System.out.println("List after removing all elements" + nums);
    }

    /*that next() needs to be called before calling remove() in an Iterator; otherwise - IllegalStateException.
    Similarly, calling remove() in subsequent statements without calling next()
    between these statements will also result in this exception. Basically, any modifications to the underlying
    container while an iterator is traversing through the container will result in this exception.*/

}
