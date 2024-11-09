package com.collection;
import java.util.*;
public class LinkedListDemo1 {
    public static void main(String...args){
        List<String> l = new LinkedList<>();
        l.add("Apple");
        l.add("Banana");
        l.add("Cherry");
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeLast());
        System.out.println(l);
    }

}
