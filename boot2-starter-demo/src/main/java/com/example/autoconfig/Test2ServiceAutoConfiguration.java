package com.example.autoconfig;

import com.example.service.Test2Service;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
// 全名不行, 不带包名就可以
//@ConditionalOnMissingClass({"com.example.service.Test2Service"})
@ConditionalOnMissingBean(Test2Service.class)
public class Test2ServiceAutoConfiguration {

    @Bean
    public Test2Service test2Service() {
        return new Test2Service();
    }
}
