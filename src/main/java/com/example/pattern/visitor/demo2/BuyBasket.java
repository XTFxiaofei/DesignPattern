package com.example.pattern.visitor.demo2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 12:03
 */
public class BuyBasket {
    private ArrayList list=new ArrayList();

    public void accept(Visitor visitor){
        Iterator i=list.iterator();
        while(i.hasNext()){
            ((Product)i.next()).accept(visitor);
        }
    }

    public void addProduct(Product product){
        list.add(product);
    }

    public void removeProduct(Product product){
        list.remove(product);
    }
}
