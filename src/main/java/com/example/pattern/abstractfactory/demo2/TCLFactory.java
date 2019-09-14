package com.example.pattern.abstractfactory.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class TCLFactory implements EFFactory {
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new TCLAirConditioner();
    }
}
