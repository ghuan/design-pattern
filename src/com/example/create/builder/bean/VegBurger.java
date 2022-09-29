package com.example.create.builder.bean;

/**
 * 素食汉堡
 *
 * @author tianma
 * @date 2022/ 09/29 15:50:48
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public Float price() {
        return 35.5F;
    }
}
