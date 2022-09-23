package com.example.singleton;

/**
 * 单例模式-懒汉模式
 * @author tianma
 * @date 2022/ 09/22 17:22:13
 */
public class Lazy {
    private static volatile Lazy instance;
    private Lazy(){}
    public static Lazy getInstance(){
        if(instance == null){
            synchronized (Lazy.class){
                if(instance == null){
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("Lazy module");
    }
}
