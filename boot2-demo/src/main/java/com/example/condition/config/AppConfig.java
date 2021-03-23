package com.example.condition.config;

import com.example.condition.pojo.OpSys;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.condition")
public class AppConfig {

    @Conditional(MacCondition.class)
    @Bean(value = "macOS")
    public OpSys macOS() {
        return new OpSys("MacOS");
    }

    @Conditional(WindowsCondition.class)
    @Bean(value = "windows")
    public OpSys windows() {
        return new OpSys("Windows");
    }

}
