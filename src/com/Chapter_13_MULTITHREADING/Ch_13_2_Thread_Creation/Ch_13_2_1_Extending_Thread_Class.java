package com.Chapter_13_MULTITHREADING.Ch_13_2_Thread_Creation;

/*
    Extending Thread Class

    A thread can be created by extending the Thread class i.e., java.lang.Thread.
    A thread can be defined by overriding the run() method.

    A thread begins its life inside run() method.
    We create an object of our new class and call start() method to start the execution of a thread.
    Start() invokes the run() method on the Thread object.
 */

class ChildClass1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("process 1 " + i);
        }
    }
}

class ChildClass2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("process 2 " + i);
        }
    }
}

public class Ch_13_2_1_Extending_Thread_Class {
    public static void main(String[] args) {
        ChildClass1 c1 = new ChildClass1();
        ChildClass2 c2 = new ChildClass2();
        c1.start();
        c2.start();
    }
}
