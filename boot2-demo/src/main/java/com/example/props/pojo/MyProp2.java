package com.example.props.pojo;

import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("myprop") // 要求必须设置setter
@ToString
public class MyProp2 {
    private String age;
    private String name;

    public void setAge(String age) {
        System.out.println(this.getClass().getSimpleName() + ": " + age);
        this.age = age;
    }

//    public void setName(String name) {
//        System.out.println(this.getClass().getSimpleName() + ": " + name);
//        this.name = name;
//    }
}
