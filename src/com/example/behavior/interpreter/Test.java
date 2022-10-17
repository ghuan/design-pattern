package com.example.behavior.interpreter;

/**
 * 解释器模式：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        MouseScript mouseScript = new MouseScript();
        mouseScript.interpret();
    }
}
