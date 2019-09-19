package com.example.pattern.command.demo3;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/20 7:47
 */
public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
