package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS.Ch_11_7_Practice_set;

// Que2: Use the pen class from Que1 to create a concrete class fountain pen with additional methods changeNib()

abstract class Pen2{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen2{
    void write() {
        System.out.println("write");
    }
    void refill() {
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changeNib");
    }
}

public class Question2 {
    public static void main(String[] args) {
        FountainPen f = new FountainPen();
        f.write();
        f.refill();
        f.changeNib();
    }
}
