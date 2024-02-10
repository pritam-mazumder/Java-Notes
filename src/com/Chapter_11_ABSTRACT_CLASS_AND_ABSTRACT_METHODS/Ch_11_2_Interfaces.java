package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS;

/*
    INTERFACES:

    Interface is a mechanism to achieve abstraction.
    Interface is similar to abstract class but having all the methods of abstract type i.e.,
    it cannot have any private methods.

    Java 8 supports "default", "static" methods.
    Java 9 supports "private" methods.

    Interface methods are by default "public abstract"
    Interface fields are by default "public static final"
    it is not necessarily  to write the "public abstract" or "public static final" in the interface as it automatically take it as default.

     CONDITIONS FOR METHOD OVERRIDING:

     1. same name
     2. different class
     3. same arguments
        - no. of args
        - type of args
        - sequence of args
     4. access modifier should grater or equals to the parent class
*/

interface Abilities {
    String type = "Dualist";    // It is final and does not support changes.

    public abstract void E();   // Type 1: with "public abstract"

    void X(int i);              // Type 2: without "public abstract"
}

interface Abilities2 {
    void C();

    void Q();
}

class Jett implements Abilities, Abilities2 {
    @Override
    public void E() {
        System.out.println("Tailwind");
    }

    @Override
    public void X(int i) {
        System.out.println("Blade Storm");
    }

    @Override
    public void C() {
        System.out.println("Cloudburst");
    }

    @Override
    public void Q() {
        System.out.println("Updraft");
    }
}

public class Ch_11_2_Interfaces {
    public static void main(String[] args) {
        Jett j = new Jett();
        System.out.println(j.type);
        j.E();
        j.X(4);
        j.C();
        j.Q();
    }
}
