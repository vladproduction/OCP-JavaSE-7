package com.vladproduction.c05_oop_design_principles.some_design_patterns.creational.singleton;

public class SingletonLazyHolder {
    private final String name;
    private SingletonLazyHolder(String name){
        this.name = name;
    }
    private static class LazyHolderInnerClass {
        static SingletonLazyHolder instance;
    }
    public static SingletonLazyHolder getInstance(String name){
        if(LazyHolderInnerClass.instance == null){
            LazyHolderInnerClass.instance = new SingletonLazyHolder(name);
        }
        return LazyHolderInnerClass.instance;
    }

    public String getName() {
        return name;
    }
}
