package com.example.create.factory.simple_factory;

import com.example.create.factory.simple_factory.bean.Car;
import com.example.create.factory.simple_factory.enums.CarTypeEnum;

/**
 * 汽车简单工厂
 * @author tianma
 * @date 2022/ 09/20 17:37:37
 */
public class CarFactory {
    public static Car createCar(CarTypeEnum carTypeEnum){
        try {
            return (Car) carTypeEnum.getTypeClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
