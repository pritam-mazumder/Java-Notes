package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS.Ch_9_5_Practice_set;

//Que 2: Create a class cylinder and use getter and setter to set its radius, height, volume and surface area.

class Cylinder2{
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

    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double surfaceArea(){
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Cylinder2 c = new Cylinder2();
        c.setHeight(12);
        int h = c.getHeight();
        System.out.println("Height: " + c.getHeight());
        c.setRadius(9);
        int r = c.getRadius();
        System.out.println("Radius: " + c.getRadius());
        System.out.println(c.volume());
        System.out.println(c.surfaceArea());
    }
}
