package com.example.lifecycle;

import com.example.lifecycle.config.AppConfig;
import com.example.lifecycle.pojo.BeanA;
import com.example.lifecycle.pojo.BeanB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("---");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("===");
        BeanA beanA = ctx.getBean(BeanA.class);
        System.out.println(beanA);
        BeanB beanB = ctx.getBean(BeanB.class);
        System.out.println(beanB);
        System.out.println("***");
        // 关闭IOC容器
        ctx.close();
    }
}
