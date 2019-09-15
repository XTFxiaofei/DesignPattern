package com.example.pattern.bridge.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Green implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType+"绿色的"+name+".");
    }
}
