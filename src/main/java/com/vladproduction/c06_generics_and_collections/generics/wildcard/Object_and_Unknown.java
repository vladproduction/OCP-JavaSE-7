package com.vladproduction.c06_generics_and_collections.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**In summary, while every object in Java is indeed an Object, List<Object> means a specific list that can hold Object instances,
 while List<?> is a more general concept that allows you to interact with lists of unknown types without knowing what they contain.*/
public class Object_and_Unknown {
    public static void main(String[] args) {
        /*List<Object>: This is a list that can only contain objects of type Object or its subclasses.
        Can add elements to this list as long as they are of type Object or any of its subclasses.
        For example, can add String, Integer, or any other object to this list.*/
        List<Object> objectList = new ArrayList<>();
        objectList.add("Hello"); // valid
        objectList.add(123);     // valid

        /*List<?>: This is a list of an unknown type. It means you can read from it, but you cannot add elements to it (except for null).
        The wildcard (?) indicates that the list could contain any type of object, but you don’t know what that type is.
        This is useful for situations where you want to accept a list of any type without knowing the specific type it will hold.*/
        List<?> wildcardList = new ArrayList<String>();
        // wildcardList.add("Hello"); // compilation error
        // wildcardList.add(123);     // compilation error

    }
}
