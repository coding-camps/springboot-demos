package com.example.zoo;

import com.example.zoo.config.AppConfig;
import com.example.zoo.entity.Person;
import com.example.zoo.entity.impl.BusinessPerson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = ctx.getBean(BusinessPerson.class);
        person.service();
    }
}
