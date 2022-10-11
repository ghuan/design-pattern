package com.example.behavior.mediator;

/**
 * 公共聊天室
 *
 * @author tianma
 * @date 2022/ 10/10 15:29:22
 */
public class PublicChatRoom extends ChatRoom {
    @Override
    public void register(User user) {
        super.register(user);
        System.out.println("欢迎"+user.getName()+"登录公共聊天室");
    }

    @Override
    public void unregister(User user) {
        super.unregister(user);
        System.out.println(user.getName()+"退出公共聊天室");
    }

    @Override
    void sendMsg(User from, User to, String msg) {
        if(to == null){
            processMsg(from,null,msg);
        }else {
            users.stream().filter(u -> u.getName().equals(to.getName())).forEach(u -> u.listen(from,msg));
        }
    }

    @Override
    void processMsg(User from, User to, String msg) {
        System.out.println(from.getName()+" 向 " + (to == null ? "所有人" : to.getName()) +"说：" + msg);
    }
}
