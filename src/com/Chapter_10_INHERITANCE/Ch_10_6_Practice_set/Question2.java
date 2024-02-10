package com.Chapter_10_INHERITANCE.Ch_10_6_Practice_set;

    /* Create a class rectangle and use inheritance to create another class cuboid.
        Try to keep it as close to real world scenario as possible.
     */

class Rectangle{
    int l;
    int b;
    Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }
}
class Cuboid extends Rectangle{
    int h;
    Cuboid(int l, int b, int h){
        super(l, b);
        this.h=h;
    }
    void dim2(){
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Cuboid cu = new Cuboid(2,1,3);
        cu.dim2();
    }
}
