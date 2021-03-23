package com.example.props.pojo;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class MyProp1 {

    @Value("${myprop.age}")
    private String age;

    private String name;

    @Value("${myprop.name}")
    public void setName(String name) {
        System.out.println(this.getClass().getSimpleName() + ": " + name);
        this.name = name;
    }


}
