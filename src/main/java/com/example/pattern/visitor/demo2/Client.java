package com.example.pattern.visitor.demo2;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 12:05
 */
public class Client {
    public static void main(String[] args) {
        Product b1=new Book();
        Product b2=new Book();
        Product a1=new Apple();
        Visitor visitor;

        BuyBasket buyBasket=new BuyBasket();
        buyBasket.addProduct(b1);
        buyBasket.addProduct(b2);
        buyBasket.addProduct(a1);

        visitor=(Visitor)XMLUtil.getBean("visitor.xml");
        visitor.setName("张三");
        buyBasket.accept(visitor);
    }
}
