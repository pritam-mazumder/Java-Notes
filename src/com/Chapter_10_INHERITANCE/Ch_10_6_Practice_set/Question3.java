package com.Chapter_10_INHERITANCE.Ch_10_6_Practice_set;

    // Create methods for area and volume in Que 1

class Circle2{
    int r;
    Circle2(int r){
        this.r=r;
    }
    void area(){
        System.out.println(2*Math.PI*(r*r));
    }
}
class Cylinder2 extends Circle2{
    int h;
    Cylinder2(int h, int r){
        super(r);
        this.h=h;
    }
    void volume(){
        System.out.println(Math.PI*(r*r)*h);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Circle2 c2 = new Circle2(1);
        c2.area();
        Cylinder2 cy2 = new Cylinder2(1,1);
        cy2.volume();
    }
}
