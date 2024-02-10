package com.Chapter_10_INHERITANCE;

/*
    Dynamic Method Dispatch:

    Dynamic method dispatch is also known as run time polymorphism.
    A process through which a call to an overridden method is resolved at the runtime rather than compile time.

    CREATING THE OBJECT OF CHILD/SUB-CLASS WITH THE REFERENCE OF PARENT/SUPER-CLASS

    PARENT CLASS obj = new CHILD CLASS
                  OR
    SUPER CLASS obj = new SUB CLASS
*/

/*
class Parent3 {
    public void m1() {
        System.out.println("Parent3 m1");
    }

    public void m2() {
        System.out.println("Parent3 m2");
    }
}

class Child3 extends Parent3 {
    @Override
    public void m2() {
        System.out.println("Child3 m2");
    }

    public void m3() {
        System.out.println("Child3 m3");
    }
}

class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

*/

class MobileOS {
    void display() {
        System.out.println("We are talking about mobile operating systems.");
    }
}
class Android extends MobileOS {
    @Override
    void display() {
        System.out.println("Android is a MobileOS.");
    }
}
class iOS extends MobileOS {
    @Override
    void display() {
        System.out.println("iOS is a MobileOS.");
    }
}
public class Ch_10_5_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

/*
        Parent3 p = new Child3(); //Yes it is allowed
//      Child3 c = new Parent3(); //Not allowed

        p.m1();//"Parent3 m1"
        p.m2();//"Child3 m2"
//      p.m3();// not allowed


        Phone obj = new SmartPhone();
        obj.showTime();
        obj.on();
//      obj.music();// Not Allowed
*/

        //Create an object of parent class
        MobileOS os1 = new MobileOS();
        os1.display();

        //Create an object of child class
        MobileOS os2 = new Android(); //Upcasting
        os2.display();

        //Create an object of child class
        MobileOS os3 = new iOS(); //Upcasting
        os3.display();
    }
}
