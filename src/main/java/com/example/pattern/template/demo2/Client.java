package com.example.pattern.template.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:31
 */
public class Client {
    public static void main(String[] args) {
        HookDemo hd;

        hd=new SubHookDemo();
        hd.process();
    }
}
