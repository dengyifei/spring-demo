package com.xefei.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class T2BeanFactoryPostProcessor implements P1BeanFactoryPostProcessor{
    @Override
    public void add() {
        System.out.println("T2BeanFactoryPostProcessor-add");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("T2BeanFactoryPostProcessor");
    }
}
