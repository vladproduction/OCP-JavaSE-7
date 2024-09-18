package com.vladproduction.c03_java_class_design.essentials_OOP;

public class CovariantReturnTypes {
    public static void main(String[] args) {

        Suv suv = new Suv(2000);
        Suv suv_copied = (Suv) suv.copy(); //compiler error: need to downcast from Vehicle to Suv

        //or
        //we can change returning type of overridden method copy(): Vehicle --> Suv
        Suv suv_copied_2 = suv.copy(); //compiler works fine: no need to cast

    }

}

abstract class Vehicle {
    //other methods
    public abstract Vehicle copy();
}

class Suv extends Vehicle {
    //other methods
    public Suv(int weight) {
    }

    /*@Override
    public Vehicle copy() {
        return new Suv(5000);
    }*/
    @Override
    public Suv copy() {
        return new Suv(5000);
    }
}
