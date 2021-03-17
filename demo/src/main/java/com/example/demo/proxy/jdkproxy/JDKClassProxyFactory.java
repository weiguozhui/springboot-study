package com.example.demo.proxy.jdkproxy;

/**
 * 代理工厂
 */
public class JDKClassProxyFactory implements JDKClass{

    JDKClass jdkClass;

    public JDKClassProxyFactory(JDKClass jdkClass){
        this.jdkClass=jdkClass;
    }

    @Override
    public void proxyMethod() {
        System.out.println("before say hello");
        jdkClass.proxyMethod();
        System.out.println("after say hello");

    }
}
