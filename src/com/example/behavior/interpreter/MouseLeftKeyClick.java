package com.example.behavior.interpreter;

/**
 * 鼠标左键点击 - 非终极表达式
 *
 * @author tianma
 * @date 2022/ 10/14 13:25:19
 */
public class MouseLeftKeyClick implements Expression {
    private Expression leftKeyDownExpression;
    private Expression leftKeyUpExpression;

    public MouseLeftKeyClick(){
        this.leftKeyDownExpression = new MouseLeftKeyDown();
        this.leftKeyUpExpression = new MouseLeftKeyUp();
    }

    @Override
    public void interpret() {
        this.leftKeyDownExpression.interpret();
        this.leftKeyUpExpression.interpret();
    }
}
