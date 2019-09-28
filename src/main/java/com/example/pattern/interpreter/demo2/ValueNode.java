package com.example.pattern.interpreter.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:10
 */
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value){
        this.value=value;
    }
    @Override
    public int interpret() {
        return this.value;
    }
}
