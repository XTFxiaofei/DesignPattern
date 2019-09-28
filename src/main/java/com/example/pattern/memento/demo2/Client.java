package com.example.pattern.memento.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 0:03
 */
public class Client {
    public static void main(String[] args) {
        UserInfoDTO user=new UserInfoDTO();
        Caretaker c=new Caretaker();

        user.setAccount("zhangsan");
        user.setPassword("123456");
        user.setTelNo("131341324124");
        System.out.println("状态一:");
        user.show();
        c.setMemento(user.saveMemento());
        System.out.println("---------------");

        user.setPassword("111111");
        user.setTelNo("1342141241243");
        System.out.println("状态二:");
        user.show();
        System.out.println("-----------");

        user.restoreMemento(c.getMemento());
        System.out.println("回到状态一:");
        user.show();
        System.out.println("--------------");
    }
}
