package com.example.create.factory.abstract_factory;

import com.example.create.factory.abstract_factory.enums.FactoryEnum;

/**
 * 抽象工厂模式：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        AbstractFactory abstractFactory = FactoryProducer.getFactory(FactoryEnum.HUMAN);
        abstractFactory.createLowSoldier().show();
        abstractFactory.createMidSoldier().show();
        abstractFactory.createHighSoldier().show();
        abstractFactory = FactoryProducer.getFactory(FactoryEnum.ORC);
        abstractFactory.createLowSoldier().show();
        abstractFactory.createMidSoldier().show();
        abstractFactory.createHighSoldier().show();
    }
}
