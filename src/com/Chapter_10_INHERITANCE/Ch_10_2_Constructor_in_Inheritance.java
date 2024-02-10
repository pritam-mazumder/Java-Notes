package com.Chapter_10_INHERITANCE;

/*
    When a child class is extended from a base class,
    the constructor of the base class is executed first
    followed by the constructor of the child class.
*/
class Parent2{
    Parent2(){
        System.out.println("Parent cons");
    }
    Parent2(int i){
        System.out.println("Parent cons overloaded " + i);
    }
}

class Child2 extends Parent2{
    Child2(){
        //call parent first and then child
        System.out.println("Child cons");
    }
    Child2(int j){
        super(0);
        /* super (for the parent2) is set to 0 that's why the i = 0
           only i rakhte to invalid hota because both j=i=1 in this case
           to call the parameterised constructor of the base class "super" keyword is used
           otherwise it will call the no-args constructor by default
           this will call base overloaded with value "0" and then child */
        System.out.println("child cons overloaded " + j);
    }
    Child2(int i, int j){
        super(i);
        //call base overloaded (super(i) because value is going to be set) and then derived
        System.out.println("Child overloaded " + j);
    }
}

class GrandChild extends Child2{
    GrandChild(){
        System.out.println("GrandChild cont");
    }
    GrandChild(int k){
        super(1);   //value of j is set as 1
        //call base overloaded with value and then child
        System.out.println("GrandChild cont overloaded "+k);
    }
    GrandChild(int i,int j,int k){
        super(i,j);
        System.out.println("GrandChild cont overloaded "+k);
    }
}

public class Ch_10_2_Constructor_in_Inheritance {
    public static void main(String[] args) {

//        Parent2 p1 = new Parent2();
//        System.out.println();
//
//        Parent2 p2 = new Parent2(1);
//        System.out.println();
//
//        Child2 c1 = new Child2();
//        System.out.println();
//
//        Child2 c2 = new Child2(1);
//        System.out.println();
//
//        Child2 c3 = new Child2(1,2);
//        System.out.println();

//        GrandChild g1 = new GrandChild();
//        System.out.println();
//
//        GrandChild g2 = new GrandChild(2);
//        System.out.println();
//
//        GrandChild g3 = new GrandChild(3,4,5);
//        System.out.println();

        Parent2 p1 = new Parent2();                             System.out.println();

        Child2 c1 = new Child2();                               System.out.println();

        Child2 c2 = new Child2(1);                            System.out.println();

        Child2 c3 = new Child2(1, 2);                       System.out.println();

        GrandChild g1 = new GrandChild();                       System.out.println();

        GrandChild g2 = new GrandChild(3);                   System.out.println();

        GrandChild g3 = new GrandChild(4,5,6);
    }
}

/*
    SUPER:
    The super keyword refers to the object of immediate parent class.

    The super keyword is used to represent an instance of the patent class
    and can invoke constructor of the parent class during inheritance.

    To access the data member of patent and child class have member with same name.
    To explicitly call the no-args class and parameterized contractor if parent class.
    To access the method of patent class when class has overridden that method.


    CONSTRUCTOR DURING CONSTRUCTOR OVERLOADING:
    When there are multiple constructors in the present class.
    The constructor without any parameter is called from the child class.
    If we want to call the constructor with parameters from the parent class,
    we can use super keyword.
 */