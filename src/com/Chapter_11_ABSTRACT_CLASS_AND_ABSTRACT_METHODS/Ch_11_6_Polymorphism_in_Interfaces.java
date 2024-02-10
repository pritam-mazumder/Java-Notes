package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS;
/*
    POLYMORPHISM

    A concept by which we can perform a single action in different ways..
    In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.

    Types of polymorphism:

    1. Compile-time Polymorphism
        - handled by compiler
        - Static Polymorphism
        ---> achieved by METHOD OVERLOADING

    2. Runtime Polymorphism
        - handled by JVM
        - Dynamic Polymorphism
        ---> achieved by METHOD OVERRIDING
 */
interface Camera{
    void takepicture();
    void recodeVideo();
    default void recode4KVideo(){
        System.out.println("4K Recording");
    }
}
interface Wifi{
    void connectToNetwork(String network);
}
class Cellphone{
    public void callNumber(int phoneNo){
        System.out.println("Calling...");
    }
    public void pickCall(){
        System.out.println("Connection...");
    }
}
class SmartPhone2 extends Cellphone implements Wifi, Camera{
    public void takepicture() {
        System.out.println("Take picture");
    }
    public void recodeVideo() {
        System.out.println("Record video");
    }
    public void recode4KVideo() {
        Camera.super.recode4KVideo();
    }
    public void connectToNetwork(String network) {
        System.out.println("Connect To Network");
    }
}
public class Ch_11_6_Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        Camera c = new SmartPhone2();   //--> using smartphone as a camera and ONLY accessing the camera function
        c.takepicture();                //--> camera method
        c.recodeVideo();                //--> camera method
        c.recode4KVideo();              //--> camera method
//      c.connectToNetwork();             --> can not use methods of Wi-Fi

        Wifi w = new SmartPhone2();
        w.connectToNetwork("a");

        Cellphone cp = new SmartPhone2();
        cp.callNumber(123);
        cp.pickCall();
    }
}
