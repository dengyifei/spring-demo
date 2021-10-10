package com.xefei.tool;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationListenerTest {

    @Bean
    public ApplicationListener applicationListener(){
        return new ApplicationListener() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.out.println("xxx");
                System.out.println(event.getSource());
                System.out.println(Thread.currentThread().getId());
            }
        };
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationListenerTest.class);
        ac.publishEvent("kkk");
    }
}
