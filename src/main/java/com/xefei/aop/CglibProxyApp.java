package com.xefei.aop;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyApp {

    public static void main(String[] args) {
        OrderService target = new OrderService();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OrderService.class);
        enhancer.setCallbacks(new Callback[]{new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before...");
                Object result = methodProxy.invoke(target, objects);
                System.out.println("after...");
                return result;
            }
        }});
        OrderService proxy = (OrderService) enhancer.create();
        proxy.test();

    }
}
