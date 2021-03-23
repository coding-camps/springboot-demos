package com.example.props.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "com.example.props", lazyInit = true)
@PropertySource(value = {"classpath:myprop.properties"}, ignoreResourceNotFound = true)
public class AppConfig {
}
