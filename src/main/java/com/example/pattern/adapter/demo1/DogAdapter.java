package com.example.pattern.adapter.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        System.out.print("机器人模仿:");
        super.wang();
    }

    @Override
    public void move() {
        System.out.print("机器人模仿:");
        super.run();
    }
}
