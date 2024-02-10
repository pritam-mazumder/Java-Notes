package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS.Ch_11_7_Practice_set;
/*
    Que3: Create a class Monkey with jump() and bite() methods,
    Create a class Human which inherits this Monkey class and
    implements BasicAnimal interface with eat() and sleep() method.
*/

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eat");
    }
    public void sleep(){
        System.out.println("Eat");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
    }
}
