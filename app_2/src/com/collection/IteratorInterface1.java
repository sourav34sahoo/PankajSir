package com.collection;
import java.util.*;
public class IteratorInterface1 {
    public static void main(String...args){
        List<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Cherry");
        for(String x : arr) System.out.println(x);
    }
}
/* Apple
   Banana
   Cherry
 */