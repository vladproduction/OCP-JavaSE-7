package com.vladproduction.c02_pretest.cover_questions.task11;

public class InnerClassAccess {
    public static void main(String []args) {
        System.out.println(new Outer.Inner().text);
        //output:
        // Inner

    }
}
/*Which one of the following expressions when replaced for the text in place of the comment *//*CODE HERE*//* will
print the output “Inner” in console?*/
//+++a) new Outer.Inner().text
//b) Outer.new Inner().text
//c) Outer.Inner.text
//d) new Outer().Inner.text
