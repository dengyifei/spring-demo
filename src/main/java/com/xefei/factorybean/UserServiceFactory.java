package com.xefei.factorybean;

import com.service.U1Service;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFactory implements FactoryBean<F1Service> {

    @Override
    public F1Service getObject() throws Exception {
        //return new U1Service();
        return new F1Service();
    }

    @Override
    public Class<?> getObjectType() {
        return Object.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
