package com.example.pattern.composite.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/15
 */
public abstract class Component {
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract Component getChild(int i);
    public abstract void operation();
}
