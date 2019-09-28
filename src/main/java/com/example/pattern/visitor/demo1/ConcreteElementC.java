package com.example.pattern.visitor.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:48
 */
public class ConcreteElementC implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA(){
        //业务方法
    }
}
