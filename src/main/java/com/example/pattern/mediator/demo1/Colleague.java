package com.example.pattern.mediator.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 22:26
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }

    public abstract void method1();

    public abstract void method2();
}
