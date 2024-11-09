package com.collection;
import  java.util.*;
public class HashMaplDemo1 {
    public static void main(String...args){
        Map<String,Integer> m = new HashMap<>();
        m.put("7894031952",4653);
        m.put("7978547386",3547);
        m.put("6370564255",4573);
        System.out.println(m);    // {7894031952=4653, 7978547386=3547, 6370564255=4573}

        System.out.println(m.remove("6370564255"));   // 4573


    }
}
