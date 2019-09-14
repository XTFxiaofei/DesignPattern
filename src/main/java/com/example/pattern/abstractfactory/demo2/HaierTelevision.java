package com.example.pattern.abstractfactory.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class HaierTelevision implements Television {
    @Override
    public void play() {
        System.out.println("海尔电视机播放中......");
    }
}
