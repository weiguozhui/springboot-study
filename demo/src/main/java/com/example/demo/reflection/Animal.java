package com.example.demo.reflection;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * 反射的继承实现类的获取实验对象
 */
@Logger
@Component
@Getter
public class Animal implements AnimalAction{
    private String type;

    @Override
    public void move() {

    }
}
