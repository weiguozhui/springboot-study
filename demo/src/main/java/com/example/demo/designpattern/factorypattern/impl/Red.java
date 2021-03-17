package com.example.demo.designpattern.factorypattern.impl;

import com.example.demo.designpattern.factorypattern.Color;

public class Red implements Color {
    @Override
    public void print() {
        System.out.println("===print red color===");
    }
}
