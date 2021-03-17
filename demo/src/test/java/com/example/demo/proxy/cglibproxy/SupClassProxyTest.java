package com.example.demo.proxy.cglibproxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * cglib 动态代理，继承需要代理的类，代理类重写需要代理的方法，方法中调用父类需要代理的方法，并添加增强内容，使用时实例对象使用代理类即可。
 */
class SupClassProxyTest {

    @Test
    void proxyMethod() {
        SupClass supClass = new SupClassProxy();
        supClass.proxyMethod();
    }
}