package com.example.behavior.strategy;

/**
 * 计算器：context系统环境
 *
 * @author tianma
 * @date 2022/ 10/09 16:00:44
 */
public class Calculator {
    private AlgorithmStrategy algorithmStrategy;

    public Calculator(AlgorithmStrategy algorithmStrategy){
        this.algorithmStrategy = algorithmStrategy;
    }

    public void setAlgorithmStrategy(AlgorithmStrategy algorithmStrategy) {
        this.algorithmStrategy = algorithmStrategy;
    }
    public int calculate(int a,int b){
        return this.algorithmStrategy.calculate(a,b);
    }
}
