package com.example.create.singleton;

/**
 * 单例模式-枚举方式
 * 实现方便
 * @author tianma
 * @date 2022/ 09/22 17:22:13
 */
public enum Enum {
    instance;
    public void doSomething(){
        System.out.println("hello world");
    }
}
