package com.example.create.prototype;

import com.example.create.prototype.bean.Car;
import com.example.create.prototype.enums.CarTypeEnum;

import java.util.Hashtable;
import java.util.Map;

/**
 * 原型模式工厂类
 *
 * @author tianma
 * @date 2022/ 09/27 10:32:12
 */
public class PrototypeFactory {
    private static Map<String, Car> cache = new Hashtable<>();
    private static Car getCarInstance(CarTypeEnum carTypeEnum){
        if(!cache.containsKey(carTypeEnum.getTypeCode())){
            try {
                cache.put(carTypeEnum.getTypeCode(), (Car) carTypeEnum.getTypeClass().newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return cache.get(carTypeEnum.getTypeCode());
    }
    public static Car getCar(CarTypeEnum carTypeEnum){
        return getCarInstance(carTypeEnum).clone();
    }
}
