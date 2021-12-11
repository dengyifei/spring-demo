package com.xefei.app;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class CustomScan extends ClassPathBeanDefinitionScanner {

    public CustomScan(BeanDefinitionRegistry registry) {
        super(registry);
    }


}
