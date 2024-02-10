package com.Chapter_13_MULTITHREADING.Ch_13_7_Practice_set;

/*
    Que4: How do you get state of a given thread in java?
 */

class TestClass3 extends Thread {
    @Override
    public void run() {
        super.run();
    }
//
//    public void test(){
//        Thread t = new Thread();
//    }
}

public class Question4 {
    public static void main(String[] args) {
        TestClass3 t = new TestClass3();
        System.out.println(t.getState());   // thread before starting --> NEW
        t.start();
        System.out.println(t.getState());   // thread after starting  --> RUNNABLE

        System.out.println(t.getName());    // Thread-0
        System.out.println(t.getId());      // 15
        System.out.println(t.isAlive());    // true
    }
}
