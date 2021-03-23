package com.example.props;

import com.example.props.config.AppConfig;
import com.example.props.pojo.MyProp1;
import com.example.props.pojo.MyProp2;
import com.example.props.pojo.MyProp3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropApp1 {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MyProp1 myprop1 = ctx.getBean(MyProp1.class);
        System.out.println(myprop1);
        MyProp2 myProp2 = ctx.getBean(MyProp2.class);
        System.out.println(myProp2);
        MyProp3 myProp3 = ctx.getBean(MyProp3.class);
        System.out.println(myProp3);
    }

}
