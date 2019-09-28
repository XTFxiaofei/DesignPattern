package com.example.pattern.mediator.demo2;



/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 22:36
 */
public abstract class AbstractChatroom {

    public abstract void register(Member member);
    public abstract void sendText(String from,String to,String message);
    public abstract void sendImage(String from,String to,String image);
}
