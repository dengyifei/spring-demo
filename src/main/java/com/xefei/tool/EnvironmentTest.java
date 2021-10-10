package com.xefei.tool;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.Map;

@Configuration
@PropertySource("classpath:test.properties")
public class EnvironmentTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(EnvironmentTest.class);
        Map<String, Object> systemProperties = ac.getEnvironment().getSystemProperties();
        systemProperties.forEach((k,v)->{
            System.out.println(k+"="+v +";");
        });
        System.out.println("=============");
        Map<String, Object> systemEnvironment = ac.getEnvironment().getSystemEnvironment();
        systemEnvironment.forEach((k,v)->{
            System.out.println(k+"="+v +";");
        });
        System.out.println("=============");
        MutablePropertySources propertySources = ac.getEnvironment().getPropertySources();
        propertySources.iterator().forEachRemaining(s->{
            System.out.println(s);
        });
        System.out.println(ac.getEnvironment().getProperty("apple.color"));

    }




}
