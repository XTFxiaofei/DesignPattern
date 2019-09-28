package com.example.pattern.observer.demo2;

import java.util.ArrayList;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 7:39
 */
public abstract class MySubject {

    protected ArrayList observers=new ArrayList();

    public void attach(MyObserver observer){
        observers.add(observer);
    }

    public void detach(MyObserver observer){
        observers.remove(observer);
    }

    public abstract void cry();
}
