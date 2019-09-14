package com.example.pattern.builder.demo2;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class Client {
    public static void main(String[] args) {
        MealBuilder mb=(MealBuilder) XMLUtil.getBean("builder.xml");
        //服务员是指挥者
        KFCWaiter waiter=new KFCWaiter();
        //服务员准备套餐
        waiter.setMealBuilder(mb);
        //客户获得套餐
        Meal meal=waiter.construct();

        System.out.println("套餐组成:");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
