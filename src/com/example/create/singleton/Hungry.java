package com.example.create.singleton;

/**
 * 单例模式-饿汉模式
 * 浪费内存
 * @author tianma
 * @date 2022/ 09/22 17:22:13
 */
public class Hungry {
    private static final Hungry instance = new Hungry();
    private Hungry(){}
    public static Hungry getInstance(){
        return instance;
    }
}
