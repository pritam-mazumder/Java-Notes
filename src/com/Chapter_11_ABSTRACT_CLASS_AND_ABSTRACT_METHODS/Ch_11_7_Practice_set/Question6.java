package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS.Ch_11_7_Practice_set;

// Que6: Create an interface TVRemote and use it to inherit another interface SmartTVRemote.

interface TVRemote{
    void on();
    void off();
}
interface SmartTVRemote extends TVRemote{
    void volup();
    void voldown();
}
public class Question6 {
    public static void main(String[] args) {

    }
}
