package com.example.create.factory.abstract_factory.bean;

/**
 * 士兵抽象类
 * @author gaohuan
 * @date 2022/ 09/20 17:32:01
 */
public abstract class Soldier {
   private String name;
   private String type;
   public Soldier(String name,String type){
      this.name = name;
      this.type = type;
   }
   public void show(){
      System.out.println(type+"士兵："+name+"发起进攻");
   }
}
