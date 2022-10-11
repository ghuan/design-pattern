package com.example.behavior.command;

/**
 * 关电视机命令实现
 *
 * @author tianma
 * @date 2022/ 10/10 16:25:12
 */
public class TVOffCommand implements Command {
    private TV tv;
    public TVOffCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void exe() {
       tv.off();
    }

    @Override
    public void unexe() {
        tv.on();
    }
}
