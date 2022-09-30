package com.example.structural.decorator.bean;

/**
 * 蓝色字体书写装饰器
 *
 * @author tianma
 * @date 2022/ 09/30 14:36:27
 */
public class RedWriterDecorator extends WriterDecorator {
    public RedWriterDecorator(Writer writerDecorated) {
        super(writerDecorated);
    }
    @Override
    public void write(String words) {
        System.out.print("用红色");
        this.writerDecorated.write(words);
    }
}
