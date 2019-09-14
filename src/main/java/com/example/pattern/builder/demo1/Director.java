package com.example.pattern.builder.demo1;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }

    public void setBuilder(Builder builder){
        this.builder=builder;
    }

    public Product construct(){
        builder.builderPartA();
        builder.builderPartB();
        builder.builderPartC();

        return builder.getResult();
    }
}
