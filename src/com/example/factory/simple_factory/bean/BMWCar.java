package com.example.factory.simple_factory.bean;

/**
 * 宝马
 * @author tianma
 * @date 2022/ 09/20 17:33:16
 */
public class BMWCar implements Car{
    @Override
    public void run() {
        System.out.println("宝马启动");
    }
}
