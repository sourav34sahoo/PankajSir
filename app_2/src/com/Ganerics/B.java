package com.Ganerics;

class A<t,u>
{
    public t name;
    public u id;
    A(t name,u id){
        this.name=name;
        this.id=id;
    }

    public t getName() {
        return name;
    }

    public u getId() {
        return id;
    }
}
public class B {
    public static void main(String...args){
        A<String,Integer> a = new A<>("sourav",2002);
        System.out.println(a.getName());      // sourav
        System.out.println(a.getId());        // 2002
    }
}
