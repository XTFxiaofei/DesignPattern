package com.example.pattern.visitor.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 12:01
 */
public class Customer extends Visitor {

    @Override
    public void visit(Apple apple) {
        System.out.println("顾客"+name+"选苹果。");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客"+name+"买书。");
    }
}
