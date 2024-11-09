package com.collection;
import java.util.*;
public class LinkedListDemo2 {
    public static void main(String...args){
        List<String> l = new LinkedList<>();
        l.add("Apple");
        l.add("banana");
        l.add("cherry");
        System.out.println(l);        // [Apple, banana, cherry]
        l.add(1,"xyz");
        System.out.println(l);        // [Apple, xyz, banana, cherry]
        System.out.println(l.set(2,"abc"));  
        System.out.println(l);         // [Apple, xyz, abc, cherry]
        System.out.println(l.remove(1));  // xyz

    }
}
