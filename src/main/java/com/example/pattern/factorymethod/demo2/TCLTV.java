package com.example.pattern.factorymethod.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class TCLTV implements TV {
    @Override
    public void play() {
        System.out.println("TCL电视机播放中......");
    }
}