package com.example.pattern.adapter.demo1;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        Robot robot=(Robot) XMLUtil.getBean("adapter.xml");
        robot.cry();
        robot.move();
    }
}
