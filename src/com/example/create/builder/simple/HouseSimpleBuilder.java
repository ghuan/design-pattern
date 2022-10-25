package com.example.create.builder.simple;

import com.example.create.builder.House;

/**
 * 房屋构建器-简单模式
 *
 * @author tianma
 * @date 2022/ 10/25 16:31:40
 */
public class HouseSimpleBuilder {
    private String foundation;
    private String wall;
    private String roof;
    private String window;
    public HouseSimpleBuilder(String foundation, String roof){
        this.foundation = foundation;
        this.roof = roof;
    }
    public HouseSimpleBuilder setFoundation(String foundation) {
        this.foundation = foundation;
        return this;
    }

    public HouseSimpleBuilder setWall(String wall) {
        this.wall = wall;
        return this;
    }

    public HouseSimpleBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public HouseSimpleBuilder setWindow(String window) {
        this.window = window;
        return this;
    }

    public static HouseSimpleBuilder instance(String foundation, String roof){
        return new HouseSimpleBuilder(foundation,roof);
    }

    public House getHouse(){
        House house = new House();
        house.setFoundation(this.foundation);
        house.setWall(this.wall);
        house.setWindow(this.window);
        house.setRoof(this.roof);
        return house;
    }

}
