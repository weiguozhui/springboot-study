package com.example.demo.designpattern.factorypattern;

import com.example.demo.designpattern.factorypattern.impl.Circle;
import com.example.demo.designpattern.factorypattern.impl.Rectangle;
import com.example.demo.designpattern.factorypattern.impl.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShareFactoryTest {

    @Test
    void getShareFactory() {
        Share circle=ShareFactory.getShareFactory(Circle.class);
        Share rectangle=ShareFactory.getShareFactory(Rectangle.class);
        Share square=ShareFactory.getShareFactory(Square.class);
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}