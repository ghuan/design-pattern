package com.example.structure.decorator.bean;

/**
 * 书写装饰器
 *
 * @author tianma
 * @date 2022/ 09/30 14:36:27
 */
public class WriterDecorator implements Writer {
    protected Writer writerDecorated;
    public WriterDecorator(Writer writerDecorated){
        this.writerDecorated = writerDecorated;
    }
    @Override
    public void write(String words) {
        writerDecorated.write(words);
    }
}
