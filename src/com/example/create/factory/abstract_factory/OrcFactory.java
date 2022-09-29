package com.example.create.factory.abstract_factory;

import com.example.create.factory.abstract_factory.bean.*;

/**
 * 兽人兵工厂类
 *
 * @author tianma
 * @date 2022/ 09/28 15:22:11
 */
public class OrcFactory extends AbstractFactory{
    @Override
    public LowSoldier createLowSoldier() {
        return new FootOrc();
    }

    @Override
    public MidSoldier createMidSoldier() {
        return new CavalryOrc();
    }

    @Override
    public HighSoldier createHighSoldier() {
        return new ElephantOrc();
    }
}
