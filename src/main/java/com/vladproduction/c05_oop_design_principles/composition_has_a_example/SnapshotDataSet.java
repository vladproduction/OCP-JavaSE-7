package com.vladproduction.c05_oop_design_principles.composition_has_a_example;

import com.vladproduction.c05_oop_design_principles.composition_has_a_example.impl.MergeSort;
import com.vladproduction.c05_oop_design_principles.composition_has_a_example.impl.QuickSort;

public class SnapshotDataSet {

    Sorting sorting;

    public SnapshotDataSet() {
        sorting = new QuickSort();
    }

    //other implementation... SnapshotDataSet
}
