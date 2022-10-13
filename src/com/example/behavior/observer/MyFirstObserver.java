package com.example.behavior.observer;

/**
 * 第一个观察者
 *
 * @author tianma
 * @date 2022/ 10/13 16:38:42
 */
public class MyFirstObserver implements MyObserver {
    @Override
    public void update() {
        System.out.println("第一个观察者收到通知");
    }
}
