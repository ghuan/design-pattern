package com.example.create.singleton;

/**
 * 单例模式-懒汉模式 线程不安全
 * @author tianma
 * @date 2022/ 09/22 17:22:13
 */
public class Lazy {
    private static Lazy instance;
    private Lazy(){}
    public static Lazy getInstance(){
        if(instance == null){
            instance = new Lazy();
        }
        return instance;
    }
}
