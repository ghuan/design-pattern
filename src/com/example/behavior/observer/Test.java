package com.example.behavior.observer;

import java.util.Observer;

/**
 * 观察者模式：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        /**
         * 手动实现观察者模式，不支持异步线程安全
         * @author tianma
         * @date 2022/10/13 16:51
         **/
        MyRealObservable myObservable = new MyRealObservable();
        MyObserver firstMyObserver = new MyFirstObserver();
        MyObserver secondMyObserver = new MySecondObserver();
        //注册观察者
        myObservable.addObserver(firstMyObserver);
        myObservable.addObserver(secondMyObserver);
        myObservable.setState("test");
        /**
         * java已支持的观察者模式：java.util.Observable,java.util.Observer
         * 线程安全
         * @author tianma
         * @date 2022/10/13 16:50
         **/
        JavaRealObservable javaRealObservable = new JavaRealObservable();
        Observer javaFirstObserver = new JavaFirstObserver();
        Observer javaSecondObserver = new JavaSecondObserver();
        javaRealObservable.addObserver(javaFirstObserver);
        javaRealObservable.addObserver(javaSecondObserver);
        javaRealObservable.setState("test");
    }
}
