package com.example.pattern.interator.demo2;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 22:00
 */
public class Client {

    public static void display(Television tv){
        TVIterator i=tv.createIterator();
        System.out.println("电视机频道: ");
        while(!i.isLast()){
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reverseDisplay(Television tv){
        TVIterator i=tv.createIterator();
        i.setChannel(5);
        System.out.println("逆向遍历电视机频道:");
        while(!i.isFirst()){
            i.previous();
            System.out.println(i.currentChannel().toString());
        }
    }

    public static void main(String[] args) {
        Television tv;
        tv=(Television)XMLUtil.getBean("iterator.xml");
        display(tv);
        System.out.println("---------------------------------");
        reverseDisplay(tv);
    }
}
