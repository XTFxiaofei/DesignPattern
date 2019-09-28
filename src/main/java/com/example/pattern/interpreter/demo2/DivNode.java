package com.example.pattern.interpreter.demo2;

/**
 * @author xietufei
 * @description:
 * @date 2019/9/22 21:12
 */
public class DivNode extends SymbolNode {

    public DivNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret()/super.right.interpret();
    }
}
