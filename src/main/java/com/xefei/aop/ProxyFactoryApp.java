package com.xefei.aop;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.Interceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.*;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * 1. Before Advice：方法之前执行
 * 2. After returning advice：方法return后执行
 * 3. After throwing advice：方法抛异常后执行
 * 4. After (finally) advice：方法执行完finally之后执行，这是最后的，比return更后
 * 5. Around advice：这是功能最强大的Advice，可以自定义执行顺序
 */
public class ProxyFactoryApp {
    public static void main(String[] args) {
        OrderService target = new OrderService();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(target);
        /**
         * 一种是田间advice
         */
//        proxyFactory.addAdvice(new MethodBeforeAdvice() {
//            @Override
//            public void before(Method method, Object[] args, Object target) throws Throwable {
//                System.out.println("before....1");
//            }
//        });
//        proxyFactory.addAdvice(new AfterReturningAdvice() {
//            @Override
//            public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
//                System.out.println("返回值:"+returnValue);
//                System.out.println("AfterReturnin....1");
//            }
//        });
//        proxyFactory.addAdvice(new MethodInterceptor() {
//
//            @Override
//            public Object invoke(MethodInvocation invocation) throws Throwable {
//                System.out.println("around....1");
//                Object proceed = invocation.proceed();
//                System.out.println("around....2");
//                return proceed;
//            }
//        });
        proxyFactory.addAdvisor(new PointcutAdvisor(){

            @Override
            public Advice getAdvice() {
                return new MethodBeforeAdvice() {
                    @Override
                    public void before(Method method, Object[] args, Object target) throws Throwable {
                        System.out.println("before....1");
                    }
                };
            }

            @Override
            public boolean isPerInstance() {
                return false;
            }

            @Override
            public Pointcut getPointcut() {
                return new StaticMethodMatcherPointcut(){
                    @Override
                    public boolean matches(Method method, Class<?> targetClass) {
                        return true;
                    }
                };
            }
        });

        OrderService proxy = (OrderService)proxyFactory.getProxy();
        proxy.buy();
    }
}
