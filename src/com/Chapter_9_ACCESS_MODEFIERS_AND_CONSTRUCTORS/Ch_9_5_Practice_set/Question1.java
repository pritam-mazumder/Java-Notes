package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS.Ch_9_5_Practice_set;

//Que 1: Create a class cylinder and use getter and setter to set its radius and height

class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setHeight(12);
        int h = c.getHeight();
        System.out.println("Height" + c.getHeight());
        c.setRadius(5);
        int r = c.getRadius();
        System.out.println("Radius" + c.getRadius());
    }
}
