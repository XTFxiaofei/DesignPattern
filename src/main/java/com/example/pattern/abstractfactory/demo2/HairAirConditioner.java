package com.example.pattern.abstractfactory.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class HairAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度改变中......");
    }
}
