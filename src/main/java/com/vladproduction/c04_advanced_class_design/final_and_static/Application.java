package com.vladproduction.c04_advanced_class_design.final_and_static;

public class Application {
    public static void main(String[] args) {

        // Creating an instance of DerivedClass
        BaseClass instance = new DerivedClass();

        // Call the final method with parameters
        String finalMethodResult = instance.finalMethod("Greetings");
        System.out.println("Result from final method with parameter: " + finalMethodResult);

        // Call the not final method with parameters
        String notFinalMethodResult = instance.notFinalMethod(7);
        System.out.println("Result from not final method with parameter: " + notFinalMethodResult);

        // Testing the method with a reference type
        String referenceMethodResult = instance.notFinalMethodWithReferenceType(new CustomEntity("Test Entity"));
        System.out.println("Result from not final method with reference type: " + referenceMethodResult);

    }
}

abstract class BaseClass {
    // Final method (cannot be overridden), takes a String parameter
    final String finalMethod(String message) {
        return "Final method received: " + message;
    }

    // Not final method: takes an int parameter
    public abstract String notFinalMethod(int number);

    // Another not final method: takes an object reference
    public abstract String notFinalMethodWithReferenceType(CustomEntity entity);
}

class DerivedClass extends BaseClass {
    @Override
    public String notFinalMethod(int number) {
        return "Not final method received: " + number;
    }

    @Override
    public String notFinalMethodWithReferenceType(CustomEntity entity) {
        return "Not final method received reference: " + entity.getTitle();
    }
}

class CustomEntity {
    private String title;

    public CustomEntity(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
