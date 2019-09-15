package com.example.pattern.flyweight.demo2;




/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public interface NetworkDevice {

    String getType();
    void use(Port port);
}
