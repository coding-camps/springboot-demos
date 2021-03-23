package com.example.condition.config;

import com.example.utils.Utils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MacCondition implements Condition {

    /**
     * ConditionContext context: spring容器上下文环境
     * AnnotatedTypeMetadata metadata ：@Conditional修饰类型信息
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // context.getEnvironment() 获取系统环境的属性
        return Utils.isMatchOsName(context.getEnvironment(), "Mac");
    }
}
