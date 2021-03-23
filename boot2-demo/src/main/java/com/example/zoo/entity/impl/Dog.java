package com.example.zoo.entity.impl;

import com.example.zoo.entity.Animal;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    public Dog() {
        System.out.println("Dog constructor");
    }

    @Override
    public String use() {
        String info = String.format("Dog (%s) is used to guard the door.", Dog.class.getSimpleName());
        System.out.println(info);
        return info;
    }
}
