package com.Chapter_13_MULTITHREADING.Ch_13_2_Thread_Creation;

/*
    Implementing Runnable Interface

    Runnable interface is part of the Java Concurrency API,
    and it is used to define a task that can be executed concurrently by a thread.
    It represents a single unit of work that can be executed independently.

    It contains a single method called run(), which has no arguments and does not return a value.
 */

class ChildClass3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("walking");
        }
    }
}

class ChildClass4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("stop");
        }
    }
}

public class Ch_13_2_2_Implementing_Runnable_Interface {
    public static void main(String[] args) {
        ChildClass3 walking = new ChildClass3();
        Thread t1 = new Thread(walking);
        ChildClass4 stop = new ChildClass4();
        Thread t2 = new Thread(stop);

        t1.start();
        t2.start();
    }
}


/**/
