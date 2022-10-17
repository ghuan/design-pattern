package com.example.behavior.interpreter;

/**
 * 延时 - 终极表达式
 *
 * @author tianma
 * @date 2022/ 10/14 13:25:19
 */
public class Delay implements Expression {
    private int seconds;
    public Delay(int seconds){
        this.seconds = seconds;
    }
    @Override
    public void interpret() {
        System.out.println("延时"+seconds+"秒");
        try {
            Thread.sleep(seconds*1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
