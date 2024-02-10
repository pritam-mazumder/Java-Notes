package com.Chapter_15_Wrapper_Classes;

/*
    Boxing Vs Autoboxing Vs Unboxing Vs Autounboxing

    Boxing:
     - A process of converting a primitive type into its corresponding wrapper class.
     - It involves creating an object of the wrapper class and assigning the value of the primitive type to it.

    Autoboxing:
     - Autoboxing is a feature introduced in Java 5 that automatically converts primitive types into their corresponding wrapper classes when needed.
     - It simplifies the code by eliminating the need for explicit boxing.

    Unboxing:
     - Unboxing is the process of converting a wrapper class object back into its corresponding primitive type.
     - It involves extracting the value from the wrapper object and assigning it to a primitive variable.

    Autounboxing:
     - Autounboxing is the automatic conversion of a wrapper class object to its corresponding primitive type.
     - Similar to autoboxing, autounboxing simplifies the code by automatically performing the conversion without explicit code.


    Parent class of all the wrapper classes:
     - For Character and Boolean: Object class
     - For other wrapper classes: Number class

 */

public class Ch_15_2_Typecasting {
    public static void main(String[] args) {

        // Boxing
        int x = 12;
        Integer y = Integer.valueOf(x);
        System.out.println(x);

        // AutoBoxing
        int a = 100;
        Integer b = a;
        System.out.println(b);

        // Unboxing
        Integer i = 50;
        int j = i.intValue();
        System.out.println(j);

        // Autounboxing
        Integer k = 90;
        int l = k;
        System.out.println(l);
    }
}
