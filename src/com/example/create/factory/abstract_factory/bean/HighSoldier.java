package com.example.create.factory.abstract_factory.bean;

/**
 * 高级士兵抽象类
 * @author gaohuan
 * @date 2022/ 09/20 17:32:01
 */
public abstract class HighSoldier extends Soldier {
   public HighSoldier(String name) {
      super(name, "高级");
   }
}
