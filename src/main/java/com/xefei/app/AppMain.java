package com.xefei.app;

import com.xefei.annotation.Dao1Annotation;
import com.xefei.config.AppConfig;
import com.xefei.scan.CustomScan;
import com.xefei.service.U1Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.type.filter.AnnotationTypeFilter;

public class AppMain {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        /**
         * regist主要是把配置类【appconfig】解析成bd，bd是 AnnotatedGenericBeanDefinition
         */
        ac.register(AppConfig.class);

        ac.scan("com.xefei"); // == @ImportResource("classpath:applicationContext.xml")
        ac.refresh();

//        System.out.println(ac.getBeanFactory().getBeanDefinition("u1Service"));
//        System.out.println(ac.getBeanFactory().getBeanDefinition("u1Service").getClass().getSimpleName());
        System.out.println(ac.getBean(U1Service.class));


        /**
         * >>>>>>>>>>>>>>>>>
         * 扫描自定义注解
         */
//        CustomScan scan = new CustomScan(ac);
//        scan.addIncludeFilter(new AnnotationTypeFilter(Dao1Annotation.class));
//        //scan.addIncludeFilter((a,b)->true);
//        int i = scan.scan("com.mapper");
//        System.out.println(i);
        // <<<<<<<<<<<<<<<<<<<

    }
}
