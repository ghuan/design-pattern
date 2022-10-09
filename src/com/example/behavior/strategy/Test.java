package com.example.behavior.strategy;

import com.example.behavior.strategy.bean.Addition;
import com.example.behavior.strategy.bean.Calculator;
import com.example.behavior.strategy.bean.Subtraction;

/**
 * 策略模式：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        Calculator calculator = new Calculator(new Addition());
        System.out.println(calculator.calculate(1,2));
        calculator.setAlgorithmStrategy(new Subtraction());
        System.out.println(calculator.calculate(1,2));
    }
}
