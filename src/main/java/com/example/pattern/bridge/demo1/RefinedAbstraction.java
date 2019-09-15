package com.example.pattern.bridge.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        impl.operationImpl();
    }
}
