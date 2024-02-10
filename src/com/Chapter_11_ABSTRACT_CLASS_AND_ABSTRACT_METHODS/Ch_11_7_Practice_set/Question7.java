package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS.Ch_11_7_Practice_set;

// Que7: Create a  class TV which implements TVRemote interface from Que6

interface TVRemote2{
    void on();
    void off();
}
interface SmartTVRemote2 extends TVRemote2{
    void volup();
    void voldown();
}
class TV implements SmartTVRemote2 {
    public void on() {
        System.out.println("on");
    }
    public void off() {
        System.out.println("off");
    }
    public void volup() {
        System.out.println("volup");
    }
    public void voldown() {
        System.out.println("voldown");
    }
}
public class Question7 {
    public static void main(String[] args) {
        TVRemote2 t = new TV();
        t.on();
        t.off();

        SmartTVRemote2 s = new TV();
        s.volup();
        s.voldown();
    }
}
