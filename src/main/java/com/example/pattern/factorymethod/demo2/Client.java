package com.example.pattern.factorymethod.demo2;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Client {
    public static void main(String[] args) {
        TV tv;
        TVFactory factory;
        factory=(TVFactory) XMLUtil.getBean("factorymethod.xml");
        tv=factory.produceTV();
        tv.play();
    }
}
