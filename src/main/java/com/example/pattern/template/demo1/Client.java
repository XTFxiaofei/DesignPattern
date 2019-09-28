package com.example.pattern.template.demo1;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:13
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bank;
        bank=(BankTemplateMethod)XMLUtil.getBean("template.xml");
        bank.process();
        System.out.println("--------------------------------");

    }
}
