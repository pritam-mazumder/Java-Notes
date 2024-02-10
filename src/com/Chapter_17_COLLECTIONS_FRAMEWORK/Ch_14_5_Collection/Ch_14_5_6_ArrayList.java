package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection;

/*
    ArrayList:

     - Resizable or growable array.
     - Implemented class of List interface.
     - Present in java.util package.

     Syntax:
        class ArrayList implements List{
            constructors
            methods
        }

        OR

        ArrayList<Integer> l = new ArrayList<>();


    Properties:
     - Index based data structures.
     - Heterogeneous/different data types.
     - It supports duplicate elements.
     - It can store any number of null values.
     - Follows the insertion order. (order of insertion and retrieval are same)
     - Support sorting order.
     - Non-synchronized.


    Constructor:

        1. ArrayList();
           - Empty list with an initial capacity of 10 and size of array list is 0. (0 because initially it is empty).

        2. ArrayList(int initialCapacity);
           - Constructs an empty list with the specified initial capacity.

        3. ArrayList(Collection<? extends E> c)
           - Constructs a list containing the elements of the specified collection,
             in the order they are returned by the collection's iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Ch_14_5_6_ArrayList {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();

        al1.add(0, 10);
        al1.add(1, "20");
        al1.add(2, 30.0);
        al1.add(3, 10);
        al1.add(4, null);
        al1.add(5, null);

        System.out.println(al1);

        ArrayList al2 = new ArrayList();

        al2.add(50);
        al2.add(60);
        al2.add(30.0);

        al1.removeAll(al2);     // it will remove all the common elements between al1 and al2
        System.out.println(al1);

        al2.addAll(al1);
        System.out.println(al2);

        al1.remove(3);
        System.out.println(al1);

        System.out.println(al1.contains("10"));
        System.out.println(al1.contains(10));

        System.out.println(al1.size());

        System.out.println(al1.get(0));

        al1.set(2, 40);
        System.out.println(al1);

        System.out.println(al1.indexOf(null));

        Iterator itr = al1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        al2.clear();
        System.out.println(al2);
    }
}


