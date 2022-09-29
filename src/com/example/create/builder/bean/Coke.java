package com.example.create.builder.bean;

/**
 * 可口可乐
 *
 * @author tianma
 * @date 2022/ 09/29 15:50:48
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public Float price() {
        return 3.5F;
    }
}
