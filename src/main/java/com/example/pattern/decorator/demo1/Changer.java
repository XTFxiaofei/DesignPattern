package com.example.pattern.decorator.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Changer implements Transform {
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
