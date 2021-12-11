package com.xefei.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.xefei.beanpostprocessor","com.service"})
public class AppBeanPostProcessTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppBeanPostProcessTest.class);
        Object u1Service = applicationContext.getBean("u1Service");
        System.out.println(u1Service);
    }
}
