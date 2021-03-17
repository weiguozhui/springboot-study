package com.example.demo.proxy.jdkproxy;

/**
 * 接口实现类
 */
public class JDKClassImpl implements JDKClass{
    @Override
    public void proxyMethod() {
        System.out.println("say hello");
    }
}
