package com.xefei.processors;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * 通过 继承 可以 拓展 PostProcessor，比如add 方法
 */
public interface P1BeanFactoryPostProcessor extends BeanFactoryPostProcessor {

    public void add();
}
