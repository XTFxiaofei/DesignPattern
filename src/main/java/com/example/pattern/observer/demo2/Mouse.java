package com.example.pattern.observer.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 7:46
 */
public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("老鼠努力逃跑!");
    }
}
