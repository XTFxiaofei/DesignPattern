package com.example.pattern.command.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:25
 */
public class TVOpenCommand implements AbstractCommand {
    private Television tv;
    public TVOpenCommand(){
        tv=new Television();
    }
    @Override
    public void execute() {
        tv.open();
    }
}
