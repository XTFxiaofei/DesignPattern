package com.example.pattern.bridge.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public abstract class Abstraction {

    protected Implementor impl;

    public void setImpl(Implementor impl){
        this.impl=impl;
    }

    public abstract void operation();
}
