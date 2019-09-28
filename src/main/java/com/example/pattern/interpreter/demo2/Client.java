package com.example.pattern.interpreter.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:20
 */
public class Client {
    public static void main(String[] args) {
        String statement="3 * 4 / 2 % 4";
        Calculator calculator=new Calculator();
        calculator.build(statement);
        int result=calculator.compute();
        System.out.println(statement+"="+result);

    }
}
