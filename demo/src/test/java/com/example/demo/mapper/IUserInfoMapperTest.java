package com.example.demo.mapper;

import com.example.demo.DemoApplicationTests;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

/**
 * 直接继承测试启动类即可
 */
class IUserInfoMapperTest extends DemoApplicationTests {

    /**
     * 使用resource注解，不然可能无法注入
     */
    @Resource
    IUserInfoMapper iUserInfoMapper;

    @Test
    void selectUserInfoList() {
        System.out.println(iUserInfoMapper.selectUserInfoList());
    }
}