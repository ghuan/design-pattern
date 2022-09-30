package com.example.structural.decorator.bean;

/**
 * 钢笔
 *
 * @author tianma
 * @date 2022/ 09/30 14:36:27
 */
public class Pen implements Writer {
    @Override
    public void write(String words) {
        System.out.println("钢笔写了："+words);
    }
}
