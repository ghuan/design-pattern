package com.example.behavior.interpreter;

import java.util.List;

/**
 * 指令序列
 *
 * @author tianma
 * @date 2022/ 10/17 15:18:30
 */
public class Sequence implements Expression {
    List<Expression> expressions;
    public Sequence(List<Expression> expressions){
        this.expressions = expressions;
    }
    @Override
    public void interpret() {
        this.expressions.forEach(e -> e.interpret());
    }
}
