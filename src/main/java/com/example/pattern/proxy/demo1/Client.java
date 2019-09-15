package com.example.pattern.proxy.demo1;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public class Client {
    public static void main(String[] args) {
        AbstractPermission permission;
        permission=(AbstractPermission) XMLUtil.getBean("proxy.xml");

        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNote();
        permission.modifyNote();
        System.out.println("--------------------------------");
        permission.setLevel(1);
        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNote();
        permission.modifyNote();
    }
}
