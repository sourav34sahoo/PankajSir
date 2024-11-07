package com.collection;
import java.util.*;
public class ImmutableArrayList {
    public static void main(String...args){
        ImmutableArrayList ima = new ImmutableArrayList();
        List<Long> m = List.of(44665835l,67563465l);
        ima.addMoney(m);
    }
    public void addMoney(List<Long> x){
        for(long x1:x) System.out.println("RS.500 adder");
    }
}
/* O/P
RS.500 adder
RS.500 adder
 */
