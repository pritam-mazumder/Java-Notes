package com.Chapter_10_INHERITANCE;

/*
        THIS:
        "THIS" is a reference variable that refers to the current object inside a method or a constructor.

        If both instance and reference variable are same then the program will confuse and
        will not able to differentiate between both the variables.
        Hence, it'll not set any value and gives "0".


        SUPER: (super means "PARENT" means concept of INHERITANCE)

        The super keyword refers to parent objects.
        It is used to call parent methods, and to access the parent constructor.
        The most common use of the super keyword is to eliminate the confusion between parentClass and childClass that have methods with the same name.



*/

class This {
    int i = 10;
}

class Super extends This {
    int i = 20;

    void asd(int i) {
        System.out.println(i);          // Default value = 0
        System.out.println(this.i);     // refers to variable of same class = 20
        System.out.println(super.i);    // refers to variable of parent class = 10
    }
}

public class Ch_10_3_This_and_Super {
    public static void main(String[] args) {
        This t = new This();
        System.out.println(t.i);

        Super s = new Super();
        s.asd(1);
    }
}