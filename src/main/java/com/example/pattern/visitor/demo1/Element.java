package com.example.pattern.visitor.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:47
 */
public interface Element {
    void accept(Visitor visitor);
}
