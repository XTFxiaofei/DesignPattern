package com.example.pattern.chainresponsibility.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/18 7:35
 */
public abstract class Leader {
    protected String name;
    protected Leader successor;
    public Leader(String name){
        this.name=name;
    }
    public void setSuccessor(Leader successor){
        this.successor=successor;
    }

    public abstract void handleRequest(LeaveRequest request);
}
