package com.example.structural.bridge;

import com.example.structural.proxy.BlackListInvocationHandler;
import com.example.structural.proxy.RouterProxy;
import com.example.structural.proxy.bean.Internet;

import java.lang.reflect.Proxy;

/**
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        //静态代理
        RouterProxy routerProxy = new RouterProxy("123456");
        routerProxy.httpAccess("http://www.baidu.com");
        //动态代理
        Internet internet = (Internet) Proxy.newProxyInstance(RouterProxy.class.getClassLoader(),
                RouterProxy.class.getInterfaces(),
                new BlackListInvocationHandler(new RouterProxy("123456")));
        internet.httpAccess("http://www.游戏.com");

    }
}
