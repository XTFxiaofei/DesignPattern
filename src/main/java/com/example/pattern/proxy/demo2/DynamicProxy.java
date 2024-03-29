package com.example.pattern.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class DynamicProxy implements InvocationHandler {
    private Object obj;

    public DynamicProxy() {
    }

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        method.invoke(obj,args);
        postRequest();
        return null;
    }

    public void preRequest(){
        System.out.println("调用之前!");
    }

    public void postRequest(){
        System.out.println("调用之后!");
    }
}
