package com.example.demo.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类加载到spring boot的容器中
 */
@Component
@Getter
@Setter
public class ValueProperties {
    // 获取全局变量的配置文件中的值
    @Value("${valueProperties.name}")
    private String name;
    // 使用表达式赋值
    @Value("#{2*3}")
    private int age;
    // 直接赋值
    @Value("true")
    private boolean flag;

}
