package com.example.customer1.config;


//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan.Filter;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.FilterType;
//import org.springframework.stereotype.Service;

import com.example.customer1.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@Configuration
// 茴香豆的茴字有多种写法
//@ComponentScan(value = "com.example.customer1", lazyInit = true)
//@ComponentScan(basePackages = {"com.example.customer1"})
//@ComponentScan(basePackages = "com.example.customer1")
//@ComponentScan("com.example.customer1.*")
//@ComponentScan(basePackages = {"com.example.customer1.*"})
//@ComponentScan(basePackages = "com.example.customer1.*")
//@ComponentScan("com.example.customer1.pojo")
//@ComponentScan(basePackages = {"com.example.customer1.pojo"})
//@ComponentScan(basePackages = "com.example.customer1.pojo")
//@ComponentScan(basePackageClasses = {com.example.customer1.pojo.BeanA.class})
//@ComponentScan(basePackageClasses = com.example.customer1.pojo.BeanA.class)
@ComponentScan(
//        basePackages = {"com.example.customer1.*"}
        basePackages = {"com.example.customer1"}
//        , excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class})}
//        , excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {UserService.class})}
)
public class AppConfig {
}
