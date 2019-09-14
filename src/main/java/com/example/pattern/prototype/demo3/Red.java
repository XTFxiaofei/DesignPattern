package com.example.pattern.prototype.demo3;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Red implements MyColor {
    @Override
    public Object clone() {
        Red r=null;
        try {
            r=(Red)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public void display() {
         System.out.println("This is red!");
    }
}
