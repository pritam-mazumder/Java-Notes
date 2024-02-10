package com.Chapter_15_Wrapper_Classes;

import java.lang.*;

/*
    In Java, wrapper classes are a set of classes that provide a way to use primitive data types (int, boolean, etc..) as objects.
    Each primitive data type in Java has a corresponding wrapper class, which allows you to perform various operations on them as objects.
    The wrapper classes are part of the Java API and are located in the java.lang package.
*/




public class Ch_15_1_Wrapper_Classes {
    public static void main(String[] args) {

        // Example 1
        String s1 = "123";
        String s2 = "456";

        System.out.println(s1 + s2);

        int p1 = Integer.parseInt(s1);
        int p2 = Integer.parseInt(s2);

        System.out.println(p1 + p2);


        // Example 2
        String s3 = "1.50";
        String s4 = "3.50";

        System.out.println(s3 + s4);

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);

        System.out.println(f1 + f2);
    }
}
