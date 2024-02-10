package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS.Ch_11_7_Practice_set;

/*
    Que4: Create a class TelePhone with ring(), lift() and disconnect() methods as abstract methods.
    Create another class SmartTelephone and demonstrate polymorphism

    Create a  class TV which implements TVRemote interface from Que6
*/

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends TelePhone{
    void ring() {
        System.out.println("ring");
    }
    void lift() {
        System.out.println("lift");
    }
    void disconnect() {
        System.out.println("disconnect");
    }
}
public class Question4 {
    public static void main(String[] args) {
        TelePhone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
    }
}
