package com.example.customer0;

import com.example.customer0.config.AppConfig;
import com.example.customer0.pojo.User;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

public class CusomerApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        User user1 = null;
        try {
            System.out.println("> try");
            // 不提倡使用的方法
            user1 = ctx.getBean(User.class);
        } catch (NoUniqueBeanDefinitionException e) {
            System.out.println("> catch");
            user1 = ctx.getBean("user", User.class);
        }
        System.out.println(user1);

        User user2 = ctx.getBean("user", User.class);
        System.out.println(user2);

        User user3 = (User) ctx.getBean("ms");
        System.out.println(user3);

        System.out.println(Objects.equals(user1, user2));
        System.out.println(Objects.equals(user1, user3));
        System.out.println(Objects.equals(user2, user3));

    }
}
