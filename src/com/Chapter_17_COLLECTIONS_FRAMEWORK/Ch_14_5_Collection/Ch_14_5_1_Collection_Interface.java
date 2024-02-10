package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection;

/*
    COLLECTION INTERFACE:

     - The Collection interface is a member of the Java Collections Framework.
     - It is a part of java.util package.
     - It is one of the root interfaces of the Collection Hierarchy.
     - The Collection interface is not directly implemented by any class.
     - However, it is implemented indirectly via its subtypes or sub-interfaces like List, Queue, and Set.


     Methods of Collection:

      - add()            - inserts the specified element to the collection
      - addAll()         - adds all the elements of a specified collection to the collection
      - contains()       - returns true if the collection contains the specified element
      - clear()          - removes all the elements of the collection
      - remove()         - removes the specified element from the collection
      - removeAll()      - removes all the elements of the specified collection from the collection
      - isEmpty()        - returns true if the collection is empty
      - size()           - returns the size of the collection
      - iterator()       - returns an iterator to access elements of the collection
 */

import java.util.ArrayList;

public class Ch_14_5_1_Collection_Interface {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        al2.add("d");
        System.out.println(al2);

        al.addAll(al2);
        System.out.println(al);

        System.out.println(al.contains(60));
        System.out.println(al.contains("a"));

        System.out.println(al.isEmpty());

        System.out.println(al.size());
        System.out.println(al2.size());

        al.remove(6);
        System.out.println(al);

        ArrayList al3 = new ArrayList();
        al3.add("c");
        al3.add("d");
        al3.add("e");

        al.removeAll(al3);
        System.out.println(al);
        System.out.println(al3);

        al3.clear();
        System.out.println(al3);
    }
}
