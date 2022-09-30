package com.example.structural.decorator;

import com.example.structural.decorator.bean.BlueWriterDecorator;
import com.example.structural.decorator.bean.Pen;
import com.example.structural.decorator.bean.Pencil;
import com.example.structural.decorator.bean.RedWriterDecorator;

/**
 * 装饰器模式：允许向一个现有的对象添加新的功能，同时又不改变其结构
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        new BlueWriterDecorator(pen).write("hello");
        new BlueWriterDecorator(pencil).write("你好");
        new RedWriterDecorator(pen).write("こんにちは");
        new RedWriterDecorator(pen).write("Guten Tag");
    }
}
