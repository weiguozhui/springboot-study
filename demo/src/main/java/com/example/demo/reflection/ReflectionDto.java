package com.example.demo.reflection;

import com.example.demo.dao.UserInfo;
import com.example.demo.dao.Userinfo2;

/**
 * 反射实体类测试
 * 定义三个不同修饰符的变量
 * 定义无参构造方法
 *
 */
public class ReflectionDto {

    public UserInfo userInfo;

    private Userinfo2 userinfo2;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Userinfo2 getUserinfo2() {
        return userinfo2;
    }

    public void setUserinfo2(Userinfo2 userinfo2) {
        this.userinfo2 = userinfo2;
    }

    // 私有变量
    private String name;

    protected int age;

    // 公开变量
    public String idNumber;

    public ReflectionDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ReflectionDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "ReflectionDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }

    // 公有内部类
    public class innerClass{
        private String name;
    }

    // 私有内部类
    private class privateInnerClass{
        private String name;
    }
}
