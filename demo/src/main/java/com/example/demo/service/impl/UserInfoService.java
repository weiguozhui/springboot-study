package com.example.demo.service.impl;

import com.example.demo.dao.UserInfo;
import com.example.demo.mapper.IUserInfoMapper;
import com.example.demo.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务接口实现类
 */
@Service
public class UserInfoService implements IUserInfoService {

    /**
     * 用resource注解
     */
    @Resource
    IUserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectUserInfoList() {
        return userInfoMapper.selectUserInfoList();
    }
}
