package com.example.pattern.mediator.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 22:50
 */
public class Client {
    public static void main(String[] args) {
        AbstractChatroom happyChat=new ChatGroup();

        Member m1,m2,m3,m4,m5;
        m1=new DiamondMember("张三");
        m2=new DiamondMember("李四");
        m3=new DiamondMember("王五");
        m4=new DiamondMember("赵六");
        m5=new DiamondMember("刘七");

        happyChat.register(m1);
        happyChat.register(m2);
        happyChat.register(m3);
        happyChat.register(m4);
        happyChat.register(m5);


        m1.sendText("李四","李四，你好");
        m2.sendText("张三","张三，你好!");
        m3.sendText("王五","王五，你好");
        m4.sendText("赵六","赵六，你好!");
        m5.sendText("刘七","刘七，你好");

    }
}
