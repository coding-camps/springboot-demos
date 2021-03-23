package com.example.customer1.service;

import com.example.customer1.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void printUser(User user) {
        System.out.println("Print message from " + UserService.class.getSimpleName() + ":");
        System.out.println(user.toString());
    }

}
