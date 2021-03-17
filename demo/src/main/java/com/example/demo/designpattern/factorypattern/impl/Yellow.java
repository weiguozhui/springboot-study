package com.example.demo.designpattern.factorypattern.impl;

import com.example.demo.designpattern.factorypattern.Color;

public class Yellow implements Color {
    @Override
    public void print() {
        System.out.println("===print yellow color==");
    }
}
