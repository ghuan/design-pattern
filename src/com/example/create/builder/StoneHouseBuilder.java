package com.example.create.builder;

/**
 * 石头房建造者
 *
 * @author tianma
 * @date 2022/ 10/20 10:48:35
 */
public class StoneHouseBuilder implements HouseBuilder{
    private House house = new House();
    @Override
    public void foundation() {
        house.setFoundation("石头地基");
    }

    @Override
    public void wall() {
        house.setWall("石头墙");
    }

    @Override
    public void roof() {
        house.setRoof("石头屋顶");
    }

    @Override
    public void window() {
        house.setWindow("石头窗户");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
