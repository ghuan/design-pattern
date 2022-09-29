package com.example.create.singleton;

/**
 * 单例模式-懒汉模式 double-checked locking
 * 线程安全
 * @author tianma
 * @date 2022/ 09/22 17:22:13
 */
public class LazyDCL {
    private static volatile LazyDCL instance;
    private LazyDCL(){}
    public static LazyDCL getInstance(){
        if(instance == null){
            synchronized (LazyDCL.class){
                if(instance == null){
                    instance = new LazyDCL();
                }
            }
        }
        return instance;
    }
}
