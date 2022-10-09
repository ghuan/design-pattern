package com.example.structure.decorator.bean;

/**
 * 蓝色字体书写装饰器
 *
 * @author tianma
 * @date 2022/ 09/30 14:36:27
 */
public class BlueWriterDecorator extends WriterDecorator {
    public BlueWriterDecorator(Writer writerDecorated) {
        super(writerDecorated);
    }
    @Override
    public void write(String words) {
        System.out.print("用蓝色");
        this.writerDecorated.write(words);
    }
}
