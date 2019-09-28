package com.example.pattern.observer.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 7:49
 */
public class Pig implements MyObserver {
    @Override
    public void response() {
        System.out.println("猪没有反应!");
    }
}
