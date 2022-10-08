package com.example.structural.bridge.bean;

/**
 * 红色
 *
 * @author tianma
 * @date 2022/ 10/08 15:11:24
 */
public class Red implements Color {
    @Override
    public void show() {
        System.out.print("红色");
    }
}
