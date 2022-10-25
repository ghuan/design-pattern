package com.example.create.builder;

/**
 * 房屋建工-导演类
 *
 * @author tianma
 * @date 2022/ 10/20 10:55:13
 */
public class HouseDirectory {
    private HouseBuilder houseBuilder;
    public HouseDirectory(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House getHouse(){
        this.houseBuilder.foundation();
        this.houseBuilder.wall();
        this.houseBuilder.roof();
        this.houseBuilder.window();
        return this.houseBuilder.getHouse();
    }
}
