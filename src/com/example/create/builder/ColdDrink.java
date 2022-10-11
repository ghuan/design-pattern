package com.example.create.builder;

/**
 * 冷饮
 *
 * @author tianma
 * @date 2022/ 09/29 15:41:05
 */
public abstract class ColdDrink implements Item {
    @Override
    public String name() {
        return "冷饮";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
