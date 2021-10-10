package com.xefei.circleAutowrite;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 循环依赖测试
 */
@Configuration
@ComponentScan
public class CircleAutowriteApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CircleAutowriteApp.class);
        System.out.println(ac.getBean("AService"));
        System.out.println(ac.getBean("BService"));
    }
}
