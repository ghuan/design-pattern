package com.example.structural.flyweight.bean;

import com.example.structural.flyweight.enums.ColorEnum;

/**
 * 圆形
 *
 * @author tianma
 * @date 2022/ 10/08 09:46:17
 */
public class Circle implements Shape {
    private ColorEnum color;
    private final String name = "圆形";
    public Circle(ColorEnum color){
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println(color.getTypeName()+name);
    }
}
