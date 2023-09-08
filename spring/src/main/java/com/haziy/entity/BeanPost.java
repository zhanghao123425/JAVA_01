package com.haziy.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * spring bean 的后置处理器
 */
public class BeanPost implements BeanPostProcessor {
    /**
     * 调用初始化方法之前执行
     * @param bean the new bean instance
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
   /* @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("spring bean 的后置处理器的postProcessBeforeInitialization方法：在bean 初始化方法之前执行");
        return bean;
    }

    *//**
     * 调用初始化方法之后执行
     * @param bean the new bean instance
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     *//*
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("spring bean 的后置处理器的postProcessBeforeInitialization方法：在bean 初始化方法之后执行");
        return bean;
    }*/
}
