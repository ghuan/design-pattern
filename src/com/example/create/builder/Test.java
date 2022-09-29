package com.example.create.builder;

/**
 * 构建器模式:将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示
 * 测试
 * @author tianma
 * @date 2022/ 09/29 15:29:40
 */
public class Test {
    public static void main(String[] args) {
        MealBuilder.createVegMeal().list();
        MealBuilder.createNoVegMeal().list();
    }
}
