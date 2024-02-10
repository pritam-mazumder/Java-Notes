package com.Chapter_8_OOPs.Ch8_2_PracticeSet;

// Que1: Create a class Employee with the following properties and methods
/*
         salary (property) (int)
         getSalary (method returning int)
         name (property) (sting)
         getName (method retuning string)
         setName(method changing name)
 
 */
class Employee {
    int salary;

    public int getSalary() {
        return salary;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary = 1;
        e.setName("asd");
        System.out.println(e.salary);
        System.out.println(e.getName());
    }
}