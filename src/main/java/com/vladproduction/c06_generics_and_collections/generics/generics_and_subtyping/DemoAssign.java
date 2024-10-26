package com.vladproduction.c06_generics_and_collections.generics.generics_and_subtyping;

import java.util.ArrayList;
import java.util.List;

public class DemoAssign {
    public static void main(String[] args) {
//        List<Integer> intList1 = new List<Integer>();
        List<Integer> intList2 = new ArrayList<Integer>();
//        List<Number> intList3 = new ArrayList<Integer>();
//        List<Integer> intList4 = new ArrayList<Number>();

        /*You can assign a derived type object to its base type reference; this is what you mean by subtyping. However, for
        generics, the type parameters should match exactly—otherwise you’ll get a compiler error. In other words, subtyping
        does not work for generic parameters.*/

        // illegal code – assume that the following initialization is allowed
//        List<Number> intList5 = new ArrayList<Integer>();
//        intList5.add(10); // okay
//        intList5.add(10.0f); // oops!


    }
}
