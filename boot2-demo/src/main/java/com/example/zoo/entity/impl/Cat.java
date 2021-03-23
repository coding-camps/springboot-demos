package com.example.zoo.entity.impl;

import com.example.zoo.entity.Animal;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Cat implements Animal {

    public Cat() {
        System.out.println("Cat constructor");
    }

    @Override
    public String use() {
        String info = String.format("Cat (%s) is used to catch the mouse.", Cat.class.getSimpleName());
        System.out.println(info);
        return info;
    }
}
