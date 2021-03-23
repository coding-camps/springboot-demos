package com.example.lifecycle.pojo;


import com.example.utils.Utils;
import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Lazy
@ToString
public class BeanA implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private Long id;
    private String userName;
    private String note;

    public BeanA() {
        System.out.println("BeanA#constructor()");
    }

    @Override
    public void setBeanName(String s) {
        Utils.printMethodInfo();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Utils.printMethodInfo();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Utils.printMethodInfo();
    }

    @PostConstruct
    public void myPostConstructor() {
        Utils.printMethodInfo();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Utils.printMethodInfo();
    }

    @PreDestroy
    public void myPreDestroy() {
        Utils.printMethodInfo();
    }

    @Override
    public void destroy() throws Exception {
        Utils.printMethodInfo();
    }
}
