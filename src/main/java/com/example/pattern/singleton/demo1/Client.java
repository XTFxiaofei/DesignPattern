package com.example.pattern.singleton.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Client {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
