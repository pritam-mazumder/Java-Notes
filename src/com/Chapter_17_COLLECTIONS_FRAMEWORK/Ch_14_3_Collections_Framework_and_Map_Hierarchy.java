package com.Chapter_17_COLLECTIONS_FRAMEWORK;

/*
COLLECTION FRAMEWORK:
    (What is Collection Framework, Collection and Collections?)

    COLLECTION       +      FRAMEWORK:              =   COLLECTION FRAMEWORK
    (it is a single         (represents the library)    (predefined API which contains classes and interfaces)
    entity which can
    store multiple
    data)

    Collection Framework (API):
     - It is an API which contains predefined classes and interfaces.

    Collection (interface):
     - It is the root interface (present in java.util package) of all the collection objects.

    Collections (Utility class):
      - It is the utility class which contains only static methods.


    Collection Framework contains two main parts:
        1. java.util.Collection (can store data directly)
        2. java.util.Map        (can store data in key-value pairs)


    Java Collection framework provides many
        1. interfaces:
             - Set (for distinct collection)
             - List
             - Queue
             - Deque
        2. classes:
             - ArrayList (for variable size collection)
             - Vector
             - LinkedList
             - PriorityQueue
             - HashSet (for storing key-valur pairs)
             - LinkedHashSet
             - TreeSet


    HIERARCHY:

    1. Collection (interface)

        - List (interface)
            - ArrayList (class)
            - LinkedList (class)
            - Vector (legacy class)
                - Stack (legacy class)

        - Set (interface)
            - HashSet (class)
                - LinkedHashSet (class)
            - SortedSet (interface)
                - NavigableSet (interface)
                    - TreeSet (class)

        - Queue (interface)
            - PriorityQueue (class)
            - DeQue (interface)
                - ArrayDeque (class)


    2. Map (interface)

        - HashMap (class)
            - ListHashMap (class)

        - IdentityHashMap (class)

        - WeakHashMap (class)

        - SortedMap (interface)
            - NavigableMap (interface)
                - TreeMap (class)

        - HashTable (class)
            - Properties (class)

        - Dictionary (class)

    Collection Objects:
    When we create an object (using 'new' keyword) of classes of collection. (stores values directly)

    Map Objects:
    When we create an object (using 'new' keyword) of classes of map. (stores values in key-value pairs)

    We can not create objects of interface (list, set, queue, hashmap, hashtable, etc). but we can create references objects if implemented class.
    e.g.,
        List l1 = new ArrayList();
        List l2 = new LinkedList();

        HashMap hm = new HashMap();
 */


public class Ch_14_3_Collections_Framework_and_Map_Hierarchy {
}
