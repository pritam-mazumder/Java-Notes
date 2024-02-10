package com.Chapter_10_INHERITANCE;

/*
    Method Overriding:
    When child class has the same method as declared in the parent class

    The "parameters" and "access modifiers" of the methods should be same in both parent and child
    Cannot override 'static' and 'final' method
*/


class A{
    public void method1(){
        System.out.println("Method 1 of class A");
    }
}
class B extends A{
    @Override
    /*A notation that indicates that you've performed method overriding
      Not compulsory but RECOMMENDED
      Make code more readable
      Act as a warning indicator.
      When we are overriding and by mistake we've changed something in the parent class,
      this will help to find the error more sufficiently */
    public void method1(){
        System.out.println("Method 1 of class B");
    }
}

public class Ch_10_4_Method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method1();

        B b = new B();
        b.method1();

    }
}
