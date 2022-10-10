package com.example.behavior.mediator;

import com.example.behavior.mediator.bean.ChatRoom;
import com.example.behavior.mediator.bean.PublicChatRoom;
import com.example.behavior.mediator.bean.User;

/**
 * 中介者模式：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        User user1 = new User("张三");
        User user2 = new User("李四");
        ChatRoom publicChatRoom = new PublicChatRoom();
        user1.login(publicChatRoom);
        user2.login(publicChatRoom);
        user1.talk(user2,"hello!");
        user2.talk(user1,"halo");
        user1.talk(null,"hello,every one");
        user1.logout();
    }
}
