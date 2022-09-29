package com.example.create.builder;

import com.example.create.builder.bean.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 一餐菜单
 *
 * @author tianma
 * @date 2022/ 09/29 15:54:49
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public Float cost(){
        return items.stream().map(i -> i.price()).reduce((sum,p) -> sum + p).get();
    }

    public void list(){
        Map<String,List<Item>> group = items.stream().collect(Collectors.groupingBy(i -> i.name()));
        AtomicInteger num = new AtomicInteger();
        final Float[] sum = {0F};
        group.forEach((k,is) -> {
            System.out.println(num.incrementAndGet()+". "+k+":");
            System.out.println("数量:"+is.size());
            System.out.println("单价:"+is.get(0).price());
            System.out.println("合计:"+(is.get(0).price()) * is.size());
            sum[0] = sum[0] + (is.get(0).price()) * is.size();
            System.out.println();
        });
        System.out.println("总价:"+sum[0]);
        System.out.println("===================================");

    }
}
