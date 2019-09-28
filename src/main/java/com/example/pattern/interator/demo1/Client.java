package com.example.pattern.interator.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:42
 */
public class Client {

    public static void process(MyCollection collection){
        MyIterator i=collection.createIterator();
        while(!i.isLast()){
            System.out.println(i.currentItem().toString());
            i.next();
        }
    }
    public static void main(String[] args) {
        MyCollection collection=new NewCollection();
        process(collection);
    }
}
