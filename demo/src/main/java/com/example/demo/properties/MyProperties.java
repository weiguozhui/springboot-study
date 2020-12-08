package com.example.demo.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
// 定义为自定义配置项映射类
@ConfigurationProperties(prefix = "myproperties")
// 注入到容器中
@Component
// get和set方法
@Getter
@Setter
public class MyProperties {
    // 定义对应的属性
    private String aaa;
    private String bbb;
    private String ccc;
    private String ddd;
}
