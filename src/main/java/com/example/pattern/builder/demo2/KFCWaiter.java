package com.example.pattern.builder.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class KFCWaiter {
    private MealBuilder mb;
    public void setMealBuilder(MealBuilder mb){
        this.mb=mb;
    }
    public Meal construct(){
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
