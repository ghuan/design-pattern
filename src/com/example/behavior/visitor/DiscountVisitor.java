package com.example.behavior.visitor;

import java.time.LocalDate;

/**
 * 访问者实现
 *
 * @author tianma
 * @date 2022/ 10/11 16:42:05
 */
public class DiscountVisitor implements Visitor{
    private LocalDate billDate;
    public DiscountVisitor(LocalDate billDate){
        this.billDate = billDate;
    }
    @Override
    public void visit(Candy candy) {
        if((this.billDate.toEpochDay()) - (candy.getLocalDate().toEpochDay()) > 180){
            System.out.println("超过180天的糖果不能食用");
        }else {
            System.out.println("========"+candy.getName()+"打折后的价格========");
            System.out.println(candy.getPrice()*0.9);
        }
    }

    @Override
    public void visit(Wine wine) {
        System.out.println("========酒类:"+wine.getName()+"无优惠========");
        System.out.println(wine.getPrice()*0.9);
    }

    @Override
    public void visit(Fruit fruit) {
        if((this.billDate.toEpochDay()) - (fruit.getLocalDate().toEpochDay()) > 7){
            System.out.println("超过7天的水果不能食用");
        }else {
            System.out.println("========"+fruit.getName()+"打折后的价格========");
            if((this.billDate.toEpochDay()) - (fruit.getLocalDate().toEpochDay()) <= 1){
                System.out.println(fruit.getPrice()*0.9);
            }else if((this.billDate.toEpochDay()) - (fruit.getLocalDate().toEpochDay()) <= 3){
                System.out.println(fruit.getPrice()*0.5);
            }
        }
    }
}
