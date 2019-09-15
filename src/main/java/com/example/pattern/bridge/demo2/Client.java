package com.example.pattern.bridge.demo2;



/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        Color color;
        Pen pen;
        color=(Color) XMLUtilPen.getBean("color");
        pen=(Pen)XMLUtilPen.getBean("pen");

        pen.setColor(color);
        pen.draw("鲜花");
    }
}
