package com.example.behavior.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 迭代器模式：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        DriveRecorder driveRecorder = new DriveRecorder();
        Arrays.asList(new String[]{"1","2","3","4","5","6","7","8","9","10","11"}).stream().forEach(r -> driveRecorder.add(r));
        Iterator<String> iterator = driveRecorder.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
