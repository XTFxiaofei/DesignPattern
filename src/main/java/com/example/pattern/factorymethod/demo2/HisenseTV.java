package com.example.pattern.factorymethod.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class HisenseTV  implements TV{
    @Override
    public void play() {
        System.out.println("海信电视机播放中......");
    }
}
