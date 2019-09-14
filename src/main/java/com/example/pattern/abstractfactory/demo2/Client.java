package com.example.pattern.abstractfactory.demo2;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Client {
    public static void main(String[] args) {
        EFFactory factory;
        Television tv;
        AirConditioner ac;
        factory=(EFFactory) XMLUtil.getBean("abstractfactory.xml");
        tv=factory.produceTelevision();
        tv.play();
        ac=factory.produceAirConditioner();
        ac.changeTemperature();
    }
}
