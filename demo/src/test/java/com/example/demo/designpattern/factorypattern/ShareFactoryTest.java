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

    @Test
    void testMethod(){
        String productCode = "21010001";

        String busiType = productCode.substring(2,5);
        String transType = productCode.substring(5,productCode.length());
        String draftAtrr = productCode.substring(0,1);

        System.out.println("busiType: "+busiType);
        System.out.println("transType: "+transType);
        System.out.println("draftAtrr: "+draftAtrr);
    }
}