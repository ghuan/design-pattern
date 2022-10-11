package com.example.structure.decorator;

/**
 * 铅笔
 *
 * @author tianma
 * @date 2022/ 09/30 14:36:27
 */
public class Pencil implements Writer {
    @Override
    public void write(String words) {
        System.out.println("铅笔写了："+words);
    }
}
