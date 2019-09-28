package com.example.pattern.interpreter.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:10
 */
public abstract class SymbolNode implements Node{

    protected Node left;
    protected Node right;

    public SymbolNode(Node left,Node right){
        this.left=left;
        this.right=right;
    }
}
