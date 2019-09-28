package com.example.pattern.state.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/26 23:19
 */
public class Client {
    public static void main(String[] args) {
        Switch s1,s2;
        s1=new Switch("开关1");
        s2=new Switch("开关2");

        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();
    }
}
