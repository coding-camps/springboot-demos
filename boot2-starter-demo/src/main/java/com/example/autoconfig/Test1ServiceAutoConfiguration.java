package com.example.autoconfig;

import com.example.service.Test1Service;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnProperty(
        prefix = "starter.test",
        name = "enabled",
        havingValue = "true"
)
public class Test1ServiceAutoConfiguration {

    @Bean
    public Test1Service test1Service() {
        return new Test1Service();
    }
}
