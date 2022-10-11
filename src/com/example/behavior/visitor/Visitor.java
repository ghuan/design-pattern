package com.example.behavior.visitor;

/**
 * @description 访问者接口
 * @author tianma
 * @date 2022/10/11 16:40
 **/
public interface Visitor {
    void visit(Candy candy);
    void visit(Wine wine);
    void visit(Fruit fruit);
}
