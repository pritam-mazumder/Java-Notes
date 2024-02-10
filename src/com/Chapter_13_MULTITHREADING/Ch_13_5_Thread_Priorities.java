package com.Chapter_13_MULTITHREADING;

/*
    THREAD PRIORITY:

    Whenever we create a thread in Java, it always has some priority assigned to it.
    Priority can either be given by JVM while creating the thread or
    it can be given by the programmer explicitly.

    1. public static int MIN_PRIORITY
       - Minimum priority that can be given to a thread.
       - Value = 1

    2. public static int NORM_PRIORITY
       - Default priority that is given to a thread IF IT IS NOT DEFINED.
       - Value = 0

    3. public static int MAX_PRIORITY
       - Maximum priority that can be given to a thread.
       - Value = 10
 */

//  Threads class with no priority given

class ChildClass8 extends Thread {

    public ChildClass8(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " Id: " + this.getId());
    }
}

//  Threads class with priority set
class ChildClass7 extends Thread {
    public ChildClass7(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " Id: " + this.getId());
    }
}

public class Ch_13_5_Thread_Priorities {
    public static void main(String[] args) {

        ChildClass7 c1 = new ChildClass7("Thread 1");
        ChildClass7 c2 = new ChildClass7("Thread 2");
        ChildClass7 c3 = new ChildClass7("Thread 3");
        ChildClass7 c4 = new ChildClass7("Thread 4");
        ChildClass7 c5 = new ChildClass7("Thread 5");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();


        ChildClass8 d1 = new ChildClass8("(M imp) Thread 1");
        ChildClass8 d2 = new ChildClass8("Thread 2");
        ChildClass8 d3 = new ChildClass8("Thread 3");
        ChildClass8 d4 = new ChildClass8("Thread 4");
        ChildClass8 d5 = new ChildClass8("(L imp) Thread 5");

        d1.setPriority(Thread.MAX_PRIORITY);
        d5.setPriority(Thread.MIN_PRIORITY);

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
    }
}
