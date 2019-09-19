package com.example.pattern.command.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:26
 */
public class TVCloseCommand implements AbstractCommand {

    private Television tv;
    public TVCloseCommand(){
        tv=new Television();
    }
    public void execute(){
        tv.close();
    }
}
