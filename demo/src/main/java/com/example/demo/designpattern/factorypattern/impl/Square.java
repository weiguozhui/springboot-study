package com.example.demo.designpattern.factorypattern.impl;

import com.example.demo.designpattern.factorypattern.Share;

public class Square implements Share {
    @Override
    public void draw() {
        System.out.println("====draw square===");
    }
}
