package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS;

interface Rifels{
    void phantom();
    void vandal();
}
interface Sidearms{
    String[] pistol();
}
class Melee{
    public void tactical_Knife(int i) {
        System.out.println("Tactical Knife");
    }
}
class Valorant extends Melee implements Sidearms, Rifels{
    public void vandal() {
        System.out.println("one tap");
    }
    public void phantom() {
        System.out.println("ez spray");
    }
    public String[] pistol() {
        String[] pistols = {"Classic","Shorty","Frenzy","Ghost","Sheriff"};
        return pistols;
    }
}
public class Ch_11_4_InterfaceExample {
    public static void main(String[] args) {
        Valorant v = new Valorant();
        String[] ar = v.pistol();
        for (String s : ar) {
            System.out.println(s);
        }
        v.phantom();
        v.vandal();
        v.tactical_Knife(0);
    }
}

