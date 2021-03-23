package com.example.zoo.entity.impl;

import com.example.zoo.entity.Animal;
import com.example.zoo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person {


    // 通过属性装配
//    @Autowired
//    private Animal dog = null;
    @Autowired
    @Qualifier("dog")
    private Animal animal = null;


    // 2.通过setter方法装配
    @Override
//    @Autowired
//    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        String info = String.format("BusinessPerson#setAnimal() -> animal is (%s)", animal.getClass().getSimpleName());
        System.out.println(info);
        this.animal = animal;
    }



//    public BusinessPerson() {
//        System.out.println("BusinessPerson#Constructor(void)");
//    }

    // 3.通过构造器装配
//    public BusinessPerson(/*@Autowired @Qualifier("dog")*/ Animal animal) {
//        String info = String.format("BusinessPerson#Constructor: Animal is %s", animal.getClass().getSimpleName());
//        System.out.println(info);
//        this.animal = animal;
//    }


    @Override
    public String service() {
        return this.animal.use();
    }

}
