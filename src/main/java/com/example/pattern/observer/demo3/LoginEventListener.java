package com.example.pattern.observer.demo3;

import java.util.EventListener;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/24 8:33
 */
public interface LoginEventListener extends EventListener {
    //声明响应事件
    void volidateLogin(LoginEvent event);
}
