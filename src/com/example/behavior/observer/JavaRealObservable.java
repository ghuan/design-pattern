package com.example.behavior.observer;

import java.util.Observable;

/**
 * java支持的被观察者
 *
 * @author tianma
 * @date 2022/ 10/13 16:53:00
 */
public class JavaRealObservable extends Observable {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.setChanged();
        new Thread(() -> this.notifyObservers()).start();
    }

}
