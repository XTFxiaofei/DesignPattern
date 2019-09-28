package com.example.pattern.visitor.demo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/28 11:52
 */
public class ObjectStructure {

    private ArrayList list=new ArrayList();

    public void accept(Visitor visitor){
        Iterator i=list.iterator();
        while(i.hasNext()){
            ((Element)i.next()).accept(visitor);
        }
    }

    public void addElement(Element element){
        list.add(element);
    }

    public void removeElement(Element eLement){
        list.add(eLement);
    }
}
