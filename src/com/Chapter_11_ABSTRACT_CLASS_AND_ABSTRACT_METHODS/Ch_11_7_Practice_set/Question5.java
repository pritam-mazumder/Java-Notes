package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS.Ch_11_7_Practice_set;

//  Que5: Demonstrate polymorphism using monkey class from que3

interface BasicAnimal2{
    void eat();
    void sleep();
}

class Monkey2{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}
class Human2 extends Monkey2 implements BasicAnimal2{
    public void eat(){
        System.out.println("Eat");
    }
    public void sleep(){
        System.out.println("Eat");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Monkey2 m = new Human2();
        m.jump();
//        m.eat();  --> not allowed

        BasicAnimal2 b = new Human2();
        b.eat();
        b.sleep();
    }
}
