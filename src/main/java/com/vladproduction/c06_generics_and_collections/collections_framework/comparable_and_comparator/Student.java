package com.vladproduction.c06_generics_and_collections.collections_framework.comparable_and_comparator;

import java.util.Comparator;

/**
 * Record type class contain by default:
 * -fields;
 * -constructor;
 * -getters();
 * -toString();
 * -equals() & hashCode();
 */
public record Student(String id, String name, double cgpa) implements Comparable<Student> {
    //cumulative grade point average (CGPA) - stands for 'cgpa'

    //overridden custom toString():
    @Override
    public String toString() {
        return " \n " + id + " \t " + name + " \t " + cgpa;
    }

    //must implement from Comparable interface:
    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}

    //class created for custom implementation of comparing two objects
    //by their cgpa
class CGPAComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.cgpa(), s2.cgpa());
    }
}

