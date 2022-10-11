package com.example.create.prototype;

/**
 * 宝马
 * @author tianma
 * @date 2022/ 09/20 17:33:16
 */
public class BMWCar extends Car {
    public BMWCar(){
        this.setType("BMW");
    }
    @Override
    void run() {
        System.out.println("宝马启动");
    }
}
