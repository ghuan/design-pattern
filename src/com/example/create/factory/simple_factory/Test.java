package com.example.create.factory.simple_factory;

import com.example.create.factory.simple_factory.enums.CarTypeEnum;

/**
 * 简单工厂模式：对象创建由工厂实现
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        CarFactory.createCar(CarTypeEnum.BMW).run();
        CarFactory.createCar(CarTypeEnum.AUDI).run();
    }
}
