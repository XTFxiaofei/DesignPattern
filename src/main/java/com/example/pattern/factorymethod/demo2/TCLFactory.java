package com.example.pattern.factorymethod.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class TCLFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("TCL电视机工厂生产TCL电视机。");
        return new TCLTV();
    }
}
