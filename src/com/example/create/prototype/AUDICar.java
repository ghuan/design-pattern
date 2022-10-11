package com.example.create.prototype;

/**
 * 宝马
 * @author tianma
 * @date 2022/ 09/20 17:33:16
 */
public class AUDICar extends Car {
    public AUDICar(){
        this.setType("AUDI");
    }
    @Override
    void run() {
        System.out.println("奥迪启动");
    }
}
