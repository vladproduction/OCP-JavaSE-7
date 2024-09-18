package com.vladproduction.c04_advanced_class_design.question_time;

public class Task3 {
    protected void display(){
        //code
    }
}

class T extends Task3{
    @Override
    protected void display() { //provide only a less restrictive or same-access modifier when overriding a method;
        super.display();
    }
}
