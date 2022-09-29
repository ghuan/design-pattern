package com.example.create.builder.bean;

/**
 * 百事可乐
 *
 * @author tianma
 * @date 2022/ 09/29 15:50:48
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public Float price() {
        return 4.5F;
    }
}
