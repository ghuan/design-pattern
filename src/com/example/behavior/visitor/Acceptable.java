package com.example.behavior.visitor;

/**
 * @description 接待者接口
 * @author tianma
 * @date 2022/10/11 17:03
 **/
public interface Acceptable {
    void accept(Visitor visitor);
}
