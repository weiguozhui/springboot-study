package com.example.demo.dao;

/**
 * 实体类
 */
public class Userinfo2 {

  private long id;
  private String userName;
  private String userPwd;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPwd() {
    return userPwd;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }

  @Override
  public String toString() {
    return "Userinfo2{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            ", userPwd='" + userPwd + '\'' +
            '}';
  }
}
