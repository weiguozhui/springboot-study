package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// 因为springboot的web项目是基于rest规范的，所以使用restController注解
@RestController
// 依旧可以用requestMapping作为父路径
@RequestMapping("/test")
public class TestController {

    // 查询数据接口遵循rest规范，使用getMapping注解
    @GetMapping("/hello")
    public String testHello(){
        System.out.println("hello");
        return "test hello";
    }

}
