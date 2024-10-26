package com.vladproduction.c06_generics_and_collections.generics.multiple_bound;

public class MultipleBound <T extends A & B>{

    private final T objectReference;

    public MultipleBound(T objectReference) {
        this.objectReference = objectReference;
    }

    public void run(){
        this.objectReference.execute();
    }
}
