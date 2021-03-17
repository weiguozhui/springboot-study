package com.example.demo.proxy.jdkproxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JDKClassProxyFactoryTest {

    @Test
    public void proxyMethod(){
        JDKClass jdkClass =new JDKClassProxyFactory(new JDKClassImpl());
        jdkClass.proxyMethod();
    }

}