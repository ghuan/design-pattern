package com.example.create.builder;

/**
 * 汉堡
 *
 * @author tianma
 * @date 2022/ 09/29 15:41:05
 */
public abstract class Burger implements Item {
    @Override
    public String name() {
        return "汉堡";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
