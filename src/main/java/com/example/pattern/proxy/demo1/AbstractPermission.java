package com.example.pattern.proxy.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public interface AbstractPermission {
    void modifyUserInfo();
    void viewNote();
    void publishNote();
    void modifyNote();
    void setLevel(int level);
}
