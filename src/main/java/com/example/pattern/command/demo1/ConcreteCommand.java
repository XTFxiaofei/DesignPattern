package com.example.pattern.command.demo1;



/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:16
 */
public class ConcreteCommand extends Command {
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}
