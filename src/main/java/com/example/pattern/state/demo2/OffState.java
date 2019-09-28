package com.example.pattern.state.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/26 23:15
 */
public class OffState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("打开!");
        s.setState(Switch.getState("on"));
    }



    @Override
    public void off(Switch s) {
        System.out.println("已经关闭!");
    }
}
