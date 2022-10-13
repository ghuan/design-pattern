package com.example.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * java支持的观察者
 *
 * @author tianma
 * @date 2022/ 10/13 16:56:15
 */
public class JavaSecondObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("java第二个观察者收到通知");
    }
}
