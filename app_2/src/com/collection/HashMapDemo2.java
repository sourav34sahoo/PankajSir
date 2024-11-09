package com.collection;
import java.util.*;
public class HashMapDemo2 {
    public static void main(String...args){
        Map<String,String> m = new HashMap<>();
        m.put("India","New Delhi");
        System.out.println("India".hashCode());   // 70793495
        System.out.println(70793495 %16);  // 7

    }
}
