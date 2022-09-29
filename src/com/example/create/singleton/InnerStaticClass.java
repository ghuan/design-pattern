package com.example.create.singleton;

/**
 * 单例模式-静态内部类方式
 * 延时加载
 * @author tianma
 * @date 2022/ 09/22 17:22:13
 */
public class InnerStaticClass {
    private static class InnerStaticClassHolder{
        private static final InnerStaticClass instance = new InnerStaticClass();
    }
    private InnerStaticClass(){}
    public static final InnerStaticClass getInstance(){
        return InnerStaticClassHolder.instance;
    }
}
