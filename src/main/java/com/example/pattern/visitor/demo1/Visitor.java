package com.example.pattern.visitor.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:41
 */
public abstract class Visitor {

    public abstract void visit(ConcreteElementA elementA);
    public abstract void visit(ConcreteElementB elementB);
    public  void visit(ConcreteElementC elementC){
        //元素ConcreteElementC操作代码
    }
}
