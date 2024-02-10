package com.Chapter_13_MULTITHREADING.Ch_13_7_Practice_set;

/*
    Que2: Add a sleep method in welcome thread of question 1 to delay its execution for 200 ms
 */

class GM2 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
        }
    }
}
class W2 extends Thread {
    public void run(){
        for (int i=0; i<10; i++){
            try{
                Thread.sleep(200);
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class Question2 {
    public static void main(String[] args) {
        GM2 g = new GM2();
        W2 w = new W2();
        g.start();
        w.start();
    }
}
