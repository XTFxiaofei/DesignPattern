package com.example.pattern.command.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:15
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command=command;
    }

    public void setCommand(Command command){
        this.command=command;
    }

    //业务方法，用于调用命令类的方法
    public void call(){
        command.execute();
    }
}
