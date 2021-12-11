package com.xefei.aop;

public class OrderService {
    public int a(int a) {
        System.out.println("a");
        return a;
    }

    public void test() {
        System.out.println("test");
    }

    public String buy() {
        System.out.println("buy");
        return "buy";
    }
}
