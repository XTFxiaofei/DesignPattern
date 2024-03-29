package com.example.pattern.visitor.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:58
 */
public abstract class Visitor {

    protected String name;

    public void setName(String name){
        this.name=name;
    }

    public abstract void visit(Apple apple);

    public abstract void visit(Book book);
}
