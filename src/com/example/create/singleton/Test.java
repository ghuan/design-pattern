package com.example.create.singleton;

/**
 * 单例模式：某个类只能生成一个实例，该类提供了一个全局访问点，供外部获取该实例，其拓展是有限多个实例。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        for(int i=0;i<2;i++){
            new Thread(() -> {
                System.out.println(String.format("实例：%s",Enum.instance.hashCode()));
            }).start();
        }
    }
}
