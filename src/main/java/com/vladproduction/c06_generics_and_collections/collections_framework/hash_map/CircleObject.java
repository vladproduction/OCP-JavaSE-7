package com.vladproduction.c06_generics_and_collections.collections_framework.hash_map;

public class CircleObject {

    private int xPos, yPos, radius;

    public CircleObject(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public boolean equals(Object arg) {
        if(arg == null) return false;
        if(this == arg) return true;
        if(arg instanceof CircleObject) {
            CircleObject that = (CircleObject) arg;
            if( (this.xPos == that.xPos) && (this.yPos == that.yPos)
                    && (this.radius == that.radius )) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        // use bit-manipuation operators such as ^ to generate close to unique hash codes
        // here we are using the magic numbers 7, 11 and 53, but you can use any numbers, preferably primes
        return (7 * xPos) ^ (11 * yPos) ^ (53 * yPos);
    }
}
