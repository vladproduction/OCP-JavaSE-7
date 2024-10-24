package com.vladproduction.c05_oop_design_principles.some_design_patterns.singleton;

public class MainSingletonLazyHolderApp {
    public static void main(String[] args) {
        SingletonLazyHolder instance1 = SingletonLazyHolder.getInstance("Singleton-1");
        SingletonLazyHolder instance2 = SingletonLazyHolder.getInstance("Singleton-2");
        System.out.format("instance1: %s%n", instance1.getName());
        System.out.format("instance2: %s%n", instance2.getName());

        if(instance1 == instance2){
            System.out.println("instances are same");
        }
        else {
            System.out.println("instances are same");
        }
    }
}
