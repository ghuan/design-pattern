package com.example.create.factory.factory_method;

/**
 * 猫创建工厂
 *
 * @author tianma
 * @date 2022/ 09/28 15:20:15
 */
public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat(Mouse.class);
    }
}
