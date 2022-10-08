package com.example.structural.flyweight;

import com.example.structural.flyweight.enums.ColorEnum;

/**
 * 享元模式：运用共享技术有效地支持大量细粒度的对象
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        ShapeFactory.getCircle(ColorEnum.BLUE).draw();
        ShapeFactory.getCircle(ColorEnum.RED).draw();
        ShapeFactory.getCircle(ColorEnum.RED).draw();
        ShapeFactory.getCircle(ColorEnum.BLUE).draw();
    }
}
