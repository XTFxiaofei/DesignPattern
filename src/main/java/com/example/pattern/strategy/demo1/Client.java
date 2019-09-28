package com.example.pattern.strategy.demo1;

import com.example.pattern.utils.XMLUtil;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/26 23:45
 */
public class Client {
    public static void main(String[] args) {
        int arr[]={1,4,6,2,5,3,7,10,9};
        int result[];
        ArrayHandler ah=new ArrayHandler();

        Sort sort;
        sort=(Sort)XMLUtil.getBean("strategy.xml");

        ah.setSortObj(sort);
        result=ah.sort(arr);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
    }
}
