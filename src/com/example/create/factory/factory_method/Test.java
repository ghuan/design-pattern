package com.example.create.factory.factory_method;

import com.example.create.factory.simple_factory.CarFactory;
import com.example.create.factory.simple_factory.enums.CarTypeEnum;

/**
 * 工厂方法模式：定义一个用户创建产品的接口，由子类决定生产什么产品
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        AnimalFactory animalFactory = new MouseFactory();
        animalFactory.show();
        animalFactory = new CatFactory();
        animalFactory.show();
    }
}
