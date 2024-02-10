package com.Chapter_8_OOPs.Ch8_2_PracticeSet;

// Que2: Create a class cellphone with methods to print "ringing...", "vibrating...", etc.

class Cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Calling...");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Cellphone asus = new Cellphone();
        asus.call();
        asus.ring();
        asus.vibrate();
    }
}
