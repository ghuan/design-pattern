package com.example.behavior.visitor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * 访问者模式：主要将数据结构与数据操作分离。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        Visitor visitor = new DiscountVisitor(LocalDate.of(2022,10,11));
        visitor.visit(new Candy("牛奶糖",5.2f,LocalDate.of(2021,10,11)));

        List<Acceptable> products = Arrays.asList(
                new Candy("牛奶糖",5.2f,LocalDate.of(2021,10,11)),
                new Wine("啤酒",15.2f,LocalDate.of(2022,10,11)),
                new Fruit("苹果",35.2f,LocalDate.of(2022,10,01))
        );
        products.forEach(p -> p.accept(visitor));
    }
}
