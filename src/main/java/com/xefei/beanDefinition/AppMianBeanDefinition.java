package com.xefei.beanDefinition;


import com.xefei.config.AppConfig;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class AppMianBeanDefinition {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        /**
         * beanDefinition 编程定义
         */
//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition.setBeanClass(T1Dao.class);
//        beanDefinition.setScope(AbstractBeanDefinition.SCOPE_SINGLETON);
//        beanDefinition.setInitMethodName("init"); // 只有再getbean是允许一次
//        beanDefinition.setLazyInit(true);
//        ac.registerBeanDefinition("t1dao",beanDefinition);
//        System.out.println(ac.getBean("t1dao"));

        /**
         * AnnotatedBeanDefinitionReader 注册成 AnnotatedGenericBeanDefinition
         * 可以直接把某个类转换为BeanDefinition，并且会解析该类上的注解
         * @Conditional，@Scope、@Lazy、@Primary、@DependsOn、 @Role、@Description
         */
//        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(ac);
//        annotatedBeanDefinitionReader.register(T2Dao.class);
//
//        System.out.println(ac.getBean("t2Dao"));
//        System.out.println(ac.getBeanDefinition("t2Dao"));


        /**
         * 读取配置文件转换为beandefiniotion
         */
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(ac);
//        xmlBeanDefinitionReader.loadBeanDefinitions("applicationContext.xml");
//
//        System.out.println(ac.getBean("u2"));
//        System.out.println(ac.getBeanDefinition("u2").getClass().getSimpleName());


        /**
         * ClassPathBeanDefinitionScanner是扫描器，但是它的作用和BeanDefinitionReader类似，它可以
         * 进行扫描，扫描某个包路径，对扫描到的类进行解析，比如，扫描到的类上如果存在@Component
         * 注解，那么就会把这个类解析为一个BeanDefinition，比如：
         */
//        ClassPathBeanDefinitionScanner classPathBeanDefinitionScanner = new ClassPathBeanDefinitionScanner(ac);
//        classPathBeanDefinitionScanner.scan("com.mapper");
//        System.out.println(ac.getBean("t1Dao"));
//        System.out.println(ac.getBeanDefinition("t1Dao").getClass().getSimpleName());


    }
}
