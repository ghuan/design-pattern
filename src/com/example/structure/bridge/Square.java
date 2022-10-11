package com.example.structure.bridge;

/**
 * 正方形
 *
 * @author tianma
 * @date 2022/ 10/08 15:11:24
 */
public class Square implements Shape {
    private Color color;
    public Square(Color color){
        this.color = color;
    }
    @Override
    public void draw() {
        color.show();
        System.out.println("□");
    }
}
