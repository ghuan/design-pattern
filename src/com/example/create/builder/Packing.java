package com.example.create.builder;

/**
 * 包装基类
 * @author tianma
 * @date 2022/9/29 15:34
 **/
public class Packing {
    private String name;

    public Packing(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
