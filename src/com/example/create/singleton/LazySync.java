package com.example.create.singleton;

/**
 * 单例模式-懒汉模式 synchronized
 * 线程安全 效率低
 * @author tianma
 * @date 2022/ 09/22 17:22:13
 */
public class LazySync {
    private static LazySync instance;
    private LazySync(){}
    public static synchronized LazySync getInstance(){
        if(instance == null){
            instance = new LazySync();
        }
        return instance;
    }
}
