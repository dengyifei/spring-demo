package com.xefei.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ImportResource("classpath:applicationContext.xml")  // === ac.scan("com.xefei");
@ComponentScan("com.service")
public class AnnotationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationContext.class);
        Object u1Service = context.getBean("u1Service");
        System.out.println(u1Service);
    }
}
