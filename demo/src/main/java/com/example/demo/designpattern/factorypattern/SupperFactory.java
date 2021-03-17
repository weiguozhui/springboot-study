package com.example.demo.designpattern.factorypattern;

public abstract class SupperFactory {
    abstract ShareFactory getShareFactory();
    abstract ColorFactory getColorFactory();
}
