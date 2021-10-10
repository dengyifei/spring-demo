package com.xefei.classload;

public class A {

    static {
        System.out.println("classload A");
    }

    public A(){
        System.out.println("new A");
        System.out.println(getClass().getClassLoader());
    }
}
