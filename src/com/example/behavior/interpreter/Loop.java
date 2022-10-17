package com.example.behavior.interpreter;

/**
 * 循环 - 终极表达式
 *
 * @author tianma
 * @date 2022/ 10/14 13:25:19
 */
public class Loop implements Expression {
    private int times;
    private Runnable target;
    public Loop(int times,Runnable target){
        this.times = times;
        this.target = target;
    }
    @Override
    public void interpret() {
        for(int i=0;i<times;i++){
            target.run();
        }
    }
}
