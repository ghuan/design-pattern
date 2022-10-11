package com.example.create.factory.factory_method;

/**
 * 动物父类
 * @author gaohuan
 * @date 2022/ 09/20 17:32:01
 */
public abstract class Animal {
   /**
    * 跑动速度
    **/
   private Integer speed;
   /**
    * 食物
    **/
   private Class food;

   public Integer getSpeed() {
      return speed;
   }

   public Class getFood() {
      return food;
   }

   public Animal(Integer speed, Class food){
      this.speed = speed;
      this.food = food;
   }
}
