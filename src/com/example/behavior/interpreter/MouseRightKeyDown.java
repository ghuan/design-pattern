package com.example.behavior.interpreter;

/**
 * 鼠标右键按下 - 终极表达式
 *
 * @author tianma
 * @date 2022/ 10/14 13:25:19
 */
public class MouseRightKeyDown implements Expression {
    @Override
    public void interpret() {
        System.out.println("鼠标右键按下");
    }
}
