package com.example.pattern.prototype.demo3;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Blue implements MyColor {
    @Override
    public Object clone() {
        Blue b=null;
        try {
            b=(Blue)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public void display() {
        System.out.println("This is Blue!");

    }


}
