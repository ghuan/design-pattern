package com.example.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 *
 * @author tianma
 * @date 2022/ 10/13 16:32:42
 */
public class MyObservable {
    List<MyObserver> observers = new ArrayList<>();
    public void addObserver(MyObserver observer){
        observers.add(observer);
    }
    public void notifyObservers(){
        observers.forEach(o -> o.update());
    }
}
