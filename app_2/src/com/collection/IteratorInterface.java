package com.collection;
import java.util.*;
public class IteratorInterface {
    public static void main(String...args){
        List<String> arr = new ArrayList<>();
        arr.add("Banana");
        arr.add("Apple");
        arr.add("Cherry");
        Iterator<String> val = arr.iterator();
        while (val.hasNext()){
            String x = val.next();
            System.out.println(x);
        }
    }
}

/* Banana
   Apple
   Cherry
*/