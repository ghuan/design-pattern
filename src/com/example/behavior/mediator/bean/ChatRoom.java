package com.example.behavior.mediator.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室抽象类
 *
 * @author tianma
 * @date 2022/ 10/10 15:17:56
 */
public abstract class ChatRoom {
    protected List<User> users = new ArrayList<>();
    public void register(User user){
        users.add(user);
    }
    public void unregister(User user){
        users.remove(user);
    }
    abstract void sendMsg(User from,User to,String msg);
    abstract void processMsg(User from,User to,String msg);
}
