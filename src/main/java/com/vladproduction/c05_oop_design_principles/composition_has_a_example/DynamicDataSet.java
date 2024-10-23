package com.vladproduction.c05_oop_design_principles.composition_has_a_example;

import com.vladproduction.c05_oop_design_principles.composition_has_a_example.impl.MergeSort;

public class DynamicDataSet {

    Sorting sorting;

    public DynamicDataSet() {
        sorting = new MergeSort();
    }

    //other implementation... DynamicDataSet
}
