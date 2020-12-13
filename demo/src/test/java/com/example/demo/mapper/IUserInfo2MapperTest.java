package com.example.demo.mapper;

import com.example.demo.DemoApplicationTests;
import com.example.demo.dao.Userinfo2;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IUserInfo2MapperTest extends DemoApplicationTests {

    @Resource
    IUserInfo2Mapper userInfo2Mapper;

    @Test
    void getUserInfo2List() {
        System.out.println(userInfo2Mapper.getUserInfo2List());
    }

    @Test
    void getUserInfo2ByPage(){
        // 定义分页信息
        PageHelper.startPage(1,1);
        // 调用sql
        List<Userinfo2> userinfo2s= userInfo2Mapper.getUserInfo2List();
        // 将结果集放置到pageInfo对象中
        PageInfo<Userinfo2> pageInfo =  new PageInfo<>(userinfo2s);
        // 遍历结果
        for (Userinfo2 userInfo: pageInfo.getList()
             ) {
            System.out.println(userinfo2s);

        }

    }
}