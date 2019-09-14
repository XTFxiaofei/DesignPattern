package com.example.pattern.builder.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public abstract class Builder {

    protected Product product=new Product();
    public abstract void builderPartA();
    public abstract void builderPartB();
    public abstract void builderPartC();

    public Product getResult(){
        return product;
    }
}
