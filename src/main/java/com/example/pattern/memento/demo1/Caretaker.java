package com.example.pattern.memento.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/23 23:54
 */
public class Caretaker {

    private Originator.Memento memento;

    public Originator.Memento getMemento() {
        return memento;
    }

    public void setMemento(Originator.Memento memento) {
        this.memento = memento;
    }
}
