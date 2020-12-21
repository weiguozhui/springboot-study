package com.example.demo.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

// 定义为自定义配置项映射类
//@ConfigurationProperties(prefix = "myproperties")
// 注入到容器中
@Component
// get和set方法
@Getter
@Setter
//@Validated
public class MyProperties {
    // 定义对应的属性
    @Value("aaa")
    private String aaa;
    @Value("${myproperties.bbb}")
    private String bbb;
    private String ccc;
    private String ddd;
    @Value("true")
    private boolean flag;
    @Value("#{2*3}")
    private int age;

//    @Email
    private String email;
}
