package com.example.pattern.observer.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 7:45
 */
public class Cat extends MySubject {
    @Override
    public void cry() {
        System.out.println("猫叫");
        System.out.println("----------------");

        for(Object obs:observers){
            ((MyObserver)obs).response();
        }
    }
}
