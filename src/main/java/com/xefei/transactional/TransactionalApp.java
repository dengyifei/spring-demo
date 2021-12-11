package com.xefei.transactional;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@EnableTransactionManagement
public class TransactionalApp {
    public static void main(String[] args) {

        // 在方法是一下代码可以强制当前事务回滚。平时开发中可能会用到。
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();

    }
}
