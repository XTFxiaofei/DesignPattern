package com.example.pattern.template.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:09
 */
public abstract class BankTemplateMethod {

    public void takeNumber(){
        System.out.println("取好排队。");
    }

    public abstract void transact();

    public void evaluate(){
        System.out.println("反馈评分。");
    }

    public void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
