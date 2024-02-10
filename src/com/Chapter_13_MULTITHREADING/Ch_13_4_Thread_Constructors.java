package com.Chapter_13_MULTITHREADING;

/*

    Commonly used Constructors of Thread class:

    1. Simple constructors:
        - Thread()
        - Thread(Runnable target)
        - Thread(String name)
        - Thread(Runnable target,String name)

    2. Thread Groups constructors:
        - Thread(ThreadGroup tg, Runnable target)
        - Thread(ThreadGroup tg, String name)
        - Thread(ThreadGroup tg, Runnable target, String name)
        - Thread(ThreadGroup tg, Runnable target, String name, long stack size)

 */

// Thread()
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread()");
    }
}

// Thread(Runnable target)
class MyThread2 implements Runnable {
    public void run() {
        System.out.println("Thread(Runnable target)");
    }
}

// Thread(String name)
class MyThread3 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    MyThread3(String name) {
        super(name);
    }
}

// Thread(Runnable target,String name)
class MyThread4 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


public class Ch_13_4_Thread_Constructors {
    public static void main(String[] args) {

        // Thread()
        MyThread mt1 = new MyThread();
        mt1.start();

        // Thread(Runnable target)
        MyThread2 mt2 = new MyThread2();
        Thread t = new Thread(mt2);
        t.start();

        // Thread(String name)
        // MyThread3 mt3 = new MyThread3();     (default name)
        // mt3.start(); --> "Thread-2"

        MyThread3 mt3 = new MyThread3("Thread(String name)");   // (with custom name)
        mt3.start();

        // Thread(Runnable target,String name)
        MyThread4 mt4 = new MyThread4();
        Thread t2 = new Thread(mt4, "Thread(Runnable target,String name)");
        t2.start();
    }
}
