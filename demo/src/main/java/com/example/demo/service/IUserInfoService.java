package com.example.demo.service;

import com.example.demo.dao.UserInfo;

import java.util.List;

public interface IUserInfoService {

    public List<UserInfo> selectUserInfoList();
}
