package com.example.pattern.strategy.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/26 23:43
 */
public class ArrayHandler {
    private Sort sortObj;
    public int[] sort(int arr[]){
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj){
        this.sortObj=sortObj;
    }
}
