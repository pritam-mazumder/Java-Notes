package com.Chapter_10_INHERITANCE;

/*
    INHERITANCE:
    Inheritance is a mechanism in which one object acquires all the properties of a parent object.

    Types of inheritance:

    1.  Single:         When a class inherits another class.
    2.  Multilevel:     When there is a chain of inheritance.
    3.  Hierarchical:   When two or more class inherits a single clas.

    4.  Multiple
    5.  Hybrid

    When a class inherits from a superclass, it inherits part of superclass methods and fields.
    Java doesn't support multiple inheritance i.e., two classes cannot be super classes for a subclass.
 */

class Parent /* Parent class / Base class / Super class */ {
    int x;

    void setX(int x) {
        System.out.println("Parent and setting x");
        this.x = x;
    }

    int getX() {
        System.out.println("Child");
        return x;
    }
}

class Child /* Child class / Derived class / Sub class */ extends Parent {
    int y;

    public void setY(int y) {
        System.out.println("Child and setting y");
        this.y = y;
    }

    public int getY() {
        System.out.println("Child");
        return y;
    }
}

public class Ch_10_1_Inheritance {
    public static void main(String[] args) {
        //Object of PARENT class using PARENT class
        Parent p = new Parent();
        p.setX(4);
        System.out.println(p.getX());

        //Object of CHILD class using CHILD class
        Child ch = new Child();
        ch.setY(5);
        System.out.println(ch.getY());

        //Object of PARENT class using CHILD class
        Child c = new Child();
        c.setX(44);
        System.out.println(c.getX());
    }
}
