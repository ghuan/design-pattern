package com.example.create.factory.abstract_factory;

/**
 * 人类兵工厂类
 *
 * @author tianma
 * @date 2022/ 09/28 15:22:11
 */
public class HumanFactory extends AbstractFactory{
    @Override
    public LowSoldier createLowSoldier() {
        return new FootSoldier();
    }

    @Override
    public MidSoldier createMidSoldier() {
        return new CavalrySoldier();
    }

    @Override
    public HighSoldier createHighSoldier() {
        return new TankSoldier();
    }
}
