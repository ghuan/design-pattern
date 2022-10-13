package com.example.behavior.observer;

/**
 * @description 被观察者实例
 * @author tianma
 * @date 2022/10/13 16:44
 **/
public class MyRealObservable extends MyObservable{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }
}
