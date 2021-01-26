package com.example.demo.designpattern.factorypattern;

public class ColorFactory {
    public static Color getColor(Class t) throws IllegalAccessException, InstantiationException {
        Color color = (Color) t.newInstance();
        return color;
    }
}
