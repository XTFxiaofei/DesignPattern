package com.example.pattern.observer.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 7:33
 */
public class ConcreteSubject extends Subject {

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify2() {
        for(Object obs:observers){
            ((Observer)obs).update();
        }

    }
}
