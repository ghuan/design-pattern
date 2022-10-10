package com.example.behavior.command.bean;

/**
 * 电视机频道-命令实现
 *
 * @author tianma
 * @date 2022/ 10/10 16:25:12
 */
public class TVChannelDownCommand implements Command {
    private TV tv;
    public TVChannelDownCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void exe() {
       tv.channelDown();
    }

    @Override
    public void unexe() {
        tv.channelUp();
    }
}
