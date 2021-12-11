package com.xefei.di;

import com.service.U1Service;
import com.service.U2Service;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * 可以自己对bean进行初始化
 */
public class Test1InstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(StringUtils.equalsIgnoreCase("u1Service",beanName)){
            System.out.println(String.format("beanName:%s",beanName));
            U1Service u1Service= (U1Service)bean;
            u1Service.setU2Service(new U2Service());
        }
        return false;// 不会后续进行自定属性进行赋值操作
    }
}
