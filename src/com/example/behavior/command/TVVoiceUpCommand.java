package com.example.behavior.command;

/**
 * 电视机音量+命令实现
 *
 * @author tianma
 * @date 2022/ 10/10 16:25:12
 */
public class TVVoiceUpCommand implements Command {
    private TV tv;
    public TVVoiceUpCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void exe() {
       tv.voiceUp();
    }

    @Override
    public void unexe() {
        tv.voiceDown();
    }
}
