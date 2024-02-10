package com.Chapter_13_MULTITHREADING.Ch_13_7_Practice_set;

/*
    Que5: How do you get reference to the current thread in java?
 */

class TestClass4 extends Thread {
    @Override
    public void run() {
        test();
    }
    public void test(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        System.out.println(t.getClass());
        System.out.println(t.getPriority());
    }
}
public class Question5 {
    public static void main(String[] args) {

        // For "main" method thread
        System.out.println(Thread.currentThread());             // Thread[main,5,main]
        System.out.println(Thread.currentThread().getName());   // main
        System.out.println(Thread.currentThread().getId());     // 1
        System.out.println(Thread.currentThread().getState());  //RUNNABLE
        System.out.println(Thread.currentThread().isAlive());   //true
        System.out.println(Thread.currentThread().getClass());  //class java.lang.Thread
        System.out.println(Thread.currentThread().getPriority());//5
        System.out.println();

        TestClass4 t = new TestClass4();
        t.start();
    }
}
