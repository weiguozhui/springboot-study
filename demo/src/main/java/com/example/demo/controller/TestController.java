package com.example.demo.controller;

import com.example.demo.dao.LomBokDao;
import com.example.demo.dao.User;
import com.example.demo.dao.UserInfo;
import com.example.demo.properties.MyProperties;
import com.example.demo.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

// 因为springboot的web项目是基于rest规范的，所以使用restController注解
@RestController
// 依旧可以用requestMapping作为父路径
@RequestMapping("/test")
public class TestController {

    @Resource(name = "userBean")
    User user;

    @Autowired
    LomBokDao lomBokDao;

    @Autowired
    MyProperties properties;

    @Autowired
    IUserInfoService userInfoService;

    // 查询数据接口遵循rest规范，使用getMapping注解
    @GetMapping("/hello")
    public String testHello(){
        System.out.println("hello");
        return "test hello";
    }

    // springboot整合的mvc接口可以直接返回实体类，到前端会直接解析为json对象
    @GetMapping("/getUser")
    public User getUser(){
        return user;
    }

    @GetMapping("/getlombok")
    public LomBokDao getLomBokDao(){
        return lomBokDao;
    }

    @GetMapping("/getProperties")
    public MyProperties getProperties(){
        return properties;
    }

    @GetMapping("/getUserInfoList")
    public List<UserInfo> getUserInfoList(){
        return userInfoService.selectUserInfoList() ;
    }

}
