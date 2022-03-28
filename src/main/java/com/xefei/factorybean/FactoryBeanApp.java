package com.xefei.factorybean;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.Introspector;

@Configuration
@ComponentScan("com.xefei.factorybean")
public class FactoryBeanApp {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanApp.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(DefaultQueryDaoFactoryBean.class);
        beanDefinition.setScope(AbstractBeanDefinition.SCOPE_SINGLETON);
        beanDefinition.setPrimary(true);
        context.registerBeanDefinition(Introspector.decapitalize(DefaultQueryDaoFactoryBean.class.getSimpleName()),beanDefinition);
        context.register(FactoryBeanApp.class);
        context.refresh();

        QueryDaoFactoryBean bean = context.getBean(QueryDaoFactoryBean.class);
        QueryDao queryDao = (QueryDao)context.getBean(Introspector.decapitalize(bean.getClass().getSimpleName()));
        System.out.println(queryDao);
        queryDao = (QueryDao)context.getBean(Introspector.decapitalize(bean.getClass().getSimpleName()));
        System.out.println(queryDao);
        queryDao = (QueryDao)context.getBean(Introspector.decapitalize(bean.getClass().getSimpleName()));
        System.out.println(queryDao);

        System.out.println(context.getBeanDefinition("userServiceFactory"));
        System.out.println(context.getBean(F1Service.class));
//        try {
//            System.out.println(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

/*        //>>>>>>>>>>>>>测试factoryMenthodName
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(F1Service.class);
        genericBeanDefinition.setFactoryMethodName("ss");
        context.registerBeanDefinition("f1Service",genericBeanDefinition);
        Object f1Service = context.getBean("f1Service");
        System.out.println(f1Service);
        //<<<<<<<<<<<<<测试factoryMenthodName

        //>>>>>>>>>>>>>测试factoryBean
        Object userService = context.getBean("userServiceFactory");
        Object userService1 = context.getBean("userServiceFactory");
        Object userService2 = context.getBean("&userServiceFactory"); // 获取factoryBean对象
        System.out.println(userService);
        System.out.println(userService1);
        System.out.println(userService2);
        //<<<<<<<<<<<测试factoryBean*/

    }
}
