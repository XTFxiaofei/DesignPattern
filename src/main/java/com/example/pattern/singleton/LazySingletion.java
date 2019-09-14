package com.example.pattern.singleton;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class LazySingletion {

    private static LazySingletion instance=null;

    public LazySingletion() {
    }

    public static synchronized LazySingletion getInstance(){
        if(instance==null){
            instance=new LazySingletion();
        }
        return instance;
    }
}
