package com.example.structure.proxy.bean;

/**
 * 调制解调器
 *
 * @author tianma
 * @date 2022/ 10/08 13:38:49
 */
public class Modem implements Internet{
    public Modem(String password){
        if(!"123456".equals(password)){
            throw new RuntimeException("拨号失败，密码错误");
        }
        System.out.println("拨号连接...成功!");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在访问："+url);
    }
}
