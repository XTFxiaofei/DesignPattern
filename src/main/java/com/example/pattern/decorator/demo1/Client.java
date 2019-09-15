package com.example.pattern.decorator.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        Transform camaro;
        camaro=new Car();
        camaro.move();
        System.out.println("---------------------------");
        Robot bumblebee=new Robot(camaro);
        bumblebee.move();
        bumblebee.say();
    }
}
