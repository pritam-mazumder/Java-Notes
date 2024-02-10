/*
Literals:
A constant value which can be assigned to the variables is called a literal



Keywords:
Words which are reserved and used by the Java compiler.
They cannot be used as Identifier

 */


package com.Chapter_1;

public class Ch1_4_Literals {
    public static void main(String[] args) {
        byte age = 34;
        int age2 = 56;
        short age3 = 84;
        long ageDino = 5666666666666L; // l or L both are the same
        char ch = 'A';
        float f1 = 5.56f; // Because by default, it will consider it as double, so you need to write f of F
        double d1 = 4.6754;
        boolean a = true;
        String str = "Fr1sk";

        System.out.println(age);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(ageDino);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(a);
        System.out.println(str);
        System.out.println();

        // String literals
        String s = "hello";
        System.out.println("This is some text");

        // Character literals
        char c = 'a';
        System.out.println('b');

        // Integer literals
        int i = 123;
        System.out.println(123);

        // Floating point literals
        System.out.println(15.3); // double
        System.out.println(5.3f); // float

        // Boolean literals
        boolean b1 = true;
        boolean b2 = false;
    }
}

