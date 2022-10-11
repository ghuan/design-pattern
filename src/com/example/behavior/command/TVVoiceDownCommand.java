package com.example.behavior.command;

/**
 * 电视机音量-命令实现
 *
 * @author tianma
 * @date 2022/ 10/10 16:25:12
 */
public class TVVoiceDownCommand implements Command {
    private TV tv;
    public TVVoiceDownCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void exe() {
       tv.voiceDown();
    }

    @Override
    public void unexe() {
        tv.voiceUp();
    }
}
