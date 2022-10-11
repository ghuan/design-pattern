package com.example.behavior.command;

/**
 * 电视机
 *
 * @author tianma
 * @date 2022/ 10/10 16:22:19
 */
public class TV {
    public void on(){
        System.out.println("电视机打开...");
    }
    public void off(){
        System.out.println("电视机关闭...");
    }
    public void channelUp(){
        System.out.println("频道+...");
    }
    public void channelDown(){
        System.out.println("频道-...");
    }
    public void voiceUp(){
        System.out.println("音量+...");
    }
    public void voiceDown(){
        System.out.println("音量-...");
    }
}
