package com.example.pattern.abstractfactory.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class HaierFactory implements EFFactory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HairAirConditioner();
    }
}
