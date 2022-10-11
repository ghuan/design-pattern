package com.example.behavior.visitor;

import java.time.LocalDate;

/**
 * 糖果
 *
 * @author tianma
 * @date 2022/ 10/11 16:36:56
 */
public class Candy extends Product implements Acceptable{

    public Candy(String name, Float price, LocalDate localDate) {
        super(name, price, localDate);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
