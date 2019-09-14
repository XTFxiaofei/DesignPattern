package com.example.pattern.singleton.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Singleton {
    private static Singleton instance=null;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
