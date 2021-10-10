package com.xefei.classload;

public class B {

    static {
        System.out.println("classload B");
    }

    public B(){
        System.out.println("new B");
    }

    public static void S1(){

    }
}
