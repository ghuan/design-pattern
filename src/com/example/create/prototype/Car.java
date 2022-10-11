package com.example.create.prototype;

/**
 * 汽车抽象类 实现Cloneable,默认clone是浅拷贝
 * @author gaohuan
 * @date 2022/ 09/20 17:32:01
 */
public abstract class Car implements Cloneable{
   abstract void run();
   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getNo() {
      return no;
   }

   public void setNo(String no) {
      this.no = no;
   }

   private String type;
   private String no;

   @Override
   public Car clone(){
      try {
         return (Car) super.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return null;
   }

}
