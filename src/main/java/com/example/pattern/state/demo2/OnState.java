package com.example.pattern.state.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/26 23:14
 */
public class OnState extends State {

    @Override
    public void on(Switch s) {
        System.out.println("已经打开了!");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭!");
        s.setState(Switch.getState("off"));

    }
}
