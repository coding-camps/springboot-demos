package com.example.customer1;

import com.example.customer1.config.AppConfig;
import com.example.customer1.pojo.User;
import com.example.customer1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        User user = ctx.getBean(User.class);
        System.out.println(user);

        /**
         * 要使用 {@link UserService}，<br/>
         * 就得打开{@link AppConfig }的扫描注解
         */
//        UserService userService = ctx.getBean(UserService.class);
//        userService.printUser(user);

    }
}
