package com.example.pattern.factorymethod.demo2;

/**
 * @author xietufei
 * @desc
 * @date 2019/9/14
 */
public class HisenseTVFactory implements TVFactory{
    @Override
    public TV produceTV() {
        System.out.println("海信电视机工程生产海信电视机");
        return new HisenseTV();
    }
}
