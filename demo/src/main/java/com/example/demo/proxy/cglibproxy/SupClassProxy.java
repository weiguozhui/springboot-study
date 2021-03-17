package com.example.demo.proxy.cglibproxy;

/**
 * 代理类，继承需要被代理的类
 */
public class SupClassProxy extends SupClass{
    @Override
    public void proxyMethod() {
        System.out.println("before proxy");
        super.proxyMethod();
        System.out.println("after proxy");
    }
}
