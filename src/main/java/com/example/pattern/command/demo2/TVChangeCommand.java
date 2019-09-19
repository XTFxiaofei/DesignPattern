package com.example.pattern.command.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:27
 */
public class TVChangeCommand implements AbstractCommand {

    private Television tv;
    public TVChangeCommand(){
        tv=new Television();
    }



    @Override
    public void execute() {
        tv.changeChannel();
    }
}
