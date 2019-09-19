package com.example.pattern.command.demo3;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:47
 */
public class Adder {
    private int num=0;

    public int add(int value){
        num+=value;
        return num;
    }
}
