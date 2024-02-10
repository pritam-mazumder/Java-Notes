package com.Chapter_13_MULTITHREADING.Ch_13_7_Practice_set;

/*
    Que1: Write a program to print "good morning" and "welcome" continuously on the screen in java using threads.
 */

class GM extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
        }
    }
}
class W extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome");
        }
    }
}

public class Question1 {
    public static void main(String[] args) {

        GM g = new GM();
        W w = new W();
        g.start();
        w.start();
    }
}
