package com.example.pattern.template.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:30
 */
public class SubHookDemo extends HookDemo {
    @Override
    public void getData() {
        System.out.println("从XML配置文件中获取数据");
    }

    @Override
    public void displayData() {
        System.out.println("以柱形图显示数据");
    }

    public boolean isValid(){
        return false;
    }
}
