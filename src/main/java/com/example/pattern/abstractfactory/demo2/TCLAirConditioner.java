package com.example.pattern.abstractfactory.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度改变中......");
    }
}
