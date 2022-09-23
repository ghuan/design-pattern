package com.example.factory.simple_factory;

import com.example.factory.simple_factory.bean.AUDICar;
import com.example.factory.simple_factory.bean.BMWCar;
import com.example.factory.simple_factory.bean.Car;
import com.example.factory.simple_factory.enums.CarTypeEnum;

/**
 * 汽车简单工程
 * @author tianma
 * @date 2022/ 09/20 17:37:37
 */
public class CarFactory {
    public static Car createCar(CarTypeEnum carTypeEnum){
        Car car;
        switch (CarTypeEnum.getByCode(carTypeEnum.getTypeCode())){
            case BMW :
                car = new BMWCar();
                break;
            case AUDI :
                car = new AUDICar();
                break;
            default:
                car = null;
        }
        return car;
    }
}
