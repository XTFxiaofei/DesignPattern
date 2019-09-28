package com.example.pattern.observer.demo1;

import java.util.ArrayList;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 7:30
 */
public abstract class Subject {

    protected ArrayList observers=new ArrayList<>();
    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract void notify2();
}
