package com.example.behavior.visitor;

import java.time.LocalDate;

/**
 * 酒类
 *
 * @author tianma
 * @date 2022/ 10/11 16:36:56
 */
public class Wine extends Product implements Acceptable{
    public Wine(String name, Float price, LocalDate localDate) {
        super(name, price, localDate);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
