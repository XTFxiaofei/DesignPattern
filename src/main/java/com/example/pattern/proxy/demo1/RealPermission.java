package com.example.pattern.proxy.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class RealPermission implements AbstractPermission {
    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息!");
    }

    @Override
    public void viewNote() {

    }

    @Override
    public void publishNote() {
        System.out.println("发表新帖!");

    }

    @Override
    public void modifyNote() {
        System.out.println("修改发帖内容");

    }

    @Override
    public void setLevel(int level) {

    }
}
