package com.example.pattern.decorator.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public final class Car implements Transform{
    public Car() {
        System.out.println("变形金刚是一辆车!");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动!");
    }
}
