package com.example.pattern.adapter.demo3;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class ConcreteServiceClass extends AbstractServiceClass {
    @Override
    public void serviceMethod1() {
        System.out.println("具体业务方法一");
    }

    @Override
    public void serviceMethod2() {
        System.out.println("具体业务方法二");

    }

    @Override
    public void serviceMethod3() {

    }
}
