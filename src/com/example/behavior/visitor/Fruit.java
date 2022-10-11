package com.example.behavior.visitor;

import java.time.LocalDate;

/**
 * 水果
 *
 * @author tianma
 * @date 2022/ 10/11 16:36:56
 */
public class Fruit extends Product implements Acceptable{
    private Double weight;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Fruit(String name, Float price, LocalDate localDate) {
        super(name, price, localDate);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
