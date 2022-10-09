package com.example.structure.bridge;

import com.example.structure.bridge.bean.Blue;
import com.example.structure.bridge.bean.Red;
import com.example.structure.bridge.bean.Square;

/**
 * 桥接模式：将抽象部分与实现部分分离，使它们都可以独立的变化。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        new Square(new Red()).draw();
        new Square(new Blue()).draw();
    }
}
