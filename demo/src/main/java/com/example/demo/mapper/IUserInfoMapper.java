package com.example.demo.mapper;


import com.example.demo.dao.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * UserInfo的映射接口，加上mybaties的注解，不然可能会报错
 */
@Mapper
public interface IUserInfoMapper {

    public List<UserInfo> selectUserInfoList();
}
