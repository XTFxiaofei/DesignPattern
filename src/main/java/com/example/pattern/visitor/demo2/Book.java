package com.example.pattern.visitor.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 12:00
 */
public class Book implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
