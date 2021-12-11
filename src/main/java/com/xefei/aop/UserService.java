package com.xefei.aop;

// public class UserService {
public class UserService implements UserServerInterface{

    @Override
    public int a(int a) {
        System.out.println("a");
        return a;
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}
