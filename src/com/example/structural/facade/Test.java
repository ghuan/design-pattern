package com.example.structural.facade;

/**
 * 外观模式：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        RestaurantFacade restaurantFacade = new RestaurantFacade();
        restaurantFacade.meal();
    }
}
