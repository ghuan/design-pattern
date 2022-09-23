package com.example.singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        for(int i=0;i<2;i++){
            new Thread(() -> {
                System.out.println(String.format("hungry 实例：%s",Hungry.getInstance().hashCode()));
            }).start();
        }

        for(int i=0;i<2;i++){
            new Thread(() -> {
                System.out.println(String.format("lazy 实例：%s",Lazy.getInstance().hashCode()));
            }).start();
        }
    }
}
