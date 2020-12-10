package com.example.demo.dao;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * UserInfo实体类
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserInfo {

  private long id;
  private String userName;
  private String userPwd;
}
