package com.example.demo.mapper;

import com.example.demo.DemoApplicationTests;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class IUserInfo2MapperTest extends DemoApplicationTests {

    @Resource
    IUserInfo2Mapper userInfo2Mapper;

    @Test
    void getUserInfo2List() {
        System.out.println(userInfo2Mapper.getUserInfo2List());
    }
}