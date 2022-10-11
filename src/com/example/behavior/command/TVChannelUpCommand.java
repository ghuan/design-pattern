package com.example.behavior.command;

/**
 * 电视机频道+命令实现
 *
 * @author tianma
 * @date 2022/ 10/10 16:25:12
 */
public class TVChannelUpCommand implements Command {
    private TV tv;
    public TVChannelUpCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void exe() {
       tv.channelUp();
    }

    @Override
    public void unexe() {
        tv.channelDown();
    }
}
