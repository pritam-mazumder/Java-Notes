/*
    METHOD OVERLOADING:
    Multiple methods with the same name but with different parameters.
    The compiler determines which method to invoke based on
    the number, type, and order of the parameters passed during the method call.
 */
package com.Chapter_7_METHODS_IN_JAVA.Ch7_2_Method_Overloading;

public class Ch7_2_1_Method_Overloading_1 {
    static void asd() {
        System.out.println("I'm global elite");
    }

    public static void main(String[] args) {
        asd();
    }
}


/*
VOID RETURN TYPE:
When we don't want our methods to return anything, we use void as the return type.

STATIC KEYWORD:
Static keyword is used to associate a method of a given class with the class rather then the object.
Static method in a class is shared by all the objects.

The static keyword in Java is mainly used for memory management.
The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes.
The static keyword belongs to the class than an instance of the class.
The static keyword is used for a constant variable or a method that is the same for every instance of a class.
 */