package com.example.pattern.interpreter.demo1;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 19:20
 */
public class NonterminalExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public void interpret(Context ctx){
        //递归调用每一组成部分的interpret()方法
        //在递归调用指定组成部分的连接方式，即非终结符的功能
    }
}
