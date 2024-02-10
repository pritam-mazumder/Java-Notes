package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_6_Map;

/*
    HashMap:

     - It is an implemented class of NavigableMap, but it also inherits the properties of SortedMap and Map interface.
     - It was introduced in JDK 1.2 version.
     - It's underlying data structure is "Red-Black Tree"

    Syntax:

        import java.util;

        class TreeMap implements NavigableMap
        (It also implements Cloneable, Serializable interface)
        {
            constructors
            methods
        }


    Properties:

     - TreeMap stores the data in key-value pairs
        e.g., key   |   value
            [ 101   |   "sova"  ] <- Each key-value pair is known as "Entry"
              102   |   "Jett"
              103   |   "raze"
     - Keys should be unique but values can be duplicated.
     - It does not follow insertion order.
     - It follow sorting order with respect to keys.
     - It can store both type of elements:
        homogeneous/same        (if we are default sorting nature and not using any "comparator" for soring)
        heterogeneous/different (if we want to provide any custom sorting nature by using "comparator")
     - It does not support "NULL" values.
     - It is non-synchronized data structures


    Constructor:

        1. HashMap()
           - Empty HashMap with the default initial capacity (16) and the default load factor (0.75).

        2. HashMap(int initialCapacity)
           - Empty HashMap with the specified initial capacity and the default load factor (0.75).

        3. HashMap(int initialCapacity, float loadFactor)
           - Empty HashMap with the specified initial capacity and load factor.

        4. HashMap(Map<? extends K,? extends V> m)
           - Constructs a new HashMap with the same mappings as the specified Map.






    Red-Black Tree
     - Every node is either red ot black color.
     - The root node is always black.
     - Every leaf node (NULL node) is black.
     - If a node is red, then both its children are black.
     - For each node, all paths from the node to its descendant leaf nodes contain the same number og black nodes.
 */


import java.util.TreeMap;

public class Ch_14_6_3_TreeMap {
    public static void main(String[] args) {

        TreeMap map1 = new TreeMap();
        map1.put(105, "five");
        map1.put(101, "one");
        map1.put(104, "four");
        map1.put(103, "three");
        map1.put(102, "two");
        map1.put(100, "zero");

//        System.out.println(map1);   // sorting according to numbers

        // ceilingEntry(K Key):
        // It is used to return a key-value mapping associated with the least key greater than or equal to the given key, or null if there is no such key.
        System.out.println(map1.ceilingEntry(90));
        System.out.println(map1.ceilingEntry(101));
        System.out.println(map1.ceilingEntry(102));
        System.out.println(map1.ceilingEntry(103));
        System.out.println(map1.ceilingEntry(104));
        System.out.println(map1.ceilingEntry(105));
        System.out.println(map1.ceilingEntry(106));

        // ceilingKey(K key):
        // This has also the same work as that of the upper one but the only difference is that it does not contain the mapped-keys.
        // It simply returns the least key greater or equal to the given key, else returns NULL.
        System.out.println(map1.ceilingKey(90));
        System.out.println(map1.ceilingKey(101));
        System.out.println(map1.ceilingKey(102));
        System.out.println(map1.ceilingKey(103));
        System.out.println(map1.ceilingKey(104));
        System.out.println(map1.ceilingKey(105));
        System.out.println(map1.ceilingKey(106));

        System.out.println(map1.containsKey(101));
        System.out.println(map1.containsKey(90));

        System.out.println(map1.containsValue("one"));
        System.out.println(map1.containsValue("six"));

        System.out.println(map1.entrySet());

        System.out.println(map1.firstEntry());

        System.out.println(map1.firstKey());

        // floorEntry():
        // It returns a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key.
        System.out.println(map1.floorEntry(100));
        System.out.println(map1.floorEntry(101));
        System.out.println(map1.floorEntry(102));
        System.out.println(map1.floorEntry(103));
        System.out.println(map1.floorEntry(104));
        System.out.println(map1.floorEntry(105));
        System.out.println(map1.floorEntry(106));

        // floorKey():
        // It returns the greatest key less than or equal to the given key, or null if there is no such key.
        System.out.println(map1.floorKey(100));
        System.out.println(map1.floorKey(101));
        System.out.println(map1.floorKey(102));
        System.out.println(map1.floorKey(103));
        System.out.println(map1.floorKey(104));
        System.out.println(map1.floorKey(105));
        System.out.println(map1.floorKey(106));


        System.out.println(map1.get(100));
        System.out.println(map1.get(90));

        System.out.println(map1.isEmpty());

        System.out.println(map1.keySet());

        System.out.println(map1.lastEntry());

        // pollFirstEntry():
        // Removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty.
        System.out.println(map1.pollFirstEntry());
        System.out.println(map1);

        // pollLastEntry():
        // Removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.
        System.out.println(map1.pollLastEntry());
        System.out.println(map1);

        map1.remove(106);
        System.out.println(map1);

        map1.replace(105, "105");
        System.out.println(map1);

        System.out.println(map1.size());

        System.out.println(map1.subMap(101, 104));

        map1.clear();
        System.out.println(map1);

        /*
        TreeMap map2 = new TreeMap();
        map2.put("five", 105);
        map2.put("one", 101);
        map2.put("four", 104);
        map2.put("three", 103);
        map2.put("two", 102);
        map2.put("zero", 100);

        System.out.println(map2);   // sorting according to alphabets
        */




        /*
        TreeMap map2 = new TreeMap();
        map2.put(105, null);
        map2.put(101, 1);
        map2.put(104, true);
        map2.put(103, 3.0);
        map2.put(102, "2");
        map2.put(null, null);

        System.out.println(map2);

        This will give error because heterogeneous elements are being used and no "comparators" is given.
         */

    }
}
