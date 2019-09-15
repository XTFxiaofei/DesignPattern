package com.example.pattern.adapter.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class BirdAdapter extends Bird implements Robot {
    @Override
    public void cry() {
        System.out.println("机器人模仿:");
        super.tweedle();
    }

    @Override
    public void move() {
        System.out.println("机器人模仿:");
        super.fly();
    }
}
