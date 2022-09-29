package com.example.create.builder;

import com.example.create.builder.bean.ChickenBurge;
import com.example.create.builder.bean.Coke;
import com.example.create.builder.bean.Pepsi;
import com.example.create.builder.bean.VegBurger;

/**
 * 菜单构建器
 *
 * @author tianma
 * @date 2022/ 09/29 16:14:46
 */
public class MealBuilder {
    public static Meal createVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal createNoVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurge());
        meal.addItem(new ChickenBurge());
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        meal.addItem(new Pepsi());
        return meal;
    }
}