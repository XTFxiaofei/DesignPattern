package com.example.pattern.command.demo3;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:50
 */
public class CalculatorForm {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command){
        this.command=command;
    }

    public void compute(int value){
        int i=command.execute(value);
        System.out.println("执行运算，运算结果为:"+i);
    }

    public void undo(){
        int i=command.undo();
        System.out.println("执行撤销，运算结果为:"+i);
    }


}
