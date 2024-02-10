package com.Chapter_8_OOPs.Ch8_2_PracticeSet;

// Que6: Create a class Circle with a method to its radius, calculate area, circumference, etc.

class Circle{
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float circumference(){
        return 2*3.14f*radius;
    }
}
public class Question6 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.radius = 4;
        System.out.println("Circumference of circle: " + cr.circumference());
        System.out.println("Area of circle: " + cr.area());
    }
}
