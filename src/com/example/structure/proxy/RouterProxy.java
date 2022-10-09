package com.example.structure.proxy;

import com.example.structure.proxy.bean.Internet;
import com.example.structure.proxy.bean.Modem;

/**
 * 路由器-调制解调器代理类
 *
 * @author tianma
 * @date 2022/ 10/08 13:42:22
 */
public class RouterProxy implements Internet {
    private Modem modem;
    public RouterProxy(String password){
        this.modem = new Modem(password);
    }

    @Override
    public void httpAccess(String url) {
        this.modem.httpAccess(url);
    }
}
