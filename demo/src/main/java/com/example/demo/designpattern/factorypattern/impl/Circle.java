package com.example.demo.designpattern.factorypattern.impl;

import com.example.demo.designpattern.factorypattern.Share;

public class Circle implements Share {
    @Override
    public void draw() {
        System.out.println("====draw circle===");
    }
}
