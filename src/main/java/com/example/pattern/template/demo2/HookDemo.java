package com.example.pattern.template.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:27
 */
public abstract class HookDemo {
    //获取数据
    public abstract void getData();

    //转换数据
    public void convertData(){
        System.out.println("通用的数据转换操作");
    }

    //显示数据
    public abstract void displayData();

    //模板方法
    public void process(){
        getData();
        if(isValid()){
            convertData();
        }
        displayData();
    }

    public boolean isValid(){
        return true;
    }
}
