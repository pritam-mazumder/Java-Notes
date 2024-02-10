package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection;

/*
    HashSet:

     - It is implemented class of set interface
     - It is present in java.util package
     - It's underlying data structure is HashTable
        * HashSet is backed up by "Map"
     - Introduced in JDK 1.2 version

     Syntax:

        import java.util;

        class HashSet implements Set
        (if we go deeply, it also inherits Cloneable, Serializable, etc)
        {
            constructors
            methods
        }


    Properties:

     - HashSet are not indexed based data-structure. They store the elements according to their "hashcode".
     - It can store heterogeneous/different data structure.
     - It does not support duplicate elements.
     - It does not support multiple null values.
     - It does not follow insertion order.
     - It does not follow sorting order.
     - Vector are non-synchronized data-structure.

    Constructor:

        1. HashSet()
           - Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor (0.75).

        2. HashSet(Collection<? extends E> c)
           - Constructs a new set containing the elements in the specified collection.

        3. HashSet(int initialCapacity)
           - Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and default load factor (0.75).

        4. HashSet(int initialCapacity, float loadFactor)
           - Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and the specified load factor.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Ch_14_5_9_HashSet {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(0, 10);
        al.add(1, "20");
        al.add(2, 30.0);
        al.add(3, 10);
        al.add(4, null);
        al.add(5, null);

        HashSet hs = new HashSet(al);
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add(4.0);
        hs.add(5);
        hs.add(true);
        hs.add(null);

        System.out.println(hs);

        Iterator itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(hs.contains("1"));
        System.out.println(hs.contains(2));

        System.out.println(hs.containsAll(hs));

        hs.remove(null);
        System.out.println(hs);

        System.out.println(hs.size());
    }
}