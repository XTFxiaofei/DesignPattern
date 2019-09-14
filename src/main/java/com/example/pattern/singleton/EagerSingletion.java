package com.example.pattern.singleton;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class EagerSingletion {
    private static final EagerSingletion instance=new EagerSingletion();

    public EagerSingletion() {
    }

    public static EagerSingletion getInstance(){
        return instance;
    }
}
