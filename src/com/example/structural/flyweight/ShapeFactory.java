package com.example.structural.flyweight;

import com.example.structural.flyweight.bean.Circle;
import com.example.structural.flyweight.bean.Shape;
import com.example.structural.flyweight.enums.ColorEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * 图形工厂类
 *
 * @author tianma
 * @date 2022/ 10/08 10:04:11
 */
public class ShapeFactory {
    private static final Map<ColorEnum, Shape> shapeMap = new HashMap<>();
    public static Shape getCircle(ColorEnum colorEnum){
        if(!shapeMap.containsKey(colorEnum)){
            shapeMap.put(colorEnum,new Circle(colorEnum));
        }
        System.out.println("shapeMap:"+shapeMap);
        return shapeMap.get(colorEnum);
    }
}
