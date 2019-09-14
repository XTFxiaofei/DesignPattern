package com.example.pattern.factorymethod.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("海尔电视机工厂生产海尔电视机");
        return new HaierTV();
    }
}
