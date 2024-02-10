
package com.Chapter_8_OOPs;

class Agent {
    int id;
    String name;
    String warcry;
    int salary;

    public void printDetails() {
        System.out.println("Agent id is: " + id);
        System.out.println("Agent name is: " + name);
        System.out.println("Agent warcry is: " + warcry);
    }

    public int getSalary() {
        return salary;
    }
}

public class Ch8_1_Custom_Class {
    public static void main(String[] args) {
        // Instantiating a new Employee object
        Agent sova = new Agent();
        Agent jett = new Agent();

        // Setting PROPERTIES or ATTRIBUTES
        sova.id = 1;
        sova.name = "Sova";
        sova.warcry = "I'm the Hunter";
        sova.salary = 12345;

        jett.id = 2;
        jett.name = "Jett";
        jett.warcry = "Watch this";
        jett.salary = 12346;


        // Printing the attributes or properties
        // Method 1:
        System.out.println("Agent id is: " + sova.id);
        System.out.println("Agent name is: " + sova.name);
        System.out.println("Agent warcry is: " + sova.warcry);
        System.out.println("Agent salary is: " + sova.salary + "\n");


        // OR


        // Printing by calling the method (Simple and efficient)
        // Method 2:
        sova.printDetails();
        System.out.println(sova.getSalary());

        jett.printDetails();
        System.out.println(jett.getSalary());


    }
}
/*
Any real world object = PROPERTIES + BEHAVIOUR
                        (camera)     (take photo)
       Object in OOPs = ATTRIBUTES + METHOD or FUNCTION
                                     (both are used interchangeably)
 */

/*
class Employee{
    public int id;
    public String name;
    int salary;

    public int getSalary(){
        return salary;
    }

    public void getDatails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}

public class Ch8_1_Custom_Class {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 1;
        e.name = "asd";
        e.salary = 12;

        e.getDatails();
    }
}
*/