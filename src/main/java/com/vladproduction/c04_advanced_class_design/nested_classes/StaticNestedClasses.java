package com.vladproduction.c04_advanced_class_design.nested_classes;

public class StaticNestedClasses {
}

class OuterA { // an outer class has a static nested class
    static class Inner {}
}
interface OuterB { // an outer interface has a static nested class
    static class Inner {} //it is implicitly static
}
class OuterC { // an outer class has a static nested interface
    static interface Inner {} //it is implicitly static
}
interface OuterD { // an outer interface has a static nested interface
    static interface Inner {}
}
