package com.xefei.beanpostprocessor;

import com.service.U1Service;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 在创建对象前可以通过 实例化前接口进行返回自定义的对象。
 */
@Component
public class Test1BeanInstantiationPostProcess implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanClass.equals(U1Service.class)){
//            System.out.println(beanClass);
//            System.out.println(beanName);
            return new Object();
        }
        return null;
    }
}
