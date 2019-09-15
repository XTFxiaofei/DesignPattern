package com.example.pattern.bridge.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class BigPen extends Pen {
    @Override
    public void draw(String name) {
        String penType="大号毛笔绘制";
        this.color.bepaint(penType,name);
    }
}
