package com.example.pattern.template.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:11
 */
public class Withdraw extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("取款");
    }
}
