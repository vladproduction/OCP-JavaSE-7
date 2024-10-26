package com.vladproduction.c06_generics_and_collections.generics.generic_classes;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> manchester = new Pair<Integer, String>(1878, "Manchester United");
        System.out.println(manchester.getFirst() + " founded " + manchester.getSecond());

        Pair<Integer, String> liverpool = new Pair<Integer, String>(1892, "Liverpool");
        System.out.println(liverpool.getFirst() + " founded " + liverpool.getSecond());

        Pair<Integer, String> milan = new Pair<Integer, String>(1899, "Milan");
        System.out.println(milan.getFirst() + " founded " + milan.getSecond());

        Pair<Integer, String> real = new Pair<Integer, String>(1902, "Real Madrid");
        System.out.println(real.getFirst() + " founded " + real.getSecond());

    }
}
