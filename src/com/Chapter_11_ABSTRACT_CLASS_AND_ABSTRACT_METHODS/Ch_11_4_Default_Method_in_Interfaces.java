package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS;
/*
    Default Methods:

    Default methods allow the interfaces to have methods with implementation
    without affecting the classes that implement the interface.

    Java 8 supports "default", "static" methods.
    Java 9 supports "private" methods.
*/

interface A2{
    void m1();
    private void asd(){     // Cannot call a private method directly
        System.out.println("A2 private method");
    }
    default void show(){
        asd();              /* if the actual logic is of default method gets very big,
                               we can simply write it in the private method and
                               call it un the default method */
        System.out.println("A2 default method");
    }
}

class TestClass implements A2{
    public void m1() {
        System.out.println("A2 m1");
    }
}

public class Ch_11_4_Default_Method_in_Interfaces {
    public static void main(String[] args) {
        TestClass d = new TestClass();
        d.show();
        d.m1();

        A2 a = new TestClass();
        a.m1();
    }
}