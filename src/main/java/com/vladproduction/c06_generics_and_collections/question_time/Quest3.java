package com.vladproduction.c06_generics_and_collections.question_time;

import com.vladproduction.c06_generics_and_collections.collections_framework.comparable_and_comparator.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Quest3 {
    public static void main(String[] args) {
        /*Which statement is true with respect to List<?> and List<Object>?

        A. Both are same, just two different ways to express a same thing.

        B. List<?> is a homogenous list of elements of a same unknown type and
        List<Object> is a heterogeneous list of elements of different types.

        C. List<?> is a heterogeneous list of elements of different types and List<Object> is
        a homogenous list of elements of a same unknown type.

        Answer: B. */

        //why? explanation:
        /**  1)List<?> (Wildcards):
            The List<?> syntax means "a list of an unknown type."
            This is a wildcard type in generics that allows you to refer to a generic type without having to specify what that type is.
            However, the elements in a List<?> are considered to be of the same unknown type when accessed.
            You can read elements from List<?>, but you cannot add elements to it (except for null), because you don't know what specific type it is.*/

        /**  2)List:
            The List<Object> is explicitly a list that can hold any type of Object, meaning it can contain different types of elements.
            It allows you to add any object, as all classes in Java are derived from Object.
            Hence, List<Object> is heterogeneous because it can contain different types — for example, String, Integer, Student, etc.*/

        //example:
        // Creating a List<?> (Wildcard) - unknowing type, read only, not to add
        List<?> wildcardList = new ArrayList<String>(List.of("Hello", "World", "!")); // Can hold a List of Strings
//         wildcardList.add("Hello"); // This would cause an error since the type is unknown
        String str = (String) wildcardList.get(0); // This is safe as we know it is String

        // Creating a List<Object> (Heterogeneous) - any Object type
        List<Object> objectList = new ArrayList<>();
        objectList.add("Java");  // String is an Object
        objectList.add(123);      // Integer is also an Object
        objectList.add(new Student("S001", "Alice", 3.5)); // Add any Object type

        System.out.println("Wildcard List: " + wildcardList);
        System.out.println("Object List: " + objectList);

    }
}

