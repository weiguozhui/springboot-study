package com.example.demo.designpattern.factorypattern;

public class ShareFactory {

    public static Share getShareFactory(Class t){
        Share share = null;
        try {
            share = (Share) t.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return share;
    }

}
