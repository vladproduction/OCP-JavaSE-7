package com.vladproduction.c06_generics_and_collections.collections_framework.hash_map;

import java.util.HashSet;
import java.util.Set;

public class TestCircleObject {
    public static void main(String[] args) {
        Set<CircleObject> circleList = new HashSet<>();
        circleList.add(new CircleObject(10, 20, 5));
        System.out.println(circleList.contains(new CircleObject(10, 20, 5)));
    }
}
