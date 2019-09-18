package com.example.pattern.chainresponsibility.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/18 7:47
 */
public class Client {
    public static void main(String[] args) {
        Leader objDirector,objManager,objGeneralManager,objViceGeneralManager;
        objDirector=new Director("小明");
        objManager=new Manager("小乔");
        objGeneralManager=new GeneralManager("小王");
        objViceGeneralManager=new ViceGeneralManager("肖红");


        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);
        objGeneralManager.setSuccessor(objViceGeneralManager);

        LeaveRequest lr1=new LeaveRequest("张三",2);
        objDirector.handleRequest(lr1);

        LeaveRequest lr2=new LeaveRequest("李四",5);
        objDirector.handleRequest(lr2);

        LeaveRequest lr3=new LeaveRequest("王五",15);
        objDirector.handleRequest(lr3);

        LeaveRequest lt4=new LeaveRequest("赵六",45);
        objDirector.handleRequest(lt4);
    }
}
