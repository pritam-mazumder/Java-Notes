package com.Chapter_13_MULTITHREADING.Ch_13_7_Practice_set;

/*
    Que3: Demonstrate getPriority() and setPriority() methods in java thread
 */

class TestClass1 extends Thread{
    public void run() {
        System.out.println("Test class 1");
    }
}
class TestClass2 extends Thread{
    public void run(){
        System.out.println("Test class 2");
    }
}
public class Question3 {
    public static void main(String[] args) {
        TestClass1 t1 = new TestClass1();
        TestClass2 t2 = new TestClass2();
        t1.setPriority(2);
        t2.setPriority(5);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
