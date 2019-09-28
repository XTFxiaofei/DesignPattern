package com.example.pattern.mediator.demo1;

import java.util.ArrayList;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 22:25
 */
public abstract class Mediator {

    protected ArrayList colleagues;

    public void register(Colleague colleague){
        colleagues.add(colleague);
    }

    public abstract void operation();
}
