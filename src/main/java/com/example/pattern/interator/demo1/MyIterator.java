package com.example.pattern.interator.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:36
 */
public interface MyIterator {

    void first();
    void next();
    boolean isLast();
    Object currentItem();
}
