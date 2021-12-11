package com.xefei.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk代理，被代理类的一定是一个接口
 */
public class JdkProxyApp {
    public static void main(String[] args) {
        UserService target = new UserService();
        UserServerInterface proxy = (UserServerInterface)Proxy.newProxyInstance(JdkProxyApp.class.getClassLoader(), new Class[]{UserServerInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before...");
                Object o = method.invoke(target,args);
                System.out.println("after...");
                return o;
            }
        });
        int a = proxy.a(2);
        //System.out.println(a);
        //proxy.test();
    }
}
