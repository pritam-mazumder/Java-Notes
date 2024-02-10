package com.Chapter_10_INHERITANCE.Ch_10_6_Practice_set;

    // Create a class circle and use inheritance to crate another cylinder from it.

class Circle{
    int r;
    Circle(int r){
        this.r=r;
    }
}
class Cylinder extends Circle{
    int h;
    Cylinder(int h, int r){
        super(r);
        this.h=h;
    }
    void dim(){
        System.out.println(r);
        System.out.println(h);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(1,2);
        cy.dim();
    }
}