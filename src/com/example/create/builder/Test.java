package com.example.create.builder;

import com.example.create.builder.simple.HouseSimpleBuilder;

/**
 * 构建器模式:将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示
 * 测试
 * @author tianma
 * @date 2022/ 09/29 15:29:40
 */
public class Test {
    public static void main(String[] args) {
        //todo 传统构建器方式
        HouseDirectory houseDirectory = new HouseDirectory(new StoneHouseBuilder());
        System.out.println(houseDirectory.getHouse().toString());
        //todo 简单链式构建器方式
        House house = HouseSimpleBuilder.instance("木头地基","木头屋顶").setWall("木头墙").setWindow("木头窗").getHouse();
        System.out.println(house.toString());
    }
}
