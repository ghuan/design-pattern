package com.example.behavior.mediator.bean;

/**
 * 用户
 *
 * @author tianma
 * @date 2022/ 10/10 15:19:01
 */
public class User {
    private String name;
    private ChatRoom chatRoom;

    public String getName() {
        return name;
    }

    public User(String name){
        this.name = name;
    }
    public void login(ChatRoom chatRoom){
        chatRoom.register(this);
        this.chatRoom = chatRoom;
    }
    public void logout(){
        this.chatRoom.unregister(this);
        this.chatRoom = null;
    }
    public void talk(User to,String msg){
        if(this.chatRoom == null){
            System.out.println("请先登录聊天室");
        }else {
            this.chatRoom.sendMsg(this,to,msg);
        }
    }
    protected void listen(User from,String msg){
        if(this.chatRoom == null){
            System.out.println("请先登录聊天室");
        }else {
            this.chatRoom.processMsg(from,this,msg);
        }
    }
}
