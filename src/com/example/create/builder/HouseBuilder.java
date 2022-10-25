package com.example.create.builder;

/**
 * 房屋建造者接口
 *
 * @author tianma
 * @date 2022/ 10/20 10:49:59
 */
public interface HouseBuilder {
    void foundation();
    void wall();
    void roof();
    void window();
    House getHouse();
}
