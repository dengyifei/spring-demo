package com.xefei.di;

import com.service.U1Service;
import com.service.U2Service;
import com.xefei.app.AppConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.TypedStringValue;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Configuration
//@ImportResource("classpath:applicationContext.xml")
@ComponentScan("com.service")
public class AppDI {
    public static void main(String[] args) {
        /**
         * xml 的依赖注入，主要使用的方法:
         * 1. 定义 autoWriteMode，自动注入模式L: ByName ByType NO constructor
         * 2. 定义 property。
         * 3. 定义 constructor。
         */
//        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("applicationContext.xml");
//        System.out.println(ac.getBean("u2Service"));

        /**
         *  注解模式,主要使用的注解
         * @AutoWrite
         * @Resoutce
         */
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppDI.class);
        ac.refresh();
        System.out.println(ac.getBean("u2Service"));





    }
}
