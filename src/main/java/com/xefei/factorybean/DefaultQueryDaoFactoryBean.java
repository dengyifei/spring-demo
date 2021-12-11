package com.xefei.factorybean;

public class DefaultQueryDaoFactoryBean implements QueryDaoFactoryBean{
    @Override
    public QueryDao getObject() throws Exception {
        System.out.println("11111");
        return new QueryDao1Iml();
    }

    @Override
    public Class<?> getObjectType() {
        return QueryDao1Iml.class;
    }
}
