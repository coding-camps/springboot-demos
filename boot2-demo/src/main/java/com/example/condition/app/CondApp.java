package com.example.condition.app;

import com.example.condition.config.AppConfig;
import com.example.condition.pojo.OpSys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Map;

@SpringBootApplication
@Import({AppConfig.class})
public class CondApp {
    /**
     * spring boot 默认扫描 @SpringBootApplication 注解类所在目录以及子目录。<br/>
     * 如果@SpringBootApplication注解的类所在目录不能覆盖扫描范围，需要导入，有两种方法：<br/>
     * 1. SpringApplication.run(AppConfig.class, args); <br/>
     * 2. @Import({AppConfig.class})
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(CondApp.class, args);

        String osName = ctx.getEnvironment().getProperty("os.name");
        System.out.println("当前操作系统：" + osName);

        Map<String, OpSys> beansOfType = ctx.getBeansOfType(OpSys.class);
        System.out.println(beansOfType);
    }
}
