package com.Chapter_8_OOPs.Ch8_2_PracticeSet;

// Que4: Create a class Rectangle with a method to its length and breadth, calculate area, perimeter, etc.

class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 4;
        rect.breadth = 2;
        System.out.println("Area of rectangle: " + rect.area());
        System.out.println("Perimeter of rectangle: " + rect.perimeter());
    }
}
