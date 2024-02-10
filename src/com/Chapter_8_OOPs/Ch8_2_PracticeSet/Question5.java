package com.Chapter_8_OOPs.Ch8_2_PracticeSet;

// Que5: Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting...), running, firing, etc.

class TommyVecetti{
    void hit(){
        System.out.println("Hitting the enemy");
    }
    void run(){
        System.out.println("Running from the ememy");
    }
    void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class Question5 {
    public static void main(String[] args) {
        TommyVecetti player1 = new TommyVecetti();
        player1.hit();
        player1.run();
        player1.fire();
    }
}
