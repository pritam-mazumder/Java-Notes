package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection;

/*
    LinkedList:

     - Implemented class of List interface.
     - Present in java.util package.
     - The underline data structure of LinkedList is "doubly linked list" or "circular linked list".

     Syntax:
        class LinkedList implements List, Deque{
            constructors
            methods
        }


    Properties:
    - Index based data structures.
    - Heterogeneous/different data types.
    - It supports duplicate elements.
    - It supports multiple null elements.
    - Follows the insertion order.
    - Supports sorting order.
    - Non-synchronized.


    Advantages:
     - Insertion and deletion are fast or efficient.
     - We can traverse the lise in forward and reverse directions both. (DoubleLinkedList)

    Disadvantages:
     - It occupies extra space for previous node address.
     - In case of insertion or deletion of elements in between we have to manage previous and next node.


    LinkedList Constructors:

        1. LinkedList()
           - Constructs an empty list.

        2. LinkedList(Collection<? extends E> c)
           - Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
*/


import java.util.ArrayList;
import java.util.LinkedList;
/*
interface Collection{
    boolean add(Object obj);
    boolean addAll(Collection c);

    boolean remove(Object obj);
    boolean removeAll(Collection c);

    void clear();

    boolean contains(Object obj);
    boolean containsAll(Collection c);

    boolean isEmpty();

    Iterator iterator();
    --------etc

}
interface List extends Collection{
    // contains collection interface methods

    void add(int index, Object obj);
    void addAll(int index, Collection c);

    Object get(int index);

    Object remove(int index);

    Object set(int index, Object newobj);

    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    --------etc
}
class LinkedList implements List, Deque {
    // contains collection, list and deque methods

    void addFirst(Object obj);
    void addLast(Object obj);

    Object getFirst();
    Object getLast();

    Object removeFirst();
    Object removeLast();
}
*/

public class Ch_14_5_6_LinkedList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add("20");
        al.add(30.0);

        LinkedList ll = new LinkedList(al);

        ll.add(true);
        ll.add("1");
        ll.add("2");
        ll.add(3);
        ll.add(4.0);
        ll.add(null);
        ll.add(null);

        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(i + " " + ll.get(i));
        }


    }
}
