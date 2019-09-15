package com.example.pattern.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        InvocationHandler handler=null;
        AbstractSubject subject=null;

        handler=new DynamicProxy(new RealSubjectA());
        subject=(AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),new Class[]{AbstractSubject.class},handler);
        subject.request();

        System.out.println("----------------------");

        handler=new DynamicProxy(new RealSubjectB());
        subject=(AbstractSubject)Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),new Class[]{AbstractSubject.class},handler);
        subject.request();
    }
}
