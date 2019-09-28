package com.example.pattern.interpreter.demo1;

import java.util.HashMap;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 19:15
 */
public class Context {

    private HashMap map=new HashMap();

    public void assign(String key,String value){
        //往环境类中设值
    }

    public String lookup(String key){
        //获取存储在环境类中的值
        return null;
    }
}
