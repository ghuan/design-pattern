package com.example.create.factory.abstract_factory;

import com.example.create.factory.abstract_factory.enums.FactoryEnum;

/**
 * 创建工厂的工厂类
 *
 * @author tianma
 * @date 2022/ 09/28 16:37:25
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryEnum factoryEnum){
        try {
            return (AbstractFactory) factoryEnum.getTypeClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
