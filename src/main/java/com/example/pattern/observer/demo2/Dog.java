package com.example.pattern.observer.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 7:47
 */
public class Dog implements MyObserver {

    @Override
    public void response() {
        System.out.println("狗跟着叫");
    }
}
