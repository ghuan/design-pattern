package com.example.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * 黑名单拦截-动态代理
 *
 * @author tianma
 * @date 2022/ 10/08 13:58:52
 */
public class BlackListInvocationHandler implements InvocationHandler {
    private Internet internet;
    private Set<String> blackSet = new HashSet<String>(){{
        add("游戏");
        add("电影");
        add("音乐");
    }};
    public BlackListInvocationHandler(Internet internet){
        this.internet = internet;
        System.out.println("开启黑名单功能");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String url = args[0].toString();
        boolean has = blackSet.stream().anyMatch(s -> url.indexOf(s) != -1);
        if(has){
            throw new RuntimeException(url+"禁止访问");
        }
        return method.invoke(internet,url);
    }
}
