package com.example.pattern.state.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/26 23:12
 */
public abstract class State {
    public abstract void on(Switch s);
    public abstract void off(Switch s);
}
