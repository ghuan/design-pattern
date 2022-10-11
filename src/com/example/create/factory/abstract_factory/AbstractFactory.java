package com.example.create.factory.abstract_factory;

/**
 * 基础工厂类
 *
 * @author tianma
 * @date 2022/ 09/28 15:22:11
 */
public abstract class AbstractFactory {
    public abstract LowSoldier createLowSoldier();
    public abstract MidSoldier createMidSoldier();
    public abstract HighSoldier createHighSoldier();
}
