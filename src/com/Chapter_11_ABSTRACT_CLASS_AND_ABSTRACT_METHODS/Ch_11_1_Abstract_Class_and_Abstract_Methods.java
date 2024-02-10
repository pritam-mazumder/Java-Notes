package com.Chapter_11_ABSTRACT_CLASS_AND_ABSTRACT_METHODS;
/*
    ABSTRACTION: - Hiding implementation/Data hiding

    Data abstraction is the process of hiding certain details and showing only essential information to the user.
    Abstraction can be achieved with either abstract classes/method or interfaces.

    ABSTRACT CLASSES AND METHODS

    Abstract class:     It is a restricted class that cannot be used to create objects
                        (to access it, it must be inherited from another class).
    Abstract method:    It can only be used in an abstract class, and it does not have a body.
                        The body is provided by the subclass (inherited from).


    Abstract classes and Abstract methods :

     - Declared with an "abstract" keyword.
     - An abstract class may or may not have all abstract methods.
     - Overriding is compulsory.
     - An abstract class can have parameterized and default constructor is always present in an abstract class.
     - We cannot make object of abstract class.
     - Class containing abstract method is definitely an abstract class
     - But Abstract class not necessarily contains abstract method
     - If child class inheriting any abstract parent class, then the class must have to implement all the abstract methods of abstract parent class.


*/

abstract class Shape{
    abstract void vertices();
}
class Triangle extends Shape{
    @Override
    void vertices() {
        System.out.println("3 vertices");
    }
}
class Square extends Shape{
    @Override
    void vertices() {
        System.out.println("4 vertices");
    }
}

public class Ch_11_1_Abstract_Class_and_Abstract_Methods {
    public static void main(String[] args) {
//        Shape s = new Shape(); ---> Not valid in abstraction
        Triangle t = new Triangle();
        t.vertices();
        Square s = new Square();
        s.vertices();

        Shape v = new Triangle();  //Dynamic Method Dispatch
        v.vertices();
    }
}
