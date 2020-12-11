package com.example.demo.mapper;

import com.example.demo.dao.Userinfo2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 映射接口
@Mapper
public interface IUserInfo2Mapper {

    // 注解方式实现mybaties整合
    @Select("select * from userinfo2")
    List<Userinfo2> getUserInfo2List();
}
