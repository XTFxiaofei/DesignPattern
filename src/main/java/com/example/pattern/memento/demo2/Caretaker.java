package com.example.pattern.memento.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 0:02
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
