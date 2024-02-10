package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS;

/*
    CONSTRUCTOR:

    It is a special method which is used to initialize an object

    It is a block (similar to method) having the same name as that of class name.
    It does not have any return type, not even void.
    Access modifiers: public, protected, default & private
    It executes automatically when we create an object

    Types of constructor:

        1. Default constructor (System defined)
           -->  Default constructor is created by COMPILER on its own.
                It will create ONLY if we don't create any constructor

            class Test{
                Test(no-arguments){
                    #constructor is being created on its owm
                    #but it will not provide arguments on its own
                }
                p s v m(s[] a){
                    Test t = new Test();
                }
            }


        2. No-arguments constructor (User defined)
           -->  No-arguments constructor is created by the user.

           class Test{
                Test(no-arguments){
                    #constructor is created by the user
                    #with no arguments
                }
                p s v m(s[] a){
                    Test t = new Test();
                }
            }

        3. Parameterised constructor (User defined)
           -->  Parameterised constructor is created by the user and providing the parameters too.

           class Test{
                Test(String name){
                    #constructor is being created by the user
                    #with arguments
                }
                p s v m(s[] a){
                    Test t = new Test("string_variable_value");
                }
            }

 */

class DefaultC {        // Default constructor
    int i;
    String s;
}

class NoArgsC {         // No-arguments constructor
    public NoArgsC() {
        System.out.println("No-arguments constructor");
    }
}

class ParameterisedC {  // Parameterised constructor
    int i;

    public ParameterisedC(int i) {
//        this.i = i;
        System.out.println("Parameterised constructor" + i);
    }
}

// Method 1: normal variable and parameterized constructor
class MyEmp2 {
    int id;
    String name;

    public MyEmp2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


// Method 2: private variable
class MyEmp3 {
    private int id2;
    private String name2;

    public MyEmp3() {
        id2 = 3;
        name2 = "Brim";
    }

    public int getId2() {
        return id2;
    }

    public String getName2() {
        return name2;
    }
}

// Method 3: private variable with getter and setter
class MyEmp4 {
    private int idx;
    private String namex;

    public MyEmp4(int idz, String namez) {
        idx = idz;
        namex = namez;
    }

    public int getIdx() {
        return idx;
    }

    public String getNamex() {
        return namex;
    }

}

public class Ch_9_3_Constructors {
    public static void main(String[] args) {

        // Default constructor
        DefaultC dc = new DefaultC();
        System.out.println(dc.i);
        System.out.println(dc.s);

        // No-arguments constructor
        NoArgsC na = new NoArgsC();

        // Parameterised constructor
        ParameterisedC pc = new ParameterisedC(1);
        System.out.println(pc.i);


        //Method 1
        MyEmp2 sova = new MyEmp2(1, "Sova");
        System.out.println(sova.id);
        System.out.println(sova.name);
        MyEmp2 jett = new MyEmp2(2, "Jett");
        System.out.println(jett.id);
        System.out.println(jett.name);

        //Method 2
        MyEmp3 brim = new MyEmp3();
        System.out.println(brim.getId2());
        System.out.println(brim.getName2());


        MyEmp4 ad = new MyEmp4(1, "wasd");
        System.out.println(ad.getIdx());
        System.out.println(ad.getNamex());

    }
}

/*

    Setter ---> Set/Update the value [mutator]  ===>   TAKE VALUE
    Getter ---> Returns the value [accessor]    ===>   DISPLAY

 */