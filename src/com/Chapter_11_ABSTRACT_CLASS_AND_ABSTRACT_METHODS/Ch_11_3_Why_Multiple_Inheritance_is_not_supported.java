package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS;

/*
    Why multiple inheritance is not supported in Java?

    Java does not support multiple inheritances in classes because it can lead to diamond problem
    and as a result it'll provide some complex way to solve it,
    there are better ways through which we can achieve the same result as multiple inheritances.
*/

abstract class Breach{
    abstract void Fault_Line();
}
interface Brim{
    void smoke();
}
interface Sova{
    void recon();
}
class Agent extends Breach implements Brim, Sova {
    public void Fault_Line(){
        System.out.println("Stun the area");
    }
    public void smoke() {
        System.out.println("Smoke the area");
    }
    public void recon() {
        System.out.println("Reveal the area");
    }
}

class Ch_11_3_Why_Multiple_Inheritance_is_not_supported {
    public static void main(String[] args) {
        Agent a = new Agent();
        a.Fault_Line();
        a.smoke();
        a.recon();
    }
}