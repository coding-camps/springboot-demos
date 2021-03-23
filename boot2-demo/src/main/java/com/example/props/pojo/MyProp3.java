package com.example.props.pojo;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"myprop.properties"})
@ToString
public class MyProp3 {
    @Value("${myprop.age}")
    private String age;

    @Value("${myprop.name}")
    private String name;

}
