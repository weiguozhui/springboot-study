package com.example.demo.proxy.cglibproxy;

/**
 *
 * 需要代理的类
 */
public class SupClass {
    /**
     * 需要增强的方法
     */
    public void proxyMethod(){
        System.out.println("say hello");
    }
}
