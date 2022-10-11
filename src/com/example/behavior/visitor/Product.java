package com.example.behavior.visitor;

import java.time.LocalDate;

/**
 * 商品类
 *
 * @author tianma
 * @date 2022/ 10/11 16:35:26
 */
public abstract class Product {
    private String name;
    private Float price;
    private LocalDate localDate;

    public Product(String name,Float price,LocalDate localDate){
        this.name = name;
        this.price = price;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
