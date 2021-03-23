package com.example.lifecycle.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.example.lifecycle", lazyInit = false)
public class AppConfig {
}
