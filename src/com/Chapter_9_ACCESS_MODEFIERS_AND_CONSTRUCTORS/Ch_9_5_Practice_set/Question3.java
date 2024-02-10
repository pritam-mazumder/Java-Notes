package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS.Ch_9_5_Practice_set;

//Que 3: Create a class cylinder and use contractor to set its radius and height

class Cylinder3{
    private int radius;
    private int height;

    public Cylinder3(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Cylinder3 c = new Cylinder3(12,9);
        System.out.println("Height: " + c.getHeight());
        System.out.println("Radius: " + c.getRadius());
    }
}
