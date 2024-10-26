package com.vladproduction.c06_generics_and_collections.collections_framework.tree_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        String pangram = "the quick brown fox jumps over the lazy dog";
        Set<Character> alphabet = new TreeSet<>();
        for (char c : pangram.toCharArray()) {
            alphabet.add(c);
        }
        System.out.println(pangram);
        System.out.println(alphabet);
    }
}
