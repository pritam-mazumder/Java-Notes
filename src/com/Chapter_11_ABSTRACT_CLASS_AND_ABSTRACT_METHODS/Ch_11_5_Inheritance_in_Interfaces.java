package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS;
/*
    Interface extends Interface --> Allowed
    Class extends Interface     --> Not allowed
    Class implements Interface  --> Allowed


    class    --> EXTENDS      --> class.
    class    --> EXTENDS      --> abstract class.
    class    --> IMPLEMENTS   --> interface.
    interface--> EXTENDS      --> interface
*/
interface ParentInterface{
    void m1();
    void m2();
}
interface ChildInterface extends ParentInterface{
    void m3();
    void m4();
}
class TestClass2 implements ChildInterface{
    public void m1() {
        System.out.println("m1");
    }
    public void m2() {
        System.out.println("m2");
    }
    public void m3() {
        System.out.println("m3");
    }
    public void m4() {
        System.out.println("m4");
    }
}
public class Ch_11_5_Inheritance_in_Interfaces {
    public static void main(String[] args) {
        TestClass2 t = new TestClass2();
        t.m1();
        t.m2();
        t.m3();
        t.m4();
    }
}
