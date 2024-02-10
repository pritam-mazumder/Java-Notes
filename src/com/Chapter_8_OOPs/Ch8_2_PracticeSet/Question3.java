package com.Chapter_8_OOPs.Ch8_2_PracticeSet;

// Que3: Create a class Square with a method to initialize its side, calculate area, perimeter, etc.

class square{
    static int side;
    static public void area(){
        System.out.println("Area: " + side*side);
    }
    static public void perimeter(){
        System.out.println("Perimeter: " + 4*side);
    }
}
public class Question3 {
    public static void main(String[] args) {

//        If the variables and methods are normal
//        Square sq = new Square();
//        sq.side = 3;
//        sq.area();
//        sq.perimeter();

//        If the variables and methods are static
        square.side=2;
        square.area();
        square.perimeter();

    }
}
