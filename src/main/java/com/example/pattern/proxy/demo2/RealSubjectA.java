package com.example.pattern.proxy.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class RealSubjectA implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实主题类A!");
    }
}
