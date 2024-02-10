package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS.Ch_9_5_Practice_set;

//Que 4: Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 5;
        this.breadth = 4;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());

        Rectangle r2 = new Rectangle(12,13);
        System.out.println("Length: " + r2.getLength());
        System.out.println("Breadth: " + r2.getBreadth());
    }
}
