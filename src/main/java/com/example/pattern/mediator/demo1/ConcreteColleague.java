package com.example.pattern.mediator.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 22:28
 */
public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        mediator.operation();
    }
}
