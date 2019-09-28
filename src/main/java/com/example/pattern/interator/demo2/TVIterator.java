package com.example.pattern.interator.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:49
 */
public interface TVIterator {

    void setChannel(int i);
    void next();
    void previous();
    boolean isLast();
    Object currentChannel();
    boolean isFirst();
}
