package com.example.singleton;

/**
 * 单例模式-饿汉模式
 * @author tianma
 * @date 2022/ 09/22 17:22:13
 */
public class Hungry {
    private static Hungry instance = new Hungry();
    private Hungry(){}
    public static Hungry getInstance(){
        return instance;
    }
    public void doSomething(){
        System.out.println("Hungry module");
    }
}
