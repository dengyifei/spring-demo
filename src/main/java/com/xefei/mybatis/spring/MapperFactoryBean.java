package com.xefei.mybatis.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * 模拟mybatis与spring的整合，所谓的整合就是将mybatis的对象放入到spring容器中。
 * 整合步骤：
 * 1. 定义factoryBean 用户生成对象
 * 2. 定义 ImportBeanDefinitionRegistrar 设置要被代理的接口类 beanDefiniton信息
 * 3. 定义 sqlSessionFactory。
 *
 */


public class MapperFactoryBean implements FactoryBean {

    private Class<?> interfaces;

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return interfaces;
    }
}
