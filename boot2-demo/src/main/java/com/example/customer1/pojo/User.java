package com.example.customer1.pojo;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Component("user")
@ToString
public class User {

    public User() {
        System.out.println("User#constructor(void)");
    }

    @Value("1")
    private Long id;

    @Value("James Gosling")
    private String userName;

    @Value("Java Father")
    private String note;
}
