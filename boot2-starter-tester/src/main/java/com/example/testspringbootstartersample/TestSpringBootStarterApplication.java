package com.example.testspringbootstartersample;

import com.example.service.Test1Service;
import com.example.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class TestSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringBootStarterApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner1(
            @Autowired(required = false) Test1Service test1Service
    ) {
        return (args) -> {
            System.out.println(Arrays.toString(args));
            System.out.println(test1Service.getMessage());
        };
    }

    @Bean
    public CommandLineRunner commandLineRunner2(
            @Autowired(required = false) Test2Service test2Service
    ) {
        return (args) -> {
            System.out.println(Arrays.toString(args));
            System.out.println(test2Service.getNewMessage());
        };
    }
}
