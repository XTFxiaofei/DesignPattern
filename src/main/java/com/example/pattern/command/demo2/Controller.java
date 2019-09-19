package com.example.pattern.command.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:28
 */
public class Controller {

    private AbstractCommand openCommand,closeCommand,changeCommand;

    public Controller(AbstractCommand openCommand,AbstractCommand closeCommand,AbstractCommand changeCommand){
        this.openCommand=openCommand;
        this.closeCommand=closeCommand;
        this.changeCommand=changeCommand;
    }

    public void open(){
        openCommand.execute();
    }

    public void change(){
        changeCommand.execute();
    }

    public void close(){
        closeCommand.execute();
    }
}
