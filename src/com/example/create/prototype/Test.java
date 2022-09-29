package com.example.create.prototype;


import com.example.create.prototype.enums.CarTypeEnum;

/**
 * 原型模式：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.println(PrototypeFactory.getCar(CarTypeEnum.BMW));
        }
    }
}
