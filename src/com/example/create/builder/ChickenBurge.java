package com.example.create.builder;

/**
 * 鸡肉汉堡
 *
 * @author tianma
 * @date 2022/ 09/29 15:50:48
 */
public class ChickenBurge extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public Float price() {
        return 50.6F;
    }
}
