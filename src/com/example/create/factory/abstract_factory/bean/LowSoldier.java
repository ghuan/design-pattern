package com.example.create.factory.abstract_factory.bean;

/**
 * 低级士兵抽象类
 * @author gaohuan
 * @date 2022/ 09/20 17:32:01
 */
public abstract class LowSoldier extends Soldier {
   public LowSoldier(String name) {
      super(name, "低级");
   }
}
