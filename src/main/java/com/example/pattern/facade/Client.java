package com.example.pattern.facade;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        GeneralSwitchFacade facade=new GeneralSwitchFacade();
        facade.on();
        System.out.println("--------------------");
        facade.off();
    }
}
