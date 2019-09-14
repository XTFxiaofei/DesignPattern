package com.example.pattern.builder.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一个鸡腿堡");
    }

    @Override
    public void buildDrink() {
       meal.setDrink("一杯可乐");
    }
}
