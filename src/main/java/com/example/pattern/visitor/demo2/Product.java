package com.example.pattern.visitor.demo2;



/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:58
 */
public interface Product {

    void accept(Visitor visitor);
}
