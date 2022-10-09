package com.example.structure.composite;

import com.example.structure.composite.bean.Directory;

/**
 * 组合模式：是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        Directory fileDirectory = new Directory("D:\\opt");
        fileDirectory.show(" ");
    }
}
