package com.example.customer0.config;

import com.example.customer0.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "user")
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setUserName("James Gosling");
        user.setNote("Java Father");
        return user;
    }

    @Bean(name = "ms")
    public User newUser() {
        User user = new User();
        user.setId(2L);
        user.setUserName("Bill Gates");
        user.setNote("Microsoft Father");
        return user;
    }
}
