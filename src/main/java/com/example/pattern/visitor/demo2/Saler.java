package com.example.pattern.visitor.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 12:02
 */
public class Saler extends Visitor {

    @Override
    public void visit(Apple apple) {
        System.out.println("收银员"+name+"给苹果过称，然后技术其价格.");
    }

    @Override
    public void visit(Book book) {
        System.out.println("收银员"+name+"直接计算书的价格.");
    }
}
