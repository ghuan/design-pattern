package com.example.create.factory.abstract_factory.bean;

/**
 * 中级士兵抽象类
 * @author gaohuan
 * @date 2022/ 09/20 17:32:01
 */
public abstract class MidSoldier extends Soldier {
   public MidSoldier(String name) {
      super(name, "中级");
   }
}
