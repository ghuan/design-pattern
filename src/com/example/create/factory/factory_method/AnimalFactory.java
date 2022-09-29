package com.example.create.factory.factory_method;

import com.example.create.factory.factory_method.bean.Animal;

/**
 * 动物工厂类
 *
 * @author tianma
 * @date 2022/ 09/28 15:22:11
 */
public abstract class AnimalFactory {
    public abstract Animal createAnimal();
    public void show(){
        Animal animal = createAnimal();
        System.out.println(animal.getClass().getSimpleName()+"：速度-"+animal.getSpeed()+"：食物："+(animal.getFood()!=null ? animal.getFood().getSimpleName() : null));
    }
}
