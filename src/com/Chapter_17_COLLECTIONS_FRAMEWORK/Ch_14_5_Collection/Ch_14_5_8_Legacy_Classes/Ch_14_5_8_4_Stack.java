package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection.Ch_14_5_8_Legacy_Classes;

/*
    Stack:

     - Introduced in JDK 1.0 version.
     - It sis the child class of vector class of vector class which is present in java.util package.

     Syntax:

        import java.util;

        class Stack extends Vector
        {
            constructors
            methods
        }

    Properties:

     - Stack class was designed on the based on LIFO (Last in first out)
     - It can be implemented on the basis of Arrays, Arraylists, Linkedlists or Vectors.
     - It is indexed based data-structure.
     - It can store heterogeneous/different data structure.

    Constructor:
     - Stack()

    Methods:

     - push(item/object)
     - pop()
     - peek()   (retrieve or fetch element present at the top without removing it from the stack)
     - search(item/object)
     - empty()



    Stack push() vs add()

    System.out.println(stack.push("1"));
    Output : 1

    System.out.println(stack.add("2"));
    Output : true
 */

import java.util.Stack;

public class Ch_14_5_8_4_Stack {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.add(0,0);
        s.push(1);
        s.push(2);
        s.push("3");
        s.push(4.0);
        s.push(true);
        s.push(null);
        s.push(null);

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s.search(4.0));
        System.out.println(s.search(3.0));

        System.out.println(s.empty());
    }
}