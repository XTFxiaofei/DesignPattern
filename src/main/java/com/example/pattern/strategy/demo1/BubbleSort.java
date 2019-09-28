package com.example.pattern.strategy.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/26 23:35
 */
public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("冒泡排序");
        return arr;
    }
}
