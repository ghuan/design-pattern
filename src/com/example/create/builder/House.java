package com.example.create.builder;

/**
 * 房屋
 *
 * @author tianma
 * @date 2022/ 10/20 10:46:59
 */
public class House {
    private String foundation;
    private String wall;
    private String roof;
    private String window;

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString(){
        return "地基："+this.foundation+"\n墙体："+this.wall+"\n屋顶："+this.roof+"\n窗户："+this.window;
    }
}
