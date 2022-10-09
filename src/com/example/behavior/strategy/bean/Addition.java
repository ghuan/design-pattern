package com.example.behavior.strategy.bean;

/**
 * 加法
 *
 * @author tianma
 * @date 2022/ 10/09 15:58:01
 */
public class Addition implements AlgorithmStrategy {
    @Override
    public int calculate(int a,int b) {
        return a + b;
    }
}
