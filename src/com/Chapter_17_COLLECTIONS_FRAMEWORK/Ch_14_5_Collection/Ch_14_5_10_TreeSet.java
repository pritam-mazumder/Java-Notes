package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection;

/*
    TreeSet:

     - TreeSet is directly implements class of NavigableSet but indirectly implements SortedSet and Set interface.
     - It is present in java.util package
     - Introduced in JDK 1.2 version
     - It's underlying data structure is "Balanced Tree"

     Syntax:

        import java.util;

        class TreeSet implements Set
        (if we go deeply, it also inherits Cloneable, Serializable)
        {
            constructors
            methods
        }


    Properties:

     - TreeSet are not indexed based data-structure.
     - It can store homogeneous/same data structure.
     - It does not follow insertion order. (throws Exception error if elements are different  )
     - It follow sorting order.
     - Vector are non-synchronized data-structure.
     - Before JDK 1.6: "null" can not be used at the first position
       After JDK 1.6: "null" can be used at the first position


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

import java.util.TreeSet;


public class Ch_14_5_10_TreeSet {
    public static void main(String[] args) {

        TreeSet ts1 = new TreeSet();
        ts1.add(1);
        ts1.add(5);
        ts1.add(4);
        ts1.add(3);
        ts1.add(2);

        TreeSet ts2 = new TreeSet();
        ts2.add("d");
        ts2.add("c");
        ts2.add("e");
        ts2.add("a");
        ts2.add("b");

        System.out.println(ts1);
        System.out.println(ts2);



        ts2.remove("e");
        System.out.println(ts2);

        ts2.clear();
        System.out.println(ts2);
    }
}