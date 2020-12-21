package com.example.demo.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

// 定义为自定义配置项映射类
@ConfigurationProperties(prefix = "myproperties")
// 注入到容器中
@Component
// get和set方法
@Getter
@Setter
// jsr303数据校验注解，表明该类要校验
@Validated
public class MyProperties {

    private String aaa;
    private String bbb;
    private String ccc;
    private String ddd;
    private boolean flag;
    private int age;

//    @Email 未定义自定义注解所以方开会报错
    private String email;
}
