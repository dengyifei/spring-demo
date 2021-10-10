package com.xefei.beanfactory;

import com.xefei.service.U2Service;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

public class AppMainBeanFactory {
    public static void main(String[] args) {
        /**
         * 首先，在Java中，接口是可以多继承的，我们发现ApplicationContext继承了ListableBeanFactory
         * 和HierarchicalBeanFactory，而ListableBeanFactory和HierarchicalBeanFactory都继承至
         * BeanFactory，所以我们可以认为ApplicationContext继承了BeanFactory，相当于苹果继承水果，
         * 宝马继承汽车一样，ApplicationContext也是BeanFactory的一种，拥有BeanFactory支持的所有功
         * 能，不过ApplicationContext比BeanFactory更加强大，ApplicationContext还基础了其他接口，也
         * 就表示ApplicationContext还拥有其他功能，比如MessageSource表示国际化，
         * ApplicationEventPublisher表示事件发布，EnvironmentCapable表示获取环境变量，等等，关于
         * ApplicationContext后面再详细讨论。
         * 在Spring的源码实现中，当我们new一个ApplicationContext时，其底层会new一个BeanFactory出
         * 来，当使用ApplicationContext的某些方法时，比如getBean()，底层调用的是BeanFactory的
         * getBean()方法。
         */

        // defaultListableBeanFactory 可以单独使用
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(defaultListableBeanFactory);
        annotatedBeanDefinitionReader.register(U2Service.class);
        System.out.println(defaultListableBeanFactory.getBean("u2Service"));
        System.out.println(defaultListableBeanFactory.getBeanDefinition("u2Service"));


    }
}
