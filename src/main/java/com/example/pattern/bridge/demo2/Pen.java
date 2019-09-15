package com.example.pattern.bridge.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public abstract class Pen {
    protected Color color;

    public void setColor(Color color){
        this.color=color;
    }

    public abstract void draw(String name);
}
