package com.Chapter_10_INHERITANCE.Ch_10_6_Practice_set;

    // Create method for area and volume in Que 2. Also create getters and setters.

class Rectangle2{
    int l;
    int b;
    public void setL(int l) {
        this.l = l;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int area(){
        return l*b;
    }
}
class Cuboid2 extends Rectangle2{
    int h;
    public void setH(int h) {
        this.h = h;
    }
    public int volume(){
        return super.area()*h;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2();
        r.setB(1);
        r.setL(2);
        System.out.println(r.area());

        Cuboid2 c = new Cuboid2();
        c.setB(1);
        c.setL(2);
        c.setH(3);
        System.out.println(c.volume());
    }
}
