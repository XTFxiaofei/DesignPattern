package com.example.pattern.builder.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public abstract class MealBuilder {

    protected Meal meal=new Meal();

    public abstract void buildFood();
    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }
}
