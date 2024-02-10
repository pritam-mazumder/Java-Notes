package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS.Ch_9_5_Practice_set;

//Que 5: Create a class sphere and use getter and setter to set its radius and height

class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double svolume(){
        return Math.PI*radius*radius*radius*4/3;
    }
    public double ssurfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.setRadius(5);
        System.out.println("Radius of sphere: " + s.getRadius());
        System.out.println("Volume of sphere: " + s.svolume());
        System.out.println("Surface area of sphere: " + s.ssurfaceArea());
    }
}
